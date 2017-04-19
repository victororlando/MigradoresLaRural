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
public class LrcotiplanbienPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SSECCDETALLEID", nullable = false)
    private long sseccdetalleid;
    @Basic(optional = false)
    @Column(name = "SPARMCOTIPLANID", nullable = false)
    private long sparmcotiplanid;
    @Basic(optional = false)
    @Column(name = "STIPOPLANID", nullable = false)
    private long stipoplanid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONNRO", nullable = false)
    private long lrcotizacionnro;
    @Basic(optional = false)
    @Column(name = "SCOTIZACIONVERSION", nullable = false)
    private long scotizacionversion;
    @Basic(optional = false)
    @Column(name = "SCOTIDATBIENASEID", nullable = false)
    private long scotidatbienaseid;

    public LrcotiplanbienPK() {
    }

    public LrcotiplanbienPK(long sseccdetalleid, long sparmcotiplanid, long stipoplanid, long lrcotizacionnro, long scotizacionversion, long scotidatbienaseid) {
        this.sseccdetalleid = sseccdetalleid;
        this.sparmcotiplanid = sparmcotiplanid;
        this.stipoplanid = stipoplanid;
        this.lrcotizacionnro = lrcotizacionnro;
        this.scotizacionversion = scotizacionversion;
        this.scotidatbienaseid = scotidatbienaseid;
    }

    public long getSseccdetalleid() {
        return sseccdetalleid;
    }

    public void setSseccdetalleid(long sseccdetalleid) {
        this.sseccdetalleid = sseccdetalleid;
    }

    public long getSparmcotiplanid() {
        return sparmcotiplanid;
    }

    public void setSparmcotiplanid(long sparmcotiplanid) {
        this.sparmcotiplanid = sparmcotiplanid;
    }

    public long getStipoplanid() {
        return stipoplanid;
    }

    public void setStipoplanid(long stipoplanid) {
        this.stipoplanid = stipoplanid;
    }

    public long getLrcotizacionnro() {
        return lrcotizacionnro;
    }

    public void setLrcotizacionnro(long lrcotizacionnro) {
        this.lrcotizacionnro = lrcotizacionnro;
    }

    public long getScotizacionversion() {
        return scotizacionversion;
    }

    public void setScotizacionversion(long scotizacionversion) {
        this.scotizacionversion = scotizacionversion;
    }

    public long getScotidatbienaseid() {
        return scotidatbienaseid;
    }

    public void setScotidatbienaseid(long scotidatbienaseid) {
        this.scotidatbienaseid = scotidatbienaseid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) sseccdetalleid;
        hash += (int) sparmcotiplanid;
        hash += (int) stipoplanid;
        hash += (int) lrcotizacionnro;
        hash += (int) scotizacionversion;
        hash += (int) scotidatbienaseid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrcotiplanbienPK)) {
            return false;
        }
        LrcotiplanbienPK other = (LrcotiplanbienPK) object;
        if (this.sseccdetalleid != other.sseccdetalleid) {
            return false;
        }
        if (this.sparmcotiplanid != other.sparmcotiplanid) {
            return false;
        }
        if (this.stipoplanid != other.stipoplanid) {
            return false;
        }
        if (this.lrcotizacionnro != other.lrcotizacionnro) {
            return false;
        }
        if (this.scotizacionversion != other.scotizacionversion) {
            return false;
        }
        if (this.scotidatbienaseid != other.scotidatbienaseid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrcotiplanbienPK[ sseccdetalleid=" + sseccdetalleid + ", sparmcotiplanid=" + sparmcotiplanid + ", stipoplanid=" + stipoplanid + ", lrcotizacionnro=" + lrcotizacionnro + ", scotizacionversion=" + scotizacionversion + ", scotidatbienaseid=" + scotidatbienaseid + " ]";
    }
    
}
