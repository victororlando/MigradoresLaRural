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
public class ZonasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COD_DPTO", nullable = false)
    private short codDpto;
    @Basic(optional = false)
    @Column(name = "COD_CIUDAD", nullable = false)
    private short codCiudad;
    @Basic(optional = false)
    @Column(name = "COD_ZONA", nullable = false)
    private short codZona;

    public ZonasPK() {
    }

    public ZonasPK(short codDpto, short codCiudad, short codZona) {
        this.codDpto = codDpto;
        this.codCiudad = codCiudad;
        this.codZona = codZona;
    }

    public short getCodDpto() {
        return codDpto;
    }

    public void setCodDpto(short codDpto) {
        this.codDpto = codDpto;
    }

    public short getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(short codCiudad) {
        this.codCiudad = codCiudad;
    }

    public short getCodZona() {
        return codZona;
    }

    public void setCodZona(short codZona) {
        this.codZona = codZona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codDpto;
        hash += (int) codCiudad;
        hash += (int) codZona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZonasPK)) {
            return false;
        }
        ZonasPK other = (ZonasPK) object;
        if (this.codDpto != other.codDpto) {
            return false;
        }
        if (this.codCiudad != other.codCiudad) {
            return false;
        }
        if (this.codZona != other.codZona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ZonasPK[ codDpto=" + codDpto + ", codCiudad=" + codCiudad + ", codZona=" + codZona + " ]";
    }
    
}
