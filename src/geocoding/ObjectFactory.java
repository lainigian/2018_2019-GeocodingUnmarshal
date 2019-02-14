//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.14 alle 11:54:40 AM CET 
//


package geocoding;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddressProvided_QNAME = new QName("", "address_provided");
    private final static QName _Country_QNAME = new QName("", "country");
    private final static QName _UsageLimit_QNAME = new QName("", "usage_limit");
    private final static QName _FormattedAddress_QNAME = new QName("", "formatted_address");
    private final static QName _Access_QNAME = new QName("", "access");
    private final static QName _UsedTotal_QNAME = new QName("", "used_total");
    private final static QName _FirstUsed_QNAME = new QName("", "first_used");
    private final static QName _ResultNumber_QNAME = new QName("", "result_number");
    private final static QName _Latitude_QNAME = new QName("", "latitude");
    private final static QName _Accuracy_QNAME = new QName("", "accuracy");
    private final static QName _TimezoneShort_QNAME = new QName("", "timezone_short");
    private final static QName _TimezoneLong_QNAME = new QName("", "timezone_long");
    private final static QName _StreetName_QNAME = new QName("", "street_name");
    private final static QName _CopyrightLogo_QNAME = new QName("", "copyright_logo");
    private final static QName _Admin2_QNAME = new QName("", "admin_2");
    private final static QName _Admin1_QNAME = new QName("", "admin_1");
    private final static QName _CopyrightNotice_QNAME = new QName("", "copyright_notice");
    private final static QName _TermsOfService_QNAME = new QName("", "terms_of_service");
    private final static QName _ResultCount_QNAME = new QName("", "result_count");
    private final static QName _Longitude_QNAME = new QName("", "longitude");
    private final static QName _Elevation_QNAME = new QName("", "elevation");
    private final static QName _DistributionLicense_QNAME = new QName("", "distribution_license");
    private final static QName _Locality_QNAME = new QName("", "locality");
    private final static QName _NortheastLongitude_QNAME = new QName("", "northeast_longitude");
    private final static QName _TimeTaken_QNAME = new QName("", "time_taken");
    private final static QName _NortheastLatitude_QNAME = new QName("", "northeast_latitude");
    private final static QName _HttpsSsl_QNAME = new QName("", "https_ssl");
    private final static QName _PrivacyPolicy_QNAME = new QName("", "privacy_policy");
    private final static QName _StreetNumber_QNAME = new QName("", "street_number");
    private final static QName _UsedToday_QNAME = new QName("", "used_today");
    private final static QName _PostalCode_QNAME = new QName("", "postal_code");
    private final static QName _SouthwestLatitude_QNAME = new QName("", "southwest_latitude");
    private final static QName _SouthwestLongitude_QNAME = new QName("", "southwest_longitude");
    private final static QName _Status_QNAME = new QName("", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link ADDRESS }
     * 
     */
    public ADDRESS createADDRESS() {
        return new ADDRESS();
    }

    /**
     * Create an instance of {@link LOCATIONDETAILS }
     * 
     */
    public LOCATIONDETAILS createLOCATIONDETAILS() {
        return new LOCATIONDETAILS();
    }

    /**
     * Create an instance of {@link COORDINATES }
     * 
     */
    public COORDINATES createCOORDINATES() {
        return new COORDINATES();
    }

    /**
     * Create an instance of {@link BOUNDARIES }
     * 
     */
    public BOUNDARIES createBOUNDARIES() {
        return new BOUNDARIES();
    }

    /**
     * Create an instance of {@link GeocodingResults }
     * 
     */
    public GeocodingResults createGeocodingResults() {
        return new GeocodingResults();
    }

    /**
     * Create an instance of {@link LEGALCOPYRIGHT }
     * 
     */
    public LEGALCOPYRIGHT createLEGALCOPYRIGHT() {
        return new LEGALCOPYRIGHT();
    }

    /**
     * Create an instance of {@link STATUS }
     * 
     */
    public STATUS createSTATUS() {
        return new STATUS();
    }

    /**
     * Create an instance of {@link ACCOUNT }
     * 
     */
    public ACCOUNT createACCOUNT() {
        return new ACCOUNT();
    }

    /**
     * Create an instance of {@link IpAddress }
     * 
     */
    public IpAddress createIpAddress() {
        return new IpAddress();
    }

    /**
     * Create an instance of {@link RESULTS }
     * 
     */
    public RESULTS createRESULTS() {
        return new RESULTS();
    }

    /**
     * Create an instance of {@link STATISTICS }
     * 
     */
    public STATISTICS createSTATISTICS() {
        return new STATISTICS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address_provided")
    public JAXBElement<String> createAddressProvided(String value) {
        return new JAXBElement<String>(_AddressProvided_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "country")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "usage_limit")
    public JAXBElement<BigInteger> createUsageLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_UsageLimit_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "formatted_address")
    public JAXBElement<String> createFormattedAddress(String value) {
        return new JAXBElement<String>(_FormattedAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "access")
    public JAXBElement<String> createAccess(String value) {
        return new JAXBElement<String>(_Access_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "used_total")
    public JAXBElement<BigInteger> createUsedTotal(BigInteger value) {
        return new JAXBElement<BigInteger>(_UsedTotal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "first_used")
    public JAXBElement<String> createFirstUsed(String value) {
        return new JAXBElement<String>(_FirstUsed_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "result_number")
    public JAXBElement<BigInteger> createResultNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResultNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "latitude")
    public JAXBElement<BigDecimal> createLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Latitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accuracy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAccuracy(String value) {
        return new JAXBElement<String>(_Accuracy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "timezone_short")
    public JAXBElement<String> createTimezoneShort(String value) {
        return new JAXBElement<String>(_TimezoneShort_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "timezone_long")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimezoneLong(String value) {
        return new JAXBElement<String>(_TimezoneLong_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "street_name")
    public JAXBElement<String> createStreetName(String value) {
        return new JAXBElement<String>(_StreetName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "copyright_logo")
    public JAXBElement<String> createCopyrightLogo(String value) {
        return new JAXBElement<String>(_CopyrightLogo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "admin_2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAdmin2(String value) {
        return new JAXBElement<String>(_Admin2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "admin_1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAdmin1(String value) {
        return new JAXBElement<String>(_Admin1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "copyright_notice")
    public JAXBElement<String> createCopyrightNotice(String value) {
        return new JAXBElement<String>(_CopyrightNotice_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "terms_of_service")
    public JAXBElement<String> createTermsOfService(String value) {
        return new JAXBElement<String>(_TermsOfService_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "result_count")
    public JAXBElement<BigInteger> createResultCount(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResultCount_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "longitude")
    public JAXBElement<BigDecimal> createLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Longitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "elevation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createElevation(String value) {
        return new JAXBElement<String>(_Elevation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "distribution_license")
    public JAXBElement<String> createDistributionLicense(String value) {
        return new JAXBElement<String>(_DistributionLicense_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "locality")
    public JAXBElement<String> createLocality(String value) {
        return new JAXBElement<String>(_Locality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "northeast_longitude")
    public JAXBElement<BigDecimal> createNortheastLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NortheastLongitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time_taken")
    public JAXBElement<BigDecimal> createTimeTaken(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TimeTaken_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "northeast_latitude")
    public JAXBElement<BigDecimal> createNortheastLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NortheastLatitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "https_ssl")
    public JAXBElement<String> createHttpsSsl(String value) {
        return new JAXBElement<String>(_HttpsSsl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "privacy_policy")
    public JAXBElement<String> createPrivacyPolicy(String value) {
        return new JAXBElement<String>(_PrivacyPolicy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "street_number")
    public JAXBElement<BigInteger> createStreetNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_StreetNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "used_today")
    public JAXBElement<BigInteger> createUsedToday(BigInteger value) {
        return new JAXBElement<BigInteger>(_UsedToday_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postal_code")
    public JAXBElement<BigInteger> createPostalCode(BigInteger value) {
        return new JAXBElement<BigInteger>(_PostalCode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "southwest_latitude")
    public JAXBElement<BigDecimal> createSouthwestLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SouthwestLatitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "southwest_longitude")
    public JAXBElement<BigDecimal> createSouthwestLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SouthwestLongitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

}
