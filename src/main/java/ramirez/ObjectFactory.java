
package ramirez;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ramirez package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _CalcularIntensidad_QNAME = new QName("http://ramirez/", "calcular_intensidad");
    private static final QName _CalcularIntensidadResponse_QNAME = new QName("http://ramirez/", "calcular_intensidadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ramirez
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularIntensidad }
     * 
     * @return
     *     the new instance of {@link CalcularIntensidad }
     */
    public CalcularIntensidad createCalcularIntensidad() {
        return new CalcularIntensidad();
    }

    /**
     * Create an instance of {@link CalcularIntensidadResponse }
     * 
     * @return
     *     the new instance of {@link CalcularIntensidadResponse }
     */
    public CalcularIntensidadResponse createCalcularIntensidadResponse() {
        return new CalcularIntensidadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularIntensidad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularIntensidad }{@code >}
     */
    @XmlElementDecl(namespace = "http://ramirez/", name = "calcular_intensidad")
    public JAXBElement<CalcularIntensidad> createCalcularIntensidad(CalcularIntensidad value) {
        return new JAXBElement<>(_CalcularIntensidad_QNAME, CalcularIntensidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularIntensidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularIntensidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ramirez/", name = "calcular_intensidadResponse")
    public JAXBElement<CalcularIntensidadResponse> createCalcularIntensidadResponse(CalcularIntensidadResponse value) {
        return new JAXBElement<>(_CalcularIntensidadResponse_QNAME, CalcularIntensidadResponse.class, null, value);
    }

}
