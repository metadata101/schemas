import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.XMLConstants;

import java.io.IOException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Validation using Java built-in Xerces XML Parser.
 *
 * Usage: java Validate.java napEx1.xml
 *
 * @see https://xerces.apache.org/xerces2-j/features.html
 * @see https://www.digitalocean.com/community/tutorials/how-to-validate-xml-against-xsd-in-java
 */
public class Validate {
    public static void main(String args[]){
        if (args.length<1) {
            System.out.println("Usage:");
            System.out.println("  java Validate.java file.xml");
            System.out.println("  java Validate.java file.xsd file.xml");
            return;
        }
        File xsd = null;
        for(String path : args ){
            if(path.endsWith(".xsd")){
                xsd = new File(path);
                continue;
            }
            File file = new File(path);
            if(!file.exists()) {
                System.out.println(path+": not found");
                continue;
            }
            try {
                boolean valid;
                if (xsd != null) {
                    System.out.println(file.getPath()+" validation check: "+xsd.getPath());
                    valid = validateXSD(xsd, file);
                } else {
                    System.out.println(file.getPath()+": validation using schemaLocation");
                    valid = validateSchemaLocation(file);
                }
                System.out.println(file.getPath()+": "+(valid ? "valid" : "invalid"));
            }
            catch (Throwable t){
                System.err.println(path+" validation failed: "+t.getMessage());
                if( t.getCause() != null){
                    t.getCause().printStackTrace(System.err);
                }
            }
        }
    }

    public static boolean validateSchemaLocation(File file) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setValidating(true);
        factory.setNamespaceAware(true);

        // https://xerces.apache.org/xerces2-j/features.html
        factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING,false);
        factory.setFeature("http://apache.org/xml/features/validation/schema", true);
        factory.setFeature("http://apache.org/xml/features/validation/schema-full-checking", true);

        SAXParser parser = factory.newSAXParser();
        parser.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA,"all");
        Feedback feedback = new Feedback();
        parser.parse(file, feedback);

        return feedback.valid;
    }
    public static boolean validateXSD(File xsd, File file) throws Exception {
        SchemaFactory factory = SchemaFactory.newDefaultInstance();
        Schema schema = factory.newSchema(xsd);

        Feedback feedback = new Feedback();
        Validator validator = schema.newValidator();
        validator.setErrorHandler(feedback);
        validator.validate(new StreamSource(file));

        return feedback.valid;
    }

    public static class Feedback extends DefaultHandler {
        public boolean valid = true;

        @Override
        public void notationDecl(String name, String publicId, String systemId) throws SAXException {
//            if (publicId!=null){
//                System.out.println(name+": "+systemId + " --> "+ publicId);
//            }
//            else {
//                System.out.println(name+": "+systemId);
//            }
            super.notationDecl(name, publicId, systemId);
        }

        @Override
        public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) throws SAXException {
//            System.out.println(name+" unparsed entity declaration:"+notationName);

            super.unparsedEntityDecl(name, publicId, systemId, notationName);
        }

        @Override
        public InputSource resolveEntity(String publicId, String systemId) throws IOException, SAXException {
//            if (publicId!=null){
//                System.out.println(systemId + " --> "+ publicId);
//            }
//            else {
//                System.out.println(systemId);
//            }
            return super.resolveEntity(publicId, systemId);
        }

        @Override
        public void warning(SAXParseException exception) throws SAXException {
            feedback("WARNING",exception);
        }

        @Override
        public void error(SAXParseException exception) throws SAXException {
            feedback("ERROR",exception);
            valid = false;
        }

        @Override
        public void fatalError(SAXParseException exception) throws SAXException {
            feedback("FATAL ERROR",exception);
            valid = false;
        }
        private void feedback(String level, SAXParseException exception) throws SAXException {
            System.err.print(level);
            System.err.print(":(");
            System.err.print(exception.getLineNumber());
            System.err.print(", ");
            System.err.print(exception.getColumnNumber());
            System.err.print(") ");
            System.err.println(exception.getMessage());
        }
    }
}