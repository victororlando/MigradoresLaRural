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
public class LrcotidatbienasePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRCOTIDATBIENASEID", nullable = false)
    private long lrcotidatbienaseid;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONID", nullable = false)
    private long lrubicacionid;

    public LrcotidatbienasePK() {
    }

    public LrcotidatbienasePK(long lrcotidatbienaseid, long lrubicacionid) {
        this.lrcotidatbienaseid = lrcotidatbienaseid;
        this.lrubicacionid = lrubicacionid;
    }

    public long getLrcotidatbienaseid() {
        return lrcotidatbienaseid;
    }

    public void setLrcotidatbienaseid(long lrcotidatbienaseid) {
        this.lrcotidatbienaseid = lrcotidatbienaseid;
    }

    public long getLrubicacionid() {
        return lrubicacionid;
    }

    public void setLrubicacionid(long lrubicacionid) {
        this.lrubicacionid = lrubicacionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrcotidatbienaseid;
        hash += (int) lrubicacionid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrcotidatbienasePK)) {
            return false;
        }
        LrcotidatbienasePK other = (LrcotidatbienasePK) object;
        if (this.lrcotidatbienaseid != other.lrcotidatbienaseid) {
            return false;
        }
        if (this.lrubicacionid != other.lrubicacionid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrcotidatbienasePK[ lrcotidatbienaseid=" + lrcotidatbienaseid + ", lrubicacionid=" + lrubicacionid + " ]";
    }
    
}
