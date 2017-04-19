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
public class ArchbeneServiciosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SECC", nullable = false)
    private short secc;
    @Basic(optional = false)
    @Column(name = "CODIGO_SERVICIO", nullable = false)
    private short codigoServicio;
    @Basic(optional = false)
    @Column(name = "COD_BENEF", nullable = false)
    private int codBenef;

    public ArchbeneServiciosPK() {
    }

    public ArchbeneServiciosPK(short secc, short codigoServicio, int codBenef) {
        this.secc = secc;
        this.codigoServicio = codigoServicio;
        this.codBenef = codBenef;
    }

    public short getSecc() {
        return secc;
    }

    public void setSecc(short secc) {
        this.secc = secc;
    }

    public short getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(short codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public int getCodBenef() {
        return codBenef;
    }

    public void setCodBenef(int codBenef) {
        this.codBenef = codBenef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) secc;
        hash += (int) codigoServicio;
        hash += (int) codBenef;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArchbeneServiciosPK)) {
            return false;
        }
        ArchbeneServiciosPK other = (ArchbeneServiciosPK) object;
        if (this.secc != other.secc) {
            return false;
        }
        if (this.codigoServicio != other.codigoServicio) {
            return false;
        }
        if (this.codBenef != other.codBenef) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ArchbeneServiciosPK[ secc=" + secc + ", codigoServicio=" + codigoServicio + ", codBenef=" + codBenef + " ]";
    }
    
}
