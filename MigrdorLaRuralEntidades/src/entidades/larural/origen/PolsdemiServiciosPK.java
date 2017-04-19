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
public class PolsdemiServiciosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TIPO_SEGURO", nullable = false)
    private short tipoSeguro;
    @Basic(optional = false)
    @Column(name = "TIPO_OPERACION", nullable = false)
    private short tipoOperacion;
    @Basic(optional = false)
    @Column(name = "EJERCICIO", nullable = false)
    private short ejercicio;
    @Basic(optional = false)
    @Column(name = "SECC", nullable = false)
    private short secc;
    @Basic(optional = false)
    @Column(name = "POLNRO", nullable = false)
    private int polnro;
    @Basic(optional = false)
    @Column(name = "ANEXO", nullable = false)
    private short anexo;
    @Basic(optional = false)
    @Column(name = "CODIGO_SERVICIO", nullable = false)
    private short codigoServicio;
    @Basic(optional = false)
    @Column(name = "COD_BENEF", nullable = false)
    private int codBenef;

    public PolsdemiServiciosPK() {
    }

    public PolsdemiServiciosPK(short tipoSeguro, short tipoOperacion, short ejercicio, short secc, int polnro, short anexo, short codigoServicio, int codBenef) {
        this.tipoSeguro = tipoSeguro;
        this.tipoOperacion = tipoOperacion;
        this.ejercicio = ejercicio;
        this.secc = secc;
        this.polnro = polnro;
        this.anexo = anexo;
        this.codigoServicio = codigoServicio;
        this.codBenef = codBenef;
    }

    public short getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(short tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public short getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(short tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public short getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(short ejercicio) {
        this.ejercicio = ejercicio;
    }

    public short getSecc() {
        return secc;
    }

    public void setSecc(short secc) {
        this.secc = secc;
    }

    public int getPolnro() {
        return polnro;
    }

    public void setPolnro(int polnro) {
        this.polnro = polnro;
    }

    public short getAnexo() {
        return anexo;
    }

    public void setAnexo(short anexo) {
        this.anexo = anexo;
    }

    public short getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(short codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public int getCodBenef() {
        return codBenef;
    }

    public void setCodBenef(int codBenef) {
        this.codBenef = codBenef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tipoSeguro;
        hash += (int) tipoOperacion;
        hash += (int) ejercicio;
        hash += (int) secc;
        hash += (int) polnro;
        hash += (int) anexo;
        hash += (int) codigoServicio;
        hash += (int) codBenef;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolsdemiServiciosPK)) {
            return false;
        }
        PolsdemiServiciosPK other = (PolsdemiServiciosPK) object;
        if (this.tipoSeguro != other.tipoSeguro) {
            return false;
        }
        if (this.tipoOperacion != other.tipoOperacion) {
            return false;
        }
        if (this.ejercicio != other.ejercicio) {
            return false;
        }
        if (this.secc != other.secc) {
            return false;
        }
        if (this.polnro != other.polnro) {
            return false;
        }
        if (this.anexo != other.anexo) {
            return false;
        }
        if (this.codigoServicio != other.codigoServicio) {
            return false;
        }
        if (this.codBenef != other.codBenef) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.PolsdemiServiciosPK[ tipoSeguro=" + tipoSeguro + ", tipoOperacion=" + tipoOperacion + ", ejercicio=" + ejercicio + ", secc=" + secc + ", polnro=" + polnro + ", anexo=" + anexo + ", codigoServicio=" + codigoServicio + ", codBenef=" + codBenef + " ]";
    }
    
}
