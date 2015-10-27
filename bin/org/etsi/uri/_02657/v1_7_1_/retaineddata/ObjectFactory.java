//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_7_1_.retaineddata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

import org.etsi.uri._02657.v1_1_1_.retaineddata.NULL;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.etsi.uri._02657.v1_7_1_.retaineddata package. 
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

    private final static QName _TransactionStatus_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "transactionStatus");
    private final static QName _ICCID_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "iCCID");
    private final static QName _SubscriptionCreationInformation_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "subscriptionCreationInformation");
    private final static QName _MsgBillingDetails_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "msgBillingDetails");
    private final static QName _PdfVerification_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "pdfVerification");
    private final static QName _PdfCopyFile_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "pdfCopyFile");
    private final static QName _NaServiceStatus_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "naServiceStatus");
    private final static QName _MultimediaRecord_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "multimediaRecord");
    private final static QName _PdfIndication_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "pdfIndication");
    private final static QName _TransmitterDetails_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "transmitterDetails");
    private final static QName _Profession_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "profession");
    private final static QName _RegisteredICCID_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "registeredICCID");
    private final static QName _CH1903_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "cH1903");
    private final static QName _ExtendedLocation_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "extendedLocation");
    private final static QName _NationalNASubscription_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "nationalNASubscription");
    private final static QName _TransactionID_QNAME = new QName("http://uri.etsi.org/02657/v1.7.1#/RetainedData", "transactionID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.etsi.uri._02657.v1_7_1_.retaineddata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultimediaBillingDetails.BillingRecords }
     * 
     */
    public MultimediaBillingDetails.BillingRecords createMultimediaBillingDetailsBillingRecords() {
        return new MultimediaBillingDetails.BillingRecords();
    }

    /**
     * Create an instance of {@link PDFCreationDetails }
     * 
     */
    public PDFCreationDetails createPDFCreationDetails() {
        return new PDFCreationDetails();
    }

    /**
     * Create an instance of {@link PDFVerification }
     * 
     */
    public PDFVerification createPDFVerification() {
        return new PDFVerification();
    }

    /**
     * Create an instance of {@link MsgBillingRecords }
     * 
     */
    public MsgBillingRecords createMsgBillingRecords() {
        return new MsgBillingRecords();
    }

    /**
     * Create an instance of {@link MultimediaSubscriber }
     * 
     */
    public MultimediaSubscriber createMultimediaSubscriber() {
        return new MultimediaSubscriber();
    }

    /**
     * Create an instance of {@link NASubscriptionCreationInformation }
     * 
     */
    public NASubscriptionCreationInformation createNASubscriptionCreationInformation() {
        return new NASubscriptionCreationInformation();
    }

    /**
     * Create an instance of {@link MediaComponent }
     * 
     */
    public MediaComponent createMediaComponent() {
        return new MediaComponent();
    }

    /**
     * Create an instance of {@link NationalMultimediaServices }
     * 
     */
    public NationalMultimediaServices createNationalMultimediaServices() {
        return new NationalMultimediaServices();
    }

    /**
     * Create an instance of {@link NationalMultimediaMediaComponent }
     * 
     */
    public NationalMultimediaMediaComponent createNationalMultimediaMediaComponent() {
        return new NationalMultimediaMediaComponent();
    }

    /**
     * Create an instance of {@link NationalMultimediaSubscriberInfo }
     * 
     */
    public NationalMultimediaSubscriberInfo createNationalMultimediaSubscriberInfo() {
        return new NationalMultimediaSubscriberInfo();
    }

    /**
     * Create an instance of {@link NationalMsgBillingDetails }
     * 
     */
    public NationalMsgBillingDetails createNationalMsgBillingDetails() {
        return new NationalMsgBillingDetails();
    }

    /**
     * Create an instance of {@link MultimediaBillingDetails }
     * 
     */
    public MultimediaBillingDetails createMultimediaBillingDetails() {
        return new MultimediaBillingDetails();
    }

    /**
     * Create an instance of {@link PDFAcceptedFormats }
     * 
     */
    public PDFAcceptedFormats createPDFAcceptedFormats() {
        return new PDFAcceptedFormats();
    }

    /**
     * Create an instance of {@link NationalMultimediaBillingDetails }
     * 
     */
    public NationalMultimediaBillingDetails createNationalMultimediaBillingDetails() {
        return new NationalMultimediaBillingDetails();
    }

    /**
     * Create an instance of {@link MultimediaServiceUsage }
     * 
     */
    public MultimediaServiceUsage createMultimediaServiceUsage() {
        return new MultimediaServiceUsage();
    }

    /**
     * Create an instance of {@link ImsInformation.ServiceInfo }
     * 
     */
    public ImsInformation.ServiceInfo createImsInformationServiceInfo() {
        return new ImsInformation.ServiceInfo();
    }

    /**
     * Create an instance of {@link MultimediaPartyInformation }
     * 
     */
    public MultimediaPartyInformation createMultimediaPartyInformation() {
        return new MultimediaPartyInformation();
    }

    /**
     * Create an instance of {@link Spot }
     * 
     */
    public Spot createSpot() {
        return new Spot();
    }

    /**
     * Create an instance of {@link ImsInformation.Service }
     * 
     */
    public ImsInformation.Service createImsInformationService() {
        return new ImsInformation.Service();
    }

    /**
     * Create an instance of {@link NationalTransmitterDetails }
     * 
     */
    public NationalTransmitterDetails createNationalTransmitterDetails() {
        return new NationalTransmitterDetails();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link SubscriptionCreationInformation }
     * 
     */
    public SubscriptionCreationInformation createSubscriptionCreationInformation() {
        return new SubscriptionCreationInformation();
    }

    /**
     * Create an instance of {@link MultimediaPartyRole }
     * 
     */
    public MultimediaPartyRole createMultimediaPartyRole() {
        return new MultimediaPartyRole();
    }

    /**
     * Create an instance of {@link MultimediaServiceUsage.CallState }
     * 
     */
    public MultimediaServiceUsage.CallState createMultimediaServiceUsageCallState() {
        return new MultimediaServiceUsage.CallState();
    }

    /**
     * Create an instance of {@link org.etsi.uri._02657.v1_7_1_.retaineddata.SubscribedMultimediaServices.RegisteredIdentifiers }
     * 
     */
    public org.etsi.uri._02657.v1_7_1_.retaineddata.SubscribedMultimediaServices.RegisteredIdentifiers createSubscribedMultimediaServicesRegisteredIdentifiers() {
        return new org.etsi.uri._02657.v1_7_1_.retaineddata.SubscribedMultimediaServices.RegisteredIdentifiers();
    }

    /**
     * Create an instance of {@link NationalNASubscription }
     * 
     */
    public NationalNASubscription createNationalNASubscription() {
        return new NationalNASubscription();
    }

    /**
     * Create an instance of {@link MultimediaServiceUsage.MediaComponents }
     * 
     */
    public MultimediaServiceUsage.MediaComponents createMultimediaServiceUsageMediaComponents() {
        return new MultimediaServiceUsage.MediaComponents();
    }

    /**
     * Create an instance of {@link NationalMultimediaBillingRecords }
     * 
     */
    public NationalMultimediaBillingRecords createNationalMultimediaBillingRecords() {
        return new NationalMultimediaBillingRecords();
    }

    /**
     * Create an instance of {@link MultimediaBearerService }
     * 
     */
    public MultimediaBearerService createMultimediaBearerService() {
        return new MultimediaBearerService();
    }

    /**
     * Create an instance of {@link NationalMsgBillingRecords }
     * 
     */
    public NationalMsgBillingRecords createNationalMsgBillingRecords() {
        return new NationalMsgBillingRecords();
    }

    /**
     * Create an instance of {@link Route.RouteMarks }
     * 
     */
    public Route.RouteMarks createRouteRouteMarks() {
        return new Route.RouteMarks();
    }

    /**
     * Create an instance of {@link NationalMultimediaServiceUsage }
     * 
     */
    public NationalMultimediaServiceUsage createNationalMultimediaServiceUsage() {
        return new NationalMultimediaServiceUsage();
    }

    /**
     * Create an instance of {@link NationalMultimediaPartyInformation }
     * 
     */
    public NationalMultimediaPartyInformation createNationalMultimediaPartyInformation() {
        return new NationalMultimediaPartyInformation();
    }

    /**
     * Create an instance of {@link PDFIndication }
     * 
     */
    public PDFIndication createPDFIndication() {
        return new PDFIndication();
    }

    /**
     * Create an instance of {@link MultimediaBillingRecords }
     * 
     */
    public MultimediaBillingRecords createMultimediaBillingRecords() {
        return new MultimediaBillingRecords();
    }

    /**
     * Create an instance of {@link TransmitterTechnology }
     * 
     */
    public TransmitterTechnology createTransmitterTechnology() {
        return new TransmitterTechnology();
    }

    /**
     * Create an instance of {@link org.etsi.uri._02657.v1_7_1_.retaineddata.SubscribedMultimediaServices }
     * 
     */
    public org.etsi.uri._02657.v1_7_1_.retaineddata.SubscribedMultimediaServices createSubscribedMultimediaServices() {
        return new org.etsi.uri._02657.v1_7_1_.retaineddata.SubscribedMultimediaServices();
    }

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {
        return new Circle();
    }

    /**
     * Create an instance of {@link MsgBillingDetails.BillingRecords }
     * 
     */
    public MsgBillingDetails.BillingRecords createMsgBillingDetailsBillingRecords() {
        return new MsgBillingDetails.BillingRecords();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link MultimediaSubscriberInfo }
     * 
     */
    public MultimediaSubscriberInfo createMultimediaSubscriberInfo() {
        return new MultimediaSubscriberInfo();
    }

    /**
     * Create an instance of {@link MultimediaServiceType }
     * 
     */
    public MultimediaServiceType createMultimediaServiceType() {
        return new MultimediaServiceType();
    }

    /**
     * Create an instance of {@link ImsInformation }
     * 
     */
    public ImsInformation createImsInformation() {
        return new ImsInformation();
    }

    /**
     * Create an instance of {@link AdditionalEmailAddresses }
     * 
     */
    public AdditionalEmailAddresses createAdditionalEmailAddresses() {
        return new AdditionalEmailAddresses();
    }

    /**
     * Create an instance of {@link Region.CornerMarks }
     * 
     */
    public Region.CornerMarks createRegionCornerMarks() {
        return new Region.CornerMarks();
    }

    /**
     * Create an instance of {@link MultimediaServiceUsage.ContentType }
     * 
     */
    public MultimediaServiceUsage.ContentType createMultimediaServiceUsageContentType() {
        return new MultimediaServiceUsage.ContentType();
    }

    /**
     * Create an instance of {@link MultimediaSubscriber.SubscribedMultimediaServices }
     * 
     */
    public MultimediaSubscriber.SubscribedMultimediaServices createMultimediaSubscriberSubscribedMultimediaServices() {
        return new MultimediaSubscriber.SubscribedMultimediaServices();
    }

    /**
     * Create an instance of {@link ExtendedLocation }
     * 
     */
    public ExtendedLocation createExtendedLocation() {
        return new ExtendedLocation();
    }

    /**
     * Create an instance of {@link ImsInformation.RoleOfNode }
     * 
     */
    public ImsInformation.RoleOfNode createImsInformationRoleOfNode() {
        return new ImsInformation.RoleOfNode();
    }

    /**
     * Create an instance of {@link MsgBillingDetails }
     * 
     */
    public MsgBillingDetails createMsgBillingDetails() {
        return new MsgBillingDetails();
    }

    /**
     * Create an instance of {@link MultimediaRecord }
     * 
     */
    public MultimediaRecord createMultimediaRecord() {
        return new MultimediaRecord();
    }

    /**
     * Create an instance of {@link TransmitterDetails }
     * 
     */
    public TransmitterDetails createTransmitterDetails() {
        return new TransmitterDetails();
    }

    /**
     * Create an instance of {@link ImsServiceInfo }
     * 
     */
    public ImsServiceInfo createImsServiceInfo() {
        return new ImsServiceInfo();
    }

    /**
     * Create an instance of {@link MultimediaCommunicationType }
     * 
     */
    public MultimediaCommunicationType createMultimediaCommunicationType() {
        return new MultimediaCommunicationType();
    }

    /**
     * Create an instance of {@link MultimediaServiceUsage.PartyInformation }
     * 
     */
    public MultimediaServiceUsage.PartyInformation createMultimediaServiceUsagePartyInformation() {
        return new MultimediaServiceUsage.PartyInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "transactionStatus")
    public JAXBElement<String> createTransactionStatus(String value) {
        return new JAXBElement<String>(_TransactionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "iCCID")
    public JAXBElement<String> createICCID(String value) {
        return new JAXBElement<String>(_ICCID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionCreationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "subscriptionCreationInformation")
    public JAXBElement<SubscriptionCreationInformation> createSubscriptionCreationInformation(SubscriptionCreationInformation value) {
        return new JAXBElement<SubscriptionCreationInformation>(_SubscriptionCreationInformation_QNAME, SubscriptionCreationInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgBillingDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "msgBillingDetails")
    public JAXBElement<MsgBillingDetails> createMsgBillingDetails(MsgBillingDetails value) {
        return new JAXBElement<MsgBillingDetails>(_MsgBillingDetails_QNAME, MsgBillingDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFVerification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "pdfVerification")
    public JAXBElement<PDFVerification> createPdfVerification(PDFVerification value) {
        return new JAXBElement<PDFVerification>(_PdfVerification_QNAME, PDFVerification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "pdfCopyFile")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createPdfCopyFile(byte[] value) {
        return new JAXBElement<byte[]>(_PdfCopyFile_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "naServiceStatus")
    public JAXBElement<String> createNaServiceStatus(String value) {
        return new JAXBElement<String>(_NaServiceStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultimediaRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "multimediaRecord")
    public JAXBElement<MultimediaRecord> createMultimediaRecord(MultimediaRecord value) {
        return new JAXBElement<MultimediaRecord>(_MultimediaRecord_QNAME, MultimediaRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFIndication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "pdfIndication")
    public JAXBElement<PDFIndication> createPdfIndication(PDFIndication value) {
        return new JAXBElement<PDFIndication>(_PdfIndication_QNAME, PDFIndication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransmitterDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "transmitterDetails")
    public JAXBElement<TransmitterDetails> createTransmitterDetails(TransmitterDetails value) {
        return new JAXBElement<TransmitterDetails>(_TransmitterDetails_QNAME, TransmitterDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "profession")
    public JAXBElement<String> createProfession(String value) {
        return new JAXBElement<String>(_Profession_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "registeredICCID")
    public JAXBElement<String> createRegisteredICCID(String value) {
        return new JAXBElement<String>(_RegisteredICCID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NULL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "cH1903")
    public JAXBElement<NULL> createCH1903(NULL value) {
        return new JAXBElement<NULL>(_CH1903_QNAME, NULL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "extendedLocation")
    public JAXBElement<ExtendedLocation> createExtendedLocation(ExtendedLocation value) {
        return new JAXBElement<ExtendedLocation>(_ExtendedLocation_QNAME, ExtendedLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NationalNASubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "nationalNASubscription")
    public JAXBElement<NationalNASubscription> createNationalNASubscription(NationalNASubscription value) {
        return new JAXBElement<NationalNASubscription>(_NationalNASubscription_QNAME, NationalNASubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.7.1#/RetainedData", name = "transactionID")
    public JAXBElement<String> createTransactionID(String value) {
        return new JAXBElement<String>(_TransactionID_QNAME, String.class, null, value);
    }

}
