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
public class CotidatbienasePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COTIZACIONESID", nullable = false)
    private long cotizacionesid;
    @Basic(optional = false)
    @Column(name = "COTIDETSECCIONESID", nullable = false)
    private long cotidetseccionesid;
    @Basic(optional = false)
    @Column(name = "COTIDATBIENASEID", nullable = false)
    private long cotidatbienaseid;

    public CotidatbienasePK() {
    }

    public CotidatbienasePK(long cotizacionesid, long cotidetseccionesid, long cotidatbienaseid) {
        this.cotizacionesid = cotizacionesid;
        this.cotidetseccionesid = cotidetseccionesid;
        this.cotidatbienaseid = cotidatbienaseid;
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

    public long getCotidatbienaseid() {
        return cotidatbienaseid;
    }

    public void setCotidatbienaseid(long cotidatbienaseid) {
        this.cotidatbienaseid = cotidatbienaseid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cotizacionesid;
        hash += (int) cotidetseccionesid;
        hash += (int) cotidatbienaseid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotidatbienasePK)) {
            return false;
        }
        CotidatbienasePK other = (CotidatbienasePK) object;
        if (this.cotizacionesid != other.cotizacionesid) {
            return false;
        }
        if (this.cotidetseccionesid != other.cotidetseccionesid) {
            return false;
        }
        if (this.cotidatbienaseid != other.cotidatbienaseid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.lrgxprod.CotidatbienasePK[ cotizacionesid=" + cotizacionesid + ", cotidetseccionesid=" + cotidetseccionesid + ", cotidatbienaseid=" + cotidatbienaseid + " ]";
    }
    
}
