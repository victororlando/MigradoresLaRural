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
public class LrplangrupvehigrupPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANGRUPID", nullable = false)
    private long lrtipoplangrupid;
    @Basic(optional = false)
    @Column(name = "VEHICULOSTIPGRUID", nullable = false)
    private long vehiculostipgruid;

    public LrplangrupvehigrupPK() {
    }

    public LrplangrupvehigrupPK(long lrtipoplangrupid, long vehiculostipgruid) {
        this.lrtipoplangrupid = lrtipoplangrupid;
        this.vehiculostipgruid = vehiculostipgruid;
    }

    public long getLrtipoplangrupid() {
        return lrtipoplangrupid;
    }

    public void setLrtipoplangrupid(long lrtipoplangrupid) {
        this.lrtipoplangrupid = lrtipoplangrupid;
    }

    public long getVehiculostipgruid() {
        return vehiculostipgruid;
    }

    public void setVehiculostipgruid(long vehiculostipgruid) {
        this.vehiculostipgruid = vehiculostipgruid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrtipoplangrupid;
        hash += (int) vehiculostipgruid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrplangrupvehigrupPK)) {
            return false;
        }
        LrplangrupvehigrupPK other = (LrplangrupvehigrupPK) object;
        if (this.lrtipoplangrupid != other.lrtipoplangrupid) {
            return false;
        }
        if (this.vehiculostipgruid != other.vehiculostipgruid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrplangrupvehigrupPK[ lrtipoplangrupid=" + lrtipoplangrupid + ", vehiculostipgruid=" + vehiculostipgruid + " ]";
    }
    
}
