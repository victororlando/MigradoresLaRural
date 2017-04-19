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
public class LrobjperfPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRPERFILESID", nullable = false)
    private long lrperfilesid;
    @Basic(optional = false)
    @Column(name = "LROBJETOSID", nullable = false)
    private long lrobjetosid;

    public LrobjperfPK() {
    }

    public LrobjperfPK(long lrperfilesid, long lrobjetosid) {
        this.lrperfilesid = lrperfilesid;
        this.lrobjetosid = lrobjetosid;
    }

    public long getLrperfilesid() {
        return lrperfilesid;
    }

    public void setLrperfilesid(long lrperfilesid) {
        this.lrperfilesid = lrperfilesid;
    }

    public long getLrobjetosid() {
        return lrobjetosid;
    }

    public void setLrobjetosid(long lrobjetosid) {
        this.lrobjetosid = lrobjetosid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrperfilesid;
        hash += (int) lrobjetosid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrobjperfPK)) {
            return false;
        }
        LrobjperfPK other = (LrobjperfPK) object;
        if (this.lrperfilesid != other.lrperfilesid) {
            return false;
        }
        if (this.lrobjetosid != other.lrobjetosid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrobjperfPK[ lrperfilesid=" + lrperfilesid + ", lrobjetosid=" + lrobjetosid + " ]";
    }
    
}
