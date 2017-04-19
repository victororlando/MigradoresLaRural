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
public class LragrupariesgoasePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARIESGOASEID", nullable = false)
    private long lrcategoriariesgoaseid;
    @Basic(optional = false)
    @Column(name = "RIESGOSASEID", nullable = false)
    private short riesgosaseid;
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;

    public LragrupariesgoasePK() {
    }

    public LragrupariesgoasePK(long lrcategoriariesgoaseid, short riesgosaseid, short seccid) {
        this.lrcategoriariesgoaseid = lrcategoriariesgoaseid;
        this.riesgosaseid = riesgosaseid;
        this.seccid = seccid;
    }

    public long getLrcategoriariesgoaseid() {
        return lrcategoriariesgoaseid;
    }

    public void setLrcategoriariesgoaseid(long lrcategoriariesgoaseid) {
        this.lrcategoriariesgoaseid = lrcategoriariesgoaseid;
    }

    public short getRiesgosaseid() {
        return riesgosaseid;
    }

    public void setRiesgosaseid(short riesgosaseid) {
        this.riesgosaseid = riesgosaseid;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrcategoriariesgoaseid;
        hash += (int) riesgosaseid;
        hash += (int) seccid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LragrupariesgoasePK)) {
            return false;
        }
        LragrupariesgoasePK other = (LragrupariesgoasePK) object;
        if (this.lrcategoriariesgoaseid != other.lrcategoriariesgoaseid) {
            return false;
        }
        if (this.riesgosaseid != other.riesgosaseid) {
            return false;
        }
        if (this.seccid != other.seccid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LragrupariesgoasePK[ lrcategoriariesgoaseid=" + lrcategoriariesgoaseid + ", riesgosaseid=" + riesgosaseid + ", seccid=" + seccid + " ]";
    }
    
}
