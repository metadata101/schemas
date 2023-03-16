# HNAP Examples

The following examples are provided to illustrate the structure of HNAP records and highlight document [guidelines and conventions](../hnap/2.3.1/HNAP.md).

The ISO19139 documents include 

## Validation Check Java

Using the provided ``Validation.java`` with Java 11:

```bash
java Validate.java napEx1.xml 
```

To check file against another schema:
```bash
java Validate.java ../2009/gmd/gmd.xsd napEx1.xml 
```

## Validation Check XMLStar

```bash
xml validate --well-formed --xsd ../2009/gmd/gmd.xsd napEx1.xml  
```
Resources:

* https://xmlstar.sourceforge.net