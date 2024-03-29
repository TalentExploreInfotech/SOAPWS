
package com.persistent;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Book_Exception", targetNamespace = "http://persistent.com/")
public class CustomException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CustomException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CustomException_Exception(String message, CustomException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CustomException_Exception(String message, CustomException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.persistent.CustomException
     */
    public CustomException getFaultInfo() {
        return faultInfo;
    }

}
