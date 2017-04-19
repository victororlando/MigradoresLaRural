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
public class LrcotizacionplanPK implements Serializable {
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
    @Column(name = "LRCOTIZACIONVERSION", nullable = false)
    private long lrcotizacionversion;

    public LrcotizacionplanPK() {
    }

    public LrcotizacionplanPK(long sseccdetalleid, long sparmcotiplanid, long stipoplanid, long lrcotizacionnro, long lrcotizacionversion) {
        this.sseccdetalleid = sseccdetalleid;
        this.sparmcotiplanid = sparmcotiplanid;
        this.stipoplanid = stipoplanid;
        this.lrcotizacionnro = lrcotizacionnro;
        this.lrcotizacionversion = lrcotizacionversion;
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

    public long getLrcotizacionversion() {
        return lrcotizacionversion;
    }

    public void setLrcotizacionversion(long lrcotizacionversion) {
        this.lrcotizacionversion = lrcotizacionversion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) sseccdetalleid;
        hash += (int) sparmcotiplanid;
        hash += (int) stipoplanid;
        hash += (int) lrcotizacionnro;
        hash += (int) lrcotizacionversion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrcotizacionplanPK)) {
            return false;
        }
        LrcotizacionplanPK other = (LrcotizacionplanPK) object;
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
        if (this.lrcotizacionversion != other.lrcotizacionversion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrcotizacionplanPK[ sseccdetalleid=" + sseccdetalleid + ", sparmcotiplanid=" + sparmcotiplanid + ", stipoplanid=" + stipoplanid + ", lrcotizacionnro=" + lrcotizacionnro + ", lrcotizacionversion=" + lrcotizacionversion + " ]";
    }
    
}
