//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.21 at 12:37:47 AM CET 
//


package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrundstueckKategorienTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrundstueckKategorienTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Wohnen"/>
 *     &lt;enumeration value="Gewerbe"/>
 *     &lt;enumeration value="LandForstwirtschaft"/>
 *     &lt;enumeration value="Freizeit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrundstueckKategorienTyp")
@XmlEnum
public enum GrundstueckKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Wohnen")
    WOHNEN("Wohnen"),
    @XmlEnumValue("Gewerbe")
    GEWERBE("Gewerbe"),
    @XmlEnumValue("LandForstwirtschaft")
    LAND_FORSTWIRTSCHAFT("LandForstwirtschaft"),
    @XmlEnumValue("Freizeit")
    FREIZEIT("Freizeit");
    private final String value;

    GrundstueckKategorienTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GrundstueckKategorienTyp fromValue(String v) {
        for (GrundstueckKategorienTyp c: GrundstueckKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}