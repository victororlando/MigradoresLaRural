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
public class LragruparubroPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARUBROID", nullable = false)
    private long lrcategoriarubroid;
    @Basic(optional = false)
    @Column(name = "RUBROSID", nullable = false)
    private long rubrosid;

    public LragruparubroPK() {
    }

    public LragruparubroPK(long lrcategoriarubroid, long rubrosid) {
        this.lrcategoriarubroid = lrcategoriarubroid;
        this.rubrosid = rubrosid;
    }

    public long getLrcategoriarubroid() {
        return lrcategoriarubroid;
    }

    public void setLrcategoriarubroid(long lrcategoriarubroid) {
        this.lrcategoriarubroid = lrcategoriarubroid;
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
        hash += (int) lrcategoriarubroid;
        hash += (int) rubrosid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LragruparubroPK)) {
            return false;
        }
        LragruparubroPK other = (LragruparubroPK) object;
        if (this.lrcategoriarubroid != other.lrcategoriarubroid) {
            return false;
        }
        if (this.rubrosid != other.rubrosid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LragruparubroPK[ lrcategoriarubroid=" + lrcategoriarubroid + ", rubrosid=" + rubrosid + " ]";
    }
    
}
