//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.25 at 02:50:35 AM CET 
//


package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ownershipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ownershipType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="intera propriet\u00e0"/>
 *     &lt;enumeration value="nuda propriet\u00e0"/>
 *     &lt;enumeration value="parziale propriet\u00e0"/>
 *     &lt;enumeration value="usufrutto"/>
 *     &lt;enumeration value="multipropriet\u00e0"/>
 *     &lt;enumeration value="diritto di superficie"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ownershipType")
@XmlEnum
public enum OwnershipType {

    @XmlEnumValue("intera propriet\u00e0")
    INTERA_PROPRIETA("intera propriet\u00e0"),
    @XmlEnumValue("nuda propriet\u00e0")
    NUDA_PROPRIETA("nuda propriet\u00e0"),
    @XmlEnumValue("parziale propriet\u00e0")
    PARZIALE("parziale propriet\u00e0"),
    @XmlEnumValue("usufrutto")
    USUFRUTTO("usufrutto"),
    @XmlEnumValue("multipropriet\u00e0")
    MULTIPROPRIETA("multipropriet\u00e0"),
    @XmlEnumValue("diritto di superficie")
    DIRITTO_DI_SUPERFICIE("diritto di superficie");
    private final String value;

    OwnershipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipType fromValue(String v) {
        for (OwnershipType c: OwnershipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
