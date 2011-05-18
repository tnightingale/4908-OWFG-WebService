
package com.owfg.facade.ws.StoreManagement;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StoreManagement {


    /**
     * 
     * @return
     *     returns java.util.List<com.owfg.facade.ws.StoreManagement.Store>
     */
    @WebResult(name = "stores", targetNamespace = "")
    @RequestWrapper(localName = "getActiveStores", targetNamespace = "http://ws.facade.owfg.com/", className = "com.owfg.facade.ws.StoreManagement.GetActiveStores")
    @ResponseWrapper(localName = "getActiveStoresResponse", targetNamespace = "http://ws.facade.owfg.com/", className = "com.owfg.facade.ws.StoreManagement.GetActiveStoresResponse")
    public List<Store> getActiveStores();

    /**
     * 
     * @return
     *     returns java.util.List<com.owfg.facade.ws.StoreManagement.Banner>
     */
    @WebMethod
    @WebResult(name = "banners", targetNamespace = "")
    @RequestWrapper(localName = "getBanners", targetNamespace = "http://ws.facade.owfg.com/", className = "com.owfg.facade.ws.StoreManagement.GetBanners")
    @ResponseWrapper(localName = "getBannersResponse", targetNamespace = "http://ws.facade.owfg.com/", className = "com.owfg.facade.ws.StoreManagement.GetBannersResponse")
    public List<Banner> getBanners();

    /**
     * 
     * @param upc
     * @param storeId
     * @return
     *     returns com.owfg.facade.ws.StoreManagement.StoreManagementInfo
     */
    @WebMethod
    @WebResult(name = "storeManagementInfo", targetNamespace = "")
    @RequestWrapper(localName = "getStoreManagementInfo", targetNamespace = "http://ws.facade.owfg.com/", className = "com.owfg.facade.ws.StoreManagement.GetStoreManagementInfo")
    @ResponseWrapper(localName = "getStoreManagementInfoResponse", targetNamespace = "http://ws.facade.owfg.com/", className = "com.owfg.facade.ws.StoreManagement.GetStoreManagementInfoResponse")
    public StoreManagementInfo getStoreManagementInfo(
        @WebParam(name = "storeId", targetNamespace = "")
        long storeId,
        @WebParam(name = "upc", targetNamespace = "")
        String upc);

}