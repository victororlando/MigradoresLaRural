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
public class LrparmcotireglasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MONID", nullable = false)
    private short monid;
    @Basic(optional = false)
    @Column(name = "LRPARMITEMID", nullable = false)
    private long lrparmitemid;
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
    @Column(name = "LRAGRUPAIMPRESIONID", nullable = false)
    private long lragrupaimpresionid;

    public LrparmcotireglasPK() {
    }

    public LrparmcotireglasPK(short monid, long lrparmitemid, long lrseccdetalleid, long lrparmcotiplanid, long lrtipoplanid, long lragrupaimpresionid) {
        this.monid = monid;
        this.lrparmitemid = lrparmitemid;
        this.lrseccdetalleid = lrseccdetalleid;
        this.lrparmcotiplanid = lrparmcotiplanid;
        this.lrtipoplanid = lrtipoplanid;
        this.lragrupaimpresionid = lragrupaimpresionid;
    }

    public short getMonid() {
        return monid;
    }

    public void setMonid(short monid) {
        this.monid = monid;
    }

    public long getLrparmitemid() {
        return lrparmitemid;
    }

    public void setLrparmitemid(long lrparmitemid) {
        this.lrparmitemid = lrparmitemid;
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

    public long getLragrupaimpresionid() {
        return lragrupaimpresionid;
    }

    public void setLragrupaimpresionid(long lragrupaimpresionid) {
        this.lragrupaimpresionid = lragrupaimpresionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) monid;
        hash += (int) lrparmitemid;
        hash += (int) lrseccdetalleid;
        hash += (int) lrparmcotiplanid;
        hash += (int) lrtipoplanid;
        hash += (int) lragrupaimpresionid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrparmcotireglasPK)) {
            return false;
        }
        LrparmcotireglasPK other = (LrparmcotireglasPK) object;
        if (this.monid != other.monid) {
            return false;
        }
        if (this.lrparmitemid != other.lrparmitemid) {
            return false;
        }
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        if (this.lrparmcotiplanid != other.lrparmcotiplanid) {
            return false;
        }
        if (this.lrtipoplanid != other.lrtipoplanid) {
            return false;
        }
        if (this.lragrupaimpresionid != other.lragrupaimpresionid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrparmcotireglasPK[ monid=" + monid + ", lrparmitemid=" + lrparmitemid + ", lrseccdetalleid=" + lrseccdetalleid + ", lrparmcotiplanid=" + lrparmcotiplanid + ", lrtipoplanid=" + lrtipoplanid + ", lragrupaimpresionid=" + lragrupaimpresionid + " ]";
    }
    
}
