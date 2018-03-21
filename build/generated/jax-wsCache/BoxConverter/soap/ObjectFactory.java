
package soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
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

    private final static QName _Converter_QNAME = new QName("http://service/", "converter");
    private final static QName _ConverterResponse_QNAME = new QName("http://service/", "converterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConverterResponse }
     * 
     */
    public ConverterResponse createConverterResponse() {
        return new ConverterResponse();
    }

    /**
     * Create an instance of {@link Converter }
     * 
     */
    public Converter createConverter() {
        return new Converter();
    }

    /**
     * Create an instance of {@link Box }
     * 
     */
    public Box createBox() {
        return new Box();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Converter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "converter")
    public JAXBElement<Converter> createConverter(Converter value) {
        return new JAXBElement<Converter>(_Converter_QNAME, Converter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "converterResponse")
    public JAXBElement<ConverterResponse> createConverterResponse(ConverterResponse value) {
        return new JAXBElement<ConverterResponse>(_ConverterResponse_QNAME, ConverterResponse.class, null, value);
    }

}
