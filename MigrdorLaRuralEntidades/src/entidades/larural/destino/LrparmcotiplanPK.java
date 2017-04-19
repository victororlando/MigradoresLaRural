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
public class LrparmcotiplanPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANID", nullable = false)
    private long lrparmcotiplanid;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANID", nullable = false)
    private long lrtipoplanid;

    public LrparmcotiplanPK() {
    }

    public LrparmcotiplanPK(long lrparmcotiplanid, long lrtipoplanid) {
        this.lrparmcotiplanid = lrparmcotiplanid;
        this.lrtipoplanid = lrtipoplanid;
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
        hash += (int) lrparmcotiplanid;
        hash += (int) lrtipoplanid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrparmcotiplanPK)) {
            return false;
        }
        LrparmcotiplanPK other = (LrparmcotiplanPK) object;
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
        return "entidadesdestino.LrparmcotiplanPK[ lrparmcotiplanid=" + lrparmcotiplanid + ", lrtipoplanid=" + lrtipoplanid + " ]";
    }
    
}
