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
public class LrtipoplanPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANID", nullable = false)
    private long lrtipoplanid;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANGRUPID", nullable = false)
    private long lrtipoplangrupid;

    public LrtipoplanPK() {
    }

    public LrtipoplanPK(long lrtipoplanid, long lrtipoplangrupid) {
        this.lrtipoplanid = lrtipoplanid;
        this.lrtipoplangrupid = lrtipoplangrupid;
    }

    public long getLrtipoplanid() {
        return lrtipoplanid;
    }

    public void setLrtipoplanid(long lrtipoplanid) {
        this.lrtipoplanid = lrtipoplanid;
    }

    public long getLrtipoplangrupid() {
        return lrtipoplangrupid;
    }

    public void setLrtipoplangrupid(long lrtipoplangrupid) {
        this.lrtipoplangrupid = lrtipoplangrupid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrtipoplanid;
        hash += (int) lrtipoplangrupid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrtipoplanPK)) {
            return false;
        }
        LrtipoplanPK other = (LrtipoplanPK) object;
        if (this.lrtipoplanid != other.lrtipoplanid) {
            return false;
        }
        if (this.lrtipoplangrupid != other.lrtipoplangrupid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrtipoplanPK[ lrtipoplanid=" + lrtipoplanid + ", lrtipoplangrupid=" + lrtipoplangrupid + " ]";
    }
    
}
