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
@Table(name = "CENTROS", schema = "SOFTTEN",uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "Centros.findAll", query = "SELECT c FROM Centros c"),
    @NamedQuery(name = "Centros.findByCodigo", query = "SELECT c FROM Centros c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Centros.findByNombre", query = "SELECT c FROM Centros c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Centros.findByDireccion", query = "SELECT c FROM Centros c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Centros.findByTelefono", query = "SELECT c FROM Centros c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Centros.findByEncargado", query = "SELECT c FROM Centros c WHERE c.encargado = :encargado"),
    @NamedQuery(name = "Centros.findByEmision", query = "SELECT c FROM Centros c WHERE c.emision = :emision"),
    @NamedQuery(name = "Centros.findByCobranzas", query = "SELECT c FROM Centros c WHERE c.cobranzas = :cobranzas"),
    @NamedQuery(name = "Centros.findBySiniestros", query = "SELECT c FROM Centros c WHERE c.siniestros = :siniestros"),
    @NamedQuery(name = "Centros.findByNroEntrada", query = "SELECT c FROM Centros c WHERE c.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Centros.findByEstado", query = "SELECT c FROM Centros c WHERE c.estado = :estado"),
    @NamedQuery(name = "Centros.findByEmail", query = "SELECT c FROM Centros c WHERE c.email = :email")})
public class Centros implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO", nullable = false)
    private Short codigo;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 80)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DIRECCION", nullable = false, length = 60)
    private String direccion;
    @Basic(optional = false)
    @Column(name = "TELEFONO", nullable = false, length = 30)
    private String telefono;
    @Basic(optional = false)
    @Column(name = "ENCARGADO", nullable = false, length = 80)
    private String encargado;
    @Basic(optional = false)
    @Column(name = "EMISION", nullable = false)
    private short emision;
    @Basic(optional = false)
    @Column(name = "COBRANZAS", nullable = false)
    private short cobranzas;
    @Basic(optional = false)
    @Column(name = "SINIESTROS", nullable = false)
    private short siniestros;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Basic(optional = false)
    @Column(name = "EMAIL", nullable = false, length = 40)
    private String email;
    @OneToMany(mappedBy = "codCentro")
    private List<Agencias> agenciasList;
    @JoinColumns({
        @JoinColumn(name = "COD_CIUDAD", referencedColumnName = "COD_CIUDAD", nullable = false),
        @JoinColumn(name = "COD_DPTO", referencedColumnName = "COD_DPTO", nullable = false)})
    @ManyToOne(optional = false)
    private Ciudades ciudades;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public Centros() {
    }

    public Centros(Short codigo) {
        this.codigo = codigo;
    }

    public Centros(Short codigo, String nombre, String direccion, String telefono, String encargado, short emision, short cobranzas, short siniestros, int nroEntrada, short estado, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.encargado = encargado;
        this.emision = emision;
        this.cobranzas = cobranzas;
        this.siniestros = siniestros;
        this.nroEntrada = nroEntrada;
        this.estado = estado;
        this.email = email;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
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

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
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

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Agencias> getAgenciasList() {
        return agenciasList;
    }

    public void setAgenciasList(List<Agencias> agenciasList) {
        this.agenciasList = agenciasList;
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
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centros)) {
            return false;
        }
        Centros other = (Centros) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Centros[ codigo=" + codigo + " ]";
    }
    
}
