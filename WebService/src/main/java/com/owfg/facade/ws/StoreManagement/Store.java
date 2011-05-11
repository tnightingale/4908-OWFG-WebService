
package com.owfg.facade.ws.StoreManagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for store complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="store">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bannerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="storeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="storeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "store", propOrder = {
    "bannerId",
    "storeId",
    "storeName"
})
public class Store {

    protected long bannerId;
    protected long storeId;
    protected String storeName;

    /**
     * Gets the value of the bannerId property.
     * 
     */
    public long getBannerId() {
        return bannerId;
    }

    /**
     * Sets the value of the bannerId property.
     * 
     */
    public void setBannerId(long value) {
        this.bannerId = value;
    }

    /**
     * Gets the value of the storeId property.
     * 
     */
    public long getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     */
    public void setStoreId(long value) {
        this.storeId = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

}
