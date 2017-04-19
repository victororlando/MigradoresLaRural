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
public class LrcotiplanmotivoajustePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCID", nullable = false)
    private long lrcotiplanbiendescid;
    @Basic(optional = false)
    @Column(name = "LRMOTIVOAJUSTEID", nullable = false)
    private long lrmotivoajusteid;

    public LrcotiplanmotivoajustePK() {
    }

    public LrcotiplanmotivoajustePK(long lrcotiplanbiendescid, long lrmotivoajusteid) {
        this.lrcotiplanbiendescid = lrcotiplanbiendescid;
        this.lrmotivoajusteid = lrmotivoajusteid;
    }

    public long getLrcotiplanbiendescid() {
        return lrcotiplanbiendescid;
    }

    public void setLrcotiplanbiendescid(long lrcotiplanbiendescid) {
        this.lrcotiplanbiendescid = lrcotiplanbiendescid;
    }

    public long getLrmotivoajusteid() {
        return lrmotivoajusteid;
    }

    public void setLrmotivoajusteid(long lrmotivoajusteid) {
        this.lrmotivoajusteid = lrmotivoajusteid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrcotiplanbiendescid;
        hash += (int) lrmotivoajusteid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrcotiplanmotivoajustePK)) {
            return false;
        }
        LrcotiplanmotivoajustePK other = (LrcotiplanmotivoajustePK) object;
        if (this.lrcotiplanbiendescid != other.lrcotiplanbiendescid) {
            return false;
        }
        if (this.lrmotivoajusteid != other.lrmotivoajusteid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrcotiplanmotivoajustePK[ lrcotiplanbiendescid=" + lrcotiplanbiendescid + ", lrmotivoajusteid=" + lrmotivoajusteid + " ]";
    }
    
}
