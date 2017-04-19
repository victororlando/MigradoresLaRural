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
public class LrprovservtipoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRTIPOAJUSTEID", nullable = false)
    private long lrtipoajusteid;
    @Basic(optional = false)
    @Column(name = "TIPOSSERVICIOSSECCID", nullable = false)
    private short tiposserviciosseccid;
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;
    @Basic(optional = false)
    @Column(name = "PROVID", nullable = false)
    private int provid;

    public LrprovservtipoPK() {
    }

    public LrprovservtipoPK(long lrtipoajusteid, short tiposserviciosseccid, short seccid, int provid) {
        this.lrtipoajusteid = lrtipoajusteid;
        this.tiposserviciosseccid = tiposserviciosseccid;
        this.seccid = seccid;
        this.provid = provid;
    }

    public long getLrtipoajusteid() {
        return lrtipoajusteid;
    }

    public void setLrtipoajusteid(long lrtipoajusteid) {
        this.lrtipoajusteid = lrtipoajusteid;
    }

    public short getTiposserviciosseccid() {
        return tiposserviciosseccid;
    }

    public void setTiposserviciosseccid(short tiposserviciosseccid) {
        this.tiposserviciosseccid = tiposserviciosseccid;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    public int getProvid() {
        return provid;
    }

    public void setProvid(int provid) {
        this.provid = provid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrtipoajusteid;
        hash += (int) tiposserviciosseccid;
        hash += (int) seccid;
        hash += (int) provid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrprovservtipoPK)) {
            return false;
        }
        LrprovservtipoPK other = (LrprovservtipoPK) object;
        if (this.lrtipoajusteid != other.lrtipoajusteid) {
            return false;
        }
        if (this.tiposserviciosseccid != other.tiposserviciosseccid) {
            return false;
        }
        if (this.seccid != other.seccid) {
            return false;
        }
        if (this.provid != other.provid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrprovservtipoPK[ lrtipoajusteid=" + lrtipoajusteid + ", tiposserviciosseccid=" + tiposserviciosseccid + ", seccid=" + seccid + ", provid=" + provid + " ]";
    }
    
}
