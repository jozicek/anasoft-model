//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 08:39:48 AM CEST 
//


package domain.v2.spravca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Typ" type="{/PortalJustice/XmlFormularObchodnyVestnik/}XmlDropDownValue"/>
 *         &lt;element name="Nazov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sidlo" type="{/PortalJustice/XmlFormularObchodnyVestnik/}Sidlo"/>
 *         &lt;element name="ZverejnujeText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "typ",
    "nazov",
    "sidlo",
    "zverejnujeText"
})
@XmlRootElement(name = "DrazbaSpravcaDane")
public class DrazbaSpravcaDane {

    @XmlElement(name = "Typ", namespace = "/PortalJustice/XmlFormularObchodnyVestnik/", required = true)
    protected XmlDropDownValue typ;
    @XmlElement(name = "Nazov", namespace = "/PortalJustice/XmlFormularObchodnyVestnik/", required = true)
    protected String nazov;
    @XmlElement(name = "Sidlo", namespace = "/PortalJustice/XmlFormularObchodnyVestnik/", required = true)
    protected Sidlo sidlo;
    @XmlElement(name = "ZverejnujeText", namespace = "/PortalJustice/XmlFormularObchodnyVestnik/", required = true)
    protected String zverejnujeText;

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDropDownValue }
     *     
     */
    public XmlDropDownValue getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDropDownValue }
     *     
     */
    public void setTyp(XmlDropDownValue value) {
        this.typ = value;
    }

    /**
     * Gets the value of the nazov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazov() {
        return nazov;
    }

    /**
     * Sets the value of the nazov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazov(String value) {
        this.nazov = value;
    }

    /**
     * Gets the value of the sidlo property.
     * 
     * @return
     *     possible object is
     *     {@link Sidlo }
     *     
     */
    public Sidlo getSidlo() {
        return sidlo;
    }

    /**
     * Sets the value of the sidlo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sidlo }
     *     
     */
    public void setSidlo(Sidlo value) {
        this.sidlo = value;
    }

    /**
     * Gets the value of the zverejnujeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZverejnujeText() {
        return zverejnujeText;
    }

    /**
     * Sets the value of the zverejnujeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZverejnujeText(String value) {
        this.zverejnujeText = value;
    }

}
