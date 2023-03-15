---
title: Guide to Harmonize ISO 19115:2003 / North American Profile Metadata For Government of Canada Geospatial Data
nav_exclude: true
---

# Guide to Harmonize ISO 19115:2003 / North American Profile Metadata For Government of Canada Geospatial Data

**V2.3.1**

**May 4, 2016**

### Document Change Control

* Revision: 1.0
  * Jan 17, 2014
    * Authors: R. Tondevold (AAFC), B. Schwarz (AAFC) <br/>
    * First Draft
* 1.1
  * Jan 27, 2014
    * R. Tondevold (AAFC), B. Schwarz (AAFC)
    * Includes feedback from participants
* 1.2
  * Feb 19, 2014
  * R. Tondevold (AAFC), B. Schwarz (AAFC)
  * Includes feedback from participants
* 1.3
  * May 16, 2014
    * R. Tondevold (AAFC)
    * Includes feedback from participants, finalized version
* 1.4
  * Sept 25, 2014
    * C. Mitchell (NRCAN-FGP)
    * Added to background and purpose, expanded implementation guidance, integrated into Federal Geospatial Platform policy suite under Data Management and Stewardship – Catalogue.
* 1.5
  * Oct 1, 2014
    * S. Smith (NRCan), J. Rupert (NRCan)
    * Best practice of useLimitation (5.4.2.1) instead of otherConstraints (5.4.2.4) when useing codelist napMD_RestrictionCode (5.4.2.3)
* 2.0
  * Oct 2, 2014
    * C. Mitchell (NRCAN-FGP)
    * FGP Guideline for Harmonized North American Profile. Includes feedback from T. Spears, L. McAvoy, K. Aston.
* 2.1
  * Oct 28, 2014
    * J. Rupert (NRCan), C. Mitchell (NRCan)
      * topicCategory is a enumerated list and cannot use a code list. dateStamp and language notes. Add Government of Canada to ResponsibleParty. Added a locale example. Added controlled vocabulary to 5.20.1 Protocol.
* 2.2
  * Nov 14, 2014
    * C. Mitchell (NRCan), J. Rupert (NRCan); R. Tondevold (AAFC)
    * Updates based on group discussion November 4, 2014: [Guide_to_Harmonized_ISO_19115:2003_NAP#Issue_Log](http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP#Issue_Log")
  * Dec 23, 2014
    * Cindy Mitchell
    * All references to Esri REST Feature Service changed to Esri REST Mapping Service.

* 2.3
  * February 23, 2015
    * M-E Martin (NRCan), R. Tondevold (AAFC) Tondevold, Mark Smith (EC), J. Rupert (NRCan)
    * Further refinement to harmonized profile following metadata validation testing.
  * February 27, 2015
    * NRCan, EC and TBS
    * Updated guidance for 5.20.5. Typographic errors fixed.
  * March 11, 2015
    * NRCan
    * Updated guidance for 5.20.1 Linkage
    * Typographic errors fixed.
  * May 28, 2015* NRCan* Correction of hyphen in the metadata standard name guideline 5.2.8. Addition of a warning about autocorrection of hyphens
  * June 16, 2015* NRCan* Correction: removal of second hyphen that erroneously followed Open Government Licence - Canada; found in 5.4.2.1 guidance.
  * April 20, 2016
    * **NOT NORMATIVE- Draft for Discussion.**
    * C. Mitchell* Issue log updates – proposed solutions noted in BLUE for discussion.
    * Issues 34-44 - [Guide_to_Harmonized_ISO_19115:2003_NAP#Issue_Log]([http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP#Issue_Log)
* 2.3.1
  * May 04, 2016
    * C. Mitchell
    * For ease of detecting updates from v2.3, changes or updates in this version are noted in BLUE.
  * January 18, 2017
    * C. Mitchell
    * Replaced outdated format name list (5.11.3.1) with link to authoritative version on GCPedia.

Markdown converstion:
* 2.3.1
  * May 07, 2021
    * J. Garnett
    * Initial converstion to Markdown
  * Jan 15, 2023
    * Fix geogratis links and examples
    * Fix http links (example https://canada.multites.net )

### Contributors

* Ryan Tondevold (Agriculture and Agri-Food Canada)
* David Lee        (Agriculture and Agri-Food Canada)
* Brian Schwarz    (Agriculture and Agri-Food Canada)
* Tobias Spears    (Department of Fisheries and Oceans)
* Mark Shaw        (Environment Canada)
* James Doyle      (Environment Canada)
* Paul Paciorek    (Environment Canada)
* Mike Weech       (Environment Canada)
* Daniel Aramov    (Environment Canada)
* Steve Smith      (Natural Resources Canada)
* Jamie Rupert     (Natural Resources Canada)
* Marie-Eve Martin (Natural Resources Canada)
* Yvon Boucher     (Natural Resources Canada)
* Denis Boutin     (Natural Resources Canada)
* Sylvie Jodouin   (Natural Resources Canada)
* Cindy Mitchell   (Natural Resources Canada)
* Ross Thompson    (Statistics Canada)
* Kristina Aston   (Treasury Board Secretariat of Canada)
* Alannah Hilt     (Treasury Board Secretariat of Canada)
* Chris Majewski   (Treasury Board Secretariat of Canada)

# Table of Contents

[1. Background]()

[2. Purpose]()

[3. Harmonized Minimum Mandatory Metadata Elements – North American Profile (HNAP)](#harmonized-minimum-mandatory-metadata-elements-north-american-profile-hnap)

[4. Additional Guidelines](#additional-guidelines)

[4.1 Bilingual Support](#bilingual-support)

[4.2 Header Information](#header-information)

[4.3 Codelists](#codelists)

<a name="codelists"></a>

<a name="#harmonized-minimum-mandatory-metadata-elements-north-american-profile-hnap"></a>
# 3. Harmonized Minimum Mandatory Metadata Elements – North American Profile (HNAP)

This section provides guidelines for populating NAP minimum mandatory metadata elements for Government of Canada geospatial datasets with the additional guidance and examples present to support a more consistent, government wide application of the metadata standards. To supplement the minimum mandatory elements of NAP, other ISO 19115:2003 metadata elements have been added and are considered mandatory.

Notes:

- Items identified with a \* are additional minimum mandatory requirements from ISO 19115:2003 as defined by NAP.

- Items identified with a \*\* are additional minimum mandatory requirements from ISO 19115:2003 for consistency within Government of Canada departmental and Open Data catalogues.

- Items identified with a (C) are requirements conditional to a rule specified.

- Items identified with a (O) are optional but are included with guidance to promote consistency when implemented.

- Shaded areas in table below have been taken verbatim from document entitled “North American Profile of ISO 19115:2003 – Geographic Information – Metadata, Minimum mandatory set of metadata items – Dataset”.
 
  Areas without shading contain HNAP conditions, guidance and examples.

## Metadata Record Information ``MD_Metadata``

### Clause 5.2.1 ``fileIdentifier``\* 

**Guideline:** Each metadata record shall have a universal unique identifier (UUID) to distinguish it from others. UUID will be generated according to ISO/IEC 9834-8:2005 using version 4 (random) or version 5 (SHA-1 hash) variants. Single or bulk version 4 (random) UUIDs can be generated at https://www.uuidgenerator.net/version4 .

**Example:**
```xml
<gmd:fileIdentifier>
  <gco:CharacterString>c959fb7e-6bac-41dd-a881-582332</gco:CharacterString>
</gmd:fileIdentifier>
```

### Clause: 5.2.2 ``language``\* 

**Notes:** Language code and country code: fra; CAN or eng; CAN of the initial metadata language.

**Guideline: Each metadata record shall be provided in a bilingual format with both Official Languages provided.**
NAP registered code lists based on ISO 639.2 alpha-3 codes for language and ISO 3166-1 alpha-3 codes for countries shall be used to describe language.

**Example:**
```xml
<gmd:language>
  <gco:CharacterString>eng; CAN</gco:CharacterString>
</gmd:language>
```

### Clause: 5.2.3 ``characterSet``\* 

The character set for the metadata representation is restricted to "utf8," as used for ISO/TS 19139:2007 compliant XML encoding.

**Guideline:** characterSet shall use codelist [napMD_CharacterSetCode](http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_95). Value will be “utf8; utf8”.

**Example:**

```xml
<gmd:MD_CharacterSetCode codeListValue=”RI_458” codeList=http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_95”>utf8; utf8</gmd:MD_CharacterSetCode>
```

### Clause: 5.2.4 ``parentIdentifier``\* (C[<sup>1</sup>](#footnote1)) <a name="1"></a> 

**Note:** parentIdentifier is documented when the hierarchy of a higher level exists.

### Clause: 5.2.5 ``hierarchyLevel``\* 

**Note:** Dataset level to which the metadata applies.

**Guideline:** hierarchyLevel shall use codelist [napMD_ScopeCode](http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_106). Values typically are “dataset” or “series”.

### Clause: 5.2.6 ``contact``

**Reference:** See Responsible Party

**Note:** contactInfo is mandatory in this case

### Clause: 5.2.7 ``dateStamp`` 

**Note:** Date that the metadata was last modified a Date or DateTime type.

### Clause: 5.2.8 ``metadataStandardName``

**Guideline:** metadataStandardName shall conform to “North American Profile of ISO 19115:2003 - Geographic information - Metadata; Profil nord-américain de la norme ISO 19115:2003 - Information géographique - Métadonnées”.<br />

Warning: in some software, because of autocorrection, "-" becomes "–" which is not valid.

**Example:**

```xml
 <metadataStandardName xsi:type="gmd:PT_FreeText_PropertyType">
     <gco:CharacterString>North American Profile of ISO 19115:2003 - Geographic information - Metadata</gco:CharacterString>
     <gmd:PT_FreeText>
       <gmd:textGroup>
          <gmd:LocalisedCharacterString locale="#fra">Profil nord-américain de la norme ISO 19115:2003 - Information géographique - Métadonnées</gmd:LocalisedCharacterString>
       </gmd:textGroup>
     </gmd:PT_FreeText>
</metadataStandardName>
```

### Clause: 5.2.11 locale*\* 

**Reference:** See Locale

**Note:** Mandatory as more than one language is used in free text descriptions.

### Clause: 5.2.12 Identification Information 

**Reference:** See Data Identification

### Clause: 5.2.17 Reference System Information (C)\* 

**Reference:** See Reference System

** Note:** Information  Mandatory, if spatialRepresentionType[<sup>2</sup>](#footnote2) in Data Identification is "vector," "grid" or "tin”. <a name="2"></a>

### Clause: 5.2.20 Distribution Information*\*

**Reference:** See Distribution Information (see 5.11)

**Note:** Information about acquiring the dataset.

## Data Identification ``MD_DataIdentification`` 

### Clause: 5.3.1.1 ``citation`` 

**Reference:** See Citation

### Clause: 5.3.1.2 ``abstract`` 

### Clause: 5.3.1.5 ``status``\* 

**Reference:** CodeList [napMD_ProgressCode](http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_106)

### Clause: 5.3.1.9 `language` 

**Note:** The language of the data set. Repeat for multiple languages.

### Clause: 5.3.1.7 ``spatialRepresentationType``\*\* 

**Reference:** CodeList napMD_SpatialRepresentationTypeCode.

**Guideline** spatialRepresentationType shall be included and conform to “vector; vecteur, grid; grille, textTable; texteTable, tin; tin, stereoModel ; stéréomodèle, video; vidéo”

**Example:**

```xml
<gmd:spatialRepresentationType>
    <gmd:MD_SpatialRepresentationTypeCode codeListValue="RI_635" codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_109">vector; vecteur</gmd:MD_SpatialRepresentationTypeCode>
 </gmd:spatialRepresentationType>
```

### Clause: 5.3.1.11 ``topicCategory``\* 

**Reference:** CodeList [napMD_TopicCategoryCode](http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_110)

**Note:** A topicCategory code shall be provided when hierarchyLevel is set to "dataset." Since this is an enumerated list in the schema, a codelist cannot be used; only the English term can be entered.

**Guideline** See example.

**Example:**

```xml
<gmd:topicCategory>
  <gmd:MD_TopicCategoryCode> imageryBaseMapsEarthCover</gmd:MD_TopicCategoryCode>
</gmd: topicCategory >
```

### Clause: 5.3.1.13 ``extent``\* 

**Reference:** See Extent (Geographic Bounding Box and Temporal Extent is mandatory for dataset)

**Note:** Geographic Bounding Box and Temporal Extent are required.

### Clause: 5.3.1.15 Resource Maintenance Information\*\*

**Reference:** See Maintenance Information

### Clause: 5.3.1.17 Descriptive Keywords\*\*

**Reference:** See Keywords

### Clause: 5.3.1.18 Resource Constraints\*\*

**Reference:** See Legal Constraints

**Guideline:** For data assessed and approved for release under the Open Government Licence - Canada (Open Data), the inclusion of 5.4.2 Legal Constraints (5.4.2.1, 5.4.2.2 and 5.4.2.3) is mandatory.

For data not released under the Open Government Licence - Canada (non-open data), 5.4.2 Legal Constraints is mandatory with the appropriate text added to 5.4.2.1 useLimitation to convey restrictions and the appropriate code selected from napMD_RestrictionCode for both 5.4.2.2 accessConstraints and 5.4.2.3 useConstraints.

5.2.3.4 otherConstraints is mandatory where accessConstraints and/or useConstraints are set to “otherRestrictions”, and will appropriately note any other restrictions.

## Keywords ``MD_Keywords``

### Clause: 5.3.6.1 ``keyword``\*\*

**Notes:** Applies to dataset not metadata.

**Guidance:** The MD_Keywords category of metadata elements shall be mandatory. At a minimum, one keyword must be supplied from the [Government of Canada Core Subject Thesaurus](https://canada.multites.net). **Only the preferred terms can be used.** **Do not create a hierarchical string of general to preferred terms.**

**Best practices:**

> **Specificity:** Choose the most specific term(s) available when describing the subject of a resource. As a general rule, do not index a resource with both broad and narrow terms (i.e., birds; migratory birds), unless a resource specifically addresses topics in this way.
>
> **Exhaustivity:** As far as possible, every essential concept dealt with in a resource should be represented with the appropriate term(s). This does not mean more is better. Remember the first rule: be specific.
> 
> **Consistency:** Keep a consistent form to terms. In English, count nouns are generally in the plural form, while non-count nouns, as well as abstract concepts, are in the singular form. In French, most terms are in the singular form.</strong>

Source LAC: https://canada.multites.net/cst/def.asp?lang=En&n=EF4A5555-1

### Clause: 5.3.6.3 ``thesaurusName`` [(C)\*\*](#_condition_thesaurusName")

**Guideline** Where keywords come from a controlled source, the thesaurus name along with its creation date, publication date and organization name will be cited. Ensure latest publication date is referenced at time of metadata creation.

<a name="condition_thesaurusName">(C)**</a> thesaurusName is mandatory when using a controlled vocabulary, such as the Government of Canada Core Subject Thesaurus. If the keyword does not come from a thesaurus (i.e. **a free text**, user defined keyword), then only the keyword element is mandatory.

**NOTE:** FGP Catalogue automatically supplies the latest version and latest publication date for the Government of Canada Core Subject Thesaurus.

**Example:**

```xml
<gmd:descriptiveKeywords>
  <gmd:MD_Keywords>
    <gmd:keyword xsi:type="gmd:PT_FreeText_PropertyType">
      <gco:CharacterString>Drainage</gco:CharacterString>
      <gmd:PT_FreeText>
        <gmd:textGroup>
          <gmd:LocalisedCharacterString locale=“#fra”>Drainage</gmd:LocalisedCharacterString>
      </gmd:textGroup>
    </gmd:PT_FreeText>
  </gmd:keyword>
  <gmd:keyword xsi:type="gmd:PT_FreeText_PropertyType">
    <gco:CharacterString>Remote sensing</gco:CharacterString>
    <gmd:PT_FreeText>
      <gmd:textGroup>
        <gmd:LocalisedCharacterString locale=“#fra”>Télédétection</gmd:LocalisedCharacterString>
    </gmd:textGroup>
  </gmd:PT_FreeText>
</gmd:keyword>
<gmd:thesaurusName>
<gmd:CI_Citation>
  <gmd:title xsi:type="gmd:PT_FreeText_PropertyType">
    <gco:CharacterString>Government of Canada Core Subject Thesaurus</gco:CharacterString>
    <gmd:PT_FreeText>
      <gmd:textGroup>
        <gmd:LocalisedCharacterString locale=“#fra”>Thésaurus des sujets de base du gouvernement du Canada</gmd:LocalisedCharacterString>
    </gmd:textGroup>
  </gmd:PT_FreeText>
</gmd:title>
<gmd:date>
  <gmd:CI_Date>
    <gmd:date>
      <gco:Date>2004</gco:Date>
    </gmd:date>
    <gmd:dateType>
      <gmd:CI_DateTypeCode codeListValue="RI_366"
                           codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_87">creation;création </gmd:CI_DateTypeCode>
    </gmd:dateType>
  </gmd:CI_Date>
</gmd:date>
<gmd:date>
  <gmd:CI_Date>
    <gmd:date>
      <gco:Date>2015-04-21</gco:Date>
    </gmd:date>
    <gmd:dateType>
      <gmd:CI_DateTypeCode codeListValue="RI_367"
                           codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_87">publication;publication</gmd:CI_DateTypeCode>
    </gmd:dateType>
  </gmd:CI_Date>
</gmd:date>
<gmd:citedResponsibleParty>
  <gmd:CI_ResponsibleParty>
    <gmd:organisationName xsi:type="gmd:PT_FreeText_PropertyType">
      <gco:CharacterString>Government of Canada; Library and Archives Canada</gco:CharacterString>
      <gmd:PT_FreeText>
        <gmd:textGroup>
          <gmd:LocalisedCharacterString locale=“#fra”>Gouvernement du Canada; Bibliothèque et Archives Canada</gmd:LocalisedCharacterString>
      </gmd:textGroup>
    </gmd:PT_FreeText>
  </gmd:organisationName>
  <gmd:role>
    <gmd:CI_RoleCode codeListValue="RI_409" codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_90">custodian; conservateur</gmd:CI_RoleCode>
  </gmd:role>
</gmd:CI_ResponsibleParty>
</gmd:citedResponsibleParty>
        </gmd:CI_Citation>
        </gmd:thesaurusName>
        </gmd:MD_Keywords>
        </gmd:descriptiveKeywords>
```

## Legal Constraints ``MD_LegalConstraints``

### Clause: 5.4.2.1 ``useLimitations``\*\*

**Reference:** free text (CharacterString)

**Note::** Applies to dataset and metadata.

**Guideline:** For data assessed and approved for release under the Open Government Licence - Canada useLimitation shall be mandatory and conform to, “Open Government Licence - Canada (<a href="http://open.canada.ca/en/open-government-licence-canada">http://open.canada.ca/en/open-government-licence-canada</a>)” (English) and “Licence du gouvernement ouvert - Canada (<a href="http://ouvert.canada.ca/fr/licence-du-gouvernement-ouvert-canada">http://ouvert.canada.ca/fr/licence-du-gouvernement-ouvert-canada</a>)” (French).

For data not released under the Open Government Licence - Canada (i.e. assessed as non-open data) appropriate text will be added to convey restrictions.

### Clause: 5.4.2.2 ``accessConstraints``\*\*

**Reference:** CodeList napMD_RestrictionCode

**Note:** Applies to dataset and metadata.

**Guideline:** For data assessed and approved for release under the Open Government Licence - Canada accessConstraints shall be mandatory and conform to “licence; licence” (see example).

### Clause: 5.4.2.3 ``useConstraints``\*\*

**Reference:** CodeList napMD_RestrictionCode

**Note::** Applies to dataset and metadata.

**Guideline:** For data assessed and approved for release under the Open Government Licence - Canada useConstraints shall be mandatory and conform to “licence; licence” (see example).


### 5.4.2.4 ``otherConstraints``

**Reference:** free text (CharacterString)

**Note:** Applies to dataset and metadata.

**Guideline:** otherConstraints shall be provided where accessConstraints (5.4.2.2) or useConstraints (5.4.2.3) is set to "otherRestrictions."

**Example:**

```xml
<gmd:resourceConstraints>
     <gmd:MD_LegalConstraints>
       <gmd:useLimitation xsi:type="gmd:PT_FreeText_PropertyType">
          <gco:CharacterString>Open Government Licence - Canada (http://open.canada.ca/en/open-government-licence-canada)</gco:CharacterString>
       <gmd:PT_FreeText>
          <gmd:textGroup>
             <gmd:LocalisedCharacterString locale="#fra">Licence du gouvernement ouvert - Canada (http://ouvert.canada.ca/fr/licence-du-gouvernement-ouvert-canada)</gmd:LocalisedCharacterString>
          </gmd:textGroup>
       </gmd:PT_FreeText>
     </gmd:useLimitation>
    <gmd:accessConstraints>
       <gmd:MD_RestrictionCode codeListValue="RI_606"    codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_107">license; licence</gmd:MD_RestrictionCode>
     </gmd:accessConstraints>
    <gmd:useConstraints>
       <gmd:MD_RestrictionCode codeListValue="RI_606" codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_107">license; licence</gmd:MD_RestrictionCode>
    </gmd:useConstraints>
  </gmd:MD_LegalConstraints>
</gmd:resourceConstraints>
```

## Maintenance Information ``MD_MaintenanceInformation``

### Clause: 5.6.1 ``maintenanceAndUpdateFrequency``\*\*

**Reference:** CodeList [napMD_MaintenanceFrequencyCode](http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_106)

**Guideline**: maintenanceAndUpdateFrequency shall be mandatory. Select one of: continual, daily, weekly, fortnightly, monthly, quarterly, biannually, annually, asNeeded, irregular, notPlanned, unknown, semimonthly (continue, quotidien, hebdomadaire, quinzomadaire, mensuel, trimestriel, semestriel, annuel, auBesoin, irrégulier, nonPlanifié, inconnu, bimensuel)

**Example:**

```xml
<gmd:resourceMaintenance>
    <gmd:MD_MaintenanceInformation>
       <gmd:maintenanceAndUpdateFrequency>
          <gmd:MD_MaintenanceFrequencyCode codeListValue="RI_538"
                                           codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_102">biannually; semestriel</gmd:MD_MaintenanceFrequencyCode>
       </gmd:maintenanceAndUpdateFrequency>
     </gmd:MD_MaintenanceInformation>
 </gmd:resourceMaintenance>
```

## Reference System Identifier ``RS_Identifier``

### Clause: 5.8.2.2 ``code``

**Note:** The alphanumeric value identifying the reference system, e.g. "EPSG:4269"

### Clause: 5.8.2.3 ``codespace`` (C)\*\*

**Note:** Identifier/namespace of the system in which the code is valid, e.g. https://epsg.org/ . **In cases where an identifier/namespace does not apply (e.g.Proj4), codespace is not mandatory.**

### Clause: 5.8.2.4 ``version`` (C)\*\*

**Note:** **In cases where a version does not apply (e.g.Proj4), version is not mandatory.**

**Guideline**: The preference is to only use projections that have their parameters described on a web accessible resource (see example). The first preference is to use the EPSG code from  
https://epsg.org/, The second preference is to use the SR-ORG code from https://www.spatialreference.org. However, some projections are not registered in an online registry. In these cases try registering the spatial reference with either https://epsg.org/ or https://www.spatialreference.org. As a last resort, enter the proj4 parameters into the code element and leave codespace and version empty.

**Examples:**

EPSG.org

```xml
<gmd:referenceSystemInfo>
  <gmd:MD_ReferenceSystem>
    <gmd:referenceSystemIdentifier>
      <gmd:RS_Identifier>
        <gmd:code>
          <gco:CharacterString>EPSG:4269</gco:CharacterString>
        </gmd:code>
        <gmd:codeSpace>
            <gco:CharacterString>http://www.epsg-registry.org</gco:CharacterString>
        </gmd:codeSpace>
        <gmd:version>
            <gco:CharacterString>8.6.2</gco:CharacterString>
        </gmd:version>
      </gmd:RS_Identifier>
    </gmd:referenceSystemIdentifier>
  </gmd:MD_ReferenceSystem>
</gmd:referenceSystemInfo>
```

SR-ORG

```xml
<gmd:referenceSystemInfo>
  <gmd:MD_ReferenceSystem>
    <gmd:referenceSystemIdentifier>
      <gmd:RS_Identifier>
        <gmd:code>
            <gco:CharacterString>SRG-ORG:29</gco:CharacterString>
        </gmd:code>
        <gmd:codeSpace>
            <gco:CharacterString>http://www.spatialreference.org</gco:CharacterString>
        </gmd:codeSpace>
      </gmd:RS_Identifier>
    </gmd:referenceSystemIdentifier>
  </gmd:MD_ReferenceSystem>
</gmd:referenceSystemInfo>
```

**Proj4**

```xml
<gmd:referenceSystemInfo>
  <gmd:MD_ReferenceSystem>
    <gmd:referenceSystemIdentifier>
      <gmd:RS_Identifier>
        <gmd:code>
          <gco:CharacterString>+proj=lcc +lat_1=50 +lat_2=70 +lat_0=40 +lon_0=-96 +x_0=0 +y_0=0 +ellps=GRS80
            +datum=NAD83 +units=m +no_defs +proj=lcc +ellps=GRS80 +lat_0=60+lon_0=-95 +lat_1=55 +lat_2=80
            +datum=NAD83 +units=m no_defs +proj=tmerc +lat_0=0.000000000 +lon_0=-62.000000000 +k=0.999500
            +x_0=400000.000 +y_0=0.000 +ellps=clrk80 +towgs84=-255,-15,71,0,0,0,0 +units=m  no_defs +proj=tmerc
            +lat_0=0.000000000 +lon_0=-62.000000000 +k=0.999500 +x_0=400000.000 +y_0=0.000 +ellps=clrk80
            +towgs84=725,685,536,0,0,0,0 +units=m  no_defs +proj=lcc +ellps=WGS84 +lat_0=0 +lon_0=-95 +lat_1=49
            +lat_2=77 +x_0=0 +y_0=-8000000.0 +datum=WGS84 +units=m no_defs +proj=aea +ellps=GRS80 +lat_0=45
            +lon_0=-126.0 +lat_1=50.0 +lat_2=58.5 +x_0=1000000.0 +y_0=0 +datum=NAD83 +units=m no_defs 
            +proj=lcc +ellps=GRS80 +lat_0=49 +lon_0=-95 +lat_1=49 +lat_2=77 +datum=NAD83 +units=m no_defs 
          </gco:CharacterString>
        </gmd:code>
      </gmd:RS_Identifier>
    </gmd:referenceSystemIdentifier>
  </gmd:MD_ReferenceSystem>
</gmd:referenceSystemInfo>
```

## Distribution Information ``MD_Distribution``

### Clause: 5.11.1 Transfer Options\*\*

**Reference:** See TransferOptions

### Clause: 5.11.2 Distributor*\*

**Reference:** See MD_Distributor

### Clause: 5.11.3 Distribution Format\*\*

**Reference:** See Distribution Format

## Distributor< ``MD_Distributor``

### Clause: 5.11.2.1 ``distributorContact``\*\*

**Reference:** See CI_ResponsibleParty

**Note:** Information on party responsible for dataset distribution.

## Transfer Options ``MD_DigitalTransferOptions``

### Clause: 5.11.1.3 ``onLine``\*\*

**Reference:** See Online Resource

## Distribution Format ``MD_Format``

### Clause: 5.11.3.1 ``name``\*\*

**Guideline:** Name shall be mandatory. Select a format name from the <a href="http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format">FGP Format Names controlled vocabulary</a> . (http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format)

NOTE: ZIP is not a useful descriptor for format from a usability perspective; it is not a recommended choice for format. Where a ZIP or other compression file is provided, please ensure that you <span class="underline">ALSO</span> indicate all resource formats found within the compressed file. This enables users to assess whether the resource is available in a format(s) they can use, without having to download and unzip the file.</strong>

NOTE: If you have a format that is not listed in the <a href="http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format">FGP Format Names controlled vocabulary</a>, please contact <strong>Cindy Mitchell, Natural Resources Canada (<a href="mailto:cindy.mitchell@canada.ca">cindy.mitchell@canada.ca</a>).

### Clause: 5.11.3.2 ``version``\*\*

**Guideline** version shall be mandatory. Choose the version number or date of the format chosen. If version is unknown use the value unknown.

## Extent ``EX_extent``

### Clause: 5.13.3 Geographic Bounding Box

**Reference:** See Geographic Bounding Box

### Clause: 5.13.5 Temporal Element

**Reference:** See Temporal Element

## Geographic Bounding Box ``EX_GeographicBoundingBox``

### Clause: 5.13.3.2 ``westBoundingLongitude``

### Clause: 5.13.3.3 ``eastBoundingLongitude``

### Clause: 5.13.3.4 ``southBoundingLatitude``

### Clause: 5.13.3.5 ``northBoundingLatitude``

**Examples:**

```xml
  <gmd:extent>
    <gmd:EX_Extent>
      <gmd:geographicElement>
        <gmd:EX_GeographicBoundingBox>
                <gmd:westBoundLongitude>
                  <gco:Decimal>-135.4338658</gco:Decimal> 
                </gmd:westBoundLongitude>
                <gmd:eastBoundLongitude>
                  <gco:Decimal>-131.4236097</gco:Decimal>
                </gmd:eastBoundLongitude>
                <gmd:southBoundLatitude>
                  <gco:Decimal>57.705188766</gco:Decimal> 
                </gmd:southBoundLatitude>
                <gmd:northBoundLatitude>
                  <gco:Decimal>59.696028939</gco:Decimal> 
                </gmd:northBoundLatitude>
        </gmd:EX_GeographicBoundingBox>
      </gmd:geographicElement>
    </gmd:EX_Extent>
  </gmd:extent>
```

## Temporal Element ``EX_TemporalExtent``

### Clause: 5.13.5.1 ``extent``

**Guideline**: TemporalExtent will be used to describe the time period that a particular dataset covers or describes. beginPosition describes the Beginning or Start date of the dataset while endPosition describes the Final date for which the dataset is describing. Some datasets will have a known beginPosition but will not have a known endPosition as the dataset is still “valid” for the current time period. Therefore beginPosition is mandatory and endPosition is optional. Date format in beginPosition and endPosition will comply with YYYY-MM-DD, YYYY-MM, or YYYY (ISO 8601).

**Example:**

```xml
 <gmd:extent>
    <gmd:EX_Extent>
      <gmd:temporalElement>
      <gmd:EX_TemporalExtent>
         <gmd:extent>
           <gml:TimePeriod gml:id="timeperiod1">
              <gml:beginPosition>2011-01-01</gml:beginPosition>
              <gml:endPosition>2011-12-31</gml:endPosition>
            </gml:TimePeriod>
            </gmd:extent>
          </gmd:EX_TemporalExtent>
        </gmd:temporalElement>
      </gmd:EX_Extent>
    </gmd:extent>
  <gmd:extent>
```

## Citation ''CI_Citation</em>''

### Clause: 5.14.1 ``title``

### Clause: 5.14.3 ``date``

**Reference:** See Date

### Clause: 5.14.7 ``citedResponsibleParty``\*

**Reference:** See Responsible Party

## Date ''CI_Date</em>''

### Clause: 5.15.1 ``date``

### Clause: 5.15.2 ``dateType``

**Reference:** Codelist [napCI_DateTypeCod](http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_87)

**Guideline:** date and dateType values shall be provided for dateType values of creation, publication, and (where applicable) revision.

**Example:**

```xml
 <gmd:date>
    <gmd:CI_Date>
      <gmd:date>
        <gco:Date>2009-10-31</gco:Date>
      </gmd:date>
      <gmd:dateType>
        <gmd:CI_DateTypeCode codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_87" codeListValue="RI_367">publication; publication</gmd:CI_DateTypeCode> 
        </gmd:dateType>
    </gmd:CI_Date>
  </gmd:date>
  <gmd:date>
    <gmd:CI_Date>
      <gmd:date>
        <gco:Date>2009-10-31</gco:Date>
      </gmd:date>
      <gmd:dateType>
        <gmd:CI_DateTypeCode codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_87" codeListValue="RI_366">creation; création</gmd:CI_DateTypeCode>
      </gmd:dateType>
    </gmd:CI_Date>
  </gmd:date>
  <gmd:date>
    <gmd:CI_Date>
      <gmd:date>
        <gco:Date>2009-10-31</gco:Date>
      </gmd:date>
      <gmd:dateType>
        <gmd:CI_DateTypeCode codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_87" codeListValue="RI_368">revision; révision</gmd:CI_DateTypeCode> 
      </gmd:dateType>
    </gmd:CI_Date>
  </gmd:date>
```

## Responsible Party ``CI_ResponsibleParty``

### Clause: 5.16.2 ``organizationName``\*\*

**Guideline:** organizationName shall be mandatory. Federal department and agency titles will conform to Federal Identity Program policy and use the Applied Title for their department or agency as defined at http://www.tbs-sct.gc.ca/fip-pcim/reg-eng.asp. 5.16.2 organizationName will conform to the format: Government of Canada; AppliedTitle. Sub-organizations (sectors, branches, etc.) may be included at the option of the department. See Responsible Party example below.

### Clause: 5.16.4 ``contactInfo``* (C)

**Reference:** See Contact

**Note:** Mandatory in the context of Metadata Record Information, Data Identification and Distributor Information.

### Clause: 5.16.5 ``role``

**Reference:** Codelist [napCI_RoleCode](http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_90)

**Example:**

```xml
<gmd:contact>
  <gmd:CI_ResponsibleParty>
    <gmd:organisationName  “xsi:type="gmd:PT_FreeText_PropertyType">
      <gco:CharacterString>Government of Canada; Agriculture and Agri-Food Canada; Science and Technology Branch; Agri-Geomatics</gco:CharacterString>
      <PT_FreeText>
        <textGroup>
          <gmd:LocalisedCharacterString locale=“#fra”>Gouvernement du Canada; Agriculture et Agroalimentaire Canada; Direction générale des sciences et de la technologie;  Agrogéomatiques</LocalisedCharacterString>
        </textGroup>
      </PT_FreeText>
    </gmd:organisationName>
    <gmd:contactInfo>
      <gmd:CI_Contact>
        <gmd:address>
          <gmd:CI_Address>
            <gmd:electronicMailAddress>
              <gco:CharacterString>agri-geomatics-agrog@agr.gc.ca</gco:CharacterString>
            </gmd:electronicMailAddress>
          </gmd:CI_Address>
        </gmd:address>
      </gmd:CI_Contact>
    </gmd:contactInfo>
    <gmd:role>
      <gmd:CI_RoleCode codeListValue="RI_414"
                       codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_90">pointOfContact; contact</gmd:CI_RoleCode>
    </gmd:role>
  </gmd:CI_ResponsibleParty>
</gmd:contact>
```

## Contact ''CI_Contact''

### Clause: 5.17.2 ``address``\*\*

**Referencce:** See Address

**Guideline:** address shall be mandatory (see Responsible Party example).

## Address ''CI_Address''

### Clause: 5.19.6 ``electronicMailAddress``\*\*

**Guideline:** electronicMailAddress shall be mandatory (see Responsible Party example).

## Online Resource ''CI_OnlineResource''

**FGP Requirement:** For each web service noted as an online resource, add an attribute on the "online" element to register the language of the resource. Acceptable values are xlink:role="urn:xml:lang:eng-CAN" and xlink:role="urn:xml:lang:fra-CAN". Required for FGP implementation of Geonetwork/RCS/Ramp system. See example.

### Clause: 5.20.1 ``linkage``

**FGP Requirement:**

1) For a OGC:WMS web map service:

   An OGC WMS GetCapabilities request with or without the addition of a non-standard “LAYERS=<layername>” parameter. For FGP implementation, layername is used for WMS with only one layer or one group layer name.<br />
Optionally, two other non-standard parameters can be added to indicate the preferred legend and get_feature_info  formats. The parameters are: LEGEND_FORMAT=<legend_format> and FEATURE_INFO_TYPE=<featureInfoformat>. When legend and/or get_feature_info formats are not provided, FGP may not enable legend and get feature info functionalities correctly.

    Examples:

    Multiple layers, no optional parameters: <br/> 
  http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities

    Single layer :<br/>
  http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities&amp;layers=railway

    Multiple layers with optional parameters:<br/>
  http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities&amp;legend_format=image/png&amp;feature_info_type=text/html

    Single layer or group layer name with optional parameters:<br/>
  http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities&amp;layers=railway&amp;legend_format=image/png&amp;feature_info_type=text/html

2. For an Esri Map Service:

   Multiple, group or dynamic layers: An Esri mapserver request.

   Feature layer: An Esri mapserver request with the addition of the layer number.
   
   Examples:

   Multiple layers: <br/>
   http://ec.gc.ca/arcgis/rest/services/data_donnees/16074bd5-66ed-45a5-b9c3-a9c33cf58e6c/MapServer

   Group layers: <br/>
   http://ec.gc.ca/arcgis/rest/services/CESI_FGP_All_Layers/MapServer/0

   Dynamic capabilities: <br/>
   http://www.agr.gc.ca/atlas/rest/services/mapservices/aafc_census_of_agriculture_2011_ccs/MapServer

   Feature layer: <br/>
   http://ec.gc.ca/arcgis/rest/services/data_donnees/16074bd5-66ed-45a5-b9c3-a9c33cf58e6c/MapServer/0

3. For an Esri Feature Service:

   Multiple layers: An Esri mapserver request.

   Single layer: An Esri mapserver request with the addition of the layer number.

   Examples:

   Multiple layers: <br/>
   http://www.agr.gc.ca/atlas/rest/services/app_cdm_ssc/canadian_drought_monitor_editing/FeatureServer

   Single layer: <br/>
   http://www.agr.gc.ca/atlas/rest/services/app_cdm_ssc/canadian_drought_monitor_editing/FeatureServer/0

4. For an Esri Image Service:

   An Esri imageserver request.

  Example:

  http://www.agr.gc.ca/atlas/rest/services/imageservices/mb_colour_orthos_50cm/ImageServer

5. For an Esri Tiled Map Service:

   An Esri mapserver request.

   Example:

   http://geoappext.nrcan.gc.ca/arcgis/rest/services/BaseMaps/CBMT_CBCT_GEOM_3857/MapServer

**Guideline**: For any other online resource (dataset, **service**, **application**, supporting document, data dictionary, etc.), add a valid URL.

### Clause: 5.20.2 ``protocol``\*

**FGP Requirement:** This element is being used to support communication between the FGP Catalogue and the RCS service. Several types of web map services are designated as compatible for use with RCS and the FGP Visualization application. To allow the RCS application to recognize and work with these supported services, these web map services will be documented in the protocol element as:

1. OGC:WMS</strong> for OGC Web Map Service
2. ESRI REST: Map Service</strong> for Esri Mapping Service
3. ESRI REST: Feature Service</strong> for Esri Feature Service
4. ESRI REST: Image Service</strong> for Esri Image Service
5. ESRI REST: Tiled Map Service</strong> for Esri Tiled Map Service

**Guideline:** For any other online resources (i.e. not an FGP supported web map service), a value for 5.20.2 protocol should be taken from an official controlled list such as the Official Internet Protocol Standards published on the Web at >http://www.rfc-editor.org/rfcxx00.html or the Internet Assigned Numbers Authority (IANA) at http://www.iana.org/numbers.html. Protocol value is typically HTTP, HTTPS or FTP.

### Clause: 5.20.4 ``name``*\*

**Guideline:** The name of the resource being described

**FGP Guideline:** Follow [FGP File Naming Convention](http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Structure#Dataset_title_naming_convention) for best results.  This is especially important when providing a name for web services, to ensure that a descriptive title is shown to the user when web services are displayed on a map. Do not include organization names or language of the resource in the title. This information is already provided and will appear redundant. Focus instead on providing specific, informative names that describe the subject of the resource.

### Clause: 5.20.5 ``description``\*\*

**Guideline:** Description shall be mandatory and will support the display of the language, content type and format of the resource on the Open Government Portal. **To allow for successful loading and access of resources on Open Government Portal, it is imperative that this field conform to the guidance below.**

The following information describing the online resource will be entered into this field, in precisely the following format: ``ContentType;Format;Lang,Lang,Lang``

ContentType:

  Select one content type from the following list: Dataset, Données, Web Service, Service Web, API, API, Supporting Document, Document de soutien, Application, Application

  NOTE: Supporting Document is used to indicate resources such as data dictionary, metadata record, etc.

Format:

  Select a format name from the [FGP Format Names controlled vocabulary](http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format). http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format

  **NOTE: ZIP is not a useful descriptor for format from a usability perspective; it is not a recommended choice for format. Where a ZIP or other compression file is provided, please ensure that you __ALSO__ indicate all resource formats found within the compressed file. This enables users to assess whether the resource is available in a format(s) they can use, without having to download and unzip the file.**

  NOTE: If you have a format that is not listed in the [FGP Format Names controlled vocabulary](http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format), please contact **Cindy Mitchell, Natural Resources Canada (<a href="mailto:cindy.mitchell@canada.ca">cindy.mitchell@canada.ca</a>).**

Language:

  Select one or more language designation from the following list: ``eng``, ``fra``, ``zxx``

  NOTE: ``zxx`` is the ISO 639-2/T code for "no linguistic content", e.g. animal sounds, raw satellite image.

  Delimit each language designation with a comma (,).

  To add a language other than French or English, include the appropriate ISO 639-2/T (use /T terminological, not /B bibliographical) code and append it with another comma separator.

**Example:**

```xml
<gmd:transferOptions>
    <gmd:MD_DigitalTransferOptions>
      <gmd:onLine xlink:role="urn:xml:lang:eng-CAN">
        <gmd:CI_OnlineResource>
          <gmd:linkage>
            <gmd:URL>http://maps.geogratis.gc.ca/wms/emerald_ash_borer_reg_area?service=WMS&amp;request=getCapabilities&amp;version=1.3.0&amp;layers=emerald_ash_borer_reg_area</gmd:URL>
          </gmd:linkage>
          <gmd:protocol>
            <gco:CharacterString>OGC:WMS</gco:CharacterString>
          </gmd:protocol>
          <gmd:name xsi:type="gmd:PT_FreeText_PropertyType">
            <gco:CharacterString>Emerald Ash Borer Regulated Areas</gco:CharacterString>
            <gmd:PT_FreeText>
              <gmd:textGroup>
                <gmd:LocalisedCharacterString locale="#fra">Des lieux règlementés de l'agrile du frêne</gmd:LocalisedCharacterString>
              </gmd:textGroup>
            </gmd:PT_FreeText>
          </gmd:name>
          <gmd:description xsi:type="gmd:PT_FreeText_PropertyType">
            <gco:CharacterString>Web Service;WMS;eng</gco:CharacterString>
            <gmd:PT_FreeText>
              <gmd:textGroup>
                <gmd:LocalisedCharacterString locale="#fra">ServiceWeb;WMS;eng</gmd:LocalisedCharacterString>
              </gmd:textGroup>
            </gmd:PT_FreeText>
          </gmd:description>
         </gmd:CI_OnlineResource>
      </gmd:onLine>
      <gmd:onLine xlink:role="urn:xml:lang:fra-CAN">
        <gmd:CI_OnlineResource>
          <gmd:linkage>
            <gmd:URL>http://cartes.geogratis.gc.ca/wms/lieux_reg_agrile_du_frene?service=WMS&amp;request=getCapabilities&amp;version=1.3.0&amp;layers=lieux_reg_agrile_du_frene</gmd:URL>
          </gmd:linkage>
          <gmd:protocol>
            <gco:CharacterString>OGC:WMS</gco:CharacterString>
          </gmd:protocol>
          <gmd:name xsi:type="gmd:PT_FreeText_PropertyType">
            <gco:CharacterString>Emerald Ash Borer Regulated Areas</gco:CharacterString>
            <gmd:PT_FreeText>
              <gmd:textGroup>
                <gmd:LocalisedCharacterString locale="#fra">Des lieux règlementés de l'agrile du frêne</gmd:LocalisedCharacterString>
              </gmd:textGroup>
            </gmd:PT_FreeText>
          </gmd:name>
          <gmd:description xsi:type="gmd:PT_FreeText_PropertyType">
            <gco:CharacterString>Web Service;WMS;fra</gco:CharacterString>
            <gmd:PT_FreeText>
              <gmd:textGroup>
                <gmd:LocalisedCharacterString locale="#fra">Service Web;WMS;fra</gmd:LocalisedCharacterString>
              </gmd:textGroup>
            </gmd:PT_FreeText>
          </gmd:description>
         </gmd:CI_OnlineResource>
      </gmd:onLine>
    </gmd:MD_DigitalTransferOptions>
```

## Locale ''PT_Locale''

### ``language``\*\*

### ``country``\*\*

### ``characterEncoding``\*\*

**Guideline:** NAP registered code lists based on ISO 639.2 alpha-3 terminology codes for language (eng=English, fra=French) and ISO 3166-1 alpha-3 codes (CAN=Canada) for countries shall be used to describe locale and character encoding shall be set to "utf8; utf8", as shown in the following example:

**Example:**

```xml
  <gmd:locale>
    <gmd:PT_Locale id="fra">
      <gmd:languageCode>
        <gmd:LanguageCode codeListValue="fra" codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_116">French; Français</gmd:LanguageCode>
      </gmd:languageCode>
      <gmd:country>
        <gmd:Country codeListValue="CAN" codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_117" >Canada; Canada</gmd:Country>
      </gmd:country>
      <gmd:characterEncoding>
        <gmd:MD_CharacterSetCode codeListValue="RI_458"
codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_95" >utf8; utf8</gmd:MD_CharacterSetCode>
      </gmd:characterEncoding>
    </gmd:PT_Locale>
  </gmd:locale>
```

<a name="additional-guidelines"></a>

# 4. Additional Guidelines

This section identifies other metadata characteristics identified as benefiting from standardization.

<a name="bilingual-support"></a>
## 4.1 Bilingual Support

Implement one bilingual metadata record per dataset.

<a name="header-information"></a>
## 4.2 Header Information

**Guideline** The information in the header of the NAP metadata profile should appear as in the example below.

**Example:**

```xml
<?xml version='1.0' encoding='UTF-8'?>  
<gmd:MD_Metadata
  xmlns="http://www.isotc211.org/2005/gmd"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
  xmlns:gco="http://www.isotc211.org/2005/gco"
  xmlns:gfc="http://www.isotc211.org/2005/gfc"
  xmlns:gmd="http://www.isotc211.org/2005/gmd"
  xmlns:xlink="http://www.w3.org/1999/xlink"
  xmlns:gmi="http://www.isotc211.org/2005/gmi" 
  xmlns:gml="http://www.opengis.net/gml/3.2"
  xmlns:gmx="http://www.isotc211.org/2005/gmx"
  xmlns:gsr="http://www.isotc211.org/2005/gsr" 
  xmlns:gss="http://www.isotc211.org/2005/gss" 
  xmlns:gts="http://www.isotc211.org/2005/gts"
  xmlns:srv="http://www.isotc211.org/2005/srv"
  xsi:schemaLocation="
   http://www.isotc211.org/2005/gmd
     https://schemas.metadata.geo.ca//2009/gmd/gmd.xsd
   http://www.isotc211.org/2005/srv
     https://schemas.metadata.geo.ca/2009/srv/srv.xsd
   http://www.geconnections.org/nap/napMetadataTools/napXsd/napm
     https://schemas.metadata.geo.ca/2009/napm/napm.xsd">
```

<a name="codelists"></a>
## 4.3 Codelists


**Guideline** Codelists shall conform to [http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml](http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml). Codelist values will be implemented such that both English and French are part of one value (See example below). Note: the Isotc211.org codelists does not include bilingual codelists while nap.geogratis.gc.ca does.

**Example:**

```xml
<gmd:CI_RoleCode codeList="https://schemas.metadata.geo.ca/register/napMetadataRegister.xml#IC_90"  codeListValue="RI_418">author; auteur</gmd:CI_RoleCode>
```

<a name="footnote1"><sup>1</sup></a>mandatory under given conditions ([back](#1))

<a name="footnote2"><sup>2</sup></a>spatialRepresentionType is a Data Identification's optional attribute and as such is not part of this document. ([back](#2))