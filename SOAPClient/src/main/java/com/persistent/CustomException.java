
package com.persistent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorBean" type="{http://persistent.com/}errorBean" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomException", propOrder = {
    "errorBean",
    "message"
})
public class CustomException {

    protected ErrorBean errorBean;
    protected String message;

    /**
     * Gets the value of the errorBean property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorBean }
     *     
     */
    public ErrorBean getErrorBean() {
        return errorBean;
    }

    /**
     * Sets the value of the errorBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorBean }
     *     
     */
    public void setErrorBean(ErrorBean value) {
        this.errorBean = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
