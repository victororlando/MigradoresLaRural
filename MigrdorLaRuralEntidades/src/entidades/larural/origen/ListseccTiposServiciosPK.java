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
public class ListseccTiposServiciosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SECC", nullable = false)
    private short secc;
    @Basic(optional = false)
    @Column(name = "CODIGO_SERVICIO", nullable = false)
    private short codigoServicio;

    public ListseccTiposServiciosPK() {
    }

    public ListseccTiposServiciosPK(short secc, short codigoServicio) {
        this.secc = secc;
        this.codigoServicio = codigoServicio;
    }

    public short getSecc() {
        return secc;
    }

    public void setSecc(short secc) {
        this.secc = secc;
    }

    public short getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(short codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) secc;
        hash += (int) codigoServicio;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListseccTiposServiciosPK)) {
            return false;
        }
        ListseccTiposServiciosPK other = (ListseccTiposServiciosPK) object;
        if (this.secc != other.secc) {
            return false;
        }
        if (this.codigoServicio != other.codigoServicio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ListseccTiposServiciosPK[ secc=" + secc + ", codigoServicio=" + codigoServicio + " ]";
    }
    
}
