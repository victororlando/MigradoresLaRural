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
public class LrgastoplanPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANID", nullable = false)
    private long lrparmcotiplanid;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANID", nullable = false)
    private long lrtipoplanid;
    @Basic(optional = false)
    @Column(name = "TIPOSSERVICIOSSECCID", nullable = false)
    private short tiposserviciosseccid;
    @Basic(optional = false)
    @Column(name = "PROVID", nullable = false)
    private int provid;
    @Basic(optional = false)
    @Column(name = "MONID", nullable = false)
    private short monid;

    public LrgastoplanPK() {
    }

    public LrgastoplanPK(long lrseccdetalleid, long lrparmcotiplanid, long lrtipoplanid, short tiposserviciosseccid, int provid, short monid) {
        this.lrseccdetalleid = lrseccdetalleid;
        this.lrparmcotiplanid = lrparmcotiplanid;
        this.lrtipoplanid = lrtipoplanid;
        this.tiposserviciosseccid = tiposserviciosseccid;
        this.provid = provid;
        this.monid = monid;
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

    public short getTiposserviciosseccid() {
        return tiposserviciosseccid;
    }

    public void setTiposserviciosseccid(short tiposserviciosseccid) {
        this.tiposserviciosseccid = tiposserviciosseccid;
    }

    public int getProvid() {
        return provid;
    }

    public void setProvid(int provid) {
        this.provid = provid;
    }

    public short getMonid() {
        return monid;
    }

    public void setMonid(short monid) {
        this.monid = monid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrseccdetalleid;
        hash += (int) lrparmcotiplanid;
        hash += (int) lrtipoplanid;
        hash += (int) tiposserviciosseccid;
        hash += (int) provid;
        hash += (int) monid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrgastoplanPK)) {
            return false;
        }
        LrgastoplanPK other = (LrgastoplanPK) object;
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        if (this.lrparmcotiplanid != other.lrparmcotiplanid) {
            return false;
        }
        if (this.lrtipoplanid != other.lrtipoplanid) {
            return false;
        }
        if (this.tiposserviciosseccid != other.tiposserviciosseccid) {
            return false;
        }
        if (this.provid != other.provid) {
            return false;
        }
        if (this.monid != other.monid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrgastoplanPK[ lrseccdetalleid=" + lrseccdetalleid + ", lrparmcotiplanid=" + lrparmcotiplanid + ", lrtipoplanid=" + lrtipoplanid + ", tiposserviciosseccid=" + tiposserviciosseccid + ", provid=" + provid + ", monid=" + monid + " ]";
    }
    
}
