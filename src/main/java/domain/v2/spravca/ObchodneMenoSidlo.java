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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObchodneMenoSidlo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObchodneMenoSidlo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObchodneMenoNazov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sidlo" type="{/PortalJustice/XmlFormularObchodnyVestnik/}Sidlo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObchodneMenoSidlo", propOrder = {
    "obchodneMenoNazov",
    "sidlo"
})
public class ObchodneMenoSidlo {

    @XmlElement(name = "ObchodneMenoNazov", required = true)
    protected String obchodneMenoNazov;
    @XmlElement(name = "Sidlo", required = true)
    protected Sidlo sidlo;

    /**
     * Gets the value of the obchodneMenoNazov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObchodneMenoNazov() {
        return obchodneMenoNazov;
    }

    /**
     * Sets the value of the obchodneMenoNazov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObchodneMenoNazov(String value) {
        this.obchodneMenoNazov = value;
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

}
