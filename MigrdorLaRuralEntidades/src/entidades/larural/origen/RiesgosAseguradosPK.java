/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victoro
 */
@Embeddable
public class RiesgosAseguradosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SECC", nullable = false)
    private short secc;
    @Basic(optional = false)
    @Column(name = "COD_RIESGO", nullable = false)
    private short codRiesgo;

    public RiesgosAseguradosPK() {
    }

    public RiesgosAseguradosPK(short secc, short codRiesgo) {
        this.secc = secc;
        this.codRiesgo = codRiesgo;
    }

    public short getSecc() {
        return secc;
    }

    public void setSecc(short secc) {
        this.secc = secc;
    }

    public short getCodRiesgo() {
        return codRiesgo;
    }

    public void setCodRiesgo(short codRiesgo) {
        this.codRiesgo = codRiesgo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) secc;
        hash += (int) codRiesgo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RiesgosAseguradosPK)) {
            return false;
        }
        RiesgosAseguradosPK other = (RiesgosAseguradosPK) object;
        if (this.secc != other.secc) {
            return false;
        }
        if (this.codRiesgo != other.codRiesgo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.RiesgosAseguradosPK[ secc=" + secc + ", codRiesgo=" + codRiesgo + " ]";
    }
    
}
