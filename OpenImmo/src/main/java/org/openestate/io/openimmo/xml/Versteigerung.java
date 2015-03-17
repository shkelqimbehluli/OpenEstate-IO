
package org.openestate.io.openimmo.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Java class for &lt;versteigerung&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zwangsversteigerung",
    "aktenzeichen",
    "zvtermin",
    "zusatztermin",
    "amtsgericht",
    "verkehrswert"
})
@XmlRootElement(name = "versteigerung")
public class Versteigerung
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Boolean zwangsversteigerung;
    protected String aktenzeichen;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar zvtermin;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar zusatztermin;
    protected String amtsgericht;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "decimal")
    protected Double verkehrswert;

    /**
     * Gets the value of the zwangsversteigerung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZwangsversteigerung() {
        return zwangsversteigerung;
    }

    /**
     * Sets the value of the zwangsversteigerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZwangsversteigerung(Boolean value) {
        this.zwangsversteigerung = value;
    }

    /**
     * Gets the value of the aktenzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktenzeichen() {
        return aktenzeichen;
    }

    /**
     * Sets the value of the aktenzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktenzeichen(String value) {
        this.aktenzeichen = value;
    }

    /**
     * Gets the value of the zvtermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getZvtermin() {
        return zvtermin;
    }

    /**
     * Sets the value of the zvtermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZvtermin(Calendar value) {
        this.zvtermin = value;
    }

    /**
     * Gets the value of the zusatztermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getZusatztermin() {
        return zusatztermin;
    }

    /**
     * Sets the value of the zusatztermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatztermin(Calendar value) {
        this.zusatztermin = value;
    }

    /**
     * Gets the value of the amtsgericht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtsgericht() {
        return amtsgericht;
    }

    /**
     * Sets the value of the amtsgericht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtsgericht(String value) {
        this.amtsgericht = value;
    }

    /**
     * Gets the value of the verkehrswert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getVerkehrswert() {
        return verkehrswert;
    }

    /**
     * Sets the value of the verkehrswert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerkehrswert(Double value) {
        this.verkehrswert = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Boolean theZwangsversteigerung;
            theZwangsversteigerung = this.isZwangsversteigerung();
            strategy.appendField(locator, this, "zwangsversteigerung", buffer, theZwangsversteigerung);
        }
        {
            String theAktenzeichen;
            theAktenzeichen = this.getAktenzeichen();
            strategy.appendField(locator, this, "aktenzeichen", buffer, theAktenzeichen);
        }
        {
            Calendar theZvtermin;
            theZvtermin = this.getZvtermin();
            strategy.appendField(locator, this, "zvtermin", buffer, theZvtermin);
        }
        {
            Calendar theZusatztermin;
            theZusatztermin = this.getZusatztermin();
            strategy.appendField(locator, this, "zusatztermin", buffer, theZusatztermin);
        }
        {
            String theAmtsgericht;
            theAmtsgericht = this.getAmtsgericht();
            strategy.appendField(locator, this, "amtsgericht", buffer, theAmtsgericht);
        }
        {
            Double theVerkehrswert;
            theVerkehrswert = this.getVerkehrswert();
            strategy.appendField(locator, this, "verkehrswert", buffer, theVerkehrswert);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Versteigerung) {
            final Versteigerung copy = ((Versteigerung) draftCopy);
            if (this.zwangsversteigerung!= null) {
                Boolean sourceZwangsversteigerung;
                sourceZwangsversteigerung = this.isZwangsversteigerung();
                Boolean copyZwangsversteigerung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zwangsversteigerung", sourceZwangsversteigerung), sourceZwangsversteigerung));
                copy.setZwangsversteigerung(copyZwangsversteigerung);
            } else {
                copy.zwangsversteigerung = null;
            }
            if (this.aktenzeichen!= null) {
                String sourceAktenzeichen;
                sourceAktenzeichen = this.getAktenzeichen();
                String copyAktenzeichen = ((String) strategy.copy(LocatorUtils.property(locator, "aktenzeichen", sourceAktenzeichen), sourceAktenzeichen));
                copy.setAktenzeichen(copyAktenzeichen);
            } else {
                copy.aktenzeichen = null;
            }
            if (this.zvtermin!= null) {
                Calendar sourceZvtermin;
                sourceZvtermin = this.getZvtermin();
                Calendar copyZvtermin = ((Calendar) strategy.copy(LocatorUtils.property(locator, "zvtermin", sourceZvtermin), sourceZvtermin));
                copy.setZvtermin(copyZvtermin);
            } else {
                copy.zvtermin = null;
            }
            if (this.zusatztermin!= null) {
                Calendar sourceZusatztermin;
                sourceZusatztermin = this.getZusatztermin();
                Calendar copyZusatztermin = ((Calendar) strategy.copy(LocatorUtils.property(locator, "zusatztermin", sourceZusatztermin), sourceZusatztermin));
                copy.setZusatztermin(copyZusatztermin);
            } else {
                copy.zusatztermin = null;
            }
            if (this.amtsgericht!= null) {
                String sourceAmtsgericht;
                sourceAmtsgericht = this.getAmtsgericht();
                String copyAmtsgericht = ((String) strategy.copy(LocatorUtils.property(locator, "amtsgericht", sourceAmtsgericht), sourceAmtsgericht));
                copy.setAmtsgericht(copyAmtsgericht);
            } else {
                copy.amtsgericht = null;
            }
            if (this.verkehrswert!= null) {
                Double sourceVerkehrswert;
                sourceVerkehrswert = this.getVerkehrswert();
                Double copyVerkehrswert = ((Double) strategy.copy(LocatorUtils.property(locator, "verkehrswert", sourceVerkehrswert), sourceVerkehrswert));
                copy.setVerkehrswert(copyVerkehrswert);
            } else {
                copy.verkehrswert = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Versteigerung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Versteigerung)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Versteigerung that = ((Versteigerung) object);
        {
            Boolean lhsZwangsversteigerung;
            lhsZwangsversteigerung = this.isZwangsversteigerung();
            Boolean rhsZwangsversteigerung;
            rhsZwangsversteigerung = that.isZwangsversteigerung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zwangsversteigerung", lhsZwangsversteigerung), LocatorUtils.property(thatLocator, "zwangsversteigerung", rhsZwangsversteigerung), lhsZwangsversteigerung, rhsZwangsversteigerung)) {
                return false;
            }
        }
        {
            String lhsAktenzeichen;
            lhsAktenzeichen = this.getAktenzeichen();
            String rhsAktenzeichen;
            rhsAktenzeichen = that.getAktenzeichen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktenzeichen", lhsAktenzeichen), LocatorUtils.property(thatLocator, "aktenzeichen", rhsAktenzeichen), lhsAktenzeichen, rhsAktenzeichen)) {
                return false;
            }
        }
        {
            Calendar lhsZvtermin;
            lhsZvtermin = this.getZvtermin();
            Calendar rhsZvtermin;
            rhsZvtermin = that.getZvtermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zvtermin", lhsZvtermin), LocatorUtils.property(thatLocator, "zvtermin", rhsZvtermin), lhsZvtermin, rhsZvtermin)) {
                return false;
            }
        }
        {
            Calendar lhsZusatztermin;
            lhsZusatztermin = this.getZusatztermin();
            Calendar rhsZusatztermin;
            rhsZusatztermin = that.getZusatztermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusatztermin", lhsZusatztermin), LocatorUtils.property(thatLocator, "zusatztermin", rhsZusatztermin), lhsZusatztermin, rhsZusatztermin)) {
                return false;
            }
        }
        {
            String lhsAmtsgericht;
            lhsAmtsgericht = this.getAmtsgericht();
            String rhsAmtsgericht;
            rhsAmtsgericht = that.getAmtsgericht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amtsgericht", lhsAmtsgericht), LocatorUtils.property(thatLocator, "amtsgericht", rhsAmtsgericht), lhsAmtsgericht, rhsAmtsgericht)) {
                return false;
            }
        }
        {
            Double lhsVerkehrswert;
            lhsVerkehrswert = this.getVerkehrswert();
            Double rhsVerkehrswert;
            rhsVerkehrswert = that.getVerkehrswert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verkehrswert", lhsVerkehrswert), LocatorUtils.property(thatLocator, "verkehrswert", rhsVerkehrswert), lhsVerkehrswert, rhsVerkehrswert)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
