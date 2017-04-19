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
public class LrgrupoasegPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRGRUPOASEGID", nullable = false)
    private long lrgrupoasegid;
    @Basic(optional = false)
    @Column(name = "LRPERSONAID", nullable = false)
    private long lrpersonaid;

    public LrgrupoasegPK() {
    }

    public LrgrupoasegPK(long lrgrupoasegid, long lrpersonaid) {
        this.lrgrupoasegid = lrgrupoasegid;
        this.lrpersonaid = lrpersonaid;
    }

    public long getLrgrupoasegid() {
        return lrgrupoasegid;
    }

    public void setLrgrupoasegid(long lrgrupoasegid) {
        this.lrgrupoasegid = lrgrupoasegid;
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
        hash += (int) lrgrupoasegid;
        hash += (int) lrpersonaid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrgrupoasegPK)) {
            return false;
        }
        LrgrupoasegPK other = (LrgrupoasegPK) object;
        if (this.lrgrupoasegid != other.lrgrupoasegid) {
            return false;
        }
        if (this.lrpersonaid != other.lrpersonaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrgrupoasegPK[ lrgrupoasegid=" + lrgrupoasegid + ", lrpersonaid=" + lrpersonaid + " ]";
    }
    
}
