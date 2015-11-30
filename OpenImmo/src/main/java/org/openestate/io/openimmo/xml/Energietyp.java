
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * Java class for &lt;energietyp&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "energietyp")
public class Energietyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "PASSIVHAUS")
    protected Boolean passivhaus;
    @XmlAttribute(name = "NIEDRIGENERGIE")
    protected Boolean niedrigenergie;
    @XmlAttribute(name = "NEUBAUSTANDARD")
    protected Boolean neubaustandard;
    @XmlAttribute(name = "KFW40")
    protected Boolean kfw40;
    @XmlAttribute(name = "KFW60")
    protected Boolean kfw60;
    @XmlAttribute(name = "KFW55")
    protected Boolean kfw55;
    @XmlAttribute(name = "KFW70")
    protected Boolean kfw70;
    @XmlAttribute(name = "MINERGIEBAUWEISE")
    protected Boolean minergiebauweise;
    @XmlAttribute(name = "MINERGIE_ZERTIFIZIERT")
    protected Boolean minergiezertifiziert;

    /**
     * Gets the value of the passivhaus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPASSIVHAUS() {
        return passivhaus;
    }

    /**
     * Sets the value of the passivhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPASSIVHAUS(Boolean value) {
        this.passivhaus = value;
    }

    /**
     * Gets the value of the niedrigenergie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNIEDRIGENERGIE() {
        return niedrigenergie;
    }

    /**
     * Sets the value of the niedrigenergie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNIEDRIGENERGIE(Boolean value) {
        this.niedrigenergie = value;
    }

    /**
     * Gets the value of the neubaustandard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNEUBAUSTANDARD() {
        return neubaustandard;
    }

    /**
     * Sets the value of the neubaustandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNEUBAUSTANDARD(Boolean value) {
        this.neubaustandard = value;
    }

    /**
     * Gets the value of the kfw40 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKFW40() {
        return kfw40;
    }

    /**
     * Sets the value of the kfw40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKFW40(Boolean value) {
        this.kfw40 = value;
    }

    /**
     * Gets the value of the kfw60 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKFW60() {
        return kfw60;
    }

    /**
     * Sets the value of the kfw60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKFW60(Boolean value) {
        this.kfw60 = value;
    }

    /**
     * Gets the value of the kfw55 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKFW55() {
        return kfw55;
    }

    /**
     * Sets the value of the kfw55 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKFW55(Boolean value) {
        this.kfw55 = value;
    }

    /**
     * Gets the value of the kfw70 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKFW70() {
        return kfw70;
    }

    /**
     * Sets the value of the kfw70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKFW70(Boolean value) {
        this.kfw70 = value;
    }

    /**
     * Gets the value of the minergiebauweise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMINERGIEBAUWEISE() {
        return minergiebauweise;
    }

    /**
     * Sets the value of the minergiebauweise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMINERGIEBAUWEISE(Boolean value) {
        this.minergiebauweise = value;
    }

    /**
     * Gets the value of the minergiezertifiziert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMINERGIEZERTIFIZIERT() {
        return minergiezertifiziert;
    }

    /**
     * Sets the value of the minergiezertifiziert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMINERGIEZERTIFIZIERT(Boolean value) {
        this.minergiezertifiziert = value;
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
            Boolean thePASSIVHAUS;
            thePASSIVHAUS = this.isPASSIVHAUS();
            strategy.appendField(locator, this, "passivhaus", buffer, thePASSIVHAUS);
        }
        {
            Boolean theNIEDRIGENERGIE;
            theNIEDRIGENERGIE = this.isNIEDRIGENERGIE();
            strategy.appendField(locator, this, "niedrigenergie", buffer, theNIEDRIGENERGIE);
        }
        {
            Boolean theNEUBAUSTANDARD;
            theNEUBAUSTANDARD = this.isNEUBAUSTANDARD();
            strategy.appendField(locator, this, "neubaustandard", buffer, theNEUBAUSTANDARD);
        }
        {
            Boolean theKFW40;
            theKFW40 = this.isKFW40();
            strategy.appendField(locator, this, "kfw40", buffer, theKFW40);
        }
        {
            Boolean theKFW60;
            theKFW60 = this.isKFW60();
            strategy.appendField(locator, this, "kfw60", buffer, theKFW60);
        }
        {
            Boolean theKFW55;
            theKFW55 = this.isKFW55();
            strategy.appendField(locator, this, "kfw55", buffer, theKFW55);
        }
        {
            Boolean theKFW70;
            theKFW70 = this.isKFW70();
            strategy.appendField(locator, this, "kfw70", buffer, theKFW70);
        }
        {
            Boolean theMINERGIEBAUWEISE;
            theMINERGIEBAUWEISE = this.isMINERGIEBAUWEISE();
            strategy.appendField(locator, this, "minergiebauweise", buffer, theMINERGIEBAUWEISE);
        }
        {
            Boolean theMINERGIEZERTIFIZIERT;
            theMINERGIEZERTIFIZIERT = this.isMINERGIEZERTIFIZIERT();
            strategy.appendField(locator, this, "minergiezertifiziert", buffer, theMINERGIEZERTIFIZIERT);
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
        if (draftCopy instanceof Energietyp) {
            final Energietyp copy = ((Energietyp) draftCopy);
            if (this.passivhaus!= null) {
                Boolean sourcePASSIVHAUS;
                sourcePASSIVHAUS = this.isPASSIVHAUS();
                Boolean copyPASSIVHAUS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "passivhaus", sourcePASSIVHAUS), sourcePASSIVHAUS));
                copy.setPASSIVHAUS(copyPASSIVHAUS);
            } else {
                copy.passivhaus = null;
            }
            if (this.niedrigenergie!= null) {
                Boolean sourceNIEDRIGENERGIE;
                sourceNIEDRIGENERGIE = this.isNIEDRIGENERGIE();
                Boolean copyNIEDRIGENERGIE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "niedrigenergie", sourceNIEDRIGENERGIE), sourceNIEDRIGENERGIE));
                copy.setNIEDRIGENERGIE(copyNIEDRIGENERGIE);
            } else {
                copy.niedrigenergie = null;
            }
            if (this.neubaustandard!= null) {
                Boolean sourceNEUBAUSTANDARD;
                sourceNEUBAUSTANDARD = this.isNEUBAUSTANDARD();
                Boolean copyNEUBAUSTANDARD = ((Boolean) strategy.copy(LocatorUtils.property(locator, "neubaustandard", sourceNEUBAUSTANDARD), sourceNEUBAUSTANDARD));
                copy.setNEUBAUSTANDARD(copyNEUBAUSTANDARD);
            } else {
                copy.neubaustandard = null;
            }
            if (this.kfw40 != null) {
                Boolean sourceKFW40;
                sourceKFW40 = this.isKFW40();
                Boolean copyKFW40 = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kfw40", sourceKFW40), sourceKFW40));
                copy.setKFW40(copyKFW40);
            } else {
                copy.kfw40 = null;
            }
            if (this.kfw60 != null) {
                Boolean sourceKFW60;
                sourceKFW60 = this.isKFW60();
                Boolean copyKFW60 = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kfw60", sourceKFW60), sourceKFW60));
                copy.setKFW60(copyKFW60);
            } else {
                copy.kfw60 = null;
            }
            if (this.kfw55 != null) {
                Boolean sourceKFW55;
                sourceKFW55 = this.isKFW55();
                Boolean copyKFW55 = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kfw55", sourceKFW55), sourceKFW55));
                copy.setKFW55(copyKFW55);
            } else {
                copy.kfw55 = null;
            }
            if (this.kfw70 != null) {
                Boolean sourceKFW70;
                sourceKFW70 = this.isKFW70();
                Boolean copyKFW70 = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kfw70", sourceKFW70), sourceKFW70));
                copy.setKFW70(copyKFW70);
            } else {
                copy.kfw70 = null;
            }
            if (this.minergiebauweise!= null) {
                Boolean sourceMINERGIEBAUWEISE;
                sourceMINERGIEBAUWEISE = this.isMINERGIEBAUWEISE();
                Boolean copyMINERGIEBAUWEISE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "minergiebauweise", sourceMINERGIEBAUWEISE), sourceMINERGIEBAUWEISE));
                copy.setMINERGIEBAUWEISE(copyMINERGIEBAUWEISE);
            } else {
                copy.minergiebauweise = null;
            }
            if (this.minergiezertifiziert!= null) {
                Boolean sourceMINERGIEZERTIFIZIERT;
                sourceMINERGIEZERTIFIZIERT = this.isMINERGIEZERTIFIZIERT();
                Boolean copyMINERGIEZERTIFIZIERT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "minergiezertifiziert", sourceMINERGIEZERTIFIZIERT), sourceMINERGIEZERTIFIZIERT));
                copy.setMINERGIEZERTIFIZIERT(copyMINERGIEZERTIFIZIERT);
            } else {
                copy.minergiezertifiziert = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Energietyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Energietyp that = ((Energietyp) object);
        {
            Boolean lhsPASSIVHAUS;
            lhsPASSIVHAUS = this.isPASSIVHAUS();
            Boolean rhsPASSIVHAUS;
            rhsPASSIVHAUS = that.isPASSIVHAUS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passivhaus", lhsPASSIVHAUS), LocatorUtils.property(thatLocator, "passivhaus", rhsPASSIVHAUS), lhsPASSIVHAUS, rhsPASSIVHAUS)) {
                return false;
            }
        }
        {
            Boolean lhsNIEDRIGENERGIE;
            lhsNIEDRIGENERGIE = this.isNIEDRIGENERGIE();
            Boolean rhsNIEDRIGENERGIE;
            rhsNIEDRIGENERGIE = that.isNIEDRIGENERGIE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "niedrigenergie", lhsNIEDRIGENERGIE), LocatorUtils.property(thatLocator, "niedrigenergie", rhsNIEDRIGENERGIE), lhsNIEDRIGENERGIE, rhsNIEDRIGENERGIE)) {
                return false;
            }
        }
        {
            Boolean lhsNEUBAUSTANDARD;
            lhsNEUBAUSTANDARD = this.isNEUBAUSTANDARD();
            Boolean rhsNEUBAUSTANDARD;
            rhsNEUBAUSTANDARD = that.isNEUBAUSTANDARD();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "neubaustandard", lhsNEUBAUSTANDARD), LocatorUtils.property(thatLocator, "neubaustandard", rhsNEUBAUSTANDARD), lhsNEUBAUSTANDARD, rhsNEUBAUSTANDARD)) {
                return false;
            }
        }
        {
            Boolean lhsKFW40;
            lhsKFW40 = this.isKFW40();
            Boolean rhsKFW40;
            rhsKFW40 = that.isKFW40();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kfw40", lhsKFW40), LocatorUtils.property(thatLocator, "kfw40", rhsKFW40), lhsKFW40, rhsKFW40)) {
                return false;
            }
        }
        {
            Boolean lhsKFW60;
            lhsKFW60 = this.isKFW60();
            Boolean rhsKFW60;
            rhsKFW60 = that.isKFW60();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kfw60", lhsKFW60), LocatorUtils.property(thatLocator, "kfw60", rhsKFW60), lhsKFW60, rhsKFW60)) {
                return false;
            }
        }
        {
            Boolean lhsKFW55;
            lhsKFW55 = this.isKFW55();
            Boolean rhsKFW55;
            rhsKFW55 = that.isKFW55();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kfw55", lhsKFW55), LocatorUtils.property(thatLocator, "kfw55", rhsKFW55), lhsKFW55, rhsKFW55)) {
                return false;
            }
        }
        {
            Boolean lhsKFW70;
            lhsKFW70 = this.isKFW70();
            Boolean rhsKFW70;
            rhsKFW70 = that.isKFW70();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kfw70", lhsKFW70), LocatorUtils.property(thatLocator, "kfw70", rhsKFW70), lhsKFW70, rhsKFW70)) {
                return false;
            }
        }
        {
            Boolean lhsMINERGIEBAUWEISE;
            lhsMINERGIEBAUWEISE = this.isMINERGIEBAUWEISE();
            Boolean rhsMINERGIEBAUWEISE;
            rhsMINERGIEBAUWEISE = that.isMINERGIEBAUWEISE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minergiebauweise", lhsMINERGIEBAUWEISE), LocatorUtils.property(thatLocator, "minergiebauweise", rhsMINERGIEBAUWEISE), lhsMINERGIEBAUWEISE, rhsMINERGIEBAUWEISE)) {
                return false;
            }
        }
        {
            Boolean lhsMINERGIEZERTIFIZIERT;
            lhsMINERGIEZERTIFIZIERT = this.isMINERGIEZERTIFIZIERT();
            Boolean rhsMINERGIEZERTIFIZIERT;
            rhsMINERGIEZERTIFIZIERT = that.isMINERGIEZERTIFIZIERT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minergiezertifiziert", lhsMINERGIEZERTIFIZIERT), LocatorUtils.property(thatLocator, "minergiezertifiziert", rhsMINERGIEZERTIFIZIERT), lhsMINERGIEZERTIFIZIERT, rhsMINERGIEZERTIFIZIERT)) {
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
