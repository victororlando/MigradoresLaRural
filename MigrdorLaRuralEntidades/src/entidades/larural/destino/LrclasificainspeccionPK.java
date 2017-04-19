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
public class LrclasificainspeccionPK implements Serializable {
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
    @Column(name = "LRAGRUPAFORMULARIOID", nullable = false)
    private long lragrupaformularioid;

    public LrclasificainspeccionPK() {
    }

    public LrclasificainspeccionPK(long rubrosid, long lrclasificacionriesgoid, long lrseccdetalleid, long lragrupaformularioid) {
        this.rubrosid = rubrosid;
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
        this.lrseccdetalleid = lrseccdetalleid;
        this.lragrupaformularioid = lragrupaformularioid;
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

    public long getLragrupaformularioid() {
        return lragrupaformularioid;
    }

    public void setLragrupaformularioid(long lragrupaformularioid) {
        this.lragrupaformularioid = lragrupaformularioid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rubrosid;
        hash += (int) lrclasificacionriesgoid;
        hash += (int) lrseccdetalleid;
        hash += (int) lragrupaformularioid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrclasificainspeccionPK)) {
            return false;
        }
        LrclasificainspeccionPK other = (LrclasificainspeccionPK) object;
        if (this.rubrosid != other.rubrosid) {
            return false;
        }
        if (this.lrclasificacionriesgoid != other.lrclasificacionriesgoid) {
            return false;
        }
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        if (this.lragrupaformularioid != other.lragrupaformularioid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrclasificainspeccionPK[ rubrosid=" + rubrosid + ", lrclasificacionriesgoid=" + lrclasificacionriesgoid + ", lrseccdetalleid=" + lrseccdetalleid + ", lragrupaformularioid=" + lragrupaformularioid + " ]";
    }
    
}
