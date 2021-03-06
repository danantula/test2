//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.14 at 10:55:58 AM BST 
//


package org.etsi.uri._02657.v1_3_1_2.retaineddata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.etsi.uri._02657.v1_3_1_2.retaineddata package. 
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

    private final static QName _SubscriberID_QNAME = new QName("http://uri.etsi.org/02657/v1.3.1#2/RetainedData", "subscriberID");
    private final static QName _IMEI_QNAME = new QName("http://uri.etsi.org/02657/v1.3.1#2/RetainedData", "iMEI");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.etsi.uri._02657.v1_3_1_2.retaineddata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllocatedDeviceIDs }
     * 
     */
    public AllocatedDeviceIDs createAllocatedDeviceIDs() {
        return new AllocatedDeviceIDs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.3.1#2/RetainedData", name = "subscriberID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createSubscriberID(byte[] value) {
        return new JAXBElement<byte[]>(_SubscriberID_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02657/v1.3.1#2/RetainedData", name = "iMEI")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createIMEI(byte[] value) {
        return new JAXBElement<byte[]>(_IMEI_QNAME, byte[].class, null, ((byte[]) value));
    }

}
