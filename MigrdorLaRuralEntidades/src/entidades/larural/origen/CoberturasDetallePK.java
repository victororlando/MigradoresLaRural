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
public class CoberturasDetallePK implements Serializable {
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
    @Column(name = "ITEM", nullable = false)
    private int item;
    @Basic(optional = false)
    @Column(name = "COD_RIESGO", nullable = false)
    private short codRiesgo;
    @Basic(optional = false)
    @Column(name = "COD_COBERTURA", nullable = false)
    private short codCobertura;

    public CoberturasDetallePK() {
    }

    public CoberturasDetallePK(short tipoSeguro, short tipoOperacion, short ejercicio, short secc, int polnro, short anexo, int item, short codRiesgo, short codCobertura) {
        this.tipoSeguro = tipoSeguro;
        this.tipoOperacion = tipoOperacion;
        this.ejercicio = ejercicio;
        this.secc = secc;
        this.polnro = polnro;
        this.anexo = anexo;
        this.item = item;
        this.codRiesgo = codRiesgo;
        this.codCobertura = codCobertura;
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

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public short getCodRiesgo() {
        return codRiesgo;
    }

    public void setCodRiesgo(short codRiesgo) {
        this.codRiesgo = codRiesgo;
    }

    public short getCodCobertura() {
        return codCobertura;
    }

    public void setCodCobertura(short codCobertura) {
        this.codCobertura = codCobertura;
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
        hash += (int) item;
        hash += (int) codRiesgo;
        hash += (int) codCobertura;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoberturasDetallePK)) {
            return false;
        }
        CoberturasDetallePK other = (CoberturasDetallePK) object;
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
        if (this.item != other.item) {
            return false;
        }
        if (this.codRiesgo != other.codRiesgo) {
            return false;
        }
        if (this.codCobertura != other.codCobertura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.CoberturasDetallePK[ tipoSeguro=" + tipoSeguro + ", tipoOperacion=" + tipoOperacion + ", ejercicio=" + ejercicio + ", secc=" + secc + ", polnro=" + polnro + ", anexo=" + anexo + ", item=" + item + ", codRiesgo=" + codRiesgo + ", codCobertura=" + codCobertura + " ]";
    }
    
}
