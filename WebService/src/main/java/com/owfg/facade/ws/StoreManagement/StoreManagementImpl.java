package com.owfg.facade.ws.StoreManagement;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public class StoreManagementImpl implements StoreManagement {
    private Factory factory = new Factory();

    public List<Store> getActiveStores() {
        return factory.getStores();
    }

    public List<Banner> getBanners() {
        return factory.getBanners();
    }

    public StoreManagementInfo getStoreManagementInfo(@WebParam(name = "storeId", targetNamespace = "") long storeId, @WebParam(name = "upc", targetNamespace = "") String upc) {
        return factory.getStoreManagementInfo(storeId, upc);
    }
}
