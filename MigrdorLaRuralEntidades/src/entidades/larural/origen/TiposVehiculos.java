/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "TIPOS_VEHICULOS", schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "TiposVehiculos.findAll", query = "SELECT t FROM TiposVehiculos t"),
    @NamedQuery(name = "TiposVehiculos.findByCodTipo", query = "SELECT t FROM TiposVehiculos t WHERE t.codTipo = :codTipo"),
    @NamedQuery(name = "TiposVehiculos.findByNombre", query = "SELECT t FROM TiposVehiculos t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TiposVehiculos.findByNroEntrada", query = "SELECT t FROM TiposVehiculos t WHERE t.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "TiposVehiculos.findByFechaCarga", query = "SELECT t FROM TiposVehiculos t WHERE t.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "TiposVehiculos.findByCodGrupoVehiculo", query = "SELECT t FROM TiposVehiculos t WHERE t.codGrupoVehiculo = :codGrupoVehiculo"),
    @NamedQuery(name = "TiposVehiculos.findByRexluido", query = "SELECT t FROM TiposVehiculos t WHERE t.rexluido = :rexluido"),
    @NamedQuery(name = "TiposVehiculos.findByAcepesp", query = "SELECT t FROM TiposVehiculos t WHERE t.acepesp = :acepesp")})
public class TiposVehiculos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_TIPO", nullable = false)
    private Short codTipo;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 60)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Column(name = "COD_GRUPO_VEHICULO")
    private Short codGrupoVehiculo;
    @Column(name = "REXLUIDO")
    private Character rexluido;
    @Column(name = "ACEPESP")
    private Character acepesp;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposVehiculos")
    private List<ModelosVehiculos> modelosVehiculosList;

    public TiposVehiculos() {
    }

    public TiposVehiculos(Short codTipo) {
        this.codTipo = codTipo;
    }

    public TiposVehiculos(Short codTipo, String nombre, int nroEntrada, Date fechaCarga) {
        this.codTipo = codTipo;
        this.nombre = nombre;
        this.nroEntrada = nroEntrada;
        this.fechaCarga = fechaCarga;
    }

    public Short getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(Short codTipo) {
        this.codTipo = codTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Short getCodGrupoVehiculo() {
        return codGrupoVehiculo;
    }

    public void setCodGrupoVehiculo(Short codGrupoVehiculo) {
        this.codGrupoVehiculo = codGrupoVehiculo;
    }

    public Character getRexluido() {
        return rexluido;
    }

    public void setRexluido(Character rexluido) {
        this.rexluido = rexluido;
    }

    public Character getAcepesp() {
        return acepesp;
    }

    public void setAcepesp(Character acepesp) {
        this.acepesp = acepesp;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public List<ModelosVehiculos> getModelosVehiculosList() {
        return modelosVehiculosList;
    }

    public void setModelosVehiculosList(List<ModelosVehiculos> modelosVehiculosList) {
        this.modelosVehiculosList = modelosVehiculosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipo != null ? codTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposVehiculos)) {
            return false;
        }
        TiposVehiculos other = (TiposVehiculos) object;
        if ((this.codTipo == null && other.codTipo != null) || (this.codTipo != null && !this.codTipo.equals(other.codTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.TiposVehiculos[ codTipo=" + codTipo + " ]";
    }

}
