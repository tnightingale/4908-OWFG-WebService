
package com.owfg.facade.ws.StoreManagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.owfg.facade.ws.StoreManagement package. 
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

    private final static QName _GetStoreManagementInfoResponse_QNAME = new QName("http://ws.facade.owfg.com/", "getStoreManagementInfoResponse");
    private final static QName _GetBannersResponse_QNAME = new QName("http://ws.facade.owfg.com/", "getBannersResponse");
    private final static QName _GetActiveStores_QNAME = new QName("http://ws.facade.owfg.com/", "getActiveStores");
    private final static QName _GetActiveStoresResponse_QNAME = new QName("http://ws.facade.owfg.com/", "getActiveStoresResponse");
    private final static QName _GetStoreManagementInfo_QNAME = new QName("http://ws.facade.owfg.com/", "getStoreManagementInfo");
    private final static QName _GetBanners_QNAME = new QName("http://ws.facade.owfg.com/", "getBanners");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.owfg.facade.ws.StoreManagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Store }
     * 
     */
    public Store createStore() {
        return new Store();
    }

    /**
     * Create an instance of {@link GetStoreManagementInfoResponse }
     * 
     */
    public GetStoreManagementInfoResponse createGetStoreManagementInfoResponse() {
        return new GetStoreManagementInfoResponse();
    }

    /**
     * Create an instance of {@link GetStoreManagementInfo }
     * 
     */
    public GetStoreManagementInfo createGetStoreManagementInfo() {
        return new GetStoreManagementInfo();
    }

    /**
     * Create an instance of {@link GetActiveStores }
     * 
     */
    public GetActiveStores createGetActiveStores() {
        return new GetActiveStores();
    }

    /**
     * Create an instance of {@link StoreManagementInfo }
     * 
     */
    public StoreManagementInfo createStoreManagementInfo() {
        return new StoreManagementInfo();
    }

    /**
     * Create an instance of {@link Banner }
     * 
     */
    public Banner createBanner() {
        return new Banner();
    }

    /**
     * Create an instance of {@link GetBanners }
     * 
     */
    public GetBanners createGetBanners() {
        return new GetBanners();
    }

    /**
     * Create an instance of {@link GetBannersResponse }
     * 
     */
    public GetBannersResponse createGetBannersResponse() {
        return new GetBannersResponse();
    }

    /**
     * Create an instance of {@link GetActiveStoresResponse }
     * 
     */
    public GetActiveStoresResponse createGetActiveStoresResponse() {
        return new GetActiveStoresResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStoreManagementInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.facade.owfg.com/", name = "getStoreManagementInfoResponse")
    public JAXBElement<GetStoreManagementInfoResponse> createGetStoreManagementInfoResponse(GetStoreManagementInfoResponse value) {
        return new JAXBElement<GetStoreManagementInfoResponse>(_GetStoreManagementInfoResponse_QNAME, GetStoreManagementInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBannersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.facade.owfg.com/", name = "getBannersResponse")
    public JAXBElement<GetBannersResponse> createGetBannersResponse(GetBannersResponse value) {
        return new JAXBElement<GetBannersResponse>(_GetBannersResponse_QNAME, GetBannersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveStores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.facade.owfg.com/", name = "getActiveStores")
    public JAXBElement<GetActiveStores> createGetActiveStores(GetActiveStores value) {
        return new JAXBElement<GetActiveStores>(_GetActiveStores_QNAME, GetActiveStores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveStoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.facade.owfg.com/", name = "getActiveStoresResponse")
    public JAXBElement<GetActiveStoresResponse> createGetActiveStoresResponse(GetActiveStoresResponse value) {
        return new JAXBElement<GetActiveStoresResponse>(_GetActiveStoresResponse_QNAME, GetActiveStoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStoreManagementInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.facade.owfg.com/", name = "getStoreManagementInfo")
    public JAXBElement<GetStoreManagementInfo> createGetStoreManagementInfo(GetStoreManagementInfo value) {
        return new JAXBElement<GetStoreManagementInfo>(_GetStoreManagementInfo_QNAME, GetStoreManagementInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanners }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.facade.owfg.com/", name = "getBanners")
    public JAXBElement<GetBanners> createGetBanners(GetBanners value) {
        return new JAXBElement<GetBanners>(_GetBanners_QNAME, GetBanners.class, null, value);
    }

}
