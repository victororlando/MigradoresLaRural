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
public class LrfichaclientedocuPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRDOCUMENTOSCAUCIONID", nullable = false)
    private long lrdocumentoscaucionid;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEID", nullable = false)
    private long lrfichaclienteid;

    public LrfichaclientedocuPK() {
    }

    public LrfichaclientedocuPK(long lrdocumentoscaucionid, long lrfichaclienteid) {
        this.lrdocumentoscaucionid = lrdocumentoscaucionid;
        this.lrfichaclienteid = lrfichaclienteid;
    }

    public long getLrdocumentoscaucionid() {
        return lrdocumentoscaucionid;
    }

    public void setLrdocumentoscaucionid(long lrdocumentoscaucionid) {
        this.lrdocumentoscaucionid = lrdocumentoscaucionid;
    }

    public long getLrfichaclienteid() {
        return lrfichaclienteid;
    }

    public void setLrfichaclienteid(long lrfichaclienteid) {
        this.lrfichaclienteid = lrfichaclienteid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrdocumentoscaucionid;
        hash += (int) lrfichaclienteid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrfichaclientedocuPK)) {
            return false;
        }
        LrfichaclientedocuPK other = (LrfichaclientedocuPK) object;
        if (this.lrdocumentoscaucionid != other.lrdocumentoscaucionid) {
            return false;
        }
        if (this.lrfichaclienteid != other.lrfichaclienteid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrfichaclientedocuPK[ lrdocumentoscaucionid=" + lrdocumentoscaucionid + ", lrfichaclienteid=" + lrfichaclienteid + " ]";
    }
    
}
