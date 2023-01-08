# OGC® GML schema ReadMe

## OGC® Geography Markup Language (GML) Encoding Standard

Geography Markup Language is an OGC Standard.

More information may be found at
http://www.opengeospatial.org/standards/gml

The most current schema are available at http://schemas.opengis.net/ .

-----------------------------------------------------------------------

2012-07-13  Nicolas Lesage

* For ISO ITTF Repository, schema location for ISO 19139 is
  http://standards.iso.org/ittf/PubliclyAvailableStandards/ISO_19139_Schemas/

2012-07-10  Kevin Stegemoller

* v2.0.0 - v3.2.1 WARNING XLink change is NOT BACKWARD COMPATIBLE.
* changed OGC XLink (xlink:simpleLink) to W3C XLink (xlink:simpleAttrs)
  per an approved TC and PC motion during the Dec. 2011 Brussels meeting.
  see http://www.opengeospatial.org/blog/1597
* implement 11-025: retroactively require/add all leaf documents of an
  XML namespace shall explicitly <include/> the all-components schema
* v3.2.1: updated xsd:schema:@version to 3.2.1.2 (06-135r7 s#13.4)

2007-09-06  Kevin Stegemoller

GML 3.2.1 (ISO 19136)
* Published GML 3.2.1 schemas from OGC 07-036
* validated with oXygen 8.2 (xerces-J 2.9.0) - Kevin Stegemoller
* validated with Xerces-J, Xerces-C++ and XSV - Clemens Portele

2007-08-17  Kevin Stegemoller

Changes made to these GML 3.2.1 / ISO 19136 schemas:
* added ReadMe.txt
* changed gmd.xsd references to "../../iso/19139/20070417/gmd/gmd.xsd"
* changed xlink references to be relative to /xlink/1.0.0/xlinks.xsd
  available from schemas.opengis.net/xlink/1.0.0/xlinks.xsd (REMOVED 2012-07-21).
* removed xlinks schema and directory

Changes made to these ISO 19139 schemas by OGC:
* added ReadMe.txt
* changed ISO_19136 path to /gml/3.2.1/
* changed xlink references to be relative to /xlink/1.0.0/xlinks.xsd
  available from schemas.opengis.net/xlink/1.0.0/xlinks.xsd (REMOVED 2012-07-21).
* removed xlinks schema and directory

OGC GML 3.2.1 / ISO 19136 schemas files will be published at:
- http://schemas.opengis.net/gml/3.2.1/
- http://standards.iso.org/ittf/PubliclyAvailableStandards/ISO_19136_Schemas/

Files in the folder "ISO/19139/20070417" are also published at
- http://standards.iso.org/ittf/PubliclyAvailableStandards/ISO_19139_Schemas/

-----------------------------------------------------------------------

Policies, Procedures, Terms, and Conditions of OGC(r) are available
http://www.opengeospatial.org/ogc/legal/ .

OGC and OpenGIS are registered trademarks of Open Geospatial Consortium.

Copyright (c) 2012, 2018 Open Geospatial Consortium

-----------------------------------------------------------------------

For the sake of convenience, GML 3.2 XML schemas (version 19136 DIS - 2005 november) are provided with the 19139 set of schemas.
The following changes were applied to the GML schemas to enable locale referencing:

The ``gmd`` names changed to "http://www.isotc211.org/schemas/2005/gmd" matching https://schemas.opengis.net/gml/ use.

-1- ``referenceSystems.xsd``:

a) replace

```xml
<import namespace="http://www.isotc211.org/schemas/2005/gmd" schemaLocation="../iso19139/gmd/gmd.xsd"/>
```
with
```xml
<import namespace="http://www.isotc211.org/2005/gmd" schemaLocation="../../iso/19139/20070417/gmd/gmd.xsd"/>
```

b) replace
```xml
xmlns:gmd="http://www.isotc211.org/schemas/2005/gmd"
```

with
```xml
xmlns:gmd="http://www.isotc211.org/2005/gmd"
```

-2- ``coordinateOperations.xsd``:

a) replace
```xml
   <import namespace="http://www.isotc211.org/schemas/2005/gmd" schemaLocation="../iso19139/gmd/gmd.xsd"/>
```
with
```xml
   <import namespace="http://www.isotc211.org/2005/gmd" schemaLocation="../../iso/19139/20070417/gmd/gmd.xsd"/>
```

b) replace

```xml
   xmlns:gmd="http://www.isotc211.org/schemas/2005/gmd"
```

with
```xml
   xmlns:gmd="http://www.isotc211.org/2005/gmd"
```