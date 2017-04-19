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
public class LrusuperfilesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSID", nullable = false, length = 30)
    private String lrusuariosid;
    @Basic(optional = false)
    @Column(name = "LRPERFILESID", nullable = false)
    private long lrperfilesid;

    public LrusuperfilesPK() {
    }

    public LrusuperfilesPK(String lrusuariosid, long lrperfilesid) {
        this.lrusuariosid = lrusuariosid;
        this.lrperfilesid = lrperfilesid;
    }

    public String getLrusuariosid() {
        return lrusuariosid;
    }

    public void setLrusuariosid(String lrusuariosid) {
        this.lrusuariosid = lrusuariosid;
    }

    public long getLrperfilesid() {
        return lrperfilesid;
    }

    public void setLrperfilesid(long lrperfilesid) {
        this.lrperfilesid = lrperfilesid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrusuariosid != null ? lrusuariosid.hashCode() : 0);
        hash += (int) lrperfilesid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrusuperfilesPK)) {
            return false;
        }
        LrusuperfilesPK other = (LrusuperfilesPK) object;
        if ((this.lrusuariosid == null && other.lrusuariosid != null) || (this.lrusuariosid != null && !this.lrusuariosid.equals(other.lrusuariosid))) {
            return false;
        }
        if (this.lrperfilesid != other.lrperfilesid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrusuperfilesPK[ lrusuariosid=" + lrusuariosid + ", lrperfilesid=" + lrperfilesid + " ]";
    }
    
}
