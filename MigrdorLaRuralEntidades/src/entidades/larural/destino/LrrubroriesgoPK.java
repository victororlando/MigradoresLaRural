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
public class LrrubroriesgoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RIESGOSASEID", nullable = false)
    private short riesgosaseid;
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;
    @Basic(optional = false)
    @Column(name = "RUBROSID", nullable = false)
    private long rubrosid;

    public LrrubroriesgoPK() {
    }

    public LrrubroriesgoPK(short riesgosaseid, short seccid, long rubrosid) {
        this.riesgosaseid = riesgosaseid;
        this.seccid = seccid;
        this.rubrosid = rubrosid;
    }

    public short getRiesgosaseid() {
        return riesgosaseid;
    }

    public void setRiesgosaseid(short riesgosaseid) {
        this.riesgosaseid = riesgosaseid;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    public long getRubrosid() {
        return rubrosid;
    }

    public void setRubrosid(long rubrosid) {
        this.rubrosid = rubrosid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) riesgosaseid;
        hash += (int) seccid;
        hash += (int) rubrosid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrrubroriesgoPK)) {
            return false;
        }
        LrrubroriesgoPK other = (LrrubroriesgoPK) object;
        if (this.riesgosaseid != other.riesgosaseid) {
            return false;
        }
        if (this.seccid != other.seccid) {
            return false;
        }
        if (this.rubrosid != other.rubrosid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrrubroriesgoPK[ riesgosaseid=" + riesgosaseid + ", seccid=" + seccid + ", rubrosid=" + rubrosid + " ]";
    }
    
}
