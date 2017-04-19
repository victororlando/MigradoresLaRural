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
public class LrparmcotidetperfilesusuPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIDETPERFILESID", nullable = false)
    private long lrparmcotidetperfilesid;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSID", nullable = false, length = 30)
    private String lrusuariosid;

    public LrparmcotidetperfilesusuPK() {
    }

    public LrparmcotidetperfilesusuPK(long lrparmcotidetperfilesid, String lrusuariosid) {
        this.lrparmcotidetperfilesid = lrparmcotidetperfilesid;
        this.lrusuariosid = lrusuariosid;
    }

    public long getLrparmcotidetperfilesid() {
        return lrparmcotidetperfilesid;
    }

    public void setLrparmcotidetperfilesid(long lrparmcotidetperfilesid) {
        this.lrparmcotidetperfilesid = lrparmcotidetperfilesid;
    }

    public String getLrusuariosid() {
        return lrusuariosid;
    }

    public void setLrusuariosid(String lrusuariosid) {
        this.lrusuariosid = lrusuariosid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrparmcotidetperfilesid;
        hash += (lrusuariosid != null ? lrusuariosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrparmcotidetperfilesusuPK)) {
            return false;
        }
        LrparmcotidetperfilesusuPK other = (LrparmcotidetperfilesusuPK) object;
        if (this.lrparmcotidetperfilesid != other.lrparmcotidetperfilesid) {
            return false;
        }
        if ((this.lrusuariosid == null && other.lrusuariosid != null) || (this.lrusuariosid != null && !this.lrusuariosid.equals(other.lrusuariosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrparmcotidetperfilesusuPK[ lrparmcotidetperfilesid=" + lrparmcotidetperfilesid + ", lrusuariosid=" + lrusuariosid + " ]";
    }
    
}
