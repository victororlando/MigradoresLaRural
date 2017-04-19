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
public class LrcoberturaclasifPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOID", nullable = false)
    private long lrclasificacionriesgoid;
    @Basic(optional = false)
    @Column(name = "COBERTURASTIPID", nullable = false)
    private short coberturastipid;
    @Basic(optional = false)
    @Column(name = "RIESGOSASEID", nullable = false)
    private short riesgosaseid;

    public LrcoberturaclasifPK() {
    }

    public LrcoberturaclasifPK(short seccid, long lrclasificacionriesgoid, short coberturastipid, short riesgosaseid) {
        this.seccid = seccid;
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
        this.coberturastipid = coberturastipid;
        this.riesgosaseid = riesgosaseid;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    public long getLrclasificacionriesgoid() {
        return lrclasificacionriesgoid;
    }

    public void setLrclasificacionriesgoid(long lrclasificacionriesgoid) {
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
    }

    public short getCoberturastipid() {
        return coberturastipid;
    }

    public void setCoberturastipid(short coberturastipid) {
        this.coberturastipid = coberturastipid;
    }

    public short getRiesgosaseid() {
        return riesgosaseid;
    }

    public void setRiesgosaseid(short riesgosaseid) {
        this.riesgosaseid = riesgosaseid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) seccid;
        hash += (int) lrclasificacionriesgoid;
        hash += (int) coberturastipid;
        hash += (int) riesgosaseid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrcoberturaclasifPK)) {
            return false;
        }
        LrcoberturaclasifPK other = (LrcoberturaclasifPK) object;
        if (this.seccid != other.seccid) {
            return false;
        }
        if (this.lrclasificacionriesgoid != other.lrclasificacionriesgoid) {
            return false;
        }
        if (this.coberturastipid != other.coberturastipid) {
            return false;
        }
        if (this.riesgosaseid != other.riesgosaseid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrcoberturaclasifPK[ seccid=" + seccid + ", lrclasificacionriesgoid=" + lrclasificacionriesgoid + ", coberturastipid=" + coberturastipid + ", riesgosaseid=" + riesgosaseid + " ]";
    }
    
}
