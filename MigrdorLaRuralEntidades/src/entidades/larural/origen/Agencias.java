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
@Table(name = "AGENCIAS",  schema = "SOFTTEN",uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "Agencias.findAll", query = "SELECT a FROM Agencias a"),
    @NamedQuery(name = "Agencias.findByCodAgcia", query = "SELECT a FROM Agencias a WHERE a.codAgcia = :codAgcia"),
    @NamedQuery(name = "Agencias.findByNombre", query = "SELECT a FROM Agencias a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Agencias.findByDireccion", query = "SELECT a FROM Agencias a WHERE a.direccion = :direccion"),
    @NamedQuery(name = "Agencias.findByTelefono", query = "SELECT a FROM Agencias a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Agencias.findByEmail", query = "SELECT a FROM Agencias a WHERE a.email = :email"),
    @NamedQuery(name = "Agencias.findByEncargado", query = "SELECT a FROM Agencias a WHERE a.encargado = :encargado"),
    @NamedQuery(name = "Agencias.findByFechaCarga", query = "SELECT a FROM Agencias a WHERE a.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Agencias.findByEstado", query = "SELECT a FROM Agencias a WHERE a.estado = :estado"),
    @NamedQuery(name = "Agencias.findByNroEntrada", query = "SELECT a FROM Agencias a WHERE a.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Agencias.findByCodSucursal", query = "SELECT a FROM Agencias a WHERE a.codSucursal = :codSucursal"),
    @NamedQuery(name = "Agencias.findByEmision", query = "SELECT a FROM Agencias a WHERE a.emision = :emision"),
    @NamedQuery(name = "Agencias.findByCobranzas", query = "SELECT a FROM Agencias a WHERE a.cobranzas = :cobranzas"),
    @NamedQuery(name = "Agencias.findBySiniestros", query = "SELECT a FROM Agencias a WHERE a.siniestros = :siniestros")})
public class Agencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_AGCIA", nullable = false)
    private Short codAgcia;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 60)
    private String nombre;
    @Column(name = "DIRECCION", length = 60)
    private String direccion;
    @Column(name = "TELEFONO", length = 15)
    private String telefono;
    @Column(name = "EMAIL", length = 50)
    private String email;
    @Column(name = "ENCARGADO", length = 40)
    private String encargado;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "COD_SUCURSAL", nullable = false, length = 3)
    private String codSucursal;
    @Basic(optional = false)
    @Column(name = "EMISION", nullable = false)
    private short emision;
    @Basic(optional = false)
    @Column(name = "COBRANZAS", nullable = false)
    private short cobranzas;
    @Basic(optional = false)
    @Column(name = "SINIESTROS", nullable = false)
    private short siniestros;
    @JoinColumn(name = "COD_CENTRO", referencedColumnName = "CODIGO")
    @ManyToOne
    private Centros codCentro;
    @JoinColumns({
        @JoinColumn(name = "COD_CIUDAD", referencedColumnName = "COD_CIUDAD", nullable = false),
        @JoinColumn(name = "COD_DPTO", referencedColumnName = "COD_DPTO", nullable = false)})
    @ManyToOne(optional = false)
    private Ciudades ciudades;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codAgcia")
    private List<Organizadores> organizadoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codAgcia")
    private List<Polsdemi> polsdemiList;

    public Agencias() {
    }

    public Agencias(Short codAgcia) {
        this.codAgcia = codAgcia;
    }

    public Agencias(Short codAgcia, String nombre, Date fechaCarga, short estado, int nroEntrada, String codSucursal, short emision, short cobranzas, short siniestros) {
        this.codAgcia = codAgcia;
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
        this.estado = estado;
        this.nroEntrada = nroEntrada;
        this.codSucursal = codSucursal;
        this.emision = emision;
        this.cobranzas = cobranzas;
        this.siniestros = siniestros;
    }

    public Short getCodAgcia() {
        return codAgcia;
    }

    public void setCodAgcia(Short codAgcia) {
        this.codAgcia = codAgcia;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public String getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(String codSucursal) {
        this.codSucursal = codSucursal;
    }

    public short getEmision() {
        return emision;
    }

    public void setEmision(short emision) {
        this.emision = emision;
    }

    public short getCobranzas() {
        return cobranzas;
    }

    public void setCobranzas(short cobranzas) {
        this.cobranzas = cobranzas;
    }

    public short getSiniestros() {
        return siniestros;
    }

    public void setSiniestros(short siniestros) {
        this.siniestros = siniestros;
    }

    public Centros getCodCentro() {
        return codCentro;
    }

    public void setCodCentro(Centros codCentro) {
        this.codCentro = codCentro;
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

    public List<Organizadores> getOrganizadoresList() {
        return organizadoresList;
    }

    public void setOrganizadoresList(List<Organizadores> organizadoresList) {
        this.organizadoresList = organizadoresList;
    }

    public List<Polsdemi> getPolsdemiList() {
        return polsdemiList;
    }

    public void setPolsdemiList(List<Polsdemi> polsdemiList) {
        this.polsdemiList = polsdemiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAgcia != null ? codAgcia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencias)) {
            return false;
        }
        Agencias other = (Agencias) object;
        if ((this.codAgcia == null && other.codAgcia != null) || (this.codAgcia != null && !this.codAgcia.equals(other.codAgcia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Agencias[ codAgcia=" + codAgcia + " ]";
    }
    
}
