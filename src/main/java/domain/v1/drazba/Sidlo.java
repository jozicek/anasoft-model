//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 08:37:40 AM CEST 
//


package domain.v1.drazba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sidlo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sidlo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ulica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cislo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Obec" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Psc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sidlo", propOrder = {
    "ulica",
    "cislo",
    "obec",
    "psc",
    "stat"
})
public class Sidlo {

    @XmlElement(name = "Ulica", namespace = "", required = true)
    protected String ulica;
    @XmlElement(name = "Cislo", namespace = "", required = true)
    protected String cislo;
    @XmlElement(name = "Obec", namespace = "", required = true)
    protected String obec;
    @XmlElement(name = "Psc", namespace = "", required = true)
    protected String psc;
    @XmlElement(name = "Stat", namespace = "", required = true)
    protected String stat;

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the cislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCislo() {
        return cislo;
    }

    /**
     * Sets the value of the cislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCislo(String value) {
        this.cislo = value;
    }

    /**
     * Gets the value of the obec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObec() {
        return obec;
    }

    /**
     * Sets the value of the obec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObec(String value) {
        this.obec = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsc() {
        return psc;
    }

    /**
     * Sets the value of the psc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsc(String value) {
        this.psc = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }

}
