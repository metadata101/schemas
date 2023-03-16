import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.XMLConstants;

/**
 * Validation using Java built-in Xerces XML Parser.
 *
 * Usage: java Validate.java napEx1.xml
 *
 * @see https://www.digitalocean.com/community/tutorials/how-to-validate-xml-against-xsd-in-java
 */
public class Validate {
    public static String SCHEMA_PATH = "../2009/napm/napm.xsd";
    public static File XSD_FILE = new File(SCHEMA_PATH);

    static class Feedback implements ErrorHandler {
        @Override
        public void warning(SAXParseException exception) throws SAXException {
            System.err.print("WARNING:(");
            System.err.print(exception.getLineNumber());
            System.err.print(", ");
            System.err.print(exception.getColumnNumber());
            System.err.print(") ");
            System.err.println(exception.getMessage());
        }

        @Override
        public void error(SAXParseException exception) throws SAXException {
            System.err.print("ERROR:(");
            System.err.print(exception.getLineNumber());
            System.err.print(", ");
            System.err.print(exception.getColumnNumber());
            System.err.print(") ");;
            System.err.println(exception.getMessage());
        }

        @Override
        public void fatalError(SAXParseException exception) throws SAXException {
            System.err.print("FATAL ERROR:(");
            System.err.print(exception.getLineNumber());
            System.err.print(", ");
            System.err.print(exception.getColumnNumber());
            System.err.print(") ");
            System.err.println(exception.getMessage());
        }
    }
    public static void main(String args[]){
        System.out.println("Checking "+args.length);
        for(String path : args ){
            if(path.endsWith(".xsd")){
                SCHEMA_PATH = path;
                XSD_FILE = new File(path);
            }
            else {
                validate(path);
            }
        }
    }

    public static void validate(String path){
        System.out.print(path+":");
        File file = new File(path);
        if( file.exists()) {
            System.out.println(" checking against "+SCHEMA_PATH);
        }
        else {
            System.out.println(" not found");
        }
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(XSD_FILE);

            Validator validator = schema.newValidator();
            validator.setErrorHandler(new Feedback());
            validator.validate(new StreamSource(file));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: "+e.getMessage());
            // e.printStackTrace(System.err);
        }
    }
}