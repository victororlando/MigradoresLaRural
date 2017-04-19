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
public class LrparmcotiplanseccPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANID", nullable = false)
    private long lrparmcotiplanid;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANID", nullable = false)
    private long lrtipoplanid;

    public LrparmcotiplanseccPK() {
    }

    public LrparmcotiplanseccPK(long lrseccdetalleid, long lrparmcotiplanid, long lrtipoplanid) {
        this.lrseccdetalleid = lrseccdetalleid;
        this.lrparmcotiplanid = lrparmcotiplanid;
        this.lrtipoplanid = lrtipoplanid;
    }

    public long getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(long lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public long getLrparmcotiplanid() {
        return lrparmcotiplanid;
    }

    public void setLrparmcotiplanid(long lrparmcotiplanid) {
        this.lrparmcotiplanid = lrparmcotiplanid;
    }

    public long getLrtipoplanid() {
        return lrtipoplanid;
    }

    public void setLrtipoplanid(long lrtipoplanid) {
        this.lrtipoplanid = lrtipoplanid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrseccdetalleid;
        hash += (int) lrparmcotiplanid;
        hash += (int) lrtipoplanid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrparmcotiplanseccPK)) {
            return false;
        }
        LrparmcotiplanseccPK other = (LrparmcotiplanseccPK) object;
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        if (this.lrparmcotiplanid != other.lrparmcotiplanid) {
            return false;
        }
        if (this.lrtipoplanid != other.lrtipoplanid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrparmcotiplanseccPK[ lrseccdetalleid=" + lrseccdetalleid + ", lrparmcotiplanid=" + lrparmcotiplanid + ", lrtipoplanid=" + lrtipoplanid + " ]";
    }
    
}
