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
public class LrparmgengrupitemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMID", nullable = false)
    private long lrparmgengrupitemid;
    @Basic(optional = false)
    @Column(name = "LRPARMGENID", nullable = false)
    private long lrparmgenid;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPID", nullable = false)
    private long lrparmgengrupid;

    public LrparmgengrupitemPK() {
    }

    public LrparmgengrupitemPK(long lrparmgengrupitemid, long lrparmgenid, long lrparmgengrupid) {
        this.lrparmgengrupitemid = lrparmgengrupitemid;
        this.lrparmgenid = lrparmgenid;
        this.lrparmgengrupid = lrparmgengrupid;
    }

    public long getLrparmgengrupitemid() {
        return lrparmgengrupitemid;
    }

    public void setLrparmgengrupitemid(long lrparmgengrupitemid) {
        this.lrparmgengrupitemid = lrparmgengrupitemid;
    }

    public long getLrparmgenid() {
        return lrparmgenid;
    }

    public void setLrparmgenid(long lrparmgenid) {
        this.lrparmgenid = lrparmgenid;
    }

    public long getLrparmgengrupid() {
        return lrparmgengrupid;
    }

    public void setLrparmgengrupid(long lrparmgengrupid) {
        this.lrparmgengrupid = lrparmgengrupid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrparmgengrupitemid;
        hash += (int) lrparmgenid;
        hash += (int) lrparmgengrupid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrparmgengrupitemPK)) {
            return false;
        }
        LrparmgengrupitemPK other = (LrparmgengrupitemPK) object;
        if (this.lrparmgengrupitemid != other.lrparmgengrupitemid) {
            return false;
        }
        if (this.lrparmgenid != other.lrparmgenid) {
            return false;
        }
        if (this.lrparmgengrupid != other.lrparmgengrupid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrparmgengrupitemPK[ lrparmgengrupitemid=" + lrparmgengrupitemid + ", lrparmgenid=" + lrparmgenid + ", lrparmgengrupid=" + lrparmgengrupid + " ]";
    }
    
}
