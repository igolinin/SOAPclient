
package soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BoxConverter", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8080/SOAPconverter/BoxConverter?wsdl")
public class BoxConverter_Service
    extends Service
{

    private final static URL BOXCONVERTER_WSDL_LOCATION;
    private final static WebServiceException BOXCONVERTER_EXCEPTION;
    private final static QName BOXCONVERTER_QNAME = new QName("http://service/", "BoxConverter");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAPconverter/BoxConverter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOXCONVERTER_WSDL_LOCATION = url;
        BOXCONVERTER_EXCEPTION = e;
    }

    public BoxConverter_Service() {
        super(__getWsdlLocation(), BOXCONVERTER_QNAME);
    }

    public BoxConverter_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOXCONVERTER_QNAME, features);
    }

    public BoxConverter_Service(URL wsdlLocation) {
        super(wsdlLocation, BOXCONVERTER_QNAME);
    }

    public BoxConverter_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOXCONVERTER_QNAME, features);
    }

    public BoxConverter_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BoxConverter_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BoxConverter
     */
    @WebEndpoint(name = "BoxConverterPort")
    public BoxConverter getBoxConverterPort() {
        return super.getPort(new QName("http://service/", "BoxConverterPort"), BoxConverter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BoxConverter
     */
    @WebEndpoint(name = "BoxConverterPort")
    public BoxConverter getBoxConverterPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "BoxConverterPort"), BoxConverter.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOXCONVERTER_EXCEPTION!= null) {
            throw BOXCONVERTER_EXCEPTION;
        }
        return BOXCONVERTER_WSDL_LOCATION;
    }

}
