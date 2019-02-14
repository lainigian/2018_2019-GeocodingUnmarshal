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
 *         &lt;element ref="{}copyright_notice"/>
 *         &lt;element ref="{}copyright_logo"/>
 *         &lt;element ref="{}terms_of_service"/>
 *         &lt;element ref="{}privacy_policy"/>
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
    "copyrightNotice",
    "copyrightLogo",
    "termsOfService",
    "privacyPolicy"
})
@XmlRootElement(name = "LEGAL_COPYRIGHT")
public class LEGALCOPYRIGHT {

    @XmlElement(name = "copyright_notice", required = true)
    protected String copyrightNotice;
    @XmlElement(name = "copyright_logo", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String copyrightLogo;
    @XmlElement(name = "terms_of_service", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String termsOfService;
    @XmlElement(name = "privacy_policy", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String privacyPolicy;

    
    public LEGALCOPYRIGHT()
    {}
    /**
     * Recupera il valore della proprietà copyrightNotice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightNotice() {
        return copyrightNotice;
    }

    /**
     * Imposta il valore della proprietà copyrightNotice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightNotice(String value) {
        this.copyrightNotice = value;
    }

    /**
     * Recupera il valore della proprietà copyrightLogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightLogo() {
        return copyrightLogo;
    }

    /**
     * Imposta il valore della proprietà copyrightLogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightLogo(String value) {
        this.copyrightLogo = value;
    }

    /**
     * Recupera il valore della proprietà termsOfService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfService() {
        return termsOfService;
    }

    /**
     * Imposta il valore della proprietà termsOfService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfService(String value) {
        this.termsOfService = value;
    }

    /**
     * Recupera il valore della proprietà privacyPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyPolicy() {
        return privacyPolicy;
    }

    /**
     * Imposta il valore della proprietà privacyPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyPolicy(String value) {
        this.privacyPolicy = value;
    }

}
