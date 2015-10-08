/*******************************************************************************
 *  Copyright FUJITSU LIMITED 2015 
 *******************************************************************************/

package org.oscm.xsd.v1;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated
 * source version: 2.2
 * 
 */
@WebServiceClient(name = "ServerSoapHandlerService", targetNamespace = "http://oscm.org/xsd", wsdlLocation = "http://localhost:8680/oscm-integrationtests-saml2-sp/SoapHandlerService?wsdl")
public class ServerSoapHandlerService extends Service {

    private final static URL SERVERSOAPHANDLERSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVERSOAPHANDLERSERVICE_EXCEPTION;
    private final static QName SERVERSOAPHANDLERSERVICE_QNAME = new QName(
            "http://oscm.org/xsd", "ServerSoapHandlerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL(
                    "http://localhost:8680/oscm-integrationtests-saml2-sp/SoapHandlerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVERSOAPHANDLERSERVICE_WSDL_LOCATION = url;
        SERVERSOAPHANDLERSERVICE_EXCEPTION = e;
    }

    public ServerSoapHandlerService() {
        super(__getWsdlLocation(), SERVERSOAPHANDLERSERVICE_QNAME);
    }

    public ServerSoapHandlerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVERSOAPHANDLERSERVICE_QNAME, features);
    }

    public ServerSoapHandlerService(URL wsdlLocation) {
        super(wsdlLocation, SERVERSOAPHANDLERSERVICE_QNAME);
    }

    public ServerSoapHandlerService(URL wsdlLocation,
            WebServiceFeature... features) {
        super(wsdlLocation, SERVERSOAPHANDLERSERVICE_QNAME, features);
    }

    public ServerSoapHandlerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServerSoapHandlerService(URL wsdlLocation, QName serviceName,
            WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return returns SoapHandlerService
     */
    @WebEndpoint(name = "ServerSoapHandlerServiceImplPort")
    public SoapHandlerService getServerSoapHandlerServiceImplPort() {
        return super.getPort(new QName("http://oscm.org/xsd",
                "ServerSoapHandlerServiceImplPort"), SoapHandlerService.class);
    }

    /**
     * 
     * @param features
     *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
     *            on the proxy. Supported features not in the
     *            <code>features</code> parameter will have their default
     *            values.
     * @return returns SoapHandlerService
     */
    @WebEndpoint(name = "ServerSoapHandlerServiceImplPort")
    public SoapHandlerService getServerSoapHandlerServiceImplPort(
            WebServiceFeature... features) {
        return super.getPort(new QName("http://oscm.org/xsd",
                "ServerSoapHandlerServiceImplPort"), SoapHandlerService.class,
                features);
    }

    private static URL __getWsdlLocation() {
        if (SERVERSOAPHANDLERSERVICE_EXCEPTION != null) {
            throw SERVERSOAPHANDLERSERVICE_EXCEPTION;
        }
        return SERVERSOAPHANDLERSERVICE_WSDL_LOCATION;
    }

}
