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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "RIESGOS_ASEGURADOS", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "RiesgosAsegurados.findAll", query = "SELECT r FROM RiesgosAsegurados r"),
    @NamedQuery(name = "RiesgosAsegurados.findBySecc", query = "SELECT r FROM RiesgosAsegurados r WHERE r.riesgosAseguradosPK.secc = :secc"),
    @NamedQuery(name = "RiesgosAsegurados.findByCodRiesgo", query = "SELECT r FROM RiesgosAsegurados r WHERE r.riesgosAseguradosPK.codRiesgo = :codRiesgo"),
    @NamedQuery(name = "RiesgosAsegurados.findByNombre", query = "SELECT r FROM RiesgosAsegurados r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "RiesgosAsegurados.findByCodUsuario", query = "SELECT r FROM RiesgosAsegurados r WHERE r.codUsuario = :codUsuario"),
    @NamedQuery(name = "RiesgosAsegurados.findByNroEntrada", query = "SELECT r FROM RiesgosAsegurados r WHERE r.nroEntrada = :nroEntrada")})
public class RiesgosAsegurados implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "riesgosAsegurados")
    private List<CoberturasDetalle> coberturasDetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "riesgosAsegurados")
    private List<TiposCoberturas> tiposCoberturasList;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RiesgosAseguradosPK riesgosAseguradosPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;
    @Column(name = "COD_USUARIO")
    private Short codUsuario;
    @Column(name = "NRO_ENTRADA")
    private Integer nroEntrada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "riesgosAsegurados")
    private List<ItemDePolizas> itemDePolizasList;

    public RiesgosAsegurados() {
    }

    public RiesgosAsegurados(RiesgosAseguradosPK riesgosAseguradosPK) {
        this.riesgosAseguradosPK = riesgosAseguradosPK;
    }

    public RiesgosAsegurados(RiesgosAseguradosPK riesgosAseguradosPK, String nombre) {
        this.riesgosAseguradosPK = riesgosAseguradosPK;
        this.nombre = nombre;
    }

    public RiesgosAsegurados(short secc, short codRiesgo) {
        this.riesgosAseguradosPK = new RiesgosAseguradosPK(secc, codRiesgo);
    }

    public RiesgosAseguradosPK getRiesgosAseguradosPK() {
        return riesgosAseguradosPK;
    }

    public void setRiesgosAseguradosPK(RiesgosAseguradosPK riesgosAseguradosPK) {
        this.riesgosAseguradosPK = riesgosAseguradosPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Short getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Short codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(Integer nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public List<ItemDePolizas> getItemDePolizasList() {
        return itemDePolizasList;
    }

    public void setItemDePolizasList(List<ItemDePolizas> itemDePolizasList) {
        this.itemDePolizasList = itemDePolizasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (riesgosAseguradosPK != null ? riesgosAseguradosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RiesgosAsegurados)) {
            return false;
        }
        RiesgosAsegurados other = (RiesgosAsegurados) object;
        if ((this.riesgosAseguradosPK == null && other.riesgosAseguradosPK != null) || (this.riesgosAseguradosPK != null && !this.riesgosAseguradosPK.equals(other.riesgosAseguradosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.RiesgosAsegurados[ riesgosAseguradosPK=" + riesgosAseguradosPK + " ]";
    }

    public List<CoberturasDetalle> getCoberturasDetalleList() {
        return coberturasDetalleList;
    }

    public void setCoberturasDetalleList(List<CoberturasDetalle> coberturasDetalleList) {
        this.coberturasDetalleList = coberturasDetalleList;
    }

    public List<TiposCoberturas> getTiposCoberturasList() {
        return tiposCoberturasList;
    }

    public void setTiposCoberturasList(List<TiposCoberturas> tiposCoberturasList) {
        this.tiposCoberturasList = tiposCoberturasList;
    }
    
}
