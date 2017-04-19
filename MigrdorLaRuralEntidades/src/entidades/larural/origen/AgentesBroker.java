/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
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
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "AGENTES_BROKER", schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "AgentesBroker.findAll", query = "SELECT a FROM AgentesBroker a"),
    @NamedQuery(name = "AgentesBroker.findByCodBroker", query = "SELECT a FROM AgentesBroker a WHERE a.codBroker = :codBroker"),
    @NamedQuery(name = "AgentesBroker.findByNombre", query = "SELECT a FROM AgentesBroker a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "AgentesBroker.findByDireccion", query = "SELECT a FROM AgentesBroker a WHERE a.direccion = :direccion"),
    @NamedQuery(name = "AgentesBroker.findByTelefono", query = "SELECT a FROM AgentesBroker a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "AgentesBroker.findByCelular", query = "SELECT a FROM AgentesBroker a WHERE a.celular = :celular"),
    @NamedQuery(name = "AgentesBroker.findByEmail", query = "SELECT a FROM AgentesBroker a WHERE a.email = :email"),
    @NamedQuery(name = "AgentesBroker.findByNroEntrada", query = "SELECT a FROM AgentesBroker a WHERE a.nroEntrada = :nroEntrada")})
public class AgentesBroker implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_BROKER", nullable = false)
    private Short codBroker;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;
    @Column(name = "DIRECCION", length = 50)
    private String direccion;
    @Column(name = "TELEFONO", length = 20)
    private String telefono;
    @Column(name = "CELULAR", length = 25)
    private String celular;
    @Column(name = "EMAIL", length = 50)
    private String email;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @OneToMany(mappedBy = "codBroker")
    private List<Listagte> listagteList;
    @JoinColumns({
        @JoinColumn(name = "COD_CIUDAD", referencedColumnName = "COD_CIUDAD", nullable = false),
        @JoinColumn(name = "COD_DPTO", referencedColumnName = "COD_DPTO", nullable = false)})
    @ManyToOne(optional = false)
    private Ciudades ciudades;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public AgentesBroker() {
    }

    public AgentesBroker(Short codBroker) {
        this.codBroker = codBroker;
    }

    public AgentesBroker(Short codBroker, String nombre, int nroEntrada) {
        this.codBroker = codBroker;
        this.nombre = nombre;
        this.nroEntrada = nroEntrada;
    }

    public Short getCodBroker() {
        return codBroker;
    }

    public void setCodBroker(Short codBroker) {
        this.codBroker = codBroker;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public List<Listagte> getListagteList() {
        return listagteList;
    }

    public void setListagteList(List<Listagte> listagteList) {
        this.listagteList = listagteList;
    }

    public Ciudades getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codBroker != null ? codBroker.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgentesBroker)) {
            return false;
        }
        AgentesBroker other = (AgentesBroker) object;
        if ((this.codBroker == null && other.codBroker != null) || (this.codBroker != null && !this.codBroker.equals(other.codBroker))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.AgentesBroker[ codBroker=" + codBroker + " ]";
    }
    
}
