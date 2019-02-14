//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.14 alle 11:54:40 AM CET 
//


package geocoding;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}northeast_latitude"/>
 *         &lt;element ref="{}northeast_longitude"/>
 *         &lt;element ref="{}southwest_latitude"/>
 *         &lt;element ref="{}southwest_longitude"/>
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
    "northeastLatitude",
    "northeastLongitude",
    "southwestLatitude",
    "southwestLongitude"
})
@XmlRootElement(name = "BOUNDARIES")
public class BOUNDARIES {

    @XmlElement(name = "northeast_latitude", required = true)
    protected BigDecimal northeastLatitude;
    @XmlElement(name = "northeast_longitude", required = true)
    protected BigDecimal northeastLongitude;
    @XmlElement(name = "southwest_latitude", required = true)
    protected BigDecimal southwestLatitude;
    @XmlElement(name = "southwest_longitude", required = true)
    protected BigDecimal southwestLongitude;

    
    public BOUNDARIES()
    {}
    /**
     * Recupera il valore della proprietà northeastLatitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNortheastLatitude() {
        return northeastLatitude;
    }

    /**
     * Imposta il valore della proprietà northeastLatitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNortheastLatitude(BigDecimal value) {
        this.northeastLatitude = value;
    }

    /**
     * Recupera il valore della proprietà northeastLongitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNortheastLongitude() {
        return northeastLongitude;
    }

    /**
     * Imposta il valore della proprietà northeastLongitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNortheastLongitude(BigDecimal value) {
        this.northeastLongitude = value;
    }

    /**
     * Recupera il valore della proprietà southwestLatitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSouthwestLatitude() {
        return southwestLatitude;
    }

    /**
     * Imposta il valore della proprietà southwestLatitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSouthwestLatitude(BigDecimal value) {
        this.southwestLatitude = value;
    }

    /**
     * Recupera il valore della proprietà southwestLongitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSouthwestLongitude() {
        return southwestLongitude;
    }

    /**
     * Imposta il valore della proprietà southwestLongitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSouthwestLongitude(BigDecimal value) {
        this.southwestLongitude = value;
    }

}
