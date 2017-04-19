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
public class LrcontrolreaseguroPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RUBROSID", nullable = false)
    private long rubrosid;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOID", nullable = false)
    private long lrclasificacionriesgoid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREASEGUROCATID", nullable = false)
    private long lrcontrolreasegurocatid;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREASEGUROREACOAID", nullable = false)
    private short lrcontrolreaseguroreacoaid;
    @Basic(optional = false)
    @Column(name = "LRCONTROLREASEGUROMONID", nullable = false)
    private short lrcontrolreaseguromonid;

    public LrcontrolreaseguroPK() {
    }

    public LrcontrolreaseguroPK(long rubrosid, long lrclasificacionriesgoid, long lrseccdetalleid, long lrcontrolreasegurocatid, short lrcontrolreaseguroreacoaid, short lrcontrolreaseguromonid) {
        this.rubrosid = rubrosid;
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
        this.lrseccdetalleid = lrseccdetalleid;
        this.lrcontrolreasegurocatid = lrcontrolreasegurocatid;
        this.lrcontrolreaseguroreacoaid = lrcontrolreaseguroreacoaid;
        this.lrcontrolreaseguromonid = lrcontrolreaseguromonid;
    }

    public long getRubrosid() {
        return rubrosid;
    }

    public void setRubrosid(long rubrosid) {
        this.rubrosid = rubrosid;
    }

    public long getLrclasificacionriesgoid() {
        return lrclasificacionriesgoid;
    }

    public void setLrclasificacionriesgoid(long lrclasificacionriesgoid) {
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
    }

    public long getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(long lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public long getLrcontrolreasegurocatid() {
        return lrcontrolreasegurocatid;
    }

    public void setLrcontrolreasegurocatid(long lrcontrolreasegurocatid) {
        this.lrcontrolreasegurocatid = lrcontrolreasegurocatid;
    }

    public short getLrcontrolreaseguroreacoaid() {
        return lrcontrolreaseguroreacoaid;
    }

    public void setLrcontrolreaseguroreacoaid(short lrcontrolreaseguroreacoaid) {
        this.lrcontrolreaseguroreacoaid = lrcontrolreaseguroreacoaid;
    }

    public short getLrcontrolreaseguromonid() {
        return lrcontrolreaseguromonid;
    }

    public void setLrcontrolreaseguromonid(short lrcontrolreaseguromonid) {
        this.lrcontrolreaseguromonid = lrcontrolreaseguromonid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rubrosid;
        hash += (int) lrclasificacionriesgoid;
        hash += (int) lrseccdetalleid;
        hash += (int) lrcontrolreasegurocatid;
        hash += (int) lrcontrolreaseguroreacoaid;
        hash += (int) lrcontrolreaseguromonid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrcontrolreaseguroPK)) {
            return false;
        }
        LrcontrolreaseguroPK other = (LrcontrolreaseguroPK) object;
        if (this.rubrosid != other.rubrosid) {
            return false;
        }
        if (this.lrclasificacionriesgoid != other.lrclasificacionriesgoid) {
            return false;
        }
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        if (this.lrcontrolreasegurocatid != other.lrcontrolreasegurocatid) {
            return false;
        }
        if (this.lrcontrolreaseguroreacoaid != other.lrcontrolreaseguroreacoaid) {
            return false;
        }
        if (this.lrcontrolreaseguromonid != other.lrcontrolreaseguromonid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrcontrolreaseguroPK[ rubrosid=" + rubrosid + ", lrclasificacionriesgoid=" + lrclasificacionriesgoid + ", lrseccdetalleid=" + lrseccdetalleid + ", lrcontrolreasegurocatid=" + lrcontrolreasegurocatid + ", lrcontrolreaseguroreacoaid=" + lrcontrolreaseguroreacoaid + ", lrcontrolreaseguromonid=" + lrcontrolreaseguromonid + " ]";
    }
    
}
