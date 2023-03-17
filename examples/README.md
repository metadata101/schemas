# HNAP Examples

The following examples are provided to illustrate the structure of HNAP records and highlight document [guidelines and conventions](../hnap/2.3.1/HNAP.md).

## Validation Check Java

Using the provided ``Validation.java`` with Java 11:

```bash
java Validate.java napEx1.xml 
```

To check file against ``hnap.xsd``:
```bash
java Validate.java ../hnap/2.3.1/hnap.xsd napEx1.xml 
```

## Validation Check XMLStar

```bash
xml validate --err --xsd ../hnap/2.3.1/hnap.xsd napEx1.xml  
```
Resources:

* https://xmlstar.sourceforge.net