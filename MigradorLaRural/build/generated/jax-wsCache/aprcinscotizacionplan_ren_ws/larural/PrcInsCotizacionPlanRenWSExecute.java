
package larural;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lrcotizacionnro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Lrcotizacionversion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lrcotizacionnro",
    "lrcotizacionversion"
})
@XmlRootElement(name = "prcInsCotizacionPlan_Ren_WS.Execute")
public class PrcInsCotizacionPlanRenWSExecute {

    @XmlElement(name = "Lrcotizacionnro")
    protected long lrcotizacionnro;
    @XmlElement(name = "Lrcotizacionversion")
    protected long lrcotizacionversion;

    /**
     * Obtiene el valor de la propiedad lrcotizacionnro.
     * 
     */
    public long getLrcotizacionnro() {
        return lrcotizacionnro;
    }

    /**
     * Define el valor de la propiedad lrcotizacionnro.
     * 
     */
    public void setLrcotizacionnro(long value) {
        this.lrcotizacionnro = value;
    }

    /**
     * Obtiene el valor de la propiedad lrcotizacionversion.
     * 
     */
    public long getLrcotizacionversion() {
        return lrcotizacionversion;
    }

    /**
     * Define el valor de la propiedad lrcotizacionversion.
     * 
     */
    public void setLrcotizacionversion(long value) {
        this.lrcotizacionversion = value;
    }

}
