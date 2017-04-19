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
public class LrpersonatcPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRPERSONATCID", nullable = false)
    private int lrpersonatcid;
    @Basic(optional = false)
    @Column(name = "LRPERSONAID", nullable = false)
    private long lrpersonaid;

    public LrpersonatcPK() {
    }

    public LrpersonatcPK(int lrpersonatcid, long lrpersonaid) {
        this.lrpersonatcid = lrpersonatcid;
        this.lrpersonaid = lrpersonaid;
    }

    public int getLrpersonatcid() {
        return lrpersonatcid;
    }

    public void setLrpersonatcid(int lrpersonatcid) {
        this.lrpersonatcid = lrpersonatcid;
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
        hash += (int) lrpersonatcid;
        hash += (int) lrpersonaid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrpersonatcPK)) {
            return false;
        }
        LrpersonatcPK other = (LrpersonatcPK) object;
        if (this.lrpersonatcid != other.lrpersonatcid) {
            return false;
        }
        if (this.lrpersonaid != other.lrpersonaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrpersonatcPK[ lrpersonatcid=" + lrpersonatcid + ", lrpersonaid=" + lrpersonaid + " ]";
    }
    
}
