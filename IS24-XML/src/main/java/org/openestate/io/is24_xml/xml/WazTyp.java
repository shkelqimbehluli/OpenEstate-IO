
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for WazTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WazTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pauschalmiete"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}WazMieteBaseTyp"&gt;
 *                 &lt;attribute name="MietePauschal" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *                 &lt;attribute name="MietePro" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}WazZeiteinheitenTyp" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Monatsmiete" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}WazMieteBaseTyp"&gt;
 *                 &lt;attribute name="Kaltmiete" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *                 &lt;attribute name="Nebenkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BefeuerungsArt" type="{http://www.immobilienscout24.de/immobilientransfer}BefeuerungsArtTyp" minOccurs="0"/&gt;
 *         &lt;element name="Energieausweis" type="{http://www.immobilienscout24.de/immobilientransfer}EnergieausweisTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="WazKategorie" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}WazKategorienTyp" /&gt;
 *       &lt;attribute name="Wohnflaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Zimmer" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}ZimmeranzahlTyp" /&gt;
 *       &lt;attribute name="FreiBis" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="Midestmietdauer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="Maximalmietdauer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="Etage" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3i0Typ" /&gt;
 *       &lt;attribute name="Etagenzahl" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" /&gt;
 *       &lt;attribute name="Objektzustand" type="{http://www.immobilienscout24.de/immobilientransfer}WazObjektZustandTyp" /&gt;
 *       &lt;attribute name="Heizungsart" type="{http://www.immobilienscout24.de/immobilientransfer}HeizungsartTyp" /&gt;
 *       &lt;attribute name="Aufzug" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Haustiere" type="{http://www.immobilienscout24.de/immobilientransfer}GenehmigungTyp" /&gt;
 *       &lt;attribute name="BalkonTerrasse" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GartenBenutzung" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Mobilar" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RaucherOk" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Geschlecht" type="{http://www.immobilienscout24.de/immobilientransfer}GeschlechtTyp" /&gt;
 *       &lt;attribute name="AnzahlPersonen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="FreiAb" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="Parkplatz" type="{http://www.immobilienscout24.de/immobilientransfer}StellplatzKategorieTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="AnzahlGaragenStellplaetze" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="Keller" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GaesteWC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Rollstuhlgerecht" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Barrierefrei" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Parkplatzmiete" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Kaution" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WazTyp", propOrder = {
    "pauschalmiete",
    "monatsmiete",
    "befeuerungsArt",
    "energieausweis"
})
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.WAZ.Type.class
})
public class WazTyp
    extends ImmobilieBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Pauschalmiete", required = true)
    protected WazTyp.Pauschalmiete pauschalmiete;
    @XmlElement(name = "Monatsmiete")
    protected WazTyp.Monatsmiete monatsmiete;
    @XmlElement(name = "BefeuerungsArt")
    protected BefeuerungsArtTyp befeuerungsArt;
    @XmlElement(name = "Energieausweis")
    protected EnergieausweisTyp energieausweis;
    @XmlAttribute(name = "WazKategorie", required = true)
    protected WazKategorienTyp wazKategorie;
    @XmlAttribute(name = "Wohnflaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal wohnflaeche;
    @XmlAttribute(name = "Zimmer", required = true)
    @XmlJavaTypeAdapter(Adapter32 .class)
    protected BigDecimal zimmer;
    @XmlAttribute(name = "FreiBis")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Calendar freiBis;
    @XmlAttribute(name = "Midestmietdauer")
    @XmlJavaTypeAdapter(Adapter30 .class)
    protected BigDecimal midestmietdauer;
    @XmlAttribute(name = "Maximalmietdauer")
    @XmlJavaTypeAdapter(Adapter30 .class)
    protected BigDecimal maximalmietdauer;
    @XmlAttribute(name = "Etage")
    @XmlJavaTypeAdapter(Adapter20 .class)
    protected Long etage;
    @XmlAttribute(name = "Etagenzahl")
    @XmlJavaTypeAdapter(Adapter21 .class)
    protected Long etagenzahl;
    @XmlAttribute(name = "Objektzustand")
    protected WazObjektZustandTyp objektzustand;
    @XmlAttribute(name = "Heizungsart")
    protected HeizungsartTyp heizungsart;
    @XmlAttribute(name = "Aufzug")
    protected Boolean aufzug;
    @XmlAttribute(name = "Haustiere")
    protected GenehmigungTyp haustiere;
    @XmlAttribute(name = "BalkonTerrasse")
    protected Boolean balkonTerrasse;
    @XmlAttribute(name = "GartenBenutzung")
    protected Boolean gartenBenutzung;
    @XmlAttribute(name = "Mobilar")
    protected Boolean mobilar;
    @XmlAttribute(name = "RaucherOk")
    protected Boolean raucherOk;
    @XmlAttribute(name = "Geschlecht")
    protected GeschlechtTyp geschlecht;
    @XmlAttribute(name = "AnzahlPersonen")
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Long anzahlPersonen;
    @XmlAttribute(name = "FreiAb", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Calendar freiAb;
    @XmlAttribute(name = "Parkplatz")
    protected StellplatzKategorieTyp parkplatz;
    @XmlAttribute(name = "AnzahlGaragenStellplaetze")
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Long anzahlGaragenStellplaetze;
    @XmlAttribute(name = "Keller")
    protected Boolean keller;
    @XmlAttribute(name = "GaesteWC")
    protected Boolean gaesteWC;
    @XmlAttribute(name = "Rollstuhlgerecht")
    protected Boolean rollstuhlgerecht;
    @XmlAttribute(name = "Barrierefrei")
    protected Boolean barrierefrei;
    @XmlAttribute(name = "Parkplatzmiete")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal parkplatzmiete;
    @XmlAttribute(name = "Kaution")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String kaution;

    /**
     * Gets the value of the pauschalmiete property.
     * 
     * @return
     *     possible object is
     *     {@link WazTyp.Pauschalmiete }
     *     
     */
    public WazTyp.Pauschalmiete getPauschalmiete() {
        return pauschalmiete;
    }

    /**
     * Sets the value of the pauschalmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link WazTyp.Pauschalmiete }
     *     
     */
    public void setPauschalmiete(WazTyp.Pauschalmiete value) {
        this.pauschalmiete = value;
    }

    /**
     * Gets the value of the monatsmiete property.
     * 
     * @return
     *     possible object is
     *     {@link WazTyp.Monatsmiete }
     *     
     */
    public WazTyp.Monatsmiete getMonatsmiete() {
        return monatsmiete;
    }

    /**
     * Sets the value of the monatsmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link WazTyp.Monatsmiete }
     *     
     */
    public void setMonatsmiete(WazTyp.Monatsmiete value) {
        this.monatsmiete = value;
    }

    /**
     * Gets the value of the befeuerungsArt property.
     * 
     * @return
     *     possible object is
     *     {@link BefeuerungsArtTyp }
     *     
     */
    public BefeuerungsArtTyp getBefeuerungsArt() {
        return befeuerungsArt;
    }

    /**
     * Sets the value of the befeuerungsArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BefeuerungsArtTyp }
     *     
     */
    public void setBefeuerungsArt(BefeuerungsArtTyp value) {
        this.befeuerungsArt = value;
    }

    /**
     * Gets the value of the energieausweis property.
     * 
     * @return
     *     possible object is
     *     {@link EnergieausweisTyp }
     *     
     */
    public EnergieausweisTyp getEnergieausweis() {
        return energieausweis;
    }

    /**
     * Sets the value of the energieausweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergieausweisTyp }
     *     
     */
    public void setEnergieausweis(EnergieausweisTyp value) {
        this.energieausweis = value;
    }

    /**
     * Gets the value of the wazKategorie property.
     * 
     * @return
     *     possible object is
     *     {@link WazKategorienTyp }
     *     
     */
    public WazKategorienTyp getWazKategorie() {
        return wazKategorie;
    }

    /**
     * Sets the value of the wazKategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link WazKategorienTyp }
     *     
     */
    public void setWazKategorie(WazKategorienTyp value) {
        this.wazKategorie = value;
    }

    /**
     * Gets the value of the wohnflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getWohnflaeche() {
        return wohnflaeche;
    }

    /**
     * Sets the value of the wohnflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnflaeche(BigDecimal value) {
        this.wohnflaeche = value;
    }

    /**
     * Gets the value of the zimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getZimmer() {
        return zimmer;
    }

    /**
     * Sets the value of the zimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZimmer(BigDecimal value) {
        this.zimmer = value;
    }

    /**
     * Gets the value of the freiBis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFreiBis() {
        return freiBis;
    }

    /**
     * Sets the value of the freiBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreiBis(Calendar value) {
        this.freiBis = value;
    }

    /**
     * Gets the value of the midestmietdauer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMidestmietdauer() {
        return midestmietdauer;
    }

    /**
     * Sets the value of the midestmietdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidestmietdauer(BigDecimal value) {
        this.midestmietdauer = value;
    }

    /**
     * Gets the value of the maximalmietdauer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMaximalmietdauer() {
        return maximalmietdauer;
    }

    /**
     * Sets the value of the maximalmietdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximalmietdauer(BigDecimal value) {
        this.maximalmietdauer = value;
    }

    /**
     * Gets the value of the etage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEtage() {
        return etage;
    }

    /**
     * Sets the value of the etage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtage(Long value) {
        this.etage = value;
    }

    /**
     * Gets the value of the etagenzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEtagenzahl() {
        return etagenzahl;
    }

    /**
     * Sets the value of the etagenzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtagenzahl(Long value) {
        this.etagenzahl = value;
    }

    /**
     * Gets the value of the objektzustand property.
     * 
     * @return
     *     possible object is
     *     {@link WazObjektZustandTyp }
     *     
     */
    public WazObjektZustandTyp getObjektzustand() {
        return objektzustand;
    }

    /**
     * Sets the value of the objektzustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link WazObjektZustandTyp }
     *     
     */
    public void setObjektzustand(WazObjektZustandTyp value) {
        this.objektzustand = value;
    }

    /**
     * Gets the value of the heizungsart property.
     * 
     * @return
     *     possible object is
     *     {@link HeizungsartTyp }
     *     
     */
    public HeizungsartTyp getHeizungsart() {
        return heizungsart;
    }

    /**
     * Sets the value of the heizungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeizungsartTyp }
     *     
     */
    public void setHeizungsart(HeizungsartTyp value) {
        this.heizungsart = value;
    }

    /**
     * Gets the value of the aufzug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAufzug() {
        return aufzug;
    }

    /**
     * Sets the value of the aufzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAufzug(Boolean value) {
        this.aufzug = value;
    }

    /**
     * Gets the value of the haustiere property.
     * 
     * @return
     *     possible object is
     *     {@link GenehmigungTyp }
     *     
     */
    public GenehmigungTyp getHaustiere() {
        return haustiere;
    }

    /**
     * Sets the value of the haustiere property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenehmigungTyp }
     *     
     */
    public void setHaustiere(GenehmigungTyp value) {
        this.haustiere = value;
    }

    /**
     * Gets the value of the balkonTerrasse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalkonTerrasse() {
        return balkonTerrasse;
    }

    /**
     * Sets the value of the balkonTerrasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalkonTerrasse(Boolean value) {
        this.balkonTerrasse = value;
    }

    /**
     * Gets the value of the gartenBenutzung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGartenBenutzung() {
        return gartenBenutzung;
    }

    /**
     * Sets the value of the gartenBenutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGartenBenutzung(Boolean value) {
        this.gartenBenutzung = value;
    }

    /**
     * Gets the value of the mobilar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobilar() {
        return mobilar;
    }

    /**
     * Sets the value of the mobilar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobilar(Boolean value) {
        this.mobilar = value;
    }

    /**
     * Gets the value of the raucherOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRaucherOk() {
        return raucherOk;
    }

    /**
     * Sets the value of the raucherOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRaucherOk(Boolean value) {
        this.raucherOk = value;
    }

    /**
     * Gets the value of the geschlecht property.
     * 
     * @return
     *     possible object is
     *     {@link GeschlechtTyp }
     *     
     */
    public GeschlechtTyp getGeschlecht() {
        return geschlecht;
    }

    /**
     * Sets the value of the geschlecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeschlechtTyp }
     *     
     */
    public void setGeschlecht(GeschlechtTyp value) {
        this.geschlecht = value;
    }

    /**
     * Gets the value of the anzahlPersonen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAnzahlPersonen() {
        return anzahlPersonen;
    }

    /**
     * Sets the value of the anzahlPersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlPersonen(Long value) {
        this.anzahlPersonen = value;
    }

    /**
     * Gets the value of the freiAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFreiAb() {
        return freiAb;
    }

    /**
     * Sets the value of the freiAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreiAb(Calendar value) {
        this.freiAb = value;
    }

    /**
     * Gets the value of the parkplatz property.
     * 
     * @return
     *     possible object is
     *     {@link StellplatzKategorieTyp }
     *     
     */
    public StellplatzKategorieTyp getParkplatz() {
        if (parkplatz == null) {
            return StellplatzKategorieTyp.KEINE_ANGABE;
        } else {
            return parkplatz;
        }
    }

    /**
     * Sets the value of the parkplatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StellplatzKategorieTyp }
     *     
     */
    public void setParkplatz(StellplatzKategorieTyp value) {
        this.parkplatz = value;
    }

    /**
     * Gets the value of the anzahlGaragenStellplaetze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAnzahlGaragenStellplaetze() {
        return anzahlGaragenStellplaetze;
    }

    /**
     * Sets the value of the anzahlGaragenStellplaetze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlGaragenStellplaetze(Long value) {
        this.anzahlGaragenStellplaetze = value;
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

    /**
     * Gets the value of the gaesteWC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGaesteWC() {
        return gaesteWC;
    }

    /**
     * Sets the value of the gaesteWC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGaesteWC(Boolean value) {
        this.gaesteWC = value;
    }

    /**
     * Gets the value of the rollstuhlgerecht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollstuhlgerecht() {
        return rollstuhlgerecht;
    }

    /**
     * Sets the value of the rollstuhlgerecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollstuhlgerecht(Boolean value) {
        this.rollstuhlgerecht = value;
    }

    /**
     * Gets the value of the barrierefrei property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBarrierefrei() {
        return barrierefrei;
    }

    /**
     * Sets the value of the barrierefrei property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBarrierefrei(Boolean value) {
        this.barrierefrei = value;
    }

    /**
     * Gets the value of the parkplatzmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getParkplatzmiete() {
        return parkplatzmiete;
    }

    /**
     * Sets the value of the parkplatzmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkplatzmiete(BigDecimal value) {
        this.parkplatzmiete = value;
    }

    /**
     * Gets the value of the kaution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKaution() {
        return kaution;
    }

    /**
     * Sets the value of the kaution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaution(String value) {
        this.kaution = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            WazTyp.Pauschalmiete thePauschalmiete;
            thePauschalmiete = this.getPauschalmiete();
            strategy.appendField(locator, this, "pauschalmiete", buffer, thePauschalmiete);
        }
        {
            WazTyp.Monatsmiete theMonatsmiete;
            theMonatsmiete = this.getMonatsmiete();
            strategy.appendField(locator, this, "monatsmiete", buffer, theMonatsmiete);
        }
        {
            BefeuerungsArtTyp theBefeuerungsArt;
            theBefeuerungsArt = this.getBefeuerungsArt();
            strategy.appendField(locator, this, "befeuerungsArt", buffer, theBefeuerungsArt);
        }
        {
            EnergieausweisTyp theEnergieausweis;
            theEnergieausweis = this.getEnergieausweis();
            strategy.appendField(locator, this, "energieausweis", buffer, theEnergieausweis);
        }
        {
            WazKategorienTyp theWazKategorie;
            theWazKategorie = this.getWazKategorie();
            strategy.appendField(locator, this, "wazKategorie", buffer, theWazKategorie);
        }
        {
            BigDecimal theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            strategy.appendField(locator, this, "wohnflaeche", buffer, theWohnflaeche);
        }
        {
            BigDecimal theZimmer;
            theZimmer = this.getZimmer();
            strategy.appendField(locator, this, "zimmer", buffer, theZimmer);
        }
        {
            Calendar theFreiBis;
            theFreiBis = this.getFreiBis();
            strategy.appendField(locator, this, "freiBis", buffer, theFreiBis);
        }
        {
            BigDecimal theMidestmietdauer;
            theMidestmietdauer = this.getMidestmietdauer();
            strategy.appendField(locator, this, "midestmietdauer", buffer, theMidestmietdauer);
        }
        {
            BigDecimal theMaximalmietdauer;
            theMaximalmietdauer = this.getMaximalmietdauer();
            strategy.appendField(locator, this, "maximalmietdauer", buffer, theMaximalmietdauer);
        }
        {
            Long theEtage;
            theEtage = this.getEtage();
            strategy.appendField(locator, this, "etage", buffer, theEtage);
        }
        {
            Long theEtagenzahl;
            theEtagenzahl = this.getEtagenzahl();
            strategy.appendField(locator, this, "etagenzahl", buffer, theEtagenzahl);
        }
        {
            WazObjektZustandTyp theObjektzustand;
            theObjektzustand = this.getObjektzustand();
            strategy.appendField(locator, this, "objektzustand", buffer, theObjektzustand);
        }
        {
            HeizungsartTyp theHeizungsart;
            theHeizungsart = this.getHeizungsart();
            strategy.appendField(locator, this, "heizungsart", buffer, theHeizungsart);
        }
        {
            Boolean theAufzug;
            theAufzug = this.isAufzug();
            strategy.appendField(locator, this, "aufzug", buffer, theAufzug);
        }
        {
            GenehmigungTyp theHaustiere;
            theHaustiere = this.getHaustiere();
            strategy.appendField(locator, this, "haustiere", buffer, theHaustiere);
        }
        {
            Boolean theBalkonTerrasse;
            theBalkonTerrasse = this.isBalkonTerrasse();
            strategy.appendField(locator, this, "balkonTerrasse", buffer, theBalkonTerrasse);
        }
        {
            Boolean theGartenBenutzung;
            theGartenBenutzung = this.isGartenBenutzung();
            strategy.appendField(locator, this, "gartenBenutzung", buffer, theGartenBenutzung);
        }
        {
            Boolean theMobilar;
            theMobilar = this.isMobilar();
            strategy.appendField(locator, this, "mobilar", buffer, theMobilar);
        }
        {
            Boolean theRaucherOk;
            theRaucherOk = this.isRaucherOk();
            strategy.appendField(locator, this, "raucherOk", buffer, theRaucherOk);
        }
        {
            GeschlechtTyp theGeschlecht;
            theGeschlecht = this.getGeschlecht();
            strategy.appendField(locator, this, "geschlecht", buffer, theGeschlecht);
        }
        {
            Long theAnzahlPersonen;
            theAnzahlPersonen = this.getAnzahlPersonen();
            strategy.appendField(locator, this, "anzahlPersonen", buffer, theAnzahlPersonen);
        }
        {
            Calendar theFreiAb;
            theFreiAb = this.getFreiAb();
            strategy.appendField(locator, this, "freiAb", buffer, theFreiAb);
        }
        {
            StellplatzKategorieTyp theParkplatz;
            theParkplatz = this.getParkplatz();
            strategy.appendField(locator, this, "parkplatz", buffer, theParkplatz);
        }
        {
            Long theAnzahlGaragenStellplaetze;
            theAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
            strategy.appendField(locator, this, "anzahlGaragenStellplaetze", buffer, theAnzahlGaragenStellplaetze);
        }
        {
            Boolean theKeller;
            theKeller = this.isKeller();
            strategy.appendField(locator, this, "keller", buffer, theKeller);
        }
        {
            Boolean theGaesteWC;
            theGaesteWC = this.isGaesteWC();
            strategy.appendField(locator, this, "gaesteWC", buffer, theGaesteWC);
        }
        {
            Boolean theRollstuhlgerecht;
            theRollstuhlgerecht = this.isRollstuhlgerecht();
            strategy.appendField(locator, this, "rollstuhlgerecht", buffer, theRollstuhlgerecht);
        }
        {
            Boolean theBarrierefrei;
            theBarrierefrei = this.isBarrierefrei();
            strategy.appendField(locator, this, "barrierefrei", buffer, theBarrierefrei);
        }
        {
            BigDecimal theParkplatzmiete;
            theParkplatzmiete = this.getParkplatzmiete();
            strategy.appendField(locator, this, "parkplatzmiete", buffer, theParkplatzmiete);
        }
        {
            String theKaution;
            theKaution = this.getKaution();
            strategy.appendField(locator, this, "kaution", buffer, theKaution);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof WazTyp) {
            final WazTyp copy = ((WazTyp) draftCopy);
            if (this.pauschalmiete!= null) {
                WazTyp.Pauschalmiete sourcePauschalmiete;
                sourcePauschalmiete = this.getPauschalmiete();
                WazTyp.Pauschalmiete copyPauschalmiete = ((WazTyp.Pauschalmiete) strategy.copy(LocatorUtils.property(locator, "pauschalmiete", sourcePauschalmiete), sourcePauschalmiete));
                copy.setPauschalmiete(copyPauschalmiete);
            } else {
                copy.pauschalmiete = null;
            }
            if (this.monatsmiete!= null) {
                WazTyp.Monatsmiete sourceMonatsmiete;
                sourceMonatsmiete = this.getMonatsmiete();
                WazTyp.Monatsmiete copyMonatsmiete = ((WazTyp.Monatsmiete) strategy.copy(LocatorUtils.property(locator, "monatsmiete", sourceMonatsmiete), sourceMonatsmiete));
                copy.setMonatsmiete(copyMonatsmiete);
            } else {
                copy.monatsmiete = null;
            }
            if (this.befeuerungsArt!= null) {
                BefeuerungsArtTyp sourceBefeuerungsArt;
                sourceBefeuerungsArt = this.getBefeuerungsArt();
                BefeuerungsArtTyp copyBefeuerungsArt = ((BefeuerungsArtTyp) strategy.copy(LocatorUtils.property(locator, "befeuerungsArt", sourceBefeuerungsArt), sourceBefeuerungsArt));
                copy.setBefeuerungsArt(copyBefeuerungsArt);
            } else {
                copy.befeuerungsArt = null;
            }
            if (this.energieausweis!= null) {
                EnergieausweisTyp sourceEnergieausweis;
                sourceEnergieausweis = this.getEnergieausweis();
                EnergieausweisTyp copyEnergieausweis = ((EnergieausweisTyp) strategy.copy(LocatorUtils.property(locator, "energieausweis", sourceEnergieausweis), sourceEnergieausweis));
                copy.setEnergieausweis(copyEnergieausweis);
            } else {
                copy.energieausweis = null;
            }
            if (this.wazKategorie!= null) {
                WazKategorienTyp sourceWazKategorie;
                sourceWazKategorie = this.getWazKategorie();
                WazKategorienTyp copyWazKategorie = ((WazKategorienTyp) strategy.copy(LocatorUtils.property(locator, "wazKategorie", sourceWazKategorie), sourceWazKategorie));
                copy.setWazKategorie(copyWazKategorie);
            } else {
                copy.wazKategorie = null;
            }
            if (this.wohnflaeche!= null) {
                BigDecimal sourceWohnflaeche;
                sourceWohnflaeche = this.getWohnflaeche();
                BigDecimal copyWohnflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wohnflaeche", sourceWohnflaeche), sourceWohnflaeche));
                copy.setWohnflaeche(copyWohnflaeche);
            } else {
                copy.wohnflaeche = null;
            }
            if (this.zimmer!= null) {
                BigDecimal sourceZimmer;
                sourceZimmer = this.getZimmer();
                BigDecimal copyZimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "zimmer", sourceZimmer), sourceZimmer));
                copy.setZimmer(copyZimmer);
            } else {
                copy.zimmer = null;
            }
            if (this.freiBis!= null) {
                Calendar sourceFreiBis;
                sourceFreiBis = this.getFreiBis();
                Calendar copyFreiBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freiBis", sourceFreiBis), sourceFreiBis));
                copy.setFreiBis(copyFreiBis);
            } else {
                copy.freiBis = null;
            }
            if (this.midestmietdauer!= null) {
                BigDecimal sourceMidestmietdauer;
                sourceMidestmietdauer = this.getMidestmietdauer();
                BigDecimal copyMidestmietdauer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "midestmietdauer", sourceMidestmietdauer), sourceMidestmietdauer));
                copy.setMidestmietdauer(copyMidestmietdauer);
            } else {
                copy.midestmietdauer = null;
            }
            if (this.maximalmietdauer!= null) {
                BigDecimal sourceMaximalmietdauer;
                sourceMaximalmietdauer = this.getMaximalmietdauer();
                BigDecimal copyMaximalmietdauer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "maximalmietdauer", sourceMaximalmietdauer), sourceMaximalmietdauer));
                copy.setMaximalmietdauer(copyMaximalmietdauer);
            } else {
                copy.maximalmietdauer = null;
            }
            if (this.etage!= null) {
                Long sourceEtage;
                sourceEtage = this.getEtage();
                Long copyEtage = ((Long) strategy.copy(LocatorUtils.property(locator, "etage", sourceEtage), sourceEtage));
                copy.setEtage(copyEtage);
            } else {
                copy.etage = null;
            }
            if (this.etagenzahl!= null) {
                Long sourceEtagenzahl;
                sourceEtagenzahl = this.getEtagenzahl();
                Long copyEtagenzahl = ((Long) strategy.copy(LocatorUtils.property(locator, "etagenzahl", sourceEtagenzahl), sourceEtagenzahl));
                copy.setEtagenzahl(copyEtagenzahl);
            } else {
                copy.etagenzahl = null;
            }
            if (this.objektzustand!= null) {
                WazObjektZustandTyp sourceObjektzustand;
                sourceObjektzustand = this.getObjektzustand();
                WazObjektZustandTyp copyObjektzustand = ((WazObjektZustandTyp) strategy.copy(LocatorUtils.property(locator, "objektzustand", sourceObjektzustand), sourceObjektzustand));
                copy.setObjektzustand(copyObjektzustand);
            } else {
                copy.objektzustand = null;
            }
            if (this.heizungsart!= null) {
                HeizungsartTyp sourceHeizungsart;
                sourceHeizungsart = this.getHeizungsart();
                HeizungsartTyp copyHeizungsart = ((HeizungsartTyp) strategy.copy(LocatorUtils.property(locator, "heizungsart", sourceHeizungsart), sourceHeizungsart));
                copy.setHeizungsart(copyHeizungsart);
            } else {
                copy.heizungsart = null;
            }
            if (this.aufzug!= null) {
                Boolean sourceAufzug;
                sourceAufzug = this.isAufzug();
                Boolean copyAufzug = ((Boolean) strategy.copy(LocatorUtils.property(locator, "aufzug", sourceAufzug), sourceAufzug));
                copy.setAufzug(copyAufzug);
            } else {
                copy.aufzug = null;
            }
            if (this.haustiere!= null) {
                GenehmigungTyp sourceHaustiere;
                sourceHaustiere = this.getHaustiere();
                GenehmigungTyp copyHaustiere = ((GenehmigungTyp) strategy.copy(LocatorUtils.property(locator, "haustiere", sourceHaustiere), sourceHaustiere));
                copy.setHaustiere(copyHaustiere);
            } else {
                copy.haustiere = null;
            }
            if (this.balkonTerrasse!= null) {
                Boolean sourceBalkonTerrasse;
                sourceBalkonTerrasse = this.isBalkonTerrasse();
                Boolean copyBalkonTerrasse = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balkonTerrasse", sourceBalkonTerrasse), sourceBalkonTerrasse));
                copy.setBalkonTerrasse(copyBalkonTerrasse);
            } else {
                copy.balkonTerrasse = null;
            }
            if (this.gartenBenutzung!= null) {
                Boolean sourceGartenBenutzung;
                sourceGartenBenutzung = this.isGartenBenutzung();
                Boolean copyGartenBenutzung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gartenBenutzung", sourceGartenBenutzung), sourceGartenBenutzung));
                copy.setGartenBenutzung(copyGartenBenutzung);
            } else {
                copy.gartenBenutzung = null;
            }
            if (this.mobilar!= null) {
                Boolean sourceMobilar;
                sourceMobilar = this.isMobilar();
                Boolean copyMobilar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mobilar", sourceMobilar), sourceMobilar));
                copy.setMobilar(copyMobilar);
            } else {
                copy.mobilar = null;
            }
            if (this.raucherOk!= null) {
                Boolean sourceRaucherOk;
                sourceRaucherOk = this.isRaucherOk();
                Boolean copyRaucherOk = ((Boolean) strategy.copy(LocatorUtils.property(locator, "raucherOk", sourceRaucherOk), sourceRaucherOk));
                copy.setRaucherOk(copyRaucherOk);
            } else {
                copy.raucherOk = null;
            }
            if (this.geschlecht!= null) {
                GeschlechtTyp sourceGeschlecht;
                sourceGeschlecht = this.getGeschlecht();
                GeschlechtTyp copyGeschlecht = ((GeschlechtTyp) strategy.copy(LocatorUtils.property(locator, "geschlecht", sourceGeschlecht), sourceGeschlecht));
                copy.setGeschlecht(copyGeschlecht);
            } else {
                copy.geschlecht = null;
            }
            if (this.anzahlPersonen!= null) {
                Long sourceAnzahlPersonen;
                sourceAnzahlPersonen = this.getAnzahlPersonen();
                Long copyAnzahlPersonen = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlPersonen", sourceAnzahlPersonen), sourceAnzahlPersonen));
                copy.setAnzahlPersonen(copyAnzahlPersonen);
            } else {
                copy.anzahlPersonen = null;
            }
            if (this.freiAb!= null) {
                Calendar sourceFreiAb;
                sourceFreiAb = this.getFreiAb();
                Calendar copyFreiAb = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freiAb", sourceFreiAb), sourceFreiAb));
                copy.setFreiAb(copyFreiAb);
            } else {
                copy.freiAb = null;
            }
            if (this.parkplatz!= null) {
                StellplatzKategorieTyp sourceParkplatz;
                sourceParkplatz = this.getParkplatz();
                StellplatzKategorieTyp copyParkplatz = ((StellplatzKategorieTyp) strategy.copy(LocatorUtils.property(locator, "parkplatz", sourceParkplatz), sourceParkplatz));
                copy.setParkplatz(copyParkplatz);
            } else {
                copy.parkplatz = null;
            }
            if (this.anzahlGaragenStellplaetze!= null) {
                Long sourceAnzahlGaragenStellplaetze;
                sourceAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
                Long copyAnzahlGaragenStellplaetze = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlGaragenStellplaetze", sourceAnzahlGaragenStellplaetze), sourceAnzahlGaragenStellplaetze));
                copy.setAnzahlGaragenStellplaetze(copyAnzahlGaragenStellplaetze);
            } else {
                copy.anzahlGaragenStellplaetze = null;
            }
            if (this.keller!= null) {
                Boolean sourceKeller;
                sourceKeller = this.isKeller();
                Boolean copyKeller = ((Boolean) strategy.copy(LocatorUtils.property(locator, "keller", sourceKeller), sourceKeller));
                copy.setKeller(copyKeller);
            } else {
                copy.keller = null;
            }
            if (this.gaesteWC!= null) {
                Boolean sourceGaesteWC;
                sourceGaesteWC = this.isGaesteWC();
                Boolean copyGaesteWC = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gaesteWC", sourceGaesteWC), sourceGaesteWC));
                copy.setGaesteWC(copyGaesteWC);
            } else {
                copy.gaesteWC = null;
            }
            if (this.rollstuhlgerecht!= null) {
                Boolean sourceRollstuhlgerecht;
                sourceRollstuhlgerecht = this.isRollstuhlgerecht();
                Boolean copyRollstuhlgerecht = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rollstuhlgerecht", sourceRollstuhlgerecht), sourceRollstuhlgerecht));
                copy.setRollstuhlgerecht(copyRollstuhlgerecht);
            } else {
                copy.rollstuhlgerecht = null;
            }
            if (this.barrierefrei!= null) {
                Boolean sourceBarrierefrei;
                sourceBarrierefrei = this.isBarrierefrei();
                Boolean copyBarrierefrei = ((Boolean) strategy.copy(LocatorUtils.property(locator, "barrierefrei", sourceBarrierefrei), sourceBarrierefrei));
                copy.setBarrierefrei(copyBarrierefrei);
            } else {
                copy.barrierefrei = null;
            }
            if (this.parkplatzmiete!= null) {
                BigDecimal sourceParkplatzmiete;
                sourceParkplatzmiete = this.getParkplatzmiete();
                BigDecimal copyParkplatzmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "parkplatzmiete", sourceParkplatzmiete), sourceParkplatzmiete));
                copy.setParkplatzmiete(copyParkplatzmiete);
            } else {
                copy.parkplatzmiete = null;
            }
            if (this.kaution!= null) {
                String sourceKaution;
                sourceKaution = this.getKaution();
                String copyKaution = ((String) strategy.copy(LocatorUtils.property(locator, "kaution", sourceKaution), sourceKaution));
                copy.setKaution(copyKaution);
            } else {
                copy.kaution = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new WazTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof WazTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final WazTyp that = ((WazTyp) object);
        {
            WazTyp.Pauschalmiete lhsPauschalmiete;
            lhsPauschalmiete = this.getPauschalmiete();
            WazTyp.Pauschalmiete rhsPauschalmiete;
            rhsPauschalmiete = that.getPauschalmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pauschalmiete", lhsPauschalmiete), LocatorUtils.property(thatLocator, "pauschalmiete", rhsPauschalmiete), lhsPauschalmiete, rhsPauschalmiete)) {
                return false;
            }
        }
        {
            WazTyp.Monatsmiete lhsMonatsmiete;
            lhsMonatsmiete = this.getMonatsmiete();
            WazTyp.Monatsmiete rhsMonatsmiete;
            rhsMonatsmiete = that.getMonatsmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monatsmiete", lhsMonatsmiete), LocatorUtils.property(thatLocator, "monatsmiete", rhsMonatsmiete), lhsMonatsmiete, rhsMonatsmiete)) {
                return false;
            }
        }
        {
            BefeuerungsArtTyp lhsBefeuerungsArt;
            lhsBefeuerungsArt = this.getBefeuerungsArt();
            BefeuerungsArtTyp rhsBefeuerungsArt;
            rhsBefeuerungsArt = that.getBefeuerungsArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "befeuerungsArt", lhsBefeuerungsArt), LocatorUtils.property(thatLocator, "befeuerungsArt", rhsBefeuerungsArt), lhsBefeuerungsArt, rhsBefeuerungsArt)) {
                return false;
            }
        }
        {
            EnergieausweisTyp lhsEnergieausweis;
            lhsEnergieausweis = this.getEnergieausweis();
            EnergieausweisTyp rhsEnergieausweis;
            rhsEnergieausweis = that.getEnergieausweis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieausweis", lhsEnergieausweis), LocatorUtils.property(thatLocator, "energieausweis", rhsEnergieausweis), lhsEnergieausweis, rhsEnergieausweis)) {
                return false;
            }
        }
        {
            WazKategorienTyp lhsWazKategorie;
            lhsWazKategorie = this.getWazKategorie();
            WazKategorienTyp rhsWazKategorie;
            rhsWazKategorie = that.getWazKategorie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wazKategorie", lhsWazKategorie), LocatorUtils.property(thatLocator, "wazKategorie", rhsWazKategorie), lhsWazKategorie, rhsWazKategorie)) {
                return false;
            }
        }
        {
            BigDecimal lhsWohnflaeche;
            lhsWohnflaeche = this.getWohnflaeche();
            BigDecimal rhsWohnflaeche;
            rhsWohnflaeche = that.getWohnflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaeche", lhsWohnflaeche), LocatorUtils.property(thatLocator, "wohnflaeche", rhsWohnflaeche), lhsWohnflaeche, rhsWohnflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsZimmer;
            lhsZimmer = this.getZimmer();
            BigDecimal rhsZimmer;
            rhsZimmer = that.getZimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmer", lhsZimmer), LocatorUtils.property(thatLocator, "zimmer", rhsZimmer), lhsZimmer, rhsZimmer)) {
                return false;
            }
        }
        {
            Calendar lhsFreiBis;
            lhsFreiBis = this.getFreiBis();
            Calendar rhsFreiBis;
            rhsFreiBis = that.getFreiBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiBis", lhsFreiBis), LocatorUtils.property(thatLocator, "freiBis", rhsFreiBis), lhsFreiBis, rhsFreiBis)) {
                return false;
            }
        }
        {
            BigDecimal lhsMidestmietdauer;
            lhsMidestmietdauer = this.getMidestmietdauer();
            BigDecimal rhsMidestmietdauer;
            rhsMidestmietdauer = that.getMidestmietdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "midestmietdauer", lhsMidestmietdauer), LocatorUtils.property(thatLocator, "midestmietdauer", rhsMidestmietdauer), lhsMidestmietdauer, rhsMidestmietdauer)) {
                return false;
            }
        }
        {
            BigDecimal lhsMaximalmietdauer;
            lhsMaximalmietdauer = this.getMaximalmietdauer();
            BigDecimal rhsMaximalmietdauer;
            rhsMaximalmietdauer = that.getMaximalmietdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximalmietdauer", lhsMaximalmietdauer), LocatorUtils.property(thatLocator, "maximalmietdauer", rhsMaximalmietdauer), lhsMaximalmietdauer, rhsMaximalmietdauer)) {
                return false;
            }
        }
        {
            Long lhsEtage;
            lhsEtage = this.getEtage();
            Long rhsEtage;
            rhsEtage = that.getEtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etage", lhsEtage), LocatorUtils.property(thatLocator, "etage", rhsEtage), lhsEtage, rhsEtage)) {
                return false;
            }
        }
        {
            Long lhsEtagenzahl;
            lhsEtagenzahl = this.getEtagenzahl();
            Long rhsEtagenzahl;
            rhsEtagenzahl = that.getEtagenzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etagenzahl", lhsEtagenzahl), LocatorUtils.property(thatLocator, "etagenzahl", rhsEtagenzahl), lhsEtagenzahl, rhsEtagenzahl)) {
                return false;
            }
        }
        {
            WazObjektZustandTyp lhsObjektzustand;
            lhsObjektzustand = this.getObjektzustand();
            WazObjektZustandTyp rhsObjektzustand;
            rhsObjektzustand = that.getObjektzustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektzustand", lhsObjektzustand), LocatorUtils.property(thatLocator, "objektzustand", rhsObjektzustand), lhsObjektzustand, rhsObjektzustand)) {
                return false;
            }
        }
        {
            HeizungsartTyp lhsHeizungsart;
            lhsHeizungsart = this.getHeizungsart();
            HeizungsartTyp rhsHeizungsart;
            rhsHeizungsart = that.getHeizungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizungsart", lhsHeizungsart), LocatorUtils.property(thatLocator, "heizungsart", rhsHeizungsart), lhsHeizungsart, rhsHeizungsart)) {
                return false;
            }
        }
        {
            Boolean lhsAufzug;
            lhsAufzug = this.isAufzug();
            Boolean rhsAufzug;
            rhsAufzug = that.isAufzug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aufzug", lhsAufzug), LocatorUtils.property(thatLocator, "aufzug", rhsAufzug), lhsAufzug, rhsAufzug)) {
                return false;
            }
        }
        {
            GenehmigungTyp lhsHaustiere;
            lhsHaustiere = this.getHaustiere();
            GenehmigungTyp rhsHaustiere;
            rhsHaustiere = that.getHaustiere();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haustiere", lhsHaustiere), LocatorUtils.property(thatLocator, "haustiere", rhsHaustiere), lhsHaustiere, rhsHaustiere)) {
                return false;
            }
        }
        {
            Boolean lhsBalkonTerrasse;
            lhsBalkonTerrasse = this.isBalkonTerrasse();
            Boolean rhsBalkonTerrasse;
            rhsBalkonTerrasse = that.isBalkonTerrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balkonTerrasse", lhsBalkonTerrasse), LocatorUtils.property(thatLocator, "balkonTerrasse", rhsBalkonTerrasse), lhsBalkonTerrasse, rhsBalkonTerrasse)) {
                return false;
            }
        }
        {
            Boolean lhsGartenBenutzung;
            lhsGartenBenutzung = this.isGartenBenutzung();
            Boolean rhsGartenBenutzung;
            rhsGartenBenutzung = that.isGartenBenutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gartenBenutzung", lhsGartenBenutzung), LocatorUtils.property(thatLocator, "gartenBenutzung", rhsGartenBenutzung), lhsGartenBenutzung, rhsGartenBenutzung)) {
                return false;
            }
        }
        {
            Boolean lhsMobilar;
            lhsMobilar = this.isMobilar();
            Boolean rhsMobilar;
            rhsMobilar = that.isMobilar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobilar", lhsMobilar), LocatorUtils.property(thatLocator, "mobilar", rhsMobilar), lhsMobilar, rhsMobilar)) {
                return false;
            }
        }
        {
            Boolean lhsRaucherOk;
            lhsRaucherOk = this.isRaucherOk();
            Boolean rhsRaucherOk;
            rhsRaucherOk = that.isRaucherOk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "raucherOk", lhsRaucherOk), LocatorUtils.property(thatLocator, "raucherOk", rhsRaucherOk), lhsRaucherOk, rhsRaucherOk)) {
                return false;
            }
        }
        {
            GeschlechtTyp lhsGeschlecht;
            lhsGeschlecht = this.getGeschlecht();
            GeschlechtTyp rhsGeschlecht;
            rhsGeschlecht = that.getGeschlecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschlecht", lhsGeschlecht), LocatorUtils.property(thatLocator, "geschlecht", rhsGeschlecht), lhsGeschlecht, rhsGeschlecht)) {
                return false;
            }
        }
        {
            Long lhsAnzahlPersonen;
            lhsAnzahlPersonen = this.getAnzahlPersonen();
            Long rhsAnzahlPersonen;
            rhsAnzahlPersonen = that.getAnzahlPersonen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlPersonen", lhsAnzahlPersonen), LocatorUtils.property(thatLocator, "anzahlPersonen", rhsAnzahlPersonen), lhsAnzahlPersonen, rhsAnzahlPersonen)) {
                return false;
            }
        }
        {
            Calendar lhsFreiAb;
            lhsFreiAb = this.getFreiAb();
            Calendar rhsFreiAb;
            rhsFreiAb = that.getFreiAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiAb", lhsFreiAb), LocatorUtils.property(thatLocator, "freiAb", rhsFreiAb), lhsFreiAb, rhsFreiAb)) {
                return false;
            }
        }
        {
            StellplatzKategorieTyp lhsParkplatz;
            lhsParkplatz = this.getParkplatz();
            StellplatzKategorieTyp rhsParkplatz;
            rhsParkplatz = that.getParkplatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkplatz", lhsParkplatz), LocatorUtils.property(thatLocator, "parkplatz", rhsParkplatz), lhsParkplatz, rhsParkplatz)) {
                return false;
            }
        }
        {
            Long lhsAnzahlGaragenStellplaetze;
            lhsAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
            Long rhsAnzahlGaragenStellplaetze;
            rhsAnzahlGaragenStellplaetze = that.getAnzahlGaragenStellplaetze();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlGaragenStellplaetze", lhsAnzahlGaragenStellplaetze), LocatorUtils.property(thatLocator, "anzahlGaragenStellplaetze", rhsAnzahlGaragenStellplaetze), lhsAnzahlGaragenStellplaetze, rhsAnzahlGaragenStellplaetze)) {
                return false;
            }
        }
        {
            Boolean lhsKeller;
            lhsKeller = this.isKeller();
            Boolean rhsKeller;
            rhsKeller = that.isKeller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keller", lhsKeller), LocatorUtils.property(thatLocator, "keller", rhsKeller), lhsKeller, rhsKeller)) {
                return false;
            }
        }
        {
            Boolean lhsGaesteWC;
            lhsGaesteWC = this.isGaesteWC();
            Boolean rhsGaesteWC;
            rhsGaesteWC = that.isGaesteWC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gaesteWC", lhsGaesteWC), LocatorUtils.property(thatLocator, "gaesteWC", rhsGaesteWC), lhsGaesteWC, rhsGaesteWC)) {
                return false;
            }
        }
        {
            Boolean lhsRollstuhlgerecht;
            lhsRollstuhlgerecht = this.isRollstuhlgerecht();
            Boolean rhsRollstuhlgerecht;
            rhsRollstuhlgerecht = that.isRollstuhlgerecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rollstuhlgerecht", lhsRollstuhlgerecht), LocatorUtils.property(thatLocator, "rollstuhlgerecht", rhsRollstuhlgerecht), lhsRollstuhlgerecht, rhsRollstuhlgerecht)) {
                return false;
            }
        }
        {
            Boolean lhsBarrierefrei;
            lhsBarrierefrei = this.isBarrierefrei();
            Boolean rhsBarrierefrei;
            rhsBarrierefrei = that.isBarrierefrei();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierefrei", lhsBarrierefrei), LocatorUtils.property(thatLocator, "barrierefrei", rhsBarrierefrei), lhsBarrierefrei, rhsBarrierefrei)) {
                return false;
            }
        }
        {
            BigDecimal lhsParkplatzmiete;
            lhsParkplatzmiete = this.getParkplatzmiete();
            BigDecimal rhsParkplatzmiete;
            rhsParkplatzmiete = that.getParkplatzmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkplatzmiete", lhsParkplatzmiete), LocatorUtils.property(thatLocator, "parkplatzmiete", rhsParkplatzmiete), lhsParkplatzmiete, rhsParkplatzmiete)) {
                return false;
            }
        }
        {
            String lhsKaution;
            lhsKaution = this.getKaution();
            String rhsKaution;
            rhsKaution = that.getKaution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaution", lhsKaution), LocatorUtils.property(thatLocator, "kaution", rhsKaution), lhsKaution, rhsKaution)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}WazMieteBaseTyp"&gt;
     *       &lt;attribute name="Kaltmiete" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
     *       &lt;attribute name="Nebenkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Monatsmiete
        extends WazMieteBaseTyp
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "Kaltmiete")
        @XmlJavaTypeAdapter(Adapter35 .class)
        protected BigDecimal kaltmiete;
        @XmlAttribute(name = "Nebenkosten")
        @XmlJavaTypeAdapter(Adapter35 .class)
        protected BigDecimal nebenkosten;

        /**
         * Gets the value of the kaltmiete property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public BigDecimal getKaltmiete() {
            return kaltmiete;
        }

        /**
         * Sets the value of the kaltmiete property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKaltmiete(BigDecimal value) {
            this.kaltmiete = value;
        }

        /**
         * Gets the value of the nebenkosten property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public BigDecimal getNebenkosten() {
            return nebenkosten;
        }

        /**
         * Sets the value of the nebenkosten property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNebenkosten(BigDecimal value) {
            this.nebenkosten = value;
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
            super.appendFields(locator, buffer, strategy);
            {
                BigDecimal theKaltmiete;
                theKaltmiete = this.getKaltmiete();
                strategy.appendField(locator, this, "kaltmiete", buffer, theKaltmiete);
            }
            {
                BigDecimal theNebenkosten;
                theNebenkosten = this.getNebenkosten();
                strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten);
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
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof WazTyp.Monatsmiete) {
                final WazTyp.Monatsmiete copy = ((WazTyp.Monatsmiete) draftCopy);
                if (this.kaltmiete!= null) {
                    BigDecimal sourceKaltmiete;
                    sourceKaltmiete = this.getKaltmiete();
                    BigDecimal copyKaltmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaltmiete", sourceKaltmiete), sourceKaltmiete));
                    copy.setKaltmiete(copyKaltmiete);
                } else {
                    copy.kaltmiete = null;
                }
                if (this.nebenkosten!= null) {
                    BigDecimal sourceNebenkosten;
                    sourceNebenkosten = this.getNebenkosten();
                    BigDecimal copyNebenkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nebenkosten", sourceNebenkosten), sourceNebenkosten));
                    copy.setNebenkosten(copyNebenkosten);
                } else {
                    copy.nebenkosten = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WazTyp.Monatsmiete();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof WazTyp.Monatsmiete)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final WazTyp.Monatsmiete that = ((WazTyp.Monatsmiete) object);
            {
                BigDecimal lhsKaltmiete;
                lhsKaltmiete = this.getKaltmiete();
                BigDecimal rhsKaltmiete;
                rhsKaltmiete = that.getKaltmiete();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kaltmiete", lhsKaltmiete), LocatorUtils.property(thatLocator, "kaltmiete", rhsKaltmiete), lhsKaltmiete, rhsKaltmiete)) {
                    return false;
                }
            }
            {
                BigDecimal lhsNebenkosten;
                lhsNebenkosten = this.getNebenkosten();
                BigDecimal rhsNebenkosten;
                rhsNebenkosten = that.getNebenkosten();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenkosten", lhsNebenkosten), LocatorUtils.property(thatLocator, "nebenkosten", rhsNebenkosten), lhsNebenkosten, rhsNebenkosten)) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}WazMieteBaseTyp"&gt;
     *       &lt;attribute name="MietePauschal" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
     *       &lt;attribute name="MietePro" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}WazZeiteinheitenTyp" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Pauschalmiete
        extends WazMieteBaseTyp
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "MietePauschal", required = true)
        @XmlJavaTypeAdapter(Adapter35 .class)
        protected BigDecimal mietePauschal;
        @XmlAttribute(name = "MietePro", required = true)
        protected WazZeiteinheitenTyp mietePro;

        /**
         * Gets the value of the mietePauschal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public BigDecimal getMietePauschal() {
            return mietePauschal;
        }

        /**
         * Sets the value of the mietePauschal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMietePauschal(BigDecimal value) {
            this.mietePauschal = value;
        }

        /**
         * Gets the value of the mietePro property.
         * 
         * @return
         *     possible object is
         *     {@link WazZeiteinheitenTyp }
         *     
         */
        public WazZeiteinheitenTyp getMietePro() {
            return mietePro;
        }

        /**
         * Sets the value of the mietePro property.
         * 
         * @param value
         *     allowed object is
         *     {@link WazZeiteinheitenTyp }
         *     
         */
        public void setMietePro(WazZeiteinheitenTyp value) {
            this.mietePro = value;
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
            super.appendFields(locator, buffer, strategy);
            {
                BigDecimal theMietePauschal;
                theMietePauschal = this.getMietePauschal();
                strategy.appendField(locator, this, "mietePauschal", buffer, theMietePauschal);
            }
            {
                WazZeiteinheitenTyp theMietePro;
                theMietePro = this.getMietePro();
                strategy.appendField(locator, this, "mietePro", buffer, theMietePro);
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
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof WazTyp.Pauschalmiete) {
                final WazTyp.Pauschalmiete copy = ((WazTyp.Pauschalmiete) draftCopy);
                if (this.mietePauschal!= null) {
                    BigDecimal sourceMietePauschal;
                    sourceMietePauschal = this.getMietePauschal();
                    BigDecimal copyMietePauschal = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mietePauschal", sourceMietePauschal), sourceMietePauschal));
                    copy.setMietePauschal(copyMietePauschal);
                } else {
                    copy.mietePauschal = null;
                }
                if (this.mietePro!= null) {
                    WazZeiteinheitenTyp sourceMietePro;
                    sourceMietePro = this.getMietePro();
                    WazZeiteinheitenTyp copyMietePro = ((WazZeiteinheitenTyp) strategy.copy(LocatorUtils.property(locator, "mietePro", sourceMietePro), sourceMietePro));
                    copy.setMietePro(copyMietePro);
                } else {
                    copy.mietePro = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WazTyp.Pauschalmiete();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof WazTyp.Pauschalmiete)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final WazTyp.Pauschalmiete that = ((WazTyp.Pauschalmiete) object);
            {
                BigDecimal lhsMietePauschal;
                lhsMietePauschal = this.getMietePauschal();
                BigDecimal rhsMietePauschal;
                rhsMietePauschal = that.getMietePauschal();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mietePauschal", lhsMietePauschal), LocatorUtils.property(thatLocator, "mietePauschal", rhsMietePauschal), lhsMietePauschal, rhsMietePauschal)) {
                    return false;
                }
            }
            {
                WazZeiteinheitenTyp lhsMietePro;
                lhsMietePro = this.getMietePro();
                WazZeiteinheitenTyp rhsMietePro;
                rhsMietePro = that.getMietePro();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mietePro", lhsMietePro), LocatorUtils.property(thatLocator, "mietePro", rhsMietePro), lhsMietePro, rhsMietePro)) {
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

}
