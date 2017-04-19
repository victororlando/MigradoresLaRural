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
public class LrcotizacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONNRO", nullable = false)
    private long lrcotizacionnro;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONVERSION", nullable = false)
    private long lrcotizacionversion;

    public LrcotizacionPK() {
    }

    public LrcotizacionPK(long lrcotizacionnro, long lrcotizacionversion) {
        this.lrcotizacionnro = lrcotizacionnro;
        this.lrcotizacionversion = lrcotizacionversion;
    }

    public long getLrcotizacionnro() {
        return lrcotizacionnro;
    }

    public void setLrcotizacionnro(long lrcotizacionnro) {
        this.lrcotizacionnro = lrcotizacionnro;
    }

    public long getLrcotizacionversion() {
        return lrcotizacionversion;
    }

    public void setLrcotizacionversion(long lrcotizacionversion) {
        this.lrcotizacionversion = lrcotizacionversion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lrcotizacionnro;
        hash += (int) lrcotizacionversion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrcotizacionPK)) {
            return false;
        }
        LrcotizacionPK other = (LrcotizacionPK) object;
        if (this.lrcotizacionnro != other.lrcotizacionnro) {
            return false;
        }
        if (this.lrcotizacionversion != other.lrcotizacionversion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.LrcotizacionPK[ lrcotizacionnro=" + lrcotizacionnro + ", lrcotizacionversion=" + lrcotizacionversion + " ]";
    }
    
}
