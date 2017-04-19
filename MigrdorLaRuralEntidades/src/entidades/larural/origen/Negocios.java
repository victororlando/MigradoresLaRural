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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "NEGOCIOS",  schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "Negocios.findAll", query = "SELECT n FROM Negocios n"),
    @NamedQuery(name = "Negocios.findByCodNegocio", query = "SELECT n FROM Negocios n WHERE n.codNegocio = :codNegocio"),
    @NamedQuery(name = "Negocios.findByNombre", query = "SELECT n FROM Negocios n WHERE n.nombre = :nombre"),
    @NamedQuery(name = "Negocios.findByDireccion", query = "SELECT n FROM Negocios n WHERE n.direccion = :direccion"),
    @NamedQuery(name = "Negocios.findByFechaCarga", query = "SELECT n FROM Negocios n WHERE n.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Negocios.findByNroEntrada", query = "SELECT n FROM Negocios n WHERE n.nroEntrada = :nroEntrada")})
public class Negocios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_NEGOCIO", nullable = false)
    private Integer codNegocio;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;
    @Column(name = "DIRECCION", length = 50)
    private String direccion;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @JoinColumns({
        @JoinColumn(name = "COD_ZONA", referencedColumnName = "COD_ZONA", nullable = false),
        @JoinColumn(name = "COD_DPTO", referencedColumnName = "COD_DPTO", nullable = false),
        @JoinColumn(name = "COD_CIUDAD", referencedColumnName = "COD_CIUDAD", nullable = false)})
    @ManyToOne(optional = false)
    private Zonas zonas;
    @OneToMany(mappedBy = "codNegocio")
    private List<ItemDePolizas> itemDePolizasList;

    public Negocios() {
    }

    public Negocios(Integer codNegocio) {
        this.codNegocio = codNegocio;
    }

    public Negocios(Integer codNegocio, String nombre, Date fechaCarga, int nroEntrada) {
        this.codNegocio = codNegocio;
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
        this.nroEntrada = nroEntrada;
    }

    public Integer getCodNegocio() {
        return codNegocio;
    }

    public void setCodNegocio(Integer codNegocio) {
        this.codNegocio = codNegocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Zonas getZonas() {
        return zonas;
    }

    public void setZonas(Zonas zonas) {
        this.zonas = zonas;
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
        hash += (codNegocio != null ? codNegocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Negocios)) {
            return false;
        }
        Negocios other = (Negocios) object;
        if ((this.codNegocio == null && other.codNegocio != null) || (this.codNegocio != null && !this.codNegocio.equals(other.codNegocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Negocios[ codNegocio=" + codNegocio + " ]";
    }
    
}
