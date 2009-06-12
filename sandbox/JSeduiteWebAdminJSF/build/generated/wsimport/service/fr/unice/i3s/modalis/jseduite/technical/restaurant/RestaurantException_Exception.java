
package fr.unice.i3s.modalis.jseduite.technical.restaurant;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.1-hudson-749-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "RestaurantException", targetNamespace = "http://restaurant.technical.jSeduite.modalis.i3s.unice.fr/")
public class RestaurantException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RestaurantException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RestaurantException_Exception(String message, RestaurantException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RestaurantException_Exception(String message, RestaurantException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: fr.unice.i3s.modalis.jseduite.technical.restaurant.RestaurantException
     */
    public RestaurantException getFaultInfo() {
        return faultInfo;
    }

}
