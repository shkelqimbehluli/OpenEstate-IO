
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for proptype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proptype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="type" type="{http://feed.immobiliare.it}propertyTypeSimple"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="business-type" type="{http://feed.immobiliare.it}businessElement"/&gt;
 *           &lt;element name="terrains" type="{http://feed.immobiliare.it}terrains" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proptype", propOrder = {
    "type",
    "businessType",
    "terrains"
})
public class Proptype implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlSchemaType(name = "string")
    protected PropertyTypeSimple type;
    @XmlElement(name = "business-type")
    protected BusinessElement businessType;
    protected Terrains terrains;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyTypeSimple }
     *     
     */
    public PropertyTypeSimple getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyTypeSimple }
     *     
     */
    public void setType(PropertyTypeSimple value) {
        this.type = value;
    }

    /**
     * Gets the value of the businessType property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessElement }
     *     
     */
    public BusinessElement getBusinessType() {
        return businessType;
    }

    /**
     * Sets the value of the businessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessElement }
     *     
     */
    public void setBusinessType(BusinessElement value) {
        this.businessType = value;
    }

    /**
     * Gets the value of the terrains property.
     * 
     * @return
     *     possible object is
     *     {@link Terrains }
     *     
     */
    public Terrains getTerrains() {
        return terrains;
    }

    /**
     * Sets the value of the terrains property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terrains }
     *     
     */
    public void setTerrains(Terrains value) {
        this.terrains = value;
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
            PropertyTypeSimple theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            BusinessElement theBusinessType;
            theBusinessType = this.getBusinessType();
            strategy.appendField(locator, this, "businessType", buffer, theBusinessType, (this.businessType!= null));
        }
        {
            Terrains theTerrains;
            theTerrains = this.getTerrains();
            strategy.appendField(locator, this, "terrains", buffer, theTerrains, (this.terrains!= null));
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
        if (draftCopy instanceof Proptype) {
            final Proptype copy = ((Proptype) draftCopy);
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    PropertyTypeSimple sourceType;
                    sourceType = this.getType();
                    PropertyTypeSimple copyType = ((PropertyTypeSimple) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
            {
                Boolean businessTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.businessType!= null));
                if (businessTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BusinessElement sourceBusinessType;
                    sourceBusinessType = this.getBusinessType();
                    BusinessElement copyBusinessType = ((BusinessElement) strategy.copy(LocatorUtils.property(locator, "businessType", sourceBusinessType), sourceBusinessType, (this.businessType!= null)));
                    copy.setBusinessType(copyBusinessType);
                } else {
                    if (businessTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.businessType = null;
                    }
                }
            }
            {
                Boolean terrainsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.terrains!= null));
                if (terrainsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Terrains sourceTerrains;
                    sourceTerrains = this.getTerrains();
                    Terrains copyTerrains = ((Terrains) strategy.copy(LocatorUtils.property(locator, "terrains", sourceTerrains), sourceTerrains, (this.terrains!= null)));
                    copy.setTerrains(copyTerrains);
                } else {
                    if (terrainsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.terrains = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Proptype();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Proptype that = ((Proptype) object);
        {
            PropertyTypeSimple lhsType;
            lhsType = this.getType();
            PropertyTypeSimple rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            BusinessElement lhsBusinessType;
            lhsBusinessType = this.getBusinessType();
            BusinessElement rhsBusinessType;
            rhsBusinessType = that.getBusinessType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessType", lhsBusinessType), LocatorUtils.property(thatLocator, "businessType", rhsBusinessType), lhsBusinessType, rhsBusinessType, (this.businessType!= null), (that.businessType!= null))) {
                return false;
            }
        }
        {
            Terrains lhsTerrains;
            lhsTerrains = this.getTerrains();
            Terrains rhsTerrains;
            rhsTerrains = that.getTerrains();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrains", lhsTerrains), LocatorUtils.property(thatLocator, "terrains", rhsTerrains), lhsTerrains, rhsTerrains, (this.terrains!= null), (that.terrains!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
