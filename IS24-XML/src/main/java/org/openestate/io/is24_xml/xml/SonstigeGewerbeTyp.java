
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for SonstigeGewerbeTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SonstigeGewerbeTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GewerbeImmoBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vermarktung" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGewerbeTyp2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Objektkategorie2" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}SonstigeGewerbeKategorieTyp" /&gt;
 *       &lt;attribute name="Hauptflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="GrundstuecksFlaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Bodenbelag" type="{http://www.immobilienscout24.de/immobilientransfer}BodenbelagTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Denkmalschutzobjekt" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Keller" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SonstigeGewerbeTyp", propOrder = {
    "vermarktung"
})
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.SonstigeGewerbe.Type.class
})
public class SonstigeGewerbeTyp
    extends GewerbeImmoBaseTyp
    implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Vermarktung", required = true)
    protected VermarktungGewerbeTyp2 vermarktung;
    @XmlAttribute(name = "Objektkategorie2", required = true)
    protected SonstigeGewerbeKategorieTyp objektkategorie2;
    @XmlAttribute(name = "Hauptflaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal hauptflaeche;
    @XmlAttribute(name = "GrundstuecksFlaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal grundstuecksFlaeche;
    @XmlAttribute(name = "Bodenbelag")
    protected BodenbelagTyp bodenbelag;
    @XmlAttribute(name = "Denkmalschutzobjekt")
    protected Boolean denkmalschutzobjekt;
    @XmlAttribute(name = "Keller")
    protected Boolean keller;

    /**
     * Gets the value of the vermarktung property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungGewerbeTyp2 }
     *     
     */
    public VermarktungGewerbeTyp2 getVermarktung() {
        return vermarktung;
    }

    /**
     * Sets the value of the vermarktung property.
     * 
     * @param value
     *     allowed object is
     *     {@link VermarktungGewerbeTyp2 }
     *     
     */
    public void setVermarktung(VermarktungGewerbeTyp2 value) {
        this.vermarktung = value;
    }

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link SonstigeGewerbeKategorieTyp }
     *     
     */
    public SonstigeGewerbeKategorieTyp getObjektkategorie2() {
        return objektkategorie2;
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SonstigeGewerbeKategorieTyp }
     *     
     */
    public void setObjektkategorie2(SonstigeGewerbeKategorieTyp value) {
        this.objektkategorie2 = value;
    }

    /**
     * Gets the value of the hauptflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getHauptflaeche() {
        return hauptflaeche;
    }

    /**
     * Sets the value of the hauptflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHauptflaeche(BigDecimal value) {
        this.hauptflaeche = value;
    }

    /**
     * Gets the value of the grundstuecksFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGrundstuecksFlaeche() {
        return grundstuecksFlaeche;
    }

    /**
     * Sets the value of the grundstuecksFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrundstuecksFlaeche(BigDecimal value) {
        this.grundstuecksFlaeche = value;
    }

    /**
     * Gets the value of the bodenbelag property.
     * 
     * @return
     *     possible object is
     *     {@link BodenbelagTyp }
     *     
     */
    public BodenbelagTyp getBodenbelag() {
        if (bodenbelag == null) {
            return BodenbelagTyp.KEINE_ANGABE;
        } else {
            return bodenbelag;
        }
    }

    /**
     * Sets the value of the bodenbelag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodenbelagTyp }
     *     
     */
    public void setBodenbelag(BodenbelagTyp value) {
        this.bodenbelag = value;
    }

    /**
     * Gets the value of the denkmalschutzobjekt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDenkmalschutzobjekt() {
        return denkmalschutzobjekt;
    }

    /**
     * Sets the value of the denkmalschutzobjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDenkmalschutzobjekt(Boolean value) {
        this.denkmalschutzobjekt = value;
    }

    /**
     * Gets the value of the keller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeller() {
        return keller;
    }

    /**
     * Sets the value of the keller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeller(Boolean value) {
        this.keller = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            VermarktungGewerbeTyp2 theVermarktung;
            theVermarktung = this.getVermarktung();
            strategy.appendField(locator, this, "vermarktung", buffer, theVermarktung, (this.vermarktung!= null));
        }
        {
            SonstigeGewerbeKategorieTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2, (this.objektkategorie2 != null));
        }
        {
            BigDecimal theHauptflaeche;
            theHauptflaeche = this.getHauptflaeche();
            strategy.appendField(locator, this, "hauptflaeche", buffer, theHauptflaeche, (this.hauptflaeche!= null));
        }
        {
            BigDecimal theGrundstuecksFlaeche;
            theGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
            strategy.appendField(locator, this, "grundstuecksFlaeche", buffer, theGrundstuecksFlaeche, (this.grundstuecksFlaeche!= null));
        }
        {
            BodenbelagTyp theBodenbelag;
            theBodenbelag = this.getBodenbelag();
            strategy.appendField(locator, this, "bodenbelag", buffer, theBodenbelag, (this.bodenbelag!= null));
        }
        {
            Boolean theDenkmalschutzobjekt;
            theDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
            strategy.appendField(locator, this, "denkmalschutzobjekt", buffer, theDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null));
        }
        {
            Boolean theKeller;
            theKeller = this.isKeller();
            strategy.appendField(locator, this, "keller", buffer, theKeller, (this.keller!= null));
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof SonstigeGewerbeTyp) {
            final SonstigeGewerbeTyp copy = ((SonstigeGewerbeTyp) draftCopy);
            {
                Boolean vermarktungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermarktung!= null));
                if (vermarktungShouldBeCopiedAndSet == Boolean.TRUE) {
                    VermarktungGewerbeTyp2 sourceVermarktung;
                    sourceVermarktung = this.getVermarktung();
                    VermarktungGewerbeTyp2 copyVermarktung = ((VermarktungGewerbeTyp2) strategy.copy(LocatorUtils.property(locator, "vermarktung", sourceVermarktung), sourceVermarktung, (this.vermarktung!= null)));
                    copy.setVermarktung(copyVermarktung);
                } else {
                    if (vermarktungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermarktung = null;
                    }
                }
            }
            {
                Boolean objektkategorie2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkategorie2 != null));
                if (objektkategorie2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    SonstigeGewerbeKategorieTyp sourceObjektkategorie2;
                    sourceObjektkategorie2 = this.getObjektkategorie2();
                    SonstigeGewerbeKategorieTyp copyObjektkategorie2 = ((SonstigeGewerbeKategorieTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2, (this.objektkategorie2 != null)));
                    copy.setObjektkategorie2(copyObjektkategorie2);
                } else {
                    if (objektkategorie2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektkategorie2 = null;
                    }
                }
            }
            {
                Boolean hauptflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hauptflaeche!= null));
                if (hauptflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHauptflaeche;
                    sourceHauptflaeche = this.getHauptflaeche();
                    BigDecimal copyHauptflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "hauptflaeche", sourceHauptflaeche), sourceHauptflaeche, (this.hauptflaeche!= null)));
                    copy.setHauptflaeche(copyHauptflaeche);
                } else {
                    if (hauptflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hauptflaeche = null;
                    }
                }
            }
            {
                Boolean grundstuecksFlaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grundstuecksFlaeche!= null));
                if (grundstuecksFlaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGrundstuecksFlaeche;
                    sourceGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
                    BigDecimal copyGrundstuecksFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grundstuecksFlaeche", sourceGrundstuecksFlaeche), sourceGrundstuecksFlaeche, (this.grundstuecksFlaeche!= null)));
                    copy.setGrundstuecksFlaeche(copyGrundstuecksFlaeche);
                } else {
                    if (grundstuecksFlaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grundstuecksFlaeche = null;
                    }
                }
            }
            {
                Boolean bodenbelagShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bodenbelag!= null));
                if (bodenbelagShouldBeCopiedAndSet == Boolean.TRUE) {
                    BodenbelagTyp sourceBodenbelag;
                    sourceBodenbelag = this.getBodenbelag();
                    BodenbelagTyp copyBodenbelag = ((BodenbelagTyp) strategy.copy(LocatorUtils.property(locator, "bodenbelag", sourceBodenbelag), sourceBodenbelag, (this.bodenbelag!= null)));
                    copy.setBodenbelag(copyBodenbelag);
                } else {
                    if (bodenbelagShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bodenbelag = null;
                    }
                }
            }
            {
                Boolean denkmalschutzobjektShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.denkmalschutzobjekt!= null));
                if (denkmalschutzobjektShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDenkmalschutzobjekt;
                    sourceDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
                    Boolean copyDenkmalschutzobjekt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "denkmalschutzobjekt", sourceDenkmalschutzobjekt), sourceDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null)));
                    copy.setDenkmalschutzobjekt(copyDenkmalschutzobjekt);
                } else {
                    if (denkmalschutzobjektShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.denkmalschutzobjekt = null;
                    }
                }
            }
            {
                Boolean kellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keller!= null));
                if (kellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKeller;
                    sourceKeller = this.isKeller();
                    Boolean copyKeller = ((Boolean) strategy.copy(LocatorUtils.property(locator, "keller", sourceKeller), sourceKeller, (this.keller!= null)));
                    copy.setKeller(copyKeller);
                } else {
                    if (kellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.keller = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SonstigeGewerbeTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SonstigeGewerbeTyp that = ((SonstigeGewerbeTyp) object);
        {
            VermarktungGewerbeTyp2 lhsVermarktung;
            lhsVermarktung = this.getVermarktung();
            VermarktungGewerbeTyp2 rhsVermarktung;
            rhsVermarktung = that.getVermarktung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktung", lhsVermarktung), LocatorUtils.property(thatLocator, "vermarktung", rhsVermarktung), lhsVermarktung, rhsVermarktung, (this.vermarktung!= null), (that.vermarktung!= null))) {
                return false;
            }
        }
        {
            SonstigeGewerbeKategorieTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            SonstigeGewerbeKategorieTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2, (this.objektkategorie2 != null), (that.objektkategorie2 != null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHauptflaeche;
            lhsHauptflaeche = this.getHauptflaeche();
            BigDecimal rhsHauptflaeche;
            rhsHauptflaeche = that.getHauptflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hauptflaeche", lhsHauptflaeche), LocatorUtils.property(thatLocator, "hauptflaeche", rhsHauptflaeche), lhsHauptflaeche, rhsHauptflaeche, (this.hauptflaeche!= null), (that.hauptflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGrundstuecksFlaeche;
            lhsGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
            BigDecimal rhsGrundstuecksFlaeche;
            rhsGrundstuecksFlaeche = that.getGrundstuecksFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstuecksFlaeche", lhsGrundstuecksFlaeche), LocatorUtils.property(thatLocator, "grundstuecksFlaeche", rhsGrundstuecksFlaeche), lhsGrundstuecksFlaeche, rhsGrundstuecksFlaeche, (this.grundstuecksFlaeche!= null), (that.grundstuecksFlaeche!= null))) {
                return false;
            }
        }
        {
            BodenbelagTyp lhsBodenbelag;
            lhsBodenbelag = this.getBodenbelag();
            BodenbelagTyp rhsBodenbelag;
            rhsBodenbelag = that.getBodenbelag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bodenbelag", lhsBodenbelag), LocatorUtils.property(thatLocator, "bodenbelag", rhsBodenbelag), lhsBodenbelag, rhsBodenbelag, (this.bodenbelag!= null), (that.bodenbelag!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDenkmalschutzobjekt;
            lhsDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
            Boolean rhsDenkmalschutzobjekt;
            rhsDenkmalschutzobjekt = that.isDenkmalschutzobjekt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denkmalschutzobjekt", lhsDenkmalschutzobjekt), LocatorUtils.property(thatLocator, "denkmalschutzobjekt", rhsDenkmalschutzobjekt), lhsDenkmalschutzobjekt, rhsDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null), (that.denkmalschutzobjekt!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKeller;
            lhsKeller = this.isKeller();
            Boolean rhsKeller;
            rhsKeller = that.isKeller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keller", lhsKeller), LocatorUtils.property(thatLocator, "keller", rhsKeller), lhsKeller, rhsKeller, (this.keller!= null), (that.keller!= null))) {
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
