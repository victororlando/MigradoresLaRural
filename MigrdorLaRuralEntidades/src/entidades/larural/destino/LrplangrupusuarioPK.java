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
public class LrplangrupusuarioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANGRUPID", nullable = false)
    private long lrtipoplangrupid;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSID", nullable = false, length = 30)
    private String lrusuariosid;

    public LrplangrupusuarioPK() {
    }

    public LrplangrupusuarioPK(long lrtipoplangrupid, String lrusuariosid) {
        this.lrtipoplangrupid = lrtipoplangrupid;
        this.lrusuariosid = lrusuariosid;
    }

    public long getLrtipoplangrupid() {
        return lrtipoplangrupid;
    }

    public void setLrtipoplangrupid(long lrtipoplangrupid) {
        this.lrtipoplangrupid = lrtipoplangrupid;
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
        hash += (int) lrtipoplangrupid;
        hash += (lrusuariosid != null ? lrusuariosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrplangrupusuarioPK)) {
            return false;
        }
        LrplangrupusuarioPK other = (LrplangrupusuarioPK) object;
        if (this.lrtipoplangrupid != other.lrtipoplangrupid) {
            return false;
        }
        if ((this.lrusuariosid == null && other.lrusuariosid != null) || (this.lrusuariosid != null && !this.lrusuariosid.equals(other.lrusuariosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrplangrupusuarioPK[ lrtipoplangrupid=" + lrtipoplangrupid + ", lrusuariosid=" + lrusuariosid + " ]";
    }
    
}
