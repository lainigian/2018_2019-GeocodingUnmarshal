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
 *         &lt;element ref="{}LEGAL_COPYRIGHT"/>
 *         &lt;element ref="{}STATUS"/>
 *         &lt;element ref="{}ACCOUNT"/>
 *         &lt;element ref="{}RESULTS"/>
 *         &lt;element ref="{}STATISTICS"/>
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
    "legalcopyright",
    "status",
    "account",
    "results",
    "statistics"
})
@XmlRootElement(name = "geocoding_results")
public class GeocodingResults {

    @XmlElement(name = "LEGAL_COPYRIGHT", required = true)
    protected LEGALCOPYRIGHT legalcopyright;
    @XmlElement(name = "STATUS", required = true)
    protected STATUS status;
    @XmlElement(name = "ACCOUNT", required = true)
    protected ACCOUNT account;
    @XmlElement(name = "RESULTS", required = true)
    protected RESULTS results;
    @XmlElement(name = "STATISTICS", required = true)
    protected STATISTICS statistics;

    public GeocodingResults()
    {}
    
    /**
     * Recupera il valore della proprietà legalcopyright.
     * 
     * @return
     *     possible object is
     *     {@link LEGALCOPYRIGHT }
     *     
     */
    public LEGALCOPYRIGHT getLEGALCOPYRIGHT() {
        return legalcopyright;
    }

    /**
     * Imposta il valore della proprietà legalcopyright.
     * 
     * @param value
     *     allowed object is
     *     {@link LEGALCOPYRIGHT }
     *     
     */
    public void setLEGALCOPYRIGHT(LEGALCOPYRIGHT value) {
        this.legalcopyright = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link STATUS }
     *     
     */
    public STATUS getSTATUS() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUS }
     *     
     */
    public void setSTATUS(STATUS value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà account.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNT }
     *     
     */
    public ACCOUNT getACCOUNT() {
        return account;
    }

    /**
     * Imposta il valore della proprietà account.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNT }
     *     
     */
    public void setACCOUNT(ACCOUNT value) {
        this.account = value;
    }

    /**
     * Recupera il valore della proprietà results.
     * 
     * @return
     *     possible object is
     *     {@link RESULTS }
     *     
     */
    public RESULTS getRESULTS() {
        return results;
    }

    /**
     * Imposta il valore della proprietà results.
     * 
     * @param value
     *     allowed object is
     *     {@link RESULTS }
     *     
     */
    public void setRESULTS(RESULTS value) {
        this.results = value;
    }

    /**
     * Recupera il valore della proprietà statistics.
     * 
     * @return
     *     possible object is
     *     {@link STATISTICS }
     *     
     */
    public STATISTICS getSTATISTICS() {
        return statistics;
    }

    /**
     * Imposta il valore della proprietà statistics.
     * 
     * @param value
     *     allowed object is
     *     {@link STATISTICS }
     *     
     */
    public void setSTATISTICS(STATISTICS value) {
        this.statistics = value;
    }

}
