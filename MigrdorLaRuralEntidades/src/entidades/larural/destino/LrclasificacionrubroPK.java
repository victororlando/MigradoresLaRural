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
public class LrclasificacionrubroPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RUBROSID", nullable = false)
    private short rubrosid;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOID", nullable = false)
    private long lrclasificacionriesgoid;

    public LrclasificacionrubroPK() {
    }

    public LrclasificacionrubroPK(short rubrosid, long lrclasificacionriesgoid) {
        this.rubrosid = rubrosid;
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
    }

    public short getRubrosid() {
        return rubrosid;
    }

    public void setRubrosid(short rubrosid) {
        this.rubrosid = rubrosid;
    }

    public long getLrclasificacionriesgoid() {
        return lrclasificacionriesgoid;
    }

    public void setLrclasificacionriesgoid(long lrclasificacionriesgoid) {
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rubrosid;
        hash += (int) lrclasificacionriesgoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrclasificacionrubroPK)) {
            return false;
        }
        LrclasificacionrubroPK other = (LrclasificacionrubroPK) object;
        if (this.rubrosid != other.rubrosid) {
            return false;
        }
        if (this.lrclasificacionriesgoid != other.lrclasificacionriesgoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrclasificacionrubroPK[ rubrosid=" + rubrosid + ", lrclasificacionriesgoid=" + lrclasificacionriesgoid + " ]";
    }
    
}
