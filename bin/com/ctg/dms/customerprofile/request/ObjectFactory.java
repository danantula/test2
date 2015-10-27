
package com.ctg.dms.customerprofile.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ctg.dms.customerprofile.request package. 
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

    private final static QName _MSISDN_QNAME = new QName("http://www.three.co.uk/midus/getcustomerdetails/bw/requestschema", "MSISDN");
    private final static QName _ICCID_QNAME = new QName("http://www.three.co.uk/midus/getcustomerdetails/bw/requestschema", "ICCID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ctg.dms.customerprofile.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link H1UK_IDU_GET_CUSTOMER_INPUT }
     * 
     */
    public H1UK_IDU_GET_CUSTOMER_INPUT createH1UK_IDU_GET_CUSTOMER_INPUT() {
        return new H1UK_IDU_GET_CUSTOMER_INPUT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.three.co.uk/midus/getcustomerdetails/bw/requestschema", name = "MSISDN")
    public JAXBElement<String> createMSISDN(String value) {
        return new JAXBElement<String>(_MSISDN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.three.co.uk/midus/getcustomerdetails/bw/requestschema", name = "ICCID")
    public JAXBElement<String> createICCID(String value) {
        return new JAXBElement<String>(_ICCID_QNAME, String.class, null, value);
    }

}
