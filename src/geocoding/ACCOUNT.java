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
 *         &lt;element ref="{}ip_address"/>
 *         &lt;element ref="{}distribution_license"/>
 *         &lt;element ref="{}usage_limit"/>
 *         &lt;element ref="{}used_today"/>
 *         &lt;element ref="{}used_total"/>
 *         &lt;element ref="{}first_used"/>
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
    "ipAddress",
    "distributionLicense",
    "usageLimit",
    "usedToday",
    "usedTotal",
    "firstUsed"
})
@XmlRootElement(name = "ACCOUNT")
public class ACCOUNT {

    @XmlElement(name = "ip_address", required = true)
    protected IpAddress ipAddress;
    @XmlElement(name = "distribution_license", required = true)
    protected String distributionLicense;
    @XmlElement(name = "usage_limit", required = true)
    protected BigInteger usageLimit;
    @XmlElement(name = "used_today", required = true)
    protected BigInteger usedToday;
    @XmlElement(name = "used_total", required = true)
    protected BigInteger usedTotal;
    @XmlElement(name = "first_used", required = true)
    protected String firstUsed;

    public ACCOUNT()
    {}
    /**
     * Recupera il valore della proprietà ipAddress.
     * 
     * @return
     *     possible object is
     *     {@link IpAddress }
     *     
     */
    public IpAddress getIpAddress() {
        return ipAddress;
    }

    /**
     * Imposta il valore della proprietà ipAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link IpAddress }
     *     
     */
    public void setIpAddress(IpAddress value) {
        this.ipAddress = value;
    }

    /**
     * Recupera il valore della proprietà distributionLicense.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionLicense() {
        return distributionLicense;
    }

    /**
     * Imposta il valore della proprietà distributionLicense.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionLicense(String value) {
        this.distributionLicense = value;
    }

    /**
     * Recupera il valore della proprietà usageLimit.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsageLimit() {
        return usageLimit;
    }

    /**
     * Imposta il valore della proprietà usageLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsageLimit(BigInteger value) {
        this.usageLimit = value;
    }

    /**
     * Recupera il valore della proprietà usedToday.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsedToday() {
        return usedToday;
    }

    /**
     * Imposta il valore della proprietà usedToday.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsedToday(BigInteger value) {
        this.usedToday = value;
    }

    /**
     * Recupera il valore della proprietà usedTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUsedTotal() {
        return usedTotal;
    }

    /**
     * Imposta il valore della proprietà usedTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUsedTotal(BigInteger value) {
        this.usedTotal = value;
    }

    /**
     * Recupera il valore della proprietà firstUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstUsed() {
        return firstUsed;
    }

    /**
     * Imposta il valore della proprietà firstUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstUsed(String value) {
        this.firstUsed = value;
    }

}
