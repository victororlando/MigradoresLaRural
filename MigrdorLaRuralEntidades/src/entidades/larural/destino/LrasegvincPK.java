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
public class LrasegvincPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRASEGVINCID", nullable = false)
    private long lrasegvincid;
    @Basic(optional = false)
    @Column(name = "LRPERSONAID", nullable = false)
    private long lrpersonaid;

    public LrasegvincPK() {
    }

    public LrasegvincPK(long lrasegvincid, long lrpersonaid) {
        this.lrasegvincid = lrasegvincid;
        this.lrpersonaid = lrpersonaid;
    }

    public long getLrasegvincid() {
        return lrasegvincid;
    }

    public void setLrasegvincid(long lrasegvincid) {
        this.lrasegvincid = lrasegvincid;
    }

    public long getLrpersonaid() {
        return lrpersonaid;
    }

    public void setLrpersonaid(long lrpersonaid) {
        this.lrpersonaid = lrpersonaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrasegvincid;
        hash += (int) lrpersonaid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrasegvincPK)) {
            return false;
        }
        LrasegvincPK other = (LrasegvincPK) object;
        if (this.lrasegvincid != other.lrasegvincid) {
            return false;
        }
        if (this.lrpersonaid != other.lrpersonaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrasegvincPK[ lrasegvincid=" + lrasegvincid + ", lrpersonaid=" + lrpersonaid + " ]";
    }
    
}
