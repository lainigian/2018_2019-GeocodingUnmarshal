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
 *         &lt;element ref="{}https_ssl"/>
 *         &lt;element ref="{}time_taken"/>
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
    "httpsSsl",
    "timeTaken"
})
@XmlRootElement(name = "STATISTICS")
public class STATISTICS {

    @XmlElement(name = "https_ssl", required = true)
    protected String httpsSsl;
    @XmlElement(name = "time_taken", required = true)
    protected BigDecimal timeTaken;

    
    public STATISTICS()
    {
    	
    }
    /**
     * Recupera il valore della proprietà httpsSsl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpsSsl() {
        return httpsSsl;
    }

    /**
     * Imposta il valore della proprietà httpsSsl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpsSsl(String value) {
        this.httpsSsl = value;
    }

    /**
     * Recupera il valore della proprietà timeTaken.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeTaken() {
        return timeTaken;
    }

    /**
     * Imposta il valore della proprietà timeTaken.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeTaken(BigDecimal value) {
        this.timeTaken = value;
    }

}
