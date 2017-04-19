/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRCOTIFLUJOPANTALLA")
@NamedQueries({
    @NamedQuery(name = "Lrcotiflujopantalla.findAll", query = "SELECT l FROM Lrcotiflujopantalla l"),
    @NamedQuery(name = "Lrcotiflujopantalla.findByLrcotiflujoid", query = "SELECT l FROM Lrcotiflujopantalla l WHERE l.lrcotiflujoid = :lrcotiflujoid"),
    @NamedQuery(name = "Lrcotiflujopantalla.findByLrseccdetalleid", query = "SELECT l FROM Lrcotiflujopantalla l WHERE l.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrcotiflujopantalla.findByLrcotiflujotipocotizacion", query = "SELECT l FROM Lrcotiflujopantalla l WHERE l.lrcotiflujotipocotizacion = :lrcotiflujotipocotizacion"),
    @NamedQuery(name = "Lrcotiflujopantalla.findByLrcotiflujomodo", query = "SELECT l FROM Lrcotiflujopantalla l WHERE l.lrcotiflujomodo = :lrcotiflujomodo"),
    @NamedQuery(name = "Lrcotiflujopantalla.findByLrcotiflujovalidar", query = "SELECT l FROM Lrcotiflujopantalla l WHERE l.lrcotiflujovalidar = :lrcotiflujovalidar"),
    @NamedQuery(name = "Lrcotiflujopantalla.findByLrcotiobjetoid", query = "SELECT l FROM Lrcotiflujopantalla l WHERE l.lrcotiobjetoid = :lrcotiobjetoid"),
    @NamedQuery(name = "Lrcotiflujopantalla.findByAntLrcotiobjeto", query = "SELECT l FROM Lrcotiflujopantalla l WHERE l.antLrcotiobjeto = :antLrcotiobjeto"),
    @NamedQuery(name = "Lrcotiflujopantalla.findBySigLrcotiobjeto", query = "SELECT l FROM Lrcotiflujopantalla l WHERE l.sigLrcotiobjeto = :sigLrcotiobjeto"),
    @NamedQuery(name = "Lrcotiflujopantalla.findByAntexcLrcotiobjetoid", query = "SELECT l FROM Lrcotiflujopantalla l WHERE l.antexcLrcotiobjetoid = :antexcLrcotiobjetoid"),
    @NamedQuery(name = "Lrcotiflujopantalla.findBySigexcLrcotiobjetoid", query = "SELECT l FROM Lrcotiflujopantalla l WHERE l.sigexcLrcotiobjetoid = :sigexcLrcotiobjetoid")})
public class Lrcotiflujopantalla implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTIFLUJOID", nullable = false)
    private Long lrcotiflujoid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;
    @Basic(optional = false)
    @Column(name = "LRCOTIFLUJOTIPOCOTIZACION", nullable = false)
    private short lrcotiflujotipocotizacion;
    @Basic(optional = false)
    @Column(name = "LRCOTIFLUJOMODO", nullable = false, length = 3)
    private String lrcotiflujomodo;
    @Basic(optional = false)
    @Column(name = "LRCOTIFLUJOVALIDAR", nullable = false)
    private Character lrcotiflujovalidar;
    @Basic(optional = false)
    @Column(name = "LRCOTIOBJETOID", nullable = false)
    private long lrcotiobjetoid;
    @Column(name = "ANT_LRCOTIOBJETO")
    private Long antLrcotiobjeto;
    @Column(name = "SIG_LRCOTIOBJETO")
    private Long sigLrcotiobjeto;
    @Column(name = "ANTEXC_LRCOTIOBJETOID")
    private Long antexcLrcotiobjetoid;
    @Column(name = "SIGEXC_LRCOTIOBJETOID")
    private Long sigexcLrcotiobjetoid;

    public Lrcotiflujopantalla() {
    }

    public Lrcotiflujopantalla(Long lrcotiflujoid) {
        this.lrcotiflujoid = lrcotiflujoid;
    }

    public Lrcotiflujopantalla(Long lrcotiflujoid, long lrseccdetalleid, short lrcotiflujotipocotizacion, String lrcotiflujomodo, Character lrcotiflujovalidar, long lrcotiobjetoid) {
        this.lrcotiflujoid = lrcotiflujoid;
        this.lrseccdetalleid = lrseccdetalleid;
        this.lrcotiflujotipocotizacion = lrcotiflujotipocotizacion;
        this.lrcotiflujomodo = lrcotiflujomodo;
        this.lrcotiflujovalidar = lrcotiflujovalidar;
        this.lrcotiobjetoid = lrcotiobjetoid;
    }

    public Long getLrcotiflujoid() {
        return lrcotiflujoid;
    }

    public void setLrcotiflujoid(Long lrcotiflujoid) {
        this.lrcotiflujoid = lrcotiflujoid;
    }

    public long getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(long lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public short getLrcotiflujotipocotizacion() {
        return lrcotiflujotipocotizacion;
    }

    public void setLrcotiflujotipocotizacion(short lrcotiflujotipocotizacion) {
        this.lrcotiflujotipocotizacion = lrcotiflujotipocotizacion;
    }

    public String getLrcotiflujomodo() {
        return lrcotiflujomodo;
    }

    public void setLrcotiflujomodo(String lrcotiflujomodo) {
        this.lrcotiflujomodo = lrcotiflujomodo;
    }

    public Character getLrcotiflujovalidar() {
        return lrcotiflujovalidar;
    }

    public void setLrcotiflujovalidar(Character lrcotiflujovalidar) {
        this.lrcotiflujovalidar = lrcotiflujovalidar;
    }

    public long getLrcotiobjetoid() {
        return lrcotiobjetoid;
    }

    public void setLrcotiobjetoid(long lrcotiobjetoid) {
        this.lrcotiobjetoid = lrcotiobjetoid;
    }

    public Long getAntLrcotiobjeto() {
        return antLrcotiobjeto;
    }

    public void setAntLrcotiobjeto(Long antLrcotiobjeto) {
        this.antLrcotiobjeto = antLrcotiobjeto;
    }

    public Long getSigLrcotiobjeto() {
        return sigLrcotiobjeto;
    }

    public void setSigLrcotiobjeto(Long sigLrcotiobjeto) {
        this.sigLrcotiobjeto = sigLrcotiobjeto;
    }

    public Long getAntexcLrcotiobjetoid() {
        return antexcLrcotiobjetoid;
    }

    public void setAntexcLrcotiobjetoid(Long antexcLrcotiobjetoid) {
        this.antexcLrcotiobjetoid = antexcLrcotiobjetoid;
    }

    public Long getSigexcLrcotiobjetoid() {
        return sigexcLrcotiobjetoid;
    }

    public void setSigexcLrcotiobjetoid(Long sigexcLrcotiobjetoid) {
        this.sigexcLrcotiobjetoid = sigexcLrcotiobjetoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotiflujoid != null ? lrcotiflujoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotiflujopantalla)) {
            return false;
        }
        Lrcotiflujopantalla other = (Lrcotiflujopantalla) object;
        if ((this.lrcotiflujoid == null && other.lrcotiflujoid != null) || (this.lrcotiflujoid != null && !this.lrcotiflujoid.equals(other.lrcotiflujoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotiflujopantalla[ lrcotiflujoid=" + lrcotiflujoid + " ]";
    }
    
}
