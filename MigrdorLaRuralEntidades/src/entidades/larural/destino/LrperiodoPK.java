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
public class LrperiodoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRPERIODOMES", nullable = false)
    private short lrperiodomes;
    @Basic(optional = false)
    @Column(name = "LRPERIODOANHO", nullable = false)
    private short lrperiodoanho;

    public LrperiodoPK() {
    }

    public LrperiodoPK(short lrperiodomes, short lrperiodoanho) {
        this.lrperiodomes = lrperiodomes;
        this.lrperiodoanho = lrperiodoanho;
    }

    public short getLrperiodomes() {
        return lrperiodomes;
    }

    public void setLrperiodomes(short lrperiodomes) {
        this.lrperiodomes = lrperiodomes;
    }

    public short getLrperiodoanho() {
        return lrperiodoanho;
    }

    public void setLrperiodoanho(short lrperiodoanho) {
        this.lrperiodoanho = lrperiodoanho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrperiodomes;
        hash += (int) lrperiodoanho;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrperiodoPK)) {
            return false;
        }
        LrperiodoPK other = (LrperiodoPK) object;
        if (this.lrperiodomes != other.lrperiodomes) {
            return false;
        }
        if (this.lrperiodoanho != other.lrperiodoanho) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrperiodoPK[ lrperiodomes=" + lrperiodomes + ", lrperiodoanho=" + lrperiodoanho + " ]";
    }
    
}
