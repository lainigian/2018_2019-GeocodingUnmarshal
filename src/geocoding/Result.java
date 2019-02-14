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
 *         &lt;element ref="{}result_number"/>
 *         &lt;element ref="{}formatted_address"/>
 *         &lt;element ref="{}accuracy"/>
 *         &lt;element ref="{}ADDRESS"/>
 *         &lt;element ref="{}LOCATION_DETAILS"/>
 *         &lt;element ref="{}COORDINATES"/>
 *         &lt;element ref="{}BOUNDARIES"/>
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
    "resultNumber",
    "formattedAddress",
    "accuracy",
    "address",
    "locationdetails",
    "coordinates",
    "boundaries"
})
@XmlRootElement(name = "result")
public class Result {

    @XmlElement(name = "result_number", required = true)
    protected BigInteger resultNumber;
    @XmlElement(name = "formatted_address", required = true)
    protected String formattedAddress;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String accuracy;
    @XmlElement(name = "ADDRESS", required = true)
    protected ADDRESS address;
    @XmlElement(name = "LOCATION_DETAILS", required = true)
    protected LOCATIONDETAILS locationdetails;
    @XmlElement(name = "COORDINATES", required = true)
    protected COORDINATES coordinates;
    @XmlElement(name = "BOUNDARIES", required = true)
    protected BOUNDARIES boundaries;

    
    public Result()
    {}
    /**
     * Recupera il valore della proprietà resultNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultNumber() {
        return resultNumber;
    }

    /**
     * Imposta il valore della proprietà resultNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultNumber(BigInteger value) {
        this.resultNumber = value;
    }

    /**
     * Recupera il valore della proprietà formattedAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Imposta il valore della proprietà formattedAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddress(String value) {
        this.formattedAddress = value;
    }

    /**
     * Recupera il valore della proprietà accuracy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuracy() {
        return accuracy;
    }

    /**
     * Imposta il valore della proprietà accuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuracy(String value) {
        this.accuracy = value;
    }

    /**
     * Recupera il valore della proprietà address.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESS }
     *     
     */
    public ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Imposta il valore della proprietà address.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESS }
     *     
     */
    public void setADDRESS(ADDRESS value) {
        this.address = value;
    }

    /**
     * Recupera il valore della proprietà locationdetails.
     * 
     * @return
     *     possible object is
     *     {@link LOCATIONDETAILS }
     *     
     */
    public LOCATIONDETAILS getLOCATIONDETAILS() {
        return locationdetails;
    }

    /**
     * Imposta il valore della proprietà locationdetails.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATIONDETAILS }
     *     
     */
    public void setLOCATIONDETAILS(LOCATIONDETAILS value) {
        this.locationdetails = value;
    }

    /**
     * Recupera il valore della proprietà coordinates.
     * 
     * @return
     *     possible object is
     *     {@link COORDINATES }
     *     
     */
    public COORDINATES getCOORDINATES() {
        return coordinates;
    }

    /**
     * Imposta il valore della proprietà coordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link COORDINATES }
     *     
     */
    public void setCOORDINATES(COORDINATES value) {
        this.coordinates = value;
    }

    /**
     * Recupera il valore della proprietà boundaries.
     * 
     * @return
     *     possible object is
     *     {@link BOUNDARIES }
     *     
     */
    public BOUNDARIES getBOUNDARIES() {
        return boundaries;
    }

    /**
     * Imposta il valore della proprietà boundaries.
     * 
     * @param value
     *     allowed object is
     *     {@link BOUNDARIES }
     *     
     */
    public void setBOUNDARIES(BOUNDARIES value) {
        this.boundaries = value;
    }

}
