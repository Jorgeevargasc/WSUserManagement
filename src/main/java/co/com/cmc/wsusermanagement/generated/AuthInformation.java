//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.06 a las 10:22:17 PM COT 
//


package co.com.cmc.wsusermanagement.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AuthInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuthInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authHour" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthInformation", propOrder = {
    "authDate",
    "authHour",
    "authAttempts"
})
public class AuthInformation {

    @XmlElement(required = true)
    protected String authDate;
    @XmlElement(required = true)
    protected String authHour;
    protected int authAttempts;

    /**
     * Obtiene el valor de la propiedad authDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthDate() {
        return authDate;
    }

    /**
     * Define el valor de la propiedad authDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthDate(String value) {
        this.authDate = value;
    }

    /**
     * Obtiene el valor de la propiedad authHour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthHour() {
        return authHour;
    }

    /**
     * Define el valor de la propiedad authHour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthHour(String value) {
        this.authHour = value;
    }

    /**
     * Obtiene el valor de la propiedad authAttempts.
     * 
     */
    public int getAuthAttempts() {
        return authAttempts;
    }

    /**
     * Define el valor de la propiedad authAttempts.
     * 
     */
    public void setAuthAttempts(int value) {
        this.authAttempts = value;
    }

}
