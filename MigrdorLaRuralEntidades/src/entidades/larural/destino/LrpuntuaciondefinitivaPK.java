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
public class LrpuntuaciondefinitivaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRAREAID", nullable = false)
    private long lrareaid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAFORMULARIOID", nullable = false)
    private long lragrupaformularioid;
    @Basic(optional = false)
    @Column(name = "LRCALIFICACIONRIESGOID", nullable = false)
    private long lrcalificacionriesgoid;

    public LrpuntuaciondefinitivaPK() {
    }

    public LrpuntuaciondefinitivaPK(long lrareaid, long lrseccdetalleid, long lragrupaformularioid, long lrcalificacionriesgoid) {
        this.lrareaid = lrareaid;
        this.lrseccdetalleid = lrseccdetalleid;
        this.lragrupaformularioid = lragrupaformularioid;
        this.lrcalificacionriesgoid = lrcalificacionriesgoid;
    }

    public long getLrareaid() {
        return lrareaid;
    }

    public void setLrareaid(long lrareaid) {
        this.lrareaid = lrareaid;
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

    public long getLrcalificacionriesgoid() {
        return lrcalificacionriesgoid;
    }

    public void setLrcalificacionriesgoid(long lrcalificacionriesgoid) {
        this.lrcalificacionriesgoid = lrcalificacionriesgoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrareaid;
        hash += (int) lrseccdetalleid;
        hash += (int) lragrupaformularioid;
        hash += (int) lrcalificacionriesgoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrpuntuaciondefinitivaPK)) {
            return false;
        }
        LrpuntuaciondefinitivaPK other = (LrpuntuaciondefinitivaPK) object;
        if (this.lrareaid != other.lrareaid) {
            return false;
        }
        if (this.lrseccdetalleid != other.lrseccdetalleid) {
            return false;
        }
        if (this.lragrupaformularioid != other.lragrupaformularioid) {
            return false;
        }
        if (this.lrcalificacionriesgoid != other.lrcalificacionriesgoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrpuntuaciondefinitivaPK[ lrareaid=" + lrareaid + ", lrseccdetalleid=" + lrseccdetalleid + ", lragrupaformularioid=" + lragrupaformularioid + ", lrcalificacionriesgoid=" + lrcalificacionriesgoid + " ]";
    }
    
}
