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
public class LrcotiplanbienpremioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRTIPOPREMIOID", nullable = false)
    private long lrtipopremioid;
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
    @Column(name = "SCOTIZACIONVERSION", nullable = false)
    private long scotizacionversion;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONNRO", nullable = false)
    private long lrcotizacionnro;
    @Basic(optional = false)
    @Column(name = "SCOTIDATBIENASEID", nullable = false)
    private long scotidatbienaseid;

    public LrcotiplanbienpremioPK() {
    }

    public LrcotiplanbienpremioPK(long lrtipopremioid, long sseccdetalleid, long sparmcotiplanid, long stipoplanid, long scotizacionversion, long lrcotizacionnro, long scotidatbienaseid) {
        this.lrtipopremioid = lrtipopremioid;
        this.sseccdetalleid = sseccdetalleid;
        this.sparmcotiplanid = sparmcotiplanid;
        this.stipoplanid = stipoplanid;
        this.scotizacionversion = scotizacionversion;
        this.lrcotizacionnro = lrcotizacionnro;
        this.scotidatbienaseid = scotidatbienaseid;
    }

    public long getLrtipopremioid() {
        return lrtipopremioid;
    }

    public void setLrtipopremioid(long lrtipopremioid) {
        this.lrtipopremioid = lrtipopremioid;
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

    public long getScotizacionversion() {
        return scotizacionversion;
    }

    public void setScotizacionversion(long scotizacionversion) {
        this.scotizacionversion = scotizacionversion;
    }

    public long getLrcotizacionnro() {
        return lrcotizacionnro;
    }

    public void setLrcotizacionnro(long lrcotizacionnro) {
        this.lrcotizacionnro = lrcotizacionnro;
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
        hash += (int) lrtipopremioid;
        hash += (int) sseccdetalleid;
        hash += (int) sparmcotiplanid;
        hash += (int) stipoplanid;
        hash += (int) scotizacionversion;
        hash += (int) lrcotizacionnro;
        hash += (int) scotidatbienaseid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrcotiplanbienpremioPK)) {
            return false;
        }
        LrcotiplanbienpremioPK other = (LrcotiplanbienpremioPK) object;
        if (this.lrtipopremioid != other.lrtipopremioid) {
            return false;
        }
        if (this.sseccdetalleid != other.sseccdetalleid) {
            return false;
        }
        if (this.sparmcotiplanid != other.sparmcotiplanid) {
            return false;
        }
        if (this.stipoplanid != other.stipoplanid) {
            return false;
        }
        if (this.scotizacionversion != other.scotizacionversion) {
            return false;
        }
        if (this.lrcotizacionnro != other.lrcotizacionnro) {
            return false;
        }
        if (this.scotidatbienaseid != other.scotidatbienaseid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrcotiplanbienpremioPK[ lrtipopremioid=" + lrtipopremioid + ", sseccdetalleid=" + sseccdetalleid + ", sparmcotiplanid=" + sparmcotiplanid + ", stipoplanid=" + stipoplanid + ", scotizacionversion=" + scotizacionversion + ", lrcotizacionnro=" + lrcotizacionnro + ", scotidatbienaseid=" + scotidatbienaseid + " ]";
    }
    
}
