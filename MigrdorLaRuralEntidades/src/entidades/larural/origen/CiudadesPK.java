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
public class CiudadesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COD_CIUDAD", nullable = false)
    private short codCiudad;
    @Basic(optional = false)
    @Column(name = "COD_DPTO", nullable = false)
    private short codDpto;

    public CiudadesPK() {
    }

    public CiudadesPK(short codCiudad, short codDpto) {
        this.codCiudad = codCiudad;
        this.codDpto = codDpto;
    }

    public short getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(short codCiudad) {
        this.codCiudad = codCiudad;
    }

    public short getCodDpto() {
        return codDpto;
    }

    public void setCodDpto(short codDpto) {
        this.codDpto = codDpto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codCiudad;
        hash += (int) codDpto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CiudadesPK)) {
            return false;
        }
        CiudadesPK other = (CiudadesPK) object;
        if (this.codCiudad != other.codCiudad) {
            return false;
        }
        if (this.codDpto != other.codDpto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.CiudadesPK[ codCiudad=" + codCiudad + ", codDpto=" + codDpto + " ]";
    }
    
}
