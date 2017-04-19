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
public class LrflujoreglasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRFLUJOREGLASID", nullable = false)
    private long lrflujoreglasid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;

    public LrflujoreglasPK() {
    }

    public LrflujoreglasPK(long lrflujoreglasid, long lrseccdetalleid) {
        this.lrflujoreglasid = lrflujoreglasid;
        this.lrseccdetalleid = lrseccdetalleid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrflujoreglasid;
        hash += (int) lrseccdetalleid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrflujoreglasPK)) {
            return false;
        }
        LrflujoreglasPK other = (LrflujoreglasPK) object;
        if (this.lrflujoreglasid != other.lrflujoreglasid) {
            return false;
        }
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrflujoreglasPK[ lrflujoreglasid=" + lrflujoreglasid + ", lrseccdetalleid=" + lrseccdetalleid + " ]";
    }
    
}
