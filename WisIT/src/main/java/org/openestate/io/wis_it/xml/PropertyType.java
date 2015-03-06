
package org.openestate.io.wis_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="propertyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bauernhof"/>
 *     &lt;enumeration value="baugrund"/>
 *     &lt;enumeration value="buero"/>
 *     &lt;enumeration value="einfamilienhaus"/>
 *     &lt;enumeration value="garage"/>
 *     &lt;enumeration value="gastgewerbeobjekt"/>
 *     &lt;enumeration value="geschaeft"/>
 *     &lt;enumeration value="gewerbehalle"/>
 *     &lt;enumeration value="kulturgrund"/>
 *     &lt;enumeration value="reihenhaus"/>
 *     &lt;enumeration value="wald"/>
 *     &lt;enumeration value="wohnung"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "propertyType")
@XmlEnum
public enum PropertyType {

    @XmlEnumValue("bauernhof")
    BAUERNHOF("bauernhof"),
    @XmlEnumValue("baugrund")
    BAUGRUND("baugrund"),
    @XmlEnumValue("buero")
    BUERO("buero"),
    @XmlEnumValue("einfamilienhaus")
    EINFAMILIENHAUS("einfamilienhaus"),
    @XmlEnumValue("garage")
    GARAGE("garage"),
    @XmlEnumValue("gastgewerbeobjekt")
    GASTGEWERBEOBJEKT("gastgewerbeobjekt"),
    @XmlEnumValue("geschaeft")
    GESCHAEFT("geschaeft"),
    @XmlEnumValue("gewerbehalle")
    GEWERBEHALLE("gewerbehalle"),
    @XmlEnumValue("kulturgrund")
    KULTURGRUND("kulturgrund"),
    @XmlEnumValue("reihenhaus")
    REIHENHAUS("reihenhaus"),
    @XmlEnumValue("wald")
    WALD("wald"),
    @XmlEnumValue("wohnung")
    WOHNUNG("wohnung");
    private final String value;

    PropertyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyType fromValue(String v) {
        for (PropertyType c: PropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
