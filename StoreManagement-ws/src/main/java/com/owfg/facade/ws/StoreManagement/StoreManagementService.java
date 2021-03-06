
package com.owfg.facade.ws.StoreManagement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "StoreManagementService", targetNamespace = "http://ws.facade.owfg.com/", wsdlLocation = "file:///Users/tomnightingale/Downloads/StoreManagement.wsdl")
public class StoreManagementService
    extends Service
{

    private final static URL STOREMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.owfg.facade.ws.StoreManagement.StoreManagementService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.owfg.facade.ws.StoreManagement.StoreManagementService.class.getResource(".");
            url = new URL(baseUrl, "file:///Users/tomnightingale/Downloads/StoreManagement.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:///Users/tomnightingale/Downloads/StoreManagement.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        STOREMANAGEMENTSERVICE_WSDL_LOCATION = url;
    }

    public StoreManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StoreManagementService() {
        super(STOREMANAGEMENTSERVICE_WSDL_LOCATION, new QName("http://ws.facade.owfg.com/", "StoreManagementService"));
    }

    /**
     * 
     * @return
     *     returns StoreManagement
     */
    @WebEndpoint(name = "StoreManagementPort")
    public StoreManagement getStoreManagementPort() {
        return super.getPort(new QName("http://ws.facade.owfg.com/", "StoreManagementPort"), StoreManagement.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StoreManagement
     */
    @WebEndpoint(name = "StoreManagementPort")
    public StoreManagement getStoreManagementPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.facade.owfg.com/", "StoreManagementPort"), StoreManagement.class, features);
    }

}
