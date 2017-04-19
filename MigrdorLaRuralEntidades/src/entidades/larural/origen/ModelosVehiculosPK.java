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
public class ModelosVehiculosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COD_MARCA", nullable = false)
    private short codMarca;
    @Basic(optional = false)
    @Column(name = "COD_MODELO", nullable = false)
    private short codModelo;
    @Basic(optional = false)
    @Column(name = "COD_TIPO", nullable = false)
    private short codTipo;

    public ModelosVehiculosPK() {
    }

    public ModelosVehiculosPK(short codMarca, short codModelo, short codTipo) {
        this.codMarca = codMarca;
        this.codModelo = codModelo;
        this.codTipo = codTipo;
    }

    public short getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(short codMarca) {
        this.codMarca = codMarca;
    }

    public short getCodModelo() {
        return codModelo;
    }

    public void setCodModelo(short codModelo) {
        this.codModelo = codModelo;
    }

    public short getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(short codTipo) {
        this.codTipo = codTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codMarca;
        hash += (int) codModelo;
        hash += (int) codTipo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelosVehiculosPK)) {
            return false;
        }
        ModelosVehiculosPK other = (ModelosVehiculosPK) object;
        if (this.codMarca != other.codMarca) {
            return false;
        }
        if (this.codModelo != other.codModelo) {
            return false;
        }
        if (this.codTipo != other.codTipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ModelosVehiculosPK[ codMarca=" + codMarca + ", codModelo=" + codModelo + ", codTipo=" + codTipo + " ]";
    }
    
}
