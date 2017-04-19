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
public class LrareasubareaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRAREAID", nullable = false)
    private long lrareaid;
    @Basic(optional = false)
    @Column(name = "LRSUBAREAID", nullable = false)
    private long lrsubareaid;

    public LrareasubareaPK() {
    }

    public LrareasubareaPK(long lrareaid, long lrsubareaid) {
        this.lrareaid = lrareaid;
        this.lrsubareaid = lrsubareaid;
    }

    public long getLrareaid() {
        return lrareaid;
    }

    public void setLrareaid(long lrareaid) {
        this.lrareaid = lrareaid;
    }

    public long getLrsubareaid() {
        return lrsubareaid;
    }

    public void setLrsubareaid(long lrsubareaid) {
        this.lrsubareaid = lrsubareaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrareaid;
        hash += (int) lrsubareaid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrareasubareaPK)) {
            return false;
        }
        LrareasubareaPK other = (LrareasubareaPK) object;
        if (this.lrareaid != other.lrareaid) {
            return false;
        }
        if (this.lrsubareaid != other.lrsubareaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrareasubareaPK[ lrareaid=" + lrareaid + ", lrsubareaid=" + lrsubareaid + " ]";
    }
    
}
