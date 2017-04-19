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
public class LrtasarubroriesgoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOID", nullable = false)
    private long lrclasificacionriesgoid;
    @Basic(optional = false)
    @Column(name = "RUBROSID", nullable = false)
    private long rubrosid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;

    public LrtasarubroriesgoPK() {
    }

    public LrtasarubroriesgoPK(long lrclasificacionriesgoid, long rubrosid, long lrseccdetalleid) {
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
        this.rubrosid = rubrosid;
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public long getLrclasificacionriesgoid() {
        return lrclasificacionriesgoid;
    }

    public void setLrclasificacionriesgoid(long lrclasificacionriesgoid) {
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
    }

    public long getRubrosid() {
        return rubrosid;
    }

    public void setRubrosid(long rubrosid) {
        this.rubrosid = rubrosid;
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
        hash += (int) lrclasificacionriesgoid;
        hash += (int) rubrosid;
        hash += (int) lrseccdetalleid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrtasarubroriesgoPK)) {
            return false;
        }
        LrtasarubroriesgoPK other = (LrtasarubroriesgoPK) object;
        if (this.lrclasificacionriesgoid != other.lrclasificacionriesgoid) {
            return false;
        }
        if (this.rubrosid != other.rubrosid) {
            return false;
        }
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrtasarubroriesgoPK[ lrclasificacionriesgoid=" + lrclasificacionriesgoid + ", rubrosid=" + rubrosid + ", lrseccdetalleid=" + lrseccdetalleid + " ]";
    }
    
}
