package com.owfg.facade.ws.StoreManagement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
import org.jboss.ejb3.annotation.SecurityDomain;
import org.jboss.wsf.spi.annotation.WebContext;
import javax.annotation.security.RolesAllowed;
@WebService
@SecurityDomain("JBossWS")
@RolesAllowed("friend")
@WebContext(authMethod = "BASIC", transportGuarantee = "NONE", secureWSDLAccess = false)
public class StoreManagementImpl {
    private Factory factory = new Factory();

    @WebMethod
    public List<Store> getActiveStores() {
        return factory.getStores();
    }

    @WebMethod
    public List<Banner> getBanners() {
        return factory.getBanners();
    }

    @WebMethod
    public StoreManagementInfo getStoreManagementInfo(@WebParam(name = "storeId", targetNamespace = "") long storeId, @WebParam(name = "upc", targetNamespace = "") String upc) {
        return factory.getStoreManagementInfo(storeId, upc);
    }
}
