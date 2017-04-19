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
public class LrmatrizpuntajePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRCALIFICACIONRIESGOID", nullable = false)
    private long lrcalificacionriesgoid;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOID", nullable = false)
    private long lrclasificacionriesgoid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;

    public LrmatrizpuntajePK() {
    }

    public LrmatrizpuntajePK(long lrcalificacionriesgoid, long lrclasificacionriesgoid, long lrseccdetalleid) {
        this.lrcalificacionriesgoid = lrcalificacionriesgoid;
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public long getLrcalificacionriesgoid() {
        return lrcalificacionriesgoid;
    }

    public void setLrcalificacionriesgoid(long lrcalificacionriesgoid) {
        this.lrcalificacionriesgoid = lrcalificacionriesgoid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrcalificacionriesgoid;
        hash += (int) lrclasificacionriesgoid;
        hash += (int) lrseccdetalleid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrmatrizpuntajePK)) {
            return false;
        }
        LrmatrizpuntajePK other = (LrmatrizpuntajePK) object;
        if (this.lrcalificacionriesgoid != other.lrcalificacionriesgoid) {
            return false;
        }
        if (this.lrclasificacionriesgoid != other.lrclasificacionriesgoid) {
            return false;
        }
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrmatrizpuntajePK[ lrcalificacionriesgoid=" + lrcalificacionriesgoid + ", lrclasificacionriesgoid=" + lrclasificacionriesgoid + ", lrseccdetalleid=" + lrseccdetalleid + " ]";
    }
    
}
