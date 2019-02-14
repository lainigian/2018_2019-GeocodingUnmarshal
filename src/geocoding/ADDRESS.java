//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.14 alle 11:54:40 AM CET 
//


package geocoding;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}street_number"/>
 *         &lt;element ref="{}street_name"/>
 *         &lt;element ref="{}locality"/>
 *         &lt;element ref="{}admin_2"/>
 *         &lt;element ref="{}admin_1"/>
 *         &lt;element ref="{}postal_code"/>
 *         &lt;element ref="{}country"/>
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
    "streetNumber",
    "streetName",
    "locality",
    "admin2",
    "admin1",
    "postalCode",
    "country"
})
@XmlRootElement(name = "ADDRESS")
public class ADDRESS {

    @XmlElement(name = "street_number", required = true)
    protected BigInteger streetNumber;
    @XmlElement(name = "street_name", required = true)
    protected String streetName;
    @XmlElement(required = true)
    protected String locality;
    @XmlElement(name = "admin_2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String admin2;
    @XmlElement(name = "admin_1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String admin1;
    @XmlElement(name = "postal_code", required = true)
    protected BigInteger postalCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String country;

    
    public ADDRESS()
    {}
    
    /**
     * Recupera il valore della proprietà streetNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStreetNumber() {
        return streetNumber;
    }

    /**
     * Imposta il valore della proprietà streetNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStreetNumber(BigInteger value) {
        this.streetNumber = value;
    }

    /**
     * Recupera il valore della proprietà streetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Imposta il valore della proprietà streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Recupera il valore della proprietà locality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Imposta il valore della proprietà locality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Recupera il valore della proprietà admin2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmin2() {
        return admin2;
    }

    /**
     * Imposta il valore della proprietà admin2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmin2(String value) {
        this.admin2 = value;
    }

    /**
     * Recupera il valore della proprietà admin1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmin1() {
        return admin1;
    }

    /**
     * Imposta il valore della proprietà admin1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmin1(String value) {
        this.admin1 = value;
    }

    /**
     * Recupera il valore della proprietà postalCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPostalCode() {
        return postalCode;
    }

    /**
     * Imposta il valore della proprietà postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPostalCode(BigInteger value) {
        this.postalCode = value;
    }

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
