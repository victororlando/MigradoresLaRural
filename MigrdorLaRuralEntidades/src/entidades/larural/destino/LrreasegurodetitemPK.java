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
public class LrreasegurodetitemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RIESGOSASEID", nullable = false)
    private short riesgosaseid;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETID", nullable = false)
    private long lrreasegurodetid;

    public LrreasegurodetitemPK() {
    }

    public LrreasegurodetitemPK(short riesgosaseid, long lrreasegurodetid) {
        this.riesgosaseid = riesgosaseid;
        this.lrreasegurodetid = lrreasegurodetid;
    }

    public short getRiesgosaseid() {
        return riesgosaseid;
    }

    public void setRiesgosaseid(short riesgosaseid) {
        this.riesgosaseid = riesgosaseid;
    }

    public long getLrreasegurodetid() {
        return lrreasegurodetid;
    }

    public void setLrreasegurodetid(long lrreasegurodetid) {
        this.lrreasegurodetid = lrreasegurodetid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) riesgosaseid;
        hash += (int) lrreasegurodetid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrreasegurodetitemPK)) {
            return false;
        }
        LrreasegurodetitemPK other = (LrreasegurodetitemPK) object;
        if (this.riesgosaseid != other.riesgosaseid) {
            return false;
        }
        if (this.lrreasegurodetid != other.lrreasegurodetid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrreasegurodetitemPK[ riesgosaseid=" + riesgosaseid + ", lrreasegurodetid=" + lrreasegurodetid + " ]";
    }
    
}
