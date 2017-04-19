/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victoro
 */
@Embeddable
public class PropautoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EJERCICIO", nullable = false)
    private short ejercicio;
    @Basic(optional = false)
    @Column(name = "NRO_PROPUESTA", nullable = false)
    private int nroPropuesta;

    public PropautoPK() {
    }

    public PropautoPK(short ejercicio, int nroPropuesta) {
        this.ejercicio = ejercicio;
        this.nroPropuesta = nroPropuesta;
    }

    public short getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(short ejercicio) {
        this.ejercicio = ejercicio;
    }

    public int getNroPropuesta() {
        return nroPropuesta;
    }

    public void setNroPropuesta(int nroPropuesta) {
        this.nroPropuesta = nroPropuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ejercicio;
        hash += (int) nroPropuesta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropautoPK)) {
            return false;
        }
        PropautoPK other = (PropautoPK) object;
        if (this.ejercicio != other.ejercicio) {
            return false;
        }
        if (this.nroPropuesta != other.nroPropuesta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.PropautoPK[ ejercicio=" + ejercicio + ", nroPropuesta=" + nroPropuesta + " ]";
    }
    
}
