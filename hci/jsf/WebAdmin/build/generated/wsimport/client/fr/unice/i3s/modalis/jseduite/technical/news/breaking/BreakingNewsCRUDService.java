
package fr.unice.i3s.modalis.jseduite.technical.news.breaking;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3.1-hudson-749-SNAPSHOT
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BreakingNewsCRUDService", targetNamespace = "http://breaking.news.technical.jSeduite.modalis.i3s.unice.fr/", wsdlLocation = "http://localhost:8080/jSeduite/BreakingNews/BreakingNewsCRUDService?wsdl")
public class BreakingNewsCRUDService
    extends Service
{

    private final static URL BREAKINGNEWSCRUDSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(fr.unice.i3s.modalis.jseduite.technical.news.breaking.BreakingNewsCRUDService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = fr.unice.i3s.modalis.jseduite.technical.news.breaking.BreakingNewsCRUDService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/jSeduite/BreakingNews/BreakingNewsCRUDService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/jSeduite/BreakingNews/BreakingNewsCRUDService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BREAKINGNEWSCRUDSERVICE_WSDL_LOCATION = url;
    }

    public BreakingNewsCRUDService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BreakingNewsCRUDService() {
        super(BREAKINGNEWSCRUDSERVICE_WSDL_LOCATION, new QName("http://breaking.news.technical.jSeduite.modalis.i3s.unice.fr/", "BreakingNewsCRUDService"));
    }

    /**
     * 
     * @return
     *     returns BreakingNewsCRUD
     */
    @WebEndpoint(name = "BreakingNewsCRUDPort")
    public BreakingNewsCRUD getBreakingNewsCRUDPort() {
        return super.getPort(new QName("http://breaking.news.technical.jSeduite.modalis.i3s.unice.fr/", "BreakingNewsCRUDPort"), BreakingNewsCRUD.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BreakingNewsCRUD
     */
    @WebEndpoint(name = "BreakingNewsCRUDPort")
    public BreakingNewsCRUD getBreakingNewsCRUDPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://breaking.news.technical.jSeduite.modalis.i3s.unice.fr/", "BreakingNewsCRUDPort"), BreakingNewsCRUD.class, features);
    }

}
