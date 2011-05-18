
package com.owfg.facade.ws.StoreManagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStoreManagementInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStoreManagementInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storeManagementInfo" type="{http://ws.facade.owfg.com/}storeManagementInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStoreManagementInfoResponse", propOrder = {
    "storeManagementInfo"
})
public class GetStoreManagementInfoResponse {

    protected StoreManagementInfo storeManagementInfo;

    /**
     * Gets the value of the storeManagementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreManagementInfo }
     *     
     */
    public StoreManagementInfo getStoreManagementInfo() {
        return storeManagementInfo;
    }

    /**
     * Sets the value of the storeManagementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreManagementInfo }
     *     
     */
    public void setStoreManagementInfo(StoreManagementInfo value) {
        this.storeManagementInfo = value;
    }

}
