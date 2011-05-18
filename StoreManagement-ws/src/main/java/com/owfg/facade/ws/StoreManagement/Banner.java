
package com.owfg.facade.ws.StoreManagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for banner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="banner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bannerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bannerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "banner", propOrder = {
    "bannerId",
    "bannerName"
})
public class Banner {

    protected long bannerId;
    protected String bannerName;

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
     * Gets the value of the bannerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBannerName() {
        return bannerName;
    }

    /**
     * Sets the value of the bannerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBannerName(String value) {
        this.bannerName = value;
    }

}
