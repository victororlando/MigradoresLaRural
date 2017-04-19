/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victoro
 */
@Embeddable
public class LrparmaccduracionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRPARMACCDURACIONID", nullable = false)
    private long lrparmaccduracionid;
    @Basic(optional = false)
    @Column(name = "LRAREAID", nullable = false)
    private long lrareaid;
    @Basic(optional = false)
    @Column(name = "LRSUBAREAID", nullable = false)
    private long lrsubareaid;
    @Basic(optional = false)
    @Column(name = "LRACCIONID", nullable = false)
    private long lraccionid;
    @Basic(optional = false)
    @Column(name = "LRSUBACCIONID", nullable = false)
    private long lrsubaccionid;
    @Basic(optional = false)
    @Column(name = "LRTIPOCOTIZACIONID", nullable = false)
    private long lrtipocotizacionid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;

    public LrparmaccduracionPK() {
    }

    public LrparmaccduracionPK(long lrparmaccduracionid, long lrareaid, long lrsubareaid, long lraccionid, long lrsubaccionid, long lrtipocotizacionid, long lrseccdetalleid) {
        this.lrparmaccduracionid = lrparmaccduracionid;
        this.lrareaid = lrareaid;
        this.lrsubareaid = lrsubareaid;
        this.lraccionid = lraccionid;
        this.lrsubaccionid = lrsubaccionid;
        this.lrtipocotizacionid = lrtipocotizacionid;
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public long getLrparmaccduracionid() {
        return lrparmaccduracionid;
    }

    public void setLrparmaccduracionid(long lrparmaccduracionid) {
        this.lrparmaccduracionid = lrparmaccduracionid;
    }

    public long getLrareaid() {
        return lrareaid;
    }

    public void setLrareaid(long lrareaid) {
        this.lrareaid = lrareaid;
    }

    public long getLrsubareaid() {
        return lrsubareaid;
    }

    public void setLrsubareaid(long lrsubareaid) {
        this.lrsubareaid = lrsubareaid;
    }

    public long getLraccionid() {
        return lraccionid;
    }

    public void setLraccionid(long lraccionid) {
        this.lraccionid = lraccionid;
    }

    public long getLrsubaccionid() {
        return lrsubaccionid;
    }

    public void setLrsubaccionid(long lrsubaccionid) {
        this.lrsubaccionid = lrsubaccionid;
    }

    public long getLrtipocotizacionid() {
        return lrtipocotizacionid;
    }

    public void setLrtipocotizacionid(long lrtipocotizacionid) {
        this.lrtipocotizacionid = lrtipocotizacionid;
    }

    public long getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(long lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrparmaccduracionid;
        hash += (int) lrareaid;
        hash += (int) lrsubareaid;
        hash += (int) lraccionid;
        hash += (int) lrsubaccionid;
        hash += (int) lrtipocotizacionid;
        hash += (int) lrseccdetalleid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrparmaccduracionPK)) {
            return false;
        }
        LrparmaccduracionPK other = (LrparmaccduracionPK) object;
        if (this.lrparmaccduracionid != other.lrparmaccduracionid) {
            return false;
        }
        if (this.lrareaid != other.lrareaid) {
            return false;
        }
        if (this.lrsubareaid != other.lrsubareaid) {
            return false;
        }
        if (this.lraccionid != other.lraccionid) {
            return false;
        }
        if (this.lrsubaccionid != other.lrsubaccionid) {
            return false;
        }
        if (this.lrtipocotizacionid != other.lrtipocotizacionid) {
            return false;
        }
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrparmaccduracionPK[ lrparmaccduracionid=" + lrparmaccduracionid + ", lrareaid=" + lrareaid + ", lrsubareaid=" + lrsubareaid + ", lraccionid=" + lraccionid + ", lrsubaccionid=" + lrsubaccionid + ", lrtipocotizacionid=" + lrtipocotizacionid + ", lrseccdetalleid=" + lrseccdetalleid + " ]";
    }
    
}
