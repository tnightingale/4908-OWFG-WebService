
package com.owfg.facade.ws.StoreManagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeManagementInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeManagementInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balanceOnHand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="forecast" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="inTransit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="itemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="onOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="pack" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="promotion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regularPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="upc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeManagementInfo", propOrder = {
    "balanceOnHand",
    "forecast",
    "inTransit",
    "itemDescription",
    "minimum",
    "onOrder",
    "pack",
    "promotion",
    "regularPrice",
    "source",
    "storeId",
    "upc"
})
public class StoreManagementInfo {

    protected Double balanceOnHand;
    protected Double forecast;
    protected Double inTransit;
    protected String itemDescription;
    protected Long minimum;
    protected Double onOrder;
    protected Integer pack;
    protected String promotion;
    protected Double regularPrice;
    protected String source;
    protected long storeId;
    protected String upc;

    /**
     * Gets the value of the balanceOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalanceOnHand() {
        return balanceOnHand;
    }

    /**
     * Sets the value of the balanceOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalanceOnHand(Double value) {
        this.balanceOnHand = value;
    }

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setForecast(Double value) {
        this.forecast = value;
    }

    /**
     * Gets the value of the inTransit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInTransit() {
        return inTransit;
    }

    /**
     * Sets the value of the inTransit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInTransit(Double value) {
        this.inTransit = value;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinimum(Long value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the onOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOnOrder() {
        return onOrder;
    }

    /**
     * Sets the value of the onOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOnOrder(Double value) {
        this.onOrder = value;
    }

    /**
     * Gets the value of the pack property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPack() {
        return pack;
    }

    /**
     * Sets the value of the pack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPack(Integer value) {
        this.pack = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotion(String value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the regularPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRegularPrice() {
        return regularPrice;
    }

    /**
     * Sets the value of the regularPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRegularPrice(Double value) {
        this.regularPrice = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
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
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpc() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpc(String value) {
        this.upc = value;
    }

}
