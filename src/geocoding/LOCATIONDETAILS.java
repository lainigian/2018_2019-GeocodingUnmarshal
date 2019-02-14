//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.14 alle 11:54:40 AM CET 
//


package geocoding;

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
 *         &lt;element ref="{}elevation"/>
 *         &lt;element ref="{}timezone_long"/>
 *         &lt;element ref="{}timezone_short"/>
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
    "elevation",
    "timezoneLong",
    "timezoneShort"
})
@XmlRootElement(name = "LOCATION_DETAILS")
public class LOCATIONDETAILS {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String elevation;
    @XmlElement(name = "timezone_long", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String timezoneLong;
    @XmlElement(name = "timezone_short", required = true)
    protected String timezoneShort;

    
    public LOCATIONDETAILS()
    {
    	
    }
    /**
     * Recupera il valore della proprietà elevation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElevation() {
        return elevation;
    }

    /**
     * Imposta il valore della proprietà elevation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevation(String value) {
        this.elevation = value;
    }

    /**
     * Recupera il valore della proprietà timezoneLong.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezoneLong() {
        return timezoneLong;
    }

    /**
     * Imposta il valore della proprietà timezoneLong.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneLong(String value) {
        this.timezoneLong = value;
    }

    /**
     * Recupera il valore della proprietà timezoneShort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezoneShort() {
        return timezoneShort;
    }

    /**
     * Imposta il valore della proprietà timezoneShort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneShort(String value) {
        this.timezoneShort = value;
    }

}
