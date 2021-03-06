
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Java class for &lt;einzelhandel&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "einzelhandel")
public class Einzelhandel implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "handel_typ")
    protected Einzelhandel.HandelTyp handelTyp;

    /**
     * Gets the value of the handelTyp property.
     *
     * @return
     *     possible object is
     *     {@link Einzelhandel.HandelTyp }
     *
     */
    public Einzelhandel.HandelTyp getHandelTyp() {
        return handelTyp;
    }

    /**
     * Sets the value of the handelTyp property.
     *
     * @param value
     *     allowed object is
     *     {@link Einzelhandel.HandelTyp }
     *
     */
    public void setHandelTyp(Einzelhandel.HandelTyp value) {
        this.handelTyp = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Einzelhandel.HandelTyp theHandelTyp;
            theHandelTyp = this.getHandelTyp();
            strategy.appendField(locator, this, "handelTyp", buffer, theHandelTyp, (this.handelTyp!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Einzelhandel) {
            final Einzelhandel copy = ((Einzelhandel) draftCopy);
            {
                Boolean handelTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.handelTyp!= null));
                if (handelTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    Einzelhandel.HandelTyp sourceHandelTyp;
                    sourceHandelTyp = this.getHandelTyp();
                    Einzelhandel.HandelTyp copyHandelTyp = ((Einzelhandel.HandelTyp) strategy.copy(LocatorUtils.property(locator, "handelTyp", sourceHandelTyp), sourceHandelTyp, (this.handelTyp!= null)));
                    copy.setHandelTyp(copyHandelTyp);
                } else {
                    if (handelTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.handelTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Einzelhandel();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Einzelhandel that = ((Einzelhandel) object);
        {
            Einzelhandel.HandelTyp lhsHandelTyp;
            lhsHandelTyp = this.getHandelTyp();
            Einzelhandel.HandelTyp rhsHandelTyp;
            rhsHandelTyp = that.getHandelTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handelTyp", lhsHandelTyp), LocatorUtils.property(thatLocator, "handelTyp", rhsHandelTyp), lhsHandelTyp, rhsHandelTyp, (this.handelTyp!= null), (that.handelTyp!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for <em>handel_typ</em> attribute in &lt;einzelhandel&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum HandelTyp {

        LADENLOKAL,
        EINZELHANDELSLADEN,
        VERBRAUCHERMARKT,
        EINKAUFSZENTRUM,
        KAUFHAUS,
        FACTORY_OUTLET,
        KIOSK,
        VERKAUFSFLAECHE,
        AUSSTELLUNGSFLAECHE;

        public String value() {
            return name();
        }

        public static Einzelhandel.HandelTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}