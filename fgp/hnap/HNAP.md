---
title: Guide to Harmonize ISO 19115:2003 / North American Profile Metadata For Government of Canada Geospatial Data
---
# Guide to Harmonize ISO 19115:2003 / North American Profile Metadata For Government of Canada Geospatial Data

**V2.3.1**

**May 4, 2016**

Document Change Control

<table>
<tbody>
<tr class="odd">
<td>Revision Number</td>
<td>Date of Issue</td>
<td>Author(s)</td>
<td>Brief Description of Change</td>
</tr>
<tr class="even">
<td>1.0</td>
<td>Jan 17, 2014</td>
<td><p>R. Tondevold (AAFC),</p>
<p>B. Schwarz (AAFC)</p></td>
<td>First Draft</td>
</tr>
<tr class="odd">
<td>1.1</td>
<td>Jan 27, 2014</td>
<td><p>R. Tondevold (AAFC),</p>
<p>B. Schwarz (AAFC)</p></td>
<td>Includes feedback from participants</td>
</tr>
<tr class="even">
<td>1.2</td>
<td>Feb 19, 2014</td>
<td><p>R. Tondevold (AAFC),</p>
<p>B. Schwarz (AAFC)</p></td>
<td>Includes feedback from participants</td>
</tr>
<tr class="odd">
<td>1.3</td>
<td>May 16, 2014</td>
<td>R. Tondevold (AAFC)</td>
<td>Includes feedback from participants, finalized version</td>
</tr>
<tr class="even">
<td>1.4</td>
<td>Sept 25, 2014</td>
<td>C. Mitchell (NRCAN-FGP)</td>
<td>Added to background and purpose, expanded implementation guidance, integrated into Federal Geospatial Platform policy suite under Data Management and Stewardship – Catalogue.</td>
</tr>
<tr class="odd">
<td>1.5</td>
<td>Oct 1, 2014</td>
<td><p>S. Smith (NRCan)</p>
<p>J. Rupert (NRCan)</p></td>
<td>Best practice of useLimitation (5.4.2.1) instead of otherConstraints (5.4.2.4) when useing codelist napMD_RestrictionCode (5.4.2.3)</td>
</tr>
<tr class="even">
<td>2.0</td>
<td>Oct 2, 2014</td>
<td>C. Mitchell (NRCAN-FGP)</td>
<td>FGP Guideline for Harmonized North American Profile. Includes feedback from T. Spears, L. McAvoy, K. Aston.</td>
</tr>
<tr class="odd">
<td>2.1</td>
<td>Oct 28, 2014</td>
<td>J. Rupert (NRCan), C. Mitchell (NRCan)</td>
<td>topicCategory is a enumerated list and cannot use a code list. dateStamp and language notes. Add Government of Canada to ResponsibleParty. Added a locale example. Added controlled vocabulary to 5.20.1 Protocol.</td>
</tr>
<tr class="even">
<td>2.2</td>
<td>Nov 14, 2014</td>
<td>C. Mitchell (NRCan), J. Rupert (NRCan); R. Tondevold (AAFC)</td>
<td>Updates based on group discussion November 4, 2014: <a href="http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP#Issue_Log">http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP#Issue_Log</a></td>
</tr>
<tr class="odd">
<td></td>
<td>Dec 23, 2014</td>
<td>Cindy Mitchell</td>
<td>All references to Esri REST Feature Service changed to Esri REST Mapping Service.</td>
</tr>
<tr class="even">
<td>2.3</td>
<td>February 23, 2015</td>
<td>M-E Martin (NRCan), R. Tondevold (AAFC) Tondevold, Mark Smith (EC), J. Rupert (NRCan)</td>
<td>Further refinement to harmonized profile following metadata validation testing.</td>
</tr>
<tr class="odd">
<td></td>
<td>February 27, 2015</td>
<td>NRCan, EC and TBS</td>
<td>Updated guidance for 5.20.5. Typographic errors fixed.</td>
</tr>
<tr class="even">
<td></td>
<td>March 11, 2015</td>
<td>NRCan</td>
<td><p>Updated guidance for 5.20.1 Linkage</p>
<p>Typographic errors fixed.</p></td>
</tr>
<tr class="odd">
<td></td>
<td>May 28, 2015</td>
<td>NRCan</td>
<td>Correction of hyphen in the metadata standard name guideline 5.2.8. Addition of a warning about autocorrection of hyphens</td>
</tr>
<tr class="even">
<td></td>
<td>June 16, 2015</td>
<td>NRCan</td>
<td>Correction: removal of second hyphen that erroneously followed Open Government Licence - Canada; found in 5.4.2.1 guidance.</td>
</tr>
<tr class="odd">
<td></td>
<td><p>April 20, 2016</p>
<p><strong>– NOT NORMATIVE- Draft for Discussion.</strong></p></td>
<td>C. Mitchell</td>
<td>Issue log updates – proposed solutions noted in <strong>BLUE</strong> for discussion. Issues 34-44 - <a href="http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP#Issue_Log">http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP#Issue_Log</a></td>
</tr>
<tr class="even">
<td>2.3.1</td>
<td>May 04, 2016</td>
<td>C. Mitchell</td>
<td>For ease of detecting updates from v2.3, changes or updates in this version are noted in <strong>BLUE.</strong></td>
</tr>
<tr class="odd">
<td>2.3.1</td>
<td>January 18, 2017</td>
<td>C. Mitchell</td>
<td>Replaced outdated format name list (5.11.3.1) with link to authoritative version on GCPedia.</td>
</tr>
</tbody>
</table>

Contributors

|                  |                                      |
| ---------------- | ------------------------------------ |
| Participant      | Organization                         |
| Ryan Tondevold   | Agriculture and Agri-Food Canada     |
| David Lee        | Agriculture and Agri-Food Canada     |
| Brian Schwarz    | Agriculture and Agri-Food Canada     |
| Tobias Spears    | Department of Fisheries and Oceans   |
| Mark Shaw        | Environment Canada                   |
| James Doyle      | Environment Canada                   |
| Paul Paciorek    | Environment Canada                   |
| Mike Weech       | Environment Canada                   |
| Daniel Aramov    | Environment Canada                   |
| Steve Smith      | Natural Resources Canada             |
| Jamie Rupert     | Natural Resources Canada             |
| Marie-Eve Martin | Natural Resources Canada             |
| Yvon Boucher     | Natural Resources Canada             |
| Denis Boutin     | Natural Resources Canada             |
| Sylvie Jodouin   | Natural Resources Canada             |
| Cindy Mitchell   | Natural Resources Canada             |
| Ross Thompson    | Statistics Canada                    |
| Kristina Aston   | Treasury Board Secretariat of Canada |
| Alannah Hilt     | Treasury Board Secretariat of Canada |
| Chris Majewski   | Treasury Board Secretariat of Canada |

# 

# Table of Contents

[1. Background 4](#_Toc380586279)

[2. Purpose 4](#_Toc380586280)

[3. Proposed Implementation to the Minimum Mandatory Metadata Elements – NAP 6](#harmonized-minimum-mandatory-metadata-elements-north-american-profile-hnap)

[4. Additional Guidelines 26](#_Toc380586282)

[4.1 Bilingual Support 26](#bilingual-support)

[4.2 Header Information 26](#header-information)

[4.3 Codelists 26](#codelists)

# Harmonized Minimum Mandatory Metadata Elements – North American Profile (HNAP)

This section provides guidelines for populating NAP minimum mandatory metadata elements for Government of Canada geospatial datasets with the additional guidance and examples present to support a more consistent, government wide application of the metadata standards. To supplement the minimum mandatory elements of NAP, other ISO 19115:2003 metadata elements have been added and are considered mandatory.

Notes:

  - Items identified with a \* are additional minimum mandatory requirements from ISO 19115:2003 as defined by NAP.

  - Items identified with a \*\* are additional minimum mandatory requirements from ISO 19115:2003 for consistency within Government of Canada departmental and Open Data catalogues.

  - Items identified with a (C) are requirements conditional to a rule specified.

  - Items identified with a (O) are optional but are included with guidance to promote consistency when implemented.

  - Shaded areas in table below have been taken verbatim from document entitled “North American Profile of ISO 19115:2003 – Geographic Information – Metadata, Minimum mandatory set of metadata items – Dataset”. Areas without shading contain HNAP conditions, guidance and examples.

<table>
<tbody>
<tr class="odd">
<td><strong>Metadata class</strong></td>
<td><strong>Clause</strong></td>
<td><strong>Metadata item</strong></td>
<td><strong>Reference</strong></td>
<td><strong>Notes</strong></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td><p>Metadata Record Information</p>
<p><em>(MD_Metadata)</em></p></td>
<td>5.2.1</td>
<td><blockquote>
<p>fileIdentifier*</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline:</span></strong> Each metadata record shall have a universal unique identifier (UUID) to distinguish it from others. UUID will be generated according to ISO/IEC 9834-8:2005 using version 4 (random) or version 5 (SHA-1 hash) variants. Single or bulk version 4 (random) UUIDs can be generated at https://www.uuidgenerator.net/version4.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example:</span></strong></p>
<p>&lt;gmd:fileIdentifier&gt;</p>
</blockquote>
<p>&lt;gco:CharacterString&gt;c959fb7e-6bac-41dd-a881-582332&lt;/gco:CharacterString&gt;</p>
<p>&lt;/gmd:fileIdentifier&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.2.2</td>
<td><blockquote>
<p>language*</p>
</blockquote></td>
<td></td>
<td><blockquote>
<p>Language code and country code: fra; CAN or eng; CAN of the initial metadata language</p>
</blockquote></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><span class="underline"><strong>Guideline: Each metadata record shall be provided in a bilingual format with both Official Languages provided.</strong></span> NAP registered code lists based on <span class="underline"> </span> ISO 639.2 alpha-3 codes for language and ISO 3166-1 alpha-3 codes for countries shall be used to describe language. <span class="underline"> </span></p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example:</span></strong></p>
<p>&lt;gmd:language&gt;</p>
<p>&lt;gco:CharacterString&gt;eng; CAN&lt;/gco:CharacterString&gt;</p>
<p>&lt;/gmd:language&gt;</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.2.3</td>
<td><blockquote>
<p>characterSet*</p>
</blockquote></td>
<td></td>
<td><blockquote>
<p>The character set for the metadata representation is restricted to "utf8," as used for</p>
<p>ISO/TS 19139:2007 compliant XML encoding.</p>
</blockquote></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline:</span></strong> characterSet shall use codelist <a href="http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_95">napMD_CharacterSetCode</a>. Value will be “utf8; utf8”.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example:</span></strong></p>
<p><span class="underline">&lt;gmd:MD_CharacterSetCode codeListValue=”RI_458” codeList=</span><strong><a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_95">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_95</a>”&gt;utf8; utf8&lt;/gmd:MD_CharacterSetCode&gt;</strong></p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.2.4</td>
<td><blockquote>
<p>parentIdentifier* (C[1])</p>
</blockquote></td>
<td></td>
<td><blockquote>
<p>parentIdentifier is documented when the hierarchy of a higher level exists.</p>
</blockquote></td>
</tr>
<tr class="odd">
<td></td>
<td>5.2.5</td>
<td><blockquote>
<p>hierarchyLevel*</p>
</blockquote></td>
<td></td>
<td><blockquote>
<p>Dataset level to which the metadata applies.</p>
</blockquote></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline:</span></strong> hierarchyLevel shall use codelist <a href="http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_106">napMD_ScopeCode</a>. Values typically are “dataset” or “series”.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.2.6</td>
<td><blockquote>
<p>contact</p>
</blockquote></td>
<td><blockquote>
<p>See Responsible Party</p>
</blockquote></td>
<td><blockquote>
<p>contactInfo is mandatory in this case</p>
</blockquote></td>
</tr>
<tr class="even">
<td></td>
<td>5.2.7</td>
<td><blockquote>
<p>dateStamp</p>
</blockquote></td>
<td></td>
<td>Date that the metadata was last modified a Date or DateTime type.</td>
</tr>
<tr class="odd">
<td></td>
<td>5.2.8</td>
<td><blockquote>
<p>metadataStandardName <a href="#footnote1"><sup>1/sup></a>< </p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline:</span></strong> metadataStandardName shall conform to “North American Profile of ISO 19115:2003 - Geographic information - Metadata; Profil nord-américain de la norme ISO 19115:2003 - Information géographique - Métadonnées”.<br />
Warning: in some software, because of autocorrection, "-" becomes "–" which is not valid.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example:</span></strong></p>
</blockquote>
<p>&lt;metadataStandardName xsi:type="<strong>gmd:PT_FreeText_PropertyType</strong>&gt;</p>
<p>&lt;gco:CharacterString&gt;<strong>North American Profile of ISO 19115:2003 - Geographic information - Metadata</strong>&lt;/gco:CharacterString&gt;</p>
<p>&lt;gmd:PT_FreeText&gt;</p>
<p>&lt;gmd:textGroup&gt;</p>
<p>&lt;gmd:LocalisedCharacterString locale="<strong>#fra</strong>"&gt;<strong>Profil nord-américain de la norme ISO 19115:2003 - Information géographique - Métadonnées</strong>&lt;/gmd:LocalisedCharacterString&gt;</p>
<p>&lt;/gmd:textGroup&gt;</p>
<p>&lt;/gmd:PT_FreeText&gt;</p>
<p>&lt;/metadataStandardName&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.2.11</td>
<td><blockquote>
<p>locale**</p>
</blockquote></td>
<td><blockquote>
<p>See Locale</p>
</blockquote></td>
<td><blockquote>
<p>Mandatory as more than one language is used in free text descriptions.</p>
</blockquote></td>
</tr>
<tr class="odd">
<td></td>
<td>5.2.12</td>
<td><blockquote>
<p>Identification Information</p>
</blockquote></td>
<td><blockquote>
<p>See Data Identification</p>
</blockquote></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.2.17</td>
<td><blockquote>
<p>Reference System Information</p>
<p>(C)*</p>
</blockquote></td>
<td><blockquote>
<p>See Reference System</p>
<p>Information</p>
</blockquote></td>
<td><blockquote>
<p>Mandatory, if spatialRepresentionType[2] in Data Identification is "vector," "grid" or "tin”.</p>
</blockquote></td>
</tr>
<tr class="odd">
<td></td>
<td>5.2.20</td>
<td><blockquote>
<p>Distribution Information**</p>
</blockquote></td>
<td><blockquote>
<p>See Distribution Information (see 5.11)</p>
</blockquote></td>
<td><blockquote>
<p>Information about acquiring the dataset.</p>
</blockquote></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Data Identification</p>
<p><em>(MD_DataIdentification)</em></p></td>
<td>5.3.1.1</td>
<td><blockquote>
<p>citation</p>
</blockquote></td>
<td><blockquote>
<p>See Citation</p>
</blockquote></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.3.1.2</td>
<td><blockquote>
<p>abstract</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.3.1.5</td>
<td><blockquote>
<p>status*</p>
</blockquote></td>
<td><blockquote>
<p>CodeList <a href="http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_106">napMD_ProgressCod</a>e</p>
</blockquote></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.3.1.9</td>
<td><blockquote>
<p>language</p>
</blockquote></td>
<td></td>
<td>The language of the data set. Repeat for multiple languages.</td>
</tr>
<tr class="odd">
<td></td>
<td>5.3.1.7</td>
<td><blockquote>
<p>spatialRepresentationType**</p>
</blockquote></td>
<td><blockquote>
<p>CodeList</p>
<p>napMD_SpatialRepresentationTypeCode.</p>
</blockquote></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline</span>:</strong> spatialRepresentationType shall be included and conform to “vector; vecteur, grid; grille, textTable; texteTable, tin; tin, stereoModel ; stéréomodèle, video; vidéo”</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example:</span></strong></p>
</blockquote>
<p>&lt;gmd:spatialRepresentationType&gt;</p>
<p>&lt;gmd:MD_SpatialRepresentationTypeCode codeListValue="RI_635" codeList="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_109"&gt;vector; vecteur&lt;/gmd:MD_SpatialRepresentationTypeCode&gt;</p>
<p>&lt;/gmd:spatialRepresentationType&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.3.1.11</td>
<td><blockquote>
<p>topicCategory*</p>
</blockquote></td>
<td><blockquote>
<p>CodeList <a href="http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_110">napMD_TopicCategoryCod</a>e</p>
</blockquote></td>
<td><blockquote>
<p>A topicCategory code shall be provided when hierarchyLevel is set to "dataset." Since this is an enumerated list in the schema, a codelist cannot be used; only the English term can be entered.</p>
</blockquote></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline</span>:</strong> See example.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example</span>:</strong></p>
<p>&lt;gmd:topicCategory&gt;</p>
<p>&lt;gmd:MD_TopicCategoryCode&gt; imageryBaseMapsEarthCover&lt;/gmd:MD_TopicCategoryCode&gt;</p>
<p>&lt;/gmd: topicCategory &gt;</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.3.1.13</td>
<td><blockquote>
<p>extent*</p>
</blockquote></td>
<td><blockquote>
<p>See Extent (Geographic Bounding Box and Temporal Extent is mandatory for dataset)</p>
</blockquote></td>
<td><blockquote>
<p>Geographic Bounding Box and Temporal Extent are required.</p>
</blockquote></td>
</tr>
<tr class="even">
<td></td>
<td>5.3.1.15</td>
<td><blockquote>
<p>Resource Maintenance Information**</p>
</blockquote></td>
<td><blockquote>
<p>See Maintenance Information</p>
</blockquote></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.3.1.17</td>
<td><blockquote>
<p>Descriptive Keywords**</p>
</blockquote></td>
<td><blockquote>
<p>See Keywords</p>
</blockquote></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.3.1.18</td>
<td><blockquote>
<p>Resource Constraints**</p>
</blockquote></td>
<td><blockquote>
<p>See Legal Constraints</p>
</blockquote></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline:</span></strong> For data assessed and approved for release under the Open Government Licence - Canada (Open Data), the inclusion of 5.4.2 Legal Constraints (5.4.2.1, 5.4.2.2 and 5.4.2.3) is mandatory.</p>
<p>For data not released under the Open Government Licence - Canada (non-open data), 5.4.2 Legal Constraints is mandatory with the appropriate text added to 5.4.2.1 useLimitation to convey restrictions and the appropriate code selected from napMD_RestrictionCode for both 5.4.2.2 accessConstraints and 5.4.2.3 useConstraints.</p>
<p>5.2.3.4 otherConstraints is mandatory where accessConstraints and/or useConstraints are set to “otherRestrictions”, and will appropriately note any other restrictions.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Keywords</p>
<p><em>(MD_Keywords)</em></p></td>
<td>5.3.6.1</td>
<td><blockquote>
<p>keyword**</p>
</blockquote></td>
<td></td>
<td><blockquote>
<p>Applies to dataset not metadata.</p>
</blockquote></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p>Guidance: The MD_Keywords category of metadata elements shall be mandatory. At a minimum, one keyword must be supplied from the <a href="http://www.thesaurus.gc.ca/default.asp?lang=En&amp;n=EAEAD1E6-1">Government of Canada Core Subject Thesaurus</a>. <strong>Only the preferred terms can be used.</strong> <strong>Do not create a hierarchical string of general to preferred terms.</strong></p>
<p><strong>Best practices:</strong></p>
<p><strong>Specificity: Choose the most specific term(s) available when describing the subject of a resource. As a general rule, do not index a resource with both broad and narrow terms (i.e., birds; migratory birds), unless a resource specifically addresses topics in this way.</strong></p>
<p><strong>Exhaustivity: As far as possible, every essential concept dealt with in a resource should be represented with the appropriate term(s). This does not mean more is better. Remember the first rule: be specific.</strong></p>
<p><strong>Consistency: Keep a consistent form to terms. In English, count nouns are generally in the plural form, while non-count nouns, as well as abstract concepts, are in the singular form. In French, most terms are in the singular form.</strong></p>
<p><strong>(Source LAC: <a href="http://www.thesaurus.gc.ca/default.asp?lang=En&amp;n=EF4A5555-1">http://www.thesaurus.gc.ca/default.asp?lang=En&amp;n=EF4A5555-1</a>.)</strong></p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.3.6.3</td>
<td><blockquote>
<p>thesaurusName (C)**</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline</span>:</strong> Where keywords come from a controlled source, the thesaurus name along with its creation date, publication date and organization name will be cited. Ensure latest publication date is referenced at time of metadata creation.</p>
<p>(<strong>C)** thesaurusName is mandatory when using a controlled vocabulary, such as the Government of Canada Core Subject Thesaurus</strong>. If the keyword does not come from a thesaurus (i.e. <strong>a free text</strong>, user defined keyword), then only the keyword element is mandatory.</p>
<p><strong>NOTE: FGP Catalogue automatically supplies the latest version and latest publication date for the Government of Canada Core Subject Thesaurus.</strong></p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example</span>:</strong></p>
</blockquote>
<p>&lt;gmd:descriptiveKeywords&gt;</p>
<p>        &lt;gmd:MD_Keywords&gt;</p>
<p>          &lt;gmd:keyword xsi:type="gmd:PT_FreeText_PropertyType"&gt;</p>
<p>            &lt;gco:CharacterString&gt;Drainage&lt;/gco:CharacterString&gt;</p>
<p>            &lt;gmd:PT_FreeText&gt;</p>
<p>              &lt;gmd:textGroup&gt;</p>
<p>                &lt;gmd:LocalisedCharacterString locale=“#fra”&gt;Drainage&lt;/gmd:LocalisedCharacterString&gt;</p>
<p>              &lt;/gmd:textGroup&gt;</p>
<p>            &lt;/gmd:PT_FreeText&gt;</p>
<p>          &lt;/gmd:keyword&gt;</p>
<p>          &lt;gmd:keyword xsi:type="gmd:PT_FreeText_PropertyType"&gt;</p>
<p>            &lt;gco:CharacterString&gt;Remote sensing&lt;/gco:CharacterString&gt;</p>
<p>            &lt;gmd:PT_FreeText&gt;</p>
<p>              &lt;gmd:textGroup&gt;</p>
<p>                &lt;gmd:LocalisedCharacterString locale=“#fra”&gt;Télédétection&lt;/gmd:LocalisedCharacterString&gt;</p>
<p>              &lt;/gmd:textGroup&gt;</p>
<p>            &lt;/gmd:PT_FreeText&gt;</p>
<p>          &lt;/gmd:keyword&gt;</p>
<p>                &lt;gmd:thesaurusName&gt;</p>
<p>            &lt;gmd:CI_Citation&gt;</p>
<p>              &lt;gmd:title xsi:type="gmd:PT_FreeText_PropertyType"&gt;</p>
<p>                &lt;gco:CharacterString&gt;Government of Canada Core Subject Thesaurus&lt;/gco:CharacterString&gt;</p>
<p>                  &lt;gmd:PT_FreeText&gt;</p>
<p>                   &lt;gmd:textGroup&gt;</p>
<p>                      &lt;gmd:LocalisedCharacterString locale=“#fra”&gt;Thésaurus des sujets de base du gouvernement du Canada&lt;/gmd:LocalisedCharacterString&gt;</p>
<p>                   &lt;/gmd:textGroup&gt;</p>
<p>                 &lt;/gmd:PT_FreeText&gt;</p>
<p>              &lt;/gmd:title&gt;</p>
<p>&lt;gmd:date&gt;</p>
<p>                &lt;gmd:CI_Date&gt;</p>
<p>                  &lt;gmd:date&gt;</p>
<p>                    &lt;gco:Date&gt;2004&lt;/gco:Date&gt;</p>
<p>                  &lt;/gmd:date&gt;</p>
<p>                  &lt;gmd:dateType&gt;</p>
<p>                    &lt;gmd:CI_DateTypeCode codeListValue="RI_366"</p>
<p>codeList="<a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_87">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_87</a>"&gt;creation;création &lt;/gmd:CI_DateTypeCode&gt;</p>
<p>                  &lt;/gmd:dateType&gt;</p>
<p>                &lt;/gmd:CI_Date&gt;</p>
<p>              &lt;/gmd:date&gt;              </p>
<p>&lt;gmd:date&gt;</p>
<p>                &lt;gmd:CI_Date&gt;</p>
<p>                  &lt;gmd:date&gt;</p>
<p>                    &lt;gco:Date&gt;<strong>2015-04-21</strong>&lt;/gco:Date&gt;</p>
<p>                  &lt;/gmd:date&gt;</p>
<p>                  &lt;gmd:dateType&gt;</p>
<p>                    &lt;gmd:CI_DateTypeCode codeListValue="RI_36<strong>7</strong>"</p>
<p>codeList="<a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_87">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_87</a>"&gt;<strong>publication;publication</strong>&lt;/gmd:CI_DateTypeCode&gt;</p>
<p>                  &lt;/gmd:dateType&gt;</p>
<p>                &lt;/gmd:CI_Date&gt;</p>
<p>              &lt;/gmd:date&gt;</p>
<p>              &lt;gmd:citedResponsibleParty&gt;</p>
<p>                &lt;gmd:CI_ResponsibleParty&gt;</p>
<p>                  &lt;gmd:organisationName xsi:type="gmd:PT_FreeText_PropertyType"&gt;</p>
<p>                    &lt;gco:CharacterString&gt;Government of Canada; Library and Archives Canada&lt;/gco:CharacterString&gt;</p>
<p>                                    &lt;gmd:PT_FreeText&gt;</p>
<p>                       &lt;gmd:textGroup&gt;</p>
<p>                          &lt;gmd:LocalisedCharacterString locale=“#fra”&gt;Gouvernement du Canada; Bibliothèque et Archives Canada&lt;/gmd:LocalisedCharacterString&gt;</p>
<p>                       &lt;/gmd:textGroup&gt;</p>
<p>                    &lt;/gmd:PT_FreeText&gt;</p>
<p>                  &lt;/gmd:organisationName&gt;</p>
<p>                  &lt;gmd:role&gt;</p>
<p>                    &lt;gmd:CI_RoleCode codeListValue="RI_409" codeList="<a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_90">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_90</a>"&gt;custodian; conservateur&lt;/gmd:CI_RoleCode&gt;</p>
<p>                  &lt;/gmd:role&gt;</p>
<p>                &lt;/gmd:CI_ResponsibleParty&gt;</p>
<p>              &lt;/gmd:citedResponsibleParty&gt;</p>
<p>            &lt;/gmd:CI_Citation&gt;</p>
<p>          &lt;/gmd:thesaurusName&gt;</p>
<p>        &lt;/gmd:MD_Keywords&gt;</p>
<p>&lt;/gmd:descriptiveKeywords&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Legal Constraints</p>
<p><em>(MD_LegalConstraints)</em></p></td>
<td>5.4.2.1</td>
<td><blockquote>
<p>useLimitations **</p>
</blockquote></td>
<td><blockquote>
<p>free text (CharacterString)</p>
</blockquote></td>
<td><blockquote>
<p>Applies to dataset and metadata.</p>
</blockquote></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline:</span></strong> For data assessed and approved for release under the Open Government Licence - Canada useLimitation shall be mandatory and conform to, “Open Government Licence - Canada (<a href="http://open.canada.ca/en/open-government-licence-canada">http://open.canada.ca/en/open-government-licence-canada</a>)” (English) and “Licence du gouvernement ouvert - Canada (<a href="http://ouvert.canada.ca/fr/licence-du-gouvernement-ouvert-canada">http://ouvert.canada.ca/fr/licence-du-gouvernement-ouvert-canada</a>)” (French).</p>
<p>For data not released under the Open Government Licence - Canada (i.e. assessed as non-open data) appropriate text will be added to convey restrictions.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.4.2.2</td>
<td><blockquote>
<p>accessConstraints**</p>
</blockquote></td>
<td><blockquote>
<p>CodeList napMD_RestrictionCode</p>
</blockquote></td>
<td><blockquote>
<p>Applies to dataset and metadata.</p>
</blockquote></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline:</span></strong> For data assessed and approved for release under the Open Government Licence - Canada accessConstraints shall be mandatory and conform to “licence; licence” (see example).</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.4.2.3</td>
<td><blockquote>
<p>useConstraints **</p>
</blockquote></td>
<td><blockquote>
<p>CodeList napMD_RestrictionCode</p>
</blockquote></td>
<td><blockquote>
<p>Applies to dataset and metadata.</p>
</blockquote></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p>Guideline: For data assessed and approved for release under the Open Government Licence - Canada useConstraints shall be mandatory and conform to “licence; licence” (see example).</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p>5.4.2.4</p>
</blockquote></td>
<td><blockquote>
<p>otherConstraints</p>
</blockquote></td>
<td><blockquote>
<p>free text (CharacterString)</p>
</blockquote></td>
<td><blockquote>
<p>Applies to dataset and metadata.</p>
</blockquote></td>
</tr>
<tr class="even">
<td></td>
<td><strong><span class="underline">Guideline:</span></strong> otherConstraints shall be provided where accessConstraints (5.4.2.2) or useConstraints (5.4.2.3) is set to "otherRestrictions."</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><p><span class="underline">Example:</span></p>
<p>&lt;gmd:resourceConstraints&gt;</p>
<p>&lt;gmd:MD_LegalConstraints&gt;</p>
<p>&lt;gmd:useLimitation xsi:type="<strong>gmd:PT_FreeText_PropertyType</strong>"&gt;</p>
<p>&lt;gco:CharacterString&gt;Open Government Licence - Canada (<a href="http://open.canada.ca/en/open-government-licence-canada)%3c/gco:CharacterString">http://open.canada.ca/en/open-government-licence-canada)&lt;/gco:CharacterString</a>&gt;</p>
<p>&lt;gmd:PT_FreeText&gt;</p>
<p>&lt;gmd:textGroup&gt;</p>
<p>&lt;gmd:LocalisedCharacterString locale="<strong>#fra</strong>"&gt;Licence du gouvernement ouvert - Canada (<a href="http://ouvert.canada.ca/fr/licence-du-gouvernement-ouvert-canada)%3c/gmd:LocalisedCharacterString">http://ouvert.canada.ca/fr/licence-du-gouvernement-ouvert-canada)&lt;/gmd:LocalisedCharacterString</a>&gt;</p>
<p>&lt;/gmd:textGroup&gt;</p>
<p>&lt;/gmd:PT_FreeText&gt;</p>
<p>&lt;/gmd:useLimitation&gt;</p>
<p>&lt;gmd:accessConstraints&gt;</p>
<p>&lt;gmd:MD_RestrictionCode codeListValue="<strong>RI_606</strong>" codeList="<strong>http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_107</strong>"&gt;license; licence&lt;/gmd:MD_RestrictionCode&gt;</p>
<p>&lt;/gmd:accessConstraints&gt;</p>
<p>&lt;gmd:useConstraints&gt;</p>
<p>&lt;gmd:MD_RestrictionCode codeListValue="<strong>RI_606</strong>" codeList="<strong>http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_107</strong>"&gt;license; licence&lt;/gmd:MD_RestrictionCode&gt;</p>
<p>&lt;/gmd:useConstraints&gt;</p>
<p>&lt;/gmd:MD_LegalConstraints&gt;</p>
<p>&lt;/gmd:resourceConstraints&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><blockquote>
<p>Maintenance Information</p>
</blockquote>
<p><em>(MD_MaintenanceInformation)</em></p></td>
<td>5.6.1</td>
<td><blockquote>
<p>maintenanceAndUpdateFrequency**</p>
</blockquote></td>
<td><blockquote>
<p>CodeList</p>
<p><a href="http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_106">napMD_MaintenanceFrequencyCode</a></p>
</blockquote></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline</span></strong>: maintenanceAndUpdateFrequency shall be mandatory. Select one of: continual, daily, weekly, fortnightly, monthly, quarterly, biannually, annually, asNeeded, irregular, notPlanned, unknown, semimonthly (continue, quotidien, hebdomadaire, quinzomadaire, mensuel, trimestriel, semestriel, annuel, auBesoin, irrégulier, nonPlanifié, inconnu, bimensuel)</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example:</span></strong></p>
</blockquote>
<p>&lt;gmd:resourceMaintenance&gt;</p>
<p>&lt;gmd:MD_MaintenanceInformation&gt;</p>
<p>&lt;gmd:maintenanceAndUpdateFrequency&gt;</p>
<p>&lt;gmd:MD_MaintenanceFrequencyCode codeListValue="RI_538"codeList="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_102"&gt;biannually; semestriel&lt;/gmd:MD_MaintenanceFrequencyCode&gt;</p>
<p>&lt;/gmd:maintenanceAndUpdateFrequency&gt;</p>
<p>&lt;/gmd:MD_MaintenanceInformation&gt;</p>
<p>&lt;/gmd:resourceMaintenance&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Reference System Identifier</p>
<p>(<em>RS_Identifier</em>)</p></td>
<td>5.8.2.2</td>
<td><blockquote>
<p>code</p>
</blockquote></td>
<td></td>
<td><p>The alphanumeric value identifying</p>
<p>the reference system, e.g.</p>
<p>"EPSG:4269"</p></td>
</tr>
<tr class="even">
<td></td>
<td>5.8.2.3</td>
<td><blockquote>
<p>codespace **(C)</p>
</blockquote></td>
<td></td>
<td><blockquote>
<p>Identifier/namespace of the system in which the code is valid, e.g.<a href="http://www.epsg-registry.org">http://www.epsg-registry.org</a>. <strong>In cases where an identifier/namespace does not apply (e.g.Proj4), codespace is not mandatory.</strong></p>
</blockquote></td>
</tr>
<tr class="odd">
<td></td>
<td>5.8.2.4</td>
<td><blockquote>
<p>version ** (C)</p>
</blockquote></td>
<td></td>
<td><blockquote>
<p><strong>In cases where a version does not apply (e.g.Proj4), version is not mandatory.</strong></p>
</blockquote></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline</span></strong>: The preference is to only use projections that have their parameters described on a web accessible resource (see example). The first preference is to use the EPSG code from <a href="http://www.epsg-registry.org">http://www.epsg-registry.org</a>, The second preference is to use the SR-ORG code from <a href="http://www.spatialreference.org/">http://www.spatialreference.org</a>. However, some projections are not registered in an online registry. In these cases try registering the spatial reference with either <a href="http://www.epsg-registry.org">http://www.epsg-registry.org</a> or <a href="http://www.spatialreference.org/">http://www.spatialreference.org</a>. As a last resort, enter the proj4 parameters into the code element and leave codespace and version empty.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Examples:</span></strong></p>
<p><span class="underline"> </span></p>
<p><strong>EPSG.org</strong></p>
<p>&lt;gmd:referenceSystemInfo&gt;</p>
<p>&lt;gmd:MD_ReferenceSystem&gt;</p>
<p>&lt;gmd:referenceSystemIdentifier&gt;</p>
<p>&lt;gmd:RS_Identifier&gt;</p>
<p>&lt;gmd:code&gt;</p>
<p>&lt;gco:CharacterString&gt;EPSG:4269&lt;/gco:CharacterString&gt;</p>
<p>&lt;/gmd:code&gt;</p>
<p>&lt;gmd:codeSpace&gt;</p>
<p>&lt;gco:CharacterString&gt;http://www.epsg-registry.org&lt;/gco:CharacterString&gt;</p>
<p>&lt;/gmd:codeSpace&gt;</p>
<p>&lt;gmd:version&gt;</p>
<p>&lt;gco:CharacterString&gt;8.6.2&lt;/gco:CharacterString&gt;</p>
<p>&lt;/gmd:version&gt;</p>
<p>&lt;/gmd:RS_Identifier&gt;</p>
<p>&lt;/gmd:referenceSystemIdentifier&gt;</p>
<p>&lt;/gmd:MD_ReferenceSystem&gt;</p>
</blockquote>
<p>&lt;/gmd:referenceSystemInfo&gt;</p>
<p><strong>SR-ORG</strong></p>
<blockquote>
<p>&lt;gmd:referenceSystemInfo&gt;</p>
<p>&lt;gmd:MD_ReferenceSystem&gt;</p>
<p>&lt;gmd:referenceSystemIdentifier&gt;</p>
<p>&lt;gmd:RS_Identifier&gt;</p>
<p>&lt;gmd:code&gt;</p>
<p>&lt;gco:CharacterString&gt;SRG-ORG:29&lt;/gco:CharacterString&gt;</p>
<p>&lt;/gmd:code&gt;</p>
<p>&lt;gmd:codeSpace&gt;</p>
<p>&lt;gco:CharacterString&gt;http://www.spatialreference.org&lt;/gco:CharacterString&gt;</p>
<p>&lt;/gmd:codeSpace&gt;</p>
<p>&lt;/gmd:RS_Identifier&gt;</p>
<p>&lt;/gmd:referenceSystemIdentifier&gt;</p>
<p>&lt;/gmd:MD_ReferenceSystem&gt;</p>
</blockquote>
<p>&lt;/gmd:referenceSystemInfo&gt;</p>
<p><strong>Proj4</strong></p>
<p>&lt;gmd:referenceSystemInfo&gt;</p>
<p>&lt;gmd:MD_ReferenceSystem&gt;</p>
<p>&lt;gmd:referenceSystemIdentifier&gt;</p>
<p>&lt;gmd:RS_Identifier&gt;</p>
<p>&lt;gmd:code&gt;</p>
<p>&lt;gco:CharacterString&gt;+proj=lcc +lat_1=50 +lat_2=70 +lat_0=40 +lon_0=-96 +x_0=0 +y_0=0 +ellps=GRS80 +datum=NAD83 +units=m +no_defs</p>
<p>+proj=lcc +ellps=GRS80 +lat_0=60+lon_0=-95 +lat_1=55 +lat_2=80 +datum=NAD83 +units=m no_defs</p>
<p>+proj=tmerc +lat_0=0.000000000 +lon_0=-62.000000000 +k=0.999500 +x_0=400000.000 +y_0=0.000 +ellps=clrk80 +towgs84=-255,-15,71,0,0,0,0 +units=m no_defs</p>
<p>+proj=tmerc +lat_0=0.000000000 +lon_0=-62.000000000 +k=0.999500 +x_0=400000.000 +y_0=0.000 +ellps=clrk80 +towgs84=725,685,536,0,0,0,0 +units=m no_defs</p>
<p>+proj=lcc +ellps=WGS84 +lat_0=0 +lon_0=-95 +lat_1=49 +lat_2=77 +x_0=0 +y_0=-8000000.0 +datum=WGS84 +units=m no_defs</p>
<p>+proj=aea +ellps=GRS80 +lat_0=45 +lon_0=-126.0 +lat_1=50.0 +lat_2=58.5 +x_0=1000000.0 +y_0=0 +datum=NAD83 +units=m no_defs</p>
<p>+proj=lcc +ellps=GRS80 +lat_0=49 +lon_0=-95 +lat_1=49 +lat_2=77 +datum=NAD83 +units=m no_defs</p>
<p>&lt;/gco:CharacterString&gt;</p>
<p>&lt;/gmd:code&gt;</p>
<p>&lt;/gmd:RS_Identifier&gt;</p>
<p>&lt;/gmd:referenceSystemIdentifier&gt;</p>
<p>&lt;/gmd:MD_ReferenceSystem&gt;</p>
<p>&lt;/gmd:referenceSystemInfo&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Distribution Information</p>
<p><em>(MD_Distribution)</em></p></td>
<td>5.11.1</td>
<td>Transfer Options**</td>
<td><blockquote>
<p>See TransferOptions</p>
</blockquote></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.11.2</td>
<td><blockquote>
<p>Distributor **</p>
</blockquote></td>
<td><blockquote>
<p>See MD_Distributor</p>
</blockquote></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.11.3</td>
<td><blockquote>
<p>Distribution Format**</p>
</blockquote></td>
<td><blockquote>
<p>See Distribution Format</p>
</blockquote></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p><em>Distributor</em></p>
<p><em>(MD_Distributor)</em></p></td>
<td>5.11.2.1</td>
<td><blockquote>
<p>distributorContact**</p>
</blockquote></td>
<td><blockquote>
<p>See CI_ResponsibleParty</p>
</blockquote></td>
<td><p>Information on party</p>
<p>responsible for dataset</p>
<p>distribution.</p></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Transfer Options</p>
<p><em>MD_DigitalTransferOptions</em></p></td>
<td>5.11.1.3</td>
<td><blockquote>
<p>onLine**</p>
</blockquote></td>
<td><blockquote>
<p>See Online Resource</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Distribution Format</p>
<p><em>(MD_Format)</em></p></td>
<td>5.11.3.1</td>
<td><blockquote>
<p>name**</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><p><strong><span class="underline">Guideline</span>:</strong> Name shall be mandatory. Select a format name from the <a href="http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format">FGP Format Names controlled vocabulary</a> . (http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format)</p>
<p><strong>NOTE: ZIP is not a useful descriptor for format from a usability perspective; it is not a recommended choice for format. Where a ZIP or other compression file is provided, please ensure that you <span class="underline">ALSO</span> indicate all resource formats found within the compressed file. This enables users to assess whether the resource is available in a format(s) they can use, without having to download and unzip the file.</strong></p>
<p>NOTE: If you have a format that is not listed in the <a href="http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format">FGP Format Names controlled vocabulary</a>, please contact <strong>Cindy Mitchell, Natural Resources Canada (<a href="mailto:cindy.mitchell@canada.ca">cindy.mitchell@canada.ca</a>).</strong></p></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.11.3.2</td>
<td><blockquote>
<p>version**</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline</span>:</strong> version shall be mandatory. Choose the version number or date of the format chosen. If version is unknown use the value unknown.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Extent</p>
<p>(<em>EX_extent</em>)</p></td>
<td>5.13.3</td>
<td><blockquote>
<p>Geographic Bounding Box</p>
</blockquote></td>
<td>See Geographic Bounding Box</td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.13.5</td>
<td><blockquote>
<p>Temporal Element</p>
</blockquote></td>
<td>See Temporal Element</td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Geographic Bounding Box</p>
<p>(<em>EX_GeographicBoundingBox</em>)</p></td>
<td>5.13.3.2</td>
<td><blockquote>
<p>westBoundingLongitude</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.13.3.3</td>
<td><blockquote>
<p>eastBoundingLongitude</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.13.3.4</td>
<td><blockquote>
<p>southBoundingLatitude</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.13.3.5</td>
<td><blockquote>
<p>northBoundingLatitude</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Examples:</span></strong></p>
</blockquote>
<p>&lt;gmd:extent&gt;</p>
<p>&lt;gmd:EX_Extent&gt;</p>
<p>&lt;gmd:geographicElement&gt;</p>
<p>&lt;gmd:EX_GeographicBoundingBox&gt;</p>
<p>&lt;gmd:westBoundLongitude&gt;</p>
<p>       &lt;gco:Decimal&gt;<strong>-135.4338658</strong>&lt;/gco:Decimal&gt;</p>
<p>      &lt;/gmd:westBoundLongitude&gt;</p>
<p>&lt;gmd:eastBoundLongitude&gt;</p>
<p>     &lt;gco:Decimal&gt;<strong>-131.4236097</strong>&lt;/gco:Decimal&gt;</p>
<p>    &lt;/gmd:eastBoundLongitude&gt;</p>
<p>    &lt;gmd:southBoundLatitude&gt;</p>
<p>     &lt;gco:Decimal&gt;<strong>57.705188766</strong>&lt;/gco:Decimal&gt;</p>
<p>     &lt;/gmd:southBoundLatitude&gt;</p>
<p>    &lt;gmd:northBoundLatitude&gt;</p>
<p>     &lt;gco:Decimal&gt;<strong>59.696028939</strong>&lt;/gco:Decimal&gt;</p>
<p>     &lt;/gmd:northBoundLatitude&gt;</p>
<p>&lt;/gmd:EX_GeographicBoundingBox&gt;</p>
<p>  &lt;/gmd:geographicElement&gt;</p>
<p>&lt;/gmd:EX_Extent&gt;</p>
<p>&lt;/gmd:extent&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td><p>Temporal Element</p>
<p>(<em>EX_TemporalExtent</em>)</p></td>
<td>5.13.5.1</td>
<td><blockquote>
<p>extent</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline</span></strong>: TemporalExtent will be used to describe the time period that a particular dataset covers or describes. beginPosition describes the Beginning or Start date of the dataset while endPosition describes the Final date for which the dataset is describing. Some datasets will have a known beginPosition but will not have a known endPosition as the dataset is still “valid” for the current time period. Therefore beginPosition is mandatory and endPosition is optional. Date format in beginPosition and endPosition will comply with YYYY-MM-DD, YYYY-MM, or YYYY (ISO 8601).</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example:</span></strong></p>
</blockquote>
<p>&lt;gmd:extent&gt;</p>
<p>&lt;gmd:EX_Extent&gt;</p>
<p>&lt;gmd:temporalElement&gt;</p>
<p>&lt;gmd:EX_TemporalExtent&gt;</p>
<p>&lt;gmd:extent&gt;</p>
<p>&lt;gml:TimePeriod gml:id="<strong>timeperiod1</strong>"&gt;</p>
<p>&lt;gml:beginPosition&gt;2011-01-01&lt;/gml:beginPosition&gt;</p>
<p>&lt;gml:endPosition&gt;2011-12-31&lt;/gml:endPosition&gt;</p>
<p>&lt;/gml:TimePeriod&gt;</p>
<p>&lt;/gmd:extent&gt;</p>
<p>&lt;/gmd:EX_TemporalExtent&gt;</p>
<p>&lt;/gmd:temporalElement&gt;</p>
<p>&lt;/gmd:EX_Extent&gt;</p>
<p>&lt;/gmd:extent&gt;</p>
<p>&lt;gmd:extent&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Citation</p>
<p>(<em>CI_Citation</em>)</p></td>
<td>5.14.1</td>
<td><blockquote>
<p>title</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.14.3</td>
<td><blockquote>
<p>date</p>
</blockquote></td>
<td><blockquote>
<p>See Date</p>
</blockquote></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.14.7</td>
<td><blockquote>
<p>citedResponsibleParty*</p>
</blockquote></td>
<td><blockquote>
<p>See Responsible Party</p>
</blockquote></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Date</p>
<p>(<em>CI_Date</em>)</p></td>
<td>5.15.1</td>
<td><blockquote>
<p>date</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.15.2</td>
<td><blockquote>
<p>dateType</p>
</blockquote></td>
<td><blockquote>
<p>Codelist <span class="underline"><a href="http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_87">napCI_DateTypeCod</a>e</span></p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline:</span></strong> date and dateType values shall be provided for dateType values of creation, publication, and (where applicable) revision.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example:</span></strong></p>
</blockquote>
<p>&lt;gmd:date&gt;</p>
<p>&lt;gmd:CI_Date&gt;</p>
<p>&lt;gmd:date&gt;</p>
<p>&lt;gco:Date&gt;2009-10-31&lt;/gco:Date&gt;</p>
<p>&lt;/gmd:date&gt;</p>
<p>      &lt;gmd:dateType&gt;</p>
<p>&lt;gmd:CI_DateTypeCode codeList="<a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_87">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_87</a>" codeListValue="RI_367"&gt;publication; publication&lt;/gmd:CI_DateTypeCode&gt;</p>
<p>&lt;/gmd:dateType&gt;</p>
<p>&lt;/gmd:CI_Date&gt;</p>
<p>&lt;/gmd:date&gt;</p>
<p>&lt;gmd:date&gt;</p>
<p>&lt;gmd:CI_Date&gt;</p>
<p>&lt;gmd:date&gt;</p>
<p>&lt;gco:Date&gt;2009-10-31&lt;/gco:Date&gt;</p>
<p>&lt;/gmd:date&gt;</p>
<p>&lt;gmd:dateType&gt;</p>
<p>&lt;gmd:CI_DateTypeCode codeList="<a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_87">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_87</a>" codeListValue="RI_366"&gt;creation; création&lt;/gmd:CI_DateTypeCode&gt;</p>
<p>&lt;/gmd:dateType&gt;</p>
<p>&lt;/gmd:CI_Date&gt;</p>
<p>&lt;/gmd:date&gt;</p>
<p>&lt;gmd:date&gt;</p>
<p>&lt;gmd:CI_Date&gt;</p>
<p>&lt;gmd:date&gt;</p>
<p>&lt;gco:Date&gt;2009-10-31&lt;/gco:Date&gt;</p>
<p>&lt;/gmd:date&gt;</p>
<p>&lt;gmd:dateType&gt;</p>
<p>&lt;gmd:CI_DateTypeCode codeList="<a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_87">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_87</a>" codeListValue="RI_368"&gt;revision; révision&lt;/gmd:CI_DateTypeCode&gt;</p>
<p>&lt;/gmd:dateType&gt;</p>
<p>&lt;/gmd:CI_Date&gt;</p>
<p>&lt;/gmd:date&gt;</p></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td><p>Responsible Party</p>
<p><em>(CI_ResponsibleParty)</em></p></td>
<td>5.16.2</td>
<td><blockquote>
<p>organizationName**</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline:</span></strong> organizationName shall be mandatory. Federal department and agency titles will conform to Federal Identity Program policy and use the Applied Title for their department or agency as defined at <a href="http://www.tbs-sct.gc.ca/fip-pcim/reg-eng.asp">http://www.tbs-sct.gc.ca/fip-pcim/reg-eng.asp</a>. 5.16.2 organizationName will conform to the format: Government of Canada; AppliedTitle. Sub-organizations (sectors, branches, etc.) may be included at the option of the department. See Responsible Party example below.</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.16.4</td>
<td><blockquote>
<p>contactInfo* (C)</p>
</blockquote></td>
<td><blockquote>
<p>See Contact</p>
</blockquote></td>
<td><blockquote>
<p>Mandatory in the context of Metadata Record Information, Data Identification and Distributor Information.</p>
</blockquote></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td>5.16.5</td>
<td><blockquote>
<p>role</p>
</blockquote></td>
<td><blockquote>
<p>Codelist <span class="underline"><a href="http://nap.geogratis.gc.ca/metadata/register/codelists-eng.html#IC_90">napCI_RoleCod</a>e</span></p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example:</span></strong></p>
</blockquote>
<p>&lt;gmd:contact&gt;</p>
<p>&lt;gmd:CI_ResponsibleParty&gt;</p>
<p>&lt;gmd:organisationName “xsi:type="<strong>gmd:PT_FreeText_PropertyType</strong>"&gt;</p>
<p>&lt;gco:CharacterString&gt;Government of Canada; Agriculture and Agri-Food Canada; Science and Technology Branch; Agri-Geomatics&lt;/gco:CharacterString&gt;</p>
<p>&lt;PT_FreeText&gt;</p>
<p>&lt;textGroup&gt;</p>
<p>&lt;gmd:LocalisedCharacterString locale=“#fra”&gt;Gouvernement du Canada; Agriculture et Agroalimentaire Canada; Direction générale des sciences et de la technologie; Agrogéomatiques&lt;/LocalisedCharacterString&gt;</p>
<p>&lt;/textGroup&gt;</p>
<p>&lt;/PT_FreeText&gt;</p>
<p>&lt;/gmd:organisationName&gt;</p>
<p>&lt;gmd:contactInfo&gt;</p>
<p>&lt;gmd:CI_Contact&gt;</p>
<p>&lt;gmd:address&gt;</p>
<p>&lt;gmd:CI_Address&gt;</p>
<p>&lt;gmd:electronicMailAddress&gt;</p>
<p>&lt;gco:CharacterString&gt;agri-geomatics-agrog@agr.gc.ca&lt;/gco:CharacterString&gt;</p>
<p>&lt;/gmd:electronicMailAddress&gt;</p>
<p>&lt;/gmd:CI_Address&gt;</p>
<p>&lt;/gmd:address&gt;</p>
<p>&lt;/gmd:CI_Contact&gt;</p>
<p>&lt;/gmd:contactInfo&gt;</p>
<p>&lt;gmd:role&gt;</p>
<p>&lt;gmd:CI_RoleCode codeListValue="RI_414"</p>
<p>codeList="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_90"&gt;pointOfContact; contact&lt;/gmd:CI_RoleCode&gt;</p>
<p>&lt;/gmd:role&gt;</p>
<p>&lt;/gmd:CI_ResponsibleParty&gt;</p>
<p>&lt;/gmd:contact&gt;</p></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td><p>Contact</p>
<p>(<em>CI_Contact</em>)</p></td>
<td>5.17.2</td>
<td><blockquote>
<p>address**</p>
</blockquote></td>
<td><blockquote>
<p>See Address</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline:</span></strong> address shall be mandatory (see Responsible Party example).</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Address</p>
<p>(<em>CI_Address</em>)</p></td>
<td>5.19.6</td>
<td><blockquote>
<p>electronicMailAddress**</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Guideline</span>:</strong> electronicMailAddress shall be mandatory (see Responsible Party example).</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Online Resource</p>
<p>(<em>CI_OnlineResource</em>)</p></td>
<td><strong>FGP Requirement:</strong> For each web service noted as an online resource, add an attribute on the "online" element to register the language of the resource. Acceptable values are xlink:role="urn:xml:lang:eng-CAN" and xlink:role="urn:xml:lang:fra-CAN". Required for FGP implementation of Geonetwork/RCS/Ramp system. See example.</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.20.1</td>
<td><blockquote>
<p>linkage</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><p><strong>FGP Requirement:</strong>:</p>
<p>1) For a OGC:WMS web map service:</p>
<blockquote>
<p>An OGC WMS GetCapabilities request with or without the addition of a non-standard “LAYERS=&lt;layername&gt;” parameter. For FGP implementation, layername is used for WMS with only one layer or one group layer name.<br />
Optionally, two other non-standard parameters can be added to indicate the preferred legend and get_feature_info  formats. The parameters are: LEGEND_FORMAT=&lt;legend_format&gt; and FEATURE_INFO_TYPE=&lt;featureInfoformat&gt;. When legend and/or get_feature_info formats are not provided, FGP may not enable legend and get feature info functionalities correctly.</p>
<p>Examples:</p>
<p>Multiple layers, no optional parameters: <span class="underline"> </span> <a href="http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities">http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities</a></p>
<p>Single layer :</p>
<p><a href="http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities&amp;layers=railway">http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities&amp;layers=railway</a></p>
<p>Multiple layers with optional parameters:</p>
<p><a href="http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities&amp;legend_format=image/png&amp;feature_info_type=text/html">http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities&amp;legend_format=image/png&amp;feature_info_type=text/html</a></p>
<p>Single layer or group layer name with optional parameters:</p>
</blockquote>
<p><a href="http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities&amp;layers=railway&amp;legend_format=image/png&amp;feature_info_type=text/html">http://maps.geogratis.gc.ca/wms/railway_en?SERVICE=WMS&amp;REQUEST=GetCapabilities&amp;layers=railway&amp;legend_format=image/png&amp;feature_info_type=text/html</a></p>
<p>2) For an Esri Map Service:</p>
<blockquote>
<p>Multiple, group or dynamic layers: An Esri mapserver request.</p>
<p>Feature layer: An Esri mapserver request with the addition of the layer number.</p>
<p>Examples:</p>
<p>Multiple layers:</p>
<p><a href="http://ec.gc.ca/arcgis/rest/services/data_donnees/16074bd5-66ed-45a5-b9c3-a9c33cf58e6c/MapServer">http://ec.gc.ca/arcgis/rest/services/data_donnees/16074bd5-66ed-45a5-b9c3-a9c33cf58e6c/MapServer</a></p>
<p>Group layers:</p>
<p><a href="http://ec.gc.ca/arcgis/rest/services/CESI_FGP_All_Layers/MapServer/0">http://ec.gc.ca/arcgis/rest/services/CESI_FGP_All_Layers/MapServer/0</a></p>
<p>Dynamic capabilities: <span class="underline"> </span> <a href="http://www.agr.gc.ca/atlas/rest/services/mapservices/aafc_census_of_agriculture_2011_ccs/MapServer">http://www.agr.gc.ca/atlas/rest/services/mapservices/aafc_census_of_agriculture_2011_ccs/MapServer</a></p>
<p>Feature layer:</p>
<p><a href="http://ec.gc.ca/arcgis/rest/services/data_donnees/16074bd5-66ed-45a5-b9c3-a9c33cf58e6c/MapServer/0">http://ec.gc.ca/arcgis/rest/services/data_donnees/16074bd5-66ed-45a5-b9c3-a9c33cf58e6c/MapServer/0</a></p>
</blockquote>
<p>3) For an Esri Feature Service:</p>
<p>Multiple layers: An Esri mapserver request.</p>
<p>Single layer: An Esri mapserver request with the addition of the layer number.</p>
<p>Examples:</p>
<p>Multiple layers:</p>
<p><a href="http://www.agr.gc.ca/atlas/rest/services/app_cdm_ssc/canadian_drought_monitor_editing/FeatureServe">http://www.agr.gc.ca/atlas/rest/services/app_cdm_ssc/canadian_drought_monitor_editing/FeatureServe</a><span class="underline">r</span></p>
<p>Single layer:</p>
<p><a href="http://www.agr.gc.ca/atlas/rest/services/app_cdm_ssc/canadian_drought_monitor_editing/FeatureServer/0">http://www.agr.gc.ca/atlas/rest/services/app_cdm_ssc/canadian_drought_monitor_editing/FeatureServer/0</a></p>
<p>4) For an Esri Image Service:</p>
<p>An Esri imageserver request.</p>
<p>Example:</p>
<p><a href="http://www.agr.gc.ca/atlas/rest/services/imageservices/mb_colour_orthos_50cm/ImageServer">http://www.agr.gc.ca/atlas/rest/services/imageservices/mb_colour_orthos_50cm/ImageServer</a></p>
<p>5) For an Esri Tiled Map Service:</p>
<p>An Esri mapserver request.</p>
<p>Example:</p>
<p><a href="http://geoappext.nrcan.gc.ca/arcgis/rest/services/BaseMaps/CBMT_CBCT_GEOM_3857/MapServer">http://geoappext.nrcan.gc.ca/arcgis/rest/services/BaseMaps/CBMT_CBCT_GEOM_3857/MapServer</a></p>
<p><strong><span class="underline">Guideline</span></strong>: For any other online resource (dataset, <strong>service, application,</strong> supporting document, data dictionary, etc.), add a valid URL.</p></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.20.2</td>
<td><blockquote>
<p>protocol*</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><p><strong>FGP Requirement:</strong>: <strong>This element is being used to support communication between the FGP Catalogue and the RCS service. Several types of web map services are designated as compatible for use with RCS and the FGP Visualization application. To allow the RCS application to recognize and work with these supported services, these web map services will be documented in the protocol element as:</strong></p>
<ol type="1">
<li><p><strong>OGC:WMS</strong> for OGC Web Map Service</p></li>
<li><p><strong>ESRI REST: Map Service</strong> for Esri Mapping Service</p></li>
<li><p><strong>ESRI REST: Feature Service</strong> for Esri Feature Service</p></li>
<li><p><strong>ESRI REST: Image Service</strong> for Esri Image Service</p></li>
<li><p><strong>ESRI REST: Tiled Map Service</strong> for Esri Tiled Map Service</p></li>
</ol>
<p><strong><span class="underline">Guideline:</span></strong> For any other online resources (i.e. not an FGP supported web map service), a value for 5.20.2 protocol should be taken from an official controlled list such as the Official Internet Protocol Standards published on the Web at <a href="http://www.rfc-editor.org/rfcxx00.html">http://www.rfc-editor.org/rfcxx00.html</a> or the Internet Assigned Numbers Authority (IANA) at <a href="http://www.iana.org/numbers.html">http://www.iana.org/numbers.html</a>. Protocol value is typically HTTP, HTTPS or FTP.</p></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.20.4</td>
<td><blockquote>
<p>name**</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><strong><span class="underline">Guideline</span>:</strong> The name of the resource being described<strong>. Follow <a href="http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Structure#Dataset_title_naming_convention">FGP File Naming Convention</a> for best results. This is especially important when providing a name for web services, to ensure that a descriptive title is shown to the user when web services are displayed on a map. Do not include organization names or language of the resource in the title. This information is already provided and will appear redundant. Focus instead on providing specific, informative names that describe the subject of the resource.</strong></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td>5.20.5</td>
<td><blockquote>
<p>description**</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><p><strong><span class="underline">Guideline</span>:</strong>  Description shall be mandatory and will support the display of the language, content type and format of the resource on the Open Government Portal. <strong>To allow for successful loading and access of resources on Open Government Portal, it is imperative that this field conform to the guidance below.</strong></p>
<p> </p>
<p>The following information describing the online resource will be entered into this field, in precisely the following format: ContentType;Format;Lang,Lang,Lang </p>
<p> </p>
<p><span class="underline">ContentType:</span></p>
<p>Select one content type from the following list: Dataset, Données, Web Service, Service Web, API, API, Supporting Document, Document de soutien, Application, Application</p>
<p> </p>
<p>NOTE: Supporting Document is used to indicate resources such as data dictionary, metadata record, etc.</p>
<p> </p>
<p><span class="underline">Format:</span></p>
<p>Select a format name from the <a href="http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format">FGP Format Names controlled vocabulary</a>. (http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format)</p>
<p><strong>NOTE: ZIP is not a useful descriptor for format from a usability perspective; it is not a recommended choice for format. Where a ZIP or other compression file is provided, please ensure that you <span class="underline">ALSO</span> indicate all resource formats found within the compressed file. This enables users to assess whether the resource is available in a format(s) they can use, without having to download and unzip the file.</strong></p>
<p>NOTE: If you have a format that is not listed in the <a href="http://www.gcpedia.gc.ca/wiki/Federal_Geospatial_Platform/Policies_and_Standards/Catalogue/Release/Appendix_B_Guidelines_and_Best_Practices/Guide_to_Harmonized_ISO_19115:2003_NAP/Format">FGP Format Names controlled vocabulary</a>, please contact <strong>Cindy Mitchell, Natural Resources Canada (<a href="mailto:cindy.mitchell@canada.ca">cindy.mitchell@canada.ca</a>).</strong></p>
<p><span class="underline">Language:</span></p>
<p>Select one or more language designation from the following list: eng, fra, zxx</p>
<p>NOTE: zxx is the ISO 639-2/T code for "no linguistic content", e.g. animal sounds, raw satellite image.</p>
<p>Delimit each language designation with a comma (,).</p>
<p>To add a language other than French or English, include the appropriate ISO 639-2/T (use /T terminological, not /B bibliographical) code and append it with another comma separator.</p></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><strong><span class="underline">Example:</span></strong></p>
</blockquote>
<p>&lt;gmd:transferOptions&gt;</p>
<p>        &lt;gmd:MD_DigitalTransferOptions&gt;</p>
<p>          &lt;gmd:onLine xlink:role="urn:xml:lang:eng-CAN"&gt;</p>
<p>            &lt;gmd:CI_OnlineResource&gt;</p>
<p>              &lt;gmd:linkage&gt;</p>
<p>                &lt;gmd:URL&gt;<a href="http://maps.geogratis.gc.ca/wms/emerald_ash_borer_reg_area?service=WMS&amp;amp;request=getCapabilities&amp;amp;version=1.3.0&amp;amp;layers=emerald_ash_borer_reg_area">http://maps.geogratis.gc.ca/wms/emerald_ash_borer_reg_area?service=WMS&amp;amp;request=getCapabilities&amp;amp;version=1.3.0&amp;amp;layers=emerald_ash_borer_reg_area</a>&lt;/gmd:URL&gt;</p>
<p>              &lt;/gmd:linkage&gt;</p>
<p>              &lt;gmd:protocol&gt;</p>
<p>                &lt;gco:CharacterString&gt;OGC:WMS&lt;/gco:CharacterString&gt;</p>
<p>              &lt;/gmd:protocol&gt;</p>
<p>              &lt;gmd:name xsi:type="gmd:PT_FreeText_PropertyType"&gt;</p>
<p>                &lt;gco:CharacterString&gt;Emerald Ash Borer Regulated Areas&lt;/gco:CharacterString&gt;</p>
<p>                &lt;gmd:PT_FreeText&gt;</p>
<p>                  &lt;gmd:textGroup&gt;</p>
<p>                    &lt;gmd:LocalisedCharacterString locale="#fra"&gt;Des lieux règlementés de l'agrile du frêne&lt;/gmd:LocalisedCharacterString&gt;</p>
<p>                  &lt;/gmd:textGroup&gt;</p>
<p>                &lt;/gmd:PT_FreeText&gt;</p>
<p>              &lt;/gmd:name&gt;</p>
<p>              &lt;gmd:description xsi:type="gmd:PT_FreeText_PropertyType"&gt;</p>
<p>                &lt;gco:CharacterString&gt;Web Service;WMS;eng&lt;/gco:CharacterString&gt;</p>
<p>                &lt;gmd:PT_FreeText&gt;</p>
<p>                  &lt;gmd:textGroup&gt;</p>
<p>                    &lt;gmd:LocalisedCharacterString locale="#fra"&gt;ServiceWeb;WMS;eng&lt;/gmd:LocalisedCharacterString&gt;</p>
<p>                  &lt;/gmd:textGroup&gt;</p>
<p>                &lt;/gmd:PT_FreeText&gt;</p>
<p>              &lt;/gmd:description&gt;</p>
<p>             &lt;/gmd:CI_OnlineResource&gt;</p>
<p>          &lt;/gmd:onLine&gt;</p>
<p>          &lt;gmd:onLine xlink:role="urn:xml:lang:fra-CAN"&gt;</p>
<p>            &lt;gmd:CI_OnlineResource&gt;</p>
<p>              &lt;gmd:linkage&gt;</p>
<p>                &lt;gmd:URL&gt;<a href="http://cartes.geogratis.gc.ca/wms/lieux_reg_agrile_du_frene?service=WMS&amp;amp;request=getCapabilities&amp;amp;version=1.3.0&amp;amp;layers=lieux_reg_agrile_du_frene%3c/gmd:URL">http://cartes.geogratis.gc.ca/wms/lieux_reg_agrile_du_frene?service=WMS&amp;amp;request=getCapabilities&amp;amp;version=1.3.0&amp;amp;layers=lieux_reg_agrile_du_frene&lt;/gmd:URL</a>&gt;</p>
<p>              &lt;/gmd:linkage&gt;</p>
<p>              &lt;gmd:protocol&gt;</p>
<p>                &lt;gco:CharacterString&gt;OGC:WMS&lt;/gco:CharacterString&gt;</p>
<p>              &lt;/gmd:protocol&gt;</p>
<p>              &lt;gmd:name xsi:type="gmd:PT_FreeText_PropertyType"&gt;</p>
<p>                &lt;gco:CharacterString&gt;Emerald Ash Borer Regulated Areas&lt;/gco:CharacterString&gt;</p>
<p>                &lt;gmd:PT_FreeText&gt;</p>
<p>                  &lt;gmd:textGroup&gt;</p>
<p>                    &lt;gmd:LocalisedCharacterString locale="#fra"&gt;Des lieux règlementés de l'agrile du frêne&lt;/gmd:LocalisedCharacterString&gt;</p>
<p>                  &lt;/gmd:textGroup&gt;</p>
<p>                &lt;/gmd:PT_FreeText&gt;</p>
<p>              &lt;/gmd:name&gt;</p>
<p>              &lt;gmd:description xsi:type="gmd:PT_FreeText_PropertyType"&gt;</p>
<p>                &lt;gco:CharacterString&gt;Web Service;WMS;fra&lt;/gco:CharacterString&gt;</p>
<p>                &lt;gmd:PT_FreeText&gt;</p>
<p>                  &lt;gmd:textGroup&gt;</p>
<p>                    &lt;gmd:LocalisedCharacterString locale="#fra"&gt;Service Web;WMS;fra&lt;/gmd:LocalisedCharacterString&gt;</p>
<p>                  &lt;/gmd:textGroup&gt;</p>
<p>                &lt;/gmd:PT_FreeText&gt;</p>
<p>              &lt;/gmd:description&gt;</p>
<p>             &lt;/gmd:CI_OnlineResource&gt;</p>
<p>          &lt;/gmd:onLine&gt;</p>
<p>        &lt;/gmd:MD_DigitalTransferOptions&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

<table>
<tbody>
<tr class="odd">
<td><p>Locale</p>
<p>(<em>PT_Locale</em>)</p></td>
<td></td>
<td><blockquote>
<p>language**</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td></td>
<td><blockquote>
<p>country**</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td></td>
<td><blockquote>
<p>characterEncoding**</p>
</blockquote></td>
<td></td>
<td></td>
</tr>
<tr class="even">
<td></td>
<td><blockquote>
<p><span class="underline"><strong>Guideline:</strong></span> NAP registered code lists based on ISO 639.2 alpha-3 terminology codes for language (eng=English, fra=French) and ISO 3166-1 alpha-3 codes (CAN=Canada) for countries shall be used to describe locale and character encoding shall be set to "utf8; utf8", as shown in the following example:</p>
</blockquote></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr class="odd">
<td></td>
<td><p><strong><span class="underline">Example:</span></strong></p>
<p>&lt;gmd:locale&gt;</p>
<p>&lt;gmd:PT_Locale id="fra"&gt;</p>
<p>&lt;gmd:languageCode&gt;</p>
<p>&lt;gmd:LanguageCode codeListValue="fra" codeList="<a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_116">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_116</a>"&gt;French; Français&lt;/gmd:LanguageCode&gt;</p>
<p>&lt;/gmd:languageCode&gt;</p>
<p>&lt;gmd:country&gt;</p>
<p>&lt;gmd:Country codeListValue="CAN" codeList="<a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_117">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_117</a>" &gt;Canada; Canada&lt;/gmd:Country&gt;</p>
<p>&lt;/gmd:country&gt;</p>
<p>&lt;gmd:characterEncoding&gt;</p>
<p>&lt;gmd:MD_CharacterSetCode codeListValue="RI_458"</p>
<p>codeList="<a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_95">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_95</a>" &gt;utf8; utf8&lt;/gmd:MD_CharacterSetCode&gt;</p>
<p>&lt;/gmd:characterEncoding&gt;</p>
<p>&lt;/gmd:PT_Locale&gt;</p>
<p>&lt;/gmd:locale&gt;</p></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

# Additional Guidelines

This section identifies other metadata characteristics identified as benefiting from standardization.

## Bilingual Support

Implement one bilingual metadata record per dataset.

## Header Information

<table>
<thead>
<tr class="header">
<th><blockquote>
<p><strong><span class="underline">Guideline</span>:</strong> The information in the header of the NAP metadata profile should appear as in the example below.</p>
</blockquote></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Example:</p>
<p>&lt;?xml version='1.0' encoding='UTF-8'?&gt;</p>
<p>&lt;gmd:MD_Metadata</p>
<p>xmlns="http://www.isotc211.org/2005/gmd"</p>
<p>xmlns:xsi="<a href="http://www.w3.org/2001/XMLSchema-instance">http://www.w3.org/2001/XMLSchema-instance</a>"</p>
<p>xmlns:gco="<a href="http://www.isotc211.org/2005/gco">http://www.isotc211.org/2005/gco</a>"</p>
<p>xmlns:gfc="<a href="http://www.isotc211.org/2005/gfc">http://www.isotc211.org/2005/gfc</a>"</p>
<p>xmlns:gmd="<a href="http://www.isotc211.org/2005/gmd">http://www.isotc211.org/2005/gmd</a>"</p>
<p>xmlns:xlink="<a href="http://www.w3.org/1999/xlink">http://www.w3.org/1999/xlink</a>"</p>
<p>xmlns:gmi="<a href="http://www.isotc211.org/2005/gmi">http://www.isotc211.org/2005/gmi</a>"</p>
<p>xmlns:gml="<a href="http://www.opengis.net/gml/3.2">http://www.opengis.net/gml/3.2</a>"</p>
<p>xmlns:gmx="<a href="http://www.isotc211.org/2005/gmx">http://www.isotc211.org/2005/gmx</a>"</p>
<p>xmlns:gsr="<a href="http://www.isotc211.org/2005/gsr">http://www.isotc211.org/2005/gsr</a>"</p>
<p>xmlns:gss="<a href="http://www.isotc211.org/2005/gss">http://www.isotc211.org/2005/gss</a>"</p>
<p>xmlns:gts="<a href="http://www.isotc211.org/2005/gts">http://www.isotc211.org/2005/gts</a>"</p>
<p>xmlns:srv="<a href="http://www.isotc211.org/2005/srv">http://www.isotc211.org/2005/srv</a>"</p>
<blockquote>
<p>xsi:schemaLocation="http://www.isotc211.org/2005/gmd http://nap.geogratis.gc.ca/metadata/tools/schemas/metadata/can-cgsb-171.100-2009-a/gmd/gmd.xsd <a href="http://www.isotc211.org/2005/srv">http://www.isotc211.org/2005/srv</a> http://nap.geogratis.gc.ca/metadata/tools/schemas/metadata/can-cgsb-171.100-2009-a/srv/srv.xsd http://www.geconnections.org/nap/napMetadataTools/napXsd/napm <a href="http://nap.geogratis.gc.ca/metadata/tools/schemas/metadata/can-cgsb-171.100-2009-a/napm/napm.xsd">http://nap.geogratis.gc.ca/metadata/tools/schemas/metadata/can-cgsb-171.100-2009-a/napm/napm.xsd</a>"&gt;</p>
</blockquote></td>
</tr>
</tbody>
</table>

## Codelists

<table>
<thead>
<tr class="header">
<th><blockquote>
<p><strong><span class="underline">Guideline</span>:</strong> Codelists shall conform to “<a href="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml">http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml</a>”. Codelist values will be implemented such that both English and French are part of one value (See example below). Note: the Isotc211.org codelists does not include bilingual codelists while nap.geogratis.gc.ca does.</p>
</blockquote></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><blockquote>
<p><strong><span class="underline">Example</span>:</strong></p>
<p>&lt;gmd:CI_RoleCode codeList="http://nap.geogratis.gc.ca/metadata/register/napMetadataRegister.xml#IC_90" codeListValue="RI_418"&gt;author; auteur&lt;/gmd:CI_RoleCode&gt;</p>
</blockquote></td>
</tr>
</tbody>
</table>

<a name="footnote1">1</a>: mandatory under given conditions

<a name="footnote2">2</a>:  spatialRepresentionType is a Data Identification's optional attribute and as such is not part of this document.
