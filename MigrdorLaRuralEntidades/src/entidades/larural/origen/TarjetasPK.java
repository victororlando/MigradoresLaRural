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
public class TarjetasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "N_ASEG", nullable = false)
    private int nAseg;
    @Basic(optional = false)
    @Column(name = "COD_ENTIDAD", nullable = false)
    private short codEntidad;
    @Basic(optional = false)
    @Column(name = "NRO_TARJETA", nullable = false, length = 30)
    private String nroTarjeta;

    public TarjetasPK() {
    }

    public TarjetasPK(int nAseg, short codEntidad, String nroTarjeta) {
        this.nAseg = nAseg;
        this.codEntidad = codEntidad;
        this.nroTarjeta = nroTarjeta;
    }

    public int getNAseg() {
        return nAseg;
    }

    public void setNAseg(int nAseg) {
        this.nAseg = nAseg;
    }

    public short getCodEntidad() {
        return codEntidad;
    }

    public void setCodEntidad(short codEntidad) {
        this.codEntidad = codEntidad;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nAseg;
        hash += (int) codEntidad;
        hash += (nroTarjeta != null ? nroTarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarjetasPK)) {
            return false;
        }
        TarjetasPK other = (TarjetasPK) object;
        if (this.nAseg != other.nAseg) {
            return false;
        }
        if (this.codEntidad != other.codEntidad) {
            return false;
        }
        if ((this.nroTarjeta == null && other.nroTarjeta != null) || (this.nroTarjeta != null && !this.nroTarjeta.equals(other.nroTarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.TarjetasPK[ nAseg=" + nAseg + ", codEntidad=" + codEntidad + ", nroTarjeta=" + nroTarjeta + " ]";
    }
    
}
