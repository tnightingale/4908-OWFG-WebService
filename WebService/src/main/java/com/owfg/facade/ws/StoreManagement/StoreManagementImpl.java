package com.owfg.facade.ws.StoreManagement;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.ArrayList;
import java.util.List;

@WebService
public class StoreManagementImpl implements StoreManagement {
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
