
package com.persistent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBookAuthorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBookAuthorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Book_Author_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBookAuthorResponse", propOrder = {
    "bookAuthorName"
})
public class GetBookAuthorResponse {

    @XmlElement(name = "Book_Author_Name")
    protected String bookAuthorName;

    /**
     * Gets the value of the bookAuthorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookAuthorName() {
        return bookAuthorName;
    }

    /**
     * Sets the value of the bookAuthorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookAuthorName(String value) {
        this.bookAuthorName = value;
    }

}
