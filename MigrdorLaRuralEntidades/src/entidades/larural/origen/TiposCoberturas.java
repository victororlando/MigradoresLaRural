/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "TIPOS_COBERTURAS", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "TiposCoberturas.findAll", query = "SELECT t FROM TiposCoberturas t"),
    @NamedQuery(name = "TiposCoberturas.findBySecc", query = "SELECT t FROM TiposCoberturas t WHERE t.tiposCoberturasPK.secc = :secc"),
    @NamedQuery(name = "TiposCoberturas.findByCodRiesgo", query = "SELECT t FROM TiposCoberturas t WHERE t.tiposCoberturasPK.codRiesgo = :codRiesgo"),
    @NamedQuery(name = "TiposCoberturas.findByCodCobertura", query = "SELECT t FROM TiposCoberturas t WHERE t.tiposCoberturasPK.codCobertura = :codCobertura"),
    @NamedQuery(name = "TiposCoberturas.findByNombre", query = "SELECT t FROM TiposCoberturas t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TiposCoberturas.findByClausula", query = "SELECT t FROM TiposCoberturas t WHERE t.clausula = :clausula"),
    @NamedQuery(name = "TiposCoberturas.findByTexto", query = "SELECT t FROM TiposCoberturas t WHERE t.texto = :texto")})
public class TiposCoberturas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TiposCoberturasPK tiposCoberturasPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;
    @Column(name = "CLAUSULA", length = 40)
    private String clausula;
    @Column(name = "TEXTO", length = 60)
    private String texto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposCoberturas")
    private List<CoberturasDetalle> coberturasDetalleList;
    @JoinColumns({
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COD_RIESGO", referencedColumnName = "COD_RIESGO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private RiesgosAsegurados riesgosAsegurados;

    public TiposCoberturas() {
    }

    public TiposCoberturas(TiposCoberturasPK tiposCoberturasPK) {
        this.tiposCoberturasPK = tiposCoberturasPK;
    }

    public TiposCoberturas(TiposCoberturasPK tiposCoberturasPK, String nombre) {
        this.tiposCoberturasPK = tiposCoberturasPK;
        this.nombre = nombre;
    }

    public TiposCoberturas(short secc, short codRiesgo, short codCobertura) {
        this.tiposCoberturasPK = new TiposCoberturasPK(secc, codRiesgo, codCobertura);
    }

    public TiposCoberturasPK getTiposCoberturasPK() {
        return tiposCoberturasPK;
    }

    public void setTiposCoberturasPK(TiposCoberturasPK tiposCoberturasPK) {
        this.tiposCoberturasPK = tiposCoberturasPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClausula() {
        return clausula;
    }

    public void setClausula(String clausula) {
        this.clausula = clausula;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<CoberturasDetalle> getCoberturasDetalleList() {
        return coberturasDetalleList;
    }

    public void setCoberturasDetalleList(List<CoberturasDetalle> coberturasDetalleList) {
        this.coberturasDetalleList = coberturasDetalleList;
    }

    public RiesgosAsegurados getRiesgosAsegurados() {
        return riesgosAsegurados;
    }

    public void setRiesgosAsegurados(RiesgosAsegurados riesgosAsegurados) {
        this.riesgosAsegurados = riesgosAsegurados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tiposCoberturasPK != null ? tiposCoberturasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposCoberturas)) {
            return false;
        }
        TiposCoberturas other = (TiposCoberturas) object;
        if ((this.tiposCoberturasPK == null && other.tiposCoberturasPK != null) || (this.tiposCoberturasPK != null && !this.tiposCoberturasPK.equals(other.tiposCoberturasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.TiposCoberturas[ tiposCoberturasPK=" + tiposCoberturasPK + " ]";
    }
    
}
