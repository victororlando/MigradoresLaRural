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
public class LrflujoreglasdetPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASID", nullable = false)
    private long lrflujoreglasid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASDETID", nullable = false)
    private long lrflujoreglasdetid;

    public LrflujoreglasdetPK() {
    }

    public LrflujoreglasdetPK(long lrflujoreglasid, long lrseccdetalleid, long lrflujoreglasdetid) {
        this.lrflujoreglasid = lrflujoreglasid;
        this.lrseccdetalleid = lrseccdetalleid;
        this.lrflujoreglasdetid = lrflujoreglasdetid;
    }

    public long getLrflujoreglasid() {
        return lrflujoreglasid;
    }

    public void setLrflujoreglasid(long lrflujoreglasid) {
        this.lrflujoreglasid = lrflujoreglasid;
    }

    public long getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(long lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public long getLrflujoreglasdetid() {
        return lrflujoreglasdetid;
    }

    public void setLrflujoreglasdetid(long lrflujoreglasdetid) {
        this.lrflujoreglasdetid = lrflujoreglasdetid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrflujoreglasid;
        hash += (int) lrseccdetalleid;
        hash += (int) lrflujoreglasdetid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrflujoreglasdetPK)) {
            return false;
        }
        LrflujoreglasdetPK other = (LrflujoreglasdetPK) object;
        if (this.lrflujoreglasid != other.lrflujoreglasid) {
            return false;
        }
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        if (this.lrflujoreglasdetid != other.lrflujoreglasdetid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrflujoreglasdetPK[ lrflujoreglasid=" + lrflujoreglasid + ", lrseccdetalleid=" + lrseccdetalleid + ", lrflujoreglasdetid=" + lrflujoreglasdetid + " ]";
    }
    
}
