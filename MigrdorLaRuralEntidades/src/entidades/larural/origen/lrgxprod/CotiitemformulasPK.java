/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen.lrgxprod;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victoro
 */
@Embeddable
public class CotiitemformulasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COTIZACIONESID", nullable = false)
    private long cotizacionesid;
    @Basic(optional = false)
    @Column(name = "COTIDETSECCIONESID", nullable = false)
    private long cotidetseccionesid;
    @Basic(optional = false)
    @Column(name = "COTIITEMFORMULASTIPO", nullable = false)
    private long cotiitemformulastipo;
    @Basic(optional = false)
    @Column(name = "COTIITEMFORMULASID", nullable = false)
    private long cotiitemformulasid;

    public CotiitemformulasPK() {
    }

    public CotiitemformulasPK(long cotizacionesid, long cotidetseccionesid, long cotiitemformulastipo, long cotiitemformulasid) {
        this.cotizacionesid = cotizacionesid;
        this.cotidetseccionesid = cotidetseccionesid;
        this.cotiitemformulastipo = cotiitemformulastipo;
        this.cotiitemformulasid = cotiitemformulasid;
    }

    public long getCotizacionesid() {
        return cotizacionesid;
    }

    public void setCotizacionesid(long cotizacionesid) {
        this.cotizacionesid = cotizacionesid;
    }

    public long getCotidetseccionesid() {
        return cotidetseccionesid;
    }

    public void setCotidetseccionesid(long cotidetseccionesid) {
        this.cotidetseccionesid = cotidetseccionesid;
    }

    public long getCotiitemformulastipo() {
        return cotiitemformulastipo;
    }

    public void setCotiitemformulastipo(long cotiitemformulastipo) {
        this.cotiitemformulastipo = cotiitemformulastipo;
    }

    public long getCotiitemformulasid() {
        return cotiitemformulasid;
    }

    public void setCotiitemformulasid(long cotiitemformulasid) {
        this.cotiitemformulasid = cotiitemformulasid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cotizacionesid;
        hash += (int) cotidetseccionesid;
        hash += (int) cotiitemformulastipo;
        hash += (int) cotiitemformulasid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotiitemformulasPK)) {
            return false;
        }
        CotiitemformulasPK other = (CotiitemformulasPK) object;
        if (this.cotizacionesid != other.cotizacionesid) {
            return false;
        }
        if (this.cotidetseccionesid != other.cotidetseccionesid) {
            return false;
        }
        if (this.cotiitemformulastipo != other.cotiitemformulastipo) {
            return false;
        }
        if (this.cotiitemformulasid != other.cotiitemformulasid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.lrgxprod.CotiitemformulasPK[ cotizacionesid=" + cotizacionesid + ", cotidetseccionesid=" + cotidetseccionesid + ", cotiitemformulastipo=" + cotiitemformulastipo + ", cotiitemformulasid=" + cotiitemformulasid + " ]";
    }
    
}
