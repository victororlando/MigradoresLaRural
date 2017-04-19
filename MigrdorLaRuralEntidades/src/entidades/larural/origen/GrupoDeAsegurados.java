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
@Table(name = "GRUPO_DE_ASEGURADOS",  schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "GrupoDeAsegurados.findAll", query = "SELECT g FROM GrupoDeAsegurados g"),
    @NamedQuery(name = "GrupoDeAsegurados.findByCodGrupo", query = "SELECT g FROM GrupoDeAsegurados g WHERE g.codGrupo = :codGrupo"),
    @NamedQuery(name = "GrupoDeAsegurados.findByNombre", query = "SELECT g FROM GrupoDeAsegurados g WHERE g.nombre = :nombre"),
    @NamedQuery(name = "GrupoDeAsegurados.findByContacto", query = "SELECT g FROM GrupoDeAsegurados g WHERE g.contacto = :contacto"),
    @NamedQuery(name = "GrupoDeAsegurados.findByDireccion", query = "SELECT g FROM GrupoDeAsegurados g WHERE g.direccion = :direccion"),
    @NamedQuery(name = "GrupoDeAsegurados.findByTelefono", query = "SELECT g FROM GrupoDeAsegurados g WHERE g.telefono = :telefono"),
    @NamedQuery(name = "GrupoDeAsegurados.findByFechaCarga", query = "SELECT g FROM GrupoDeAsegurados g WHERE g.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "GrupoDeAsegurados.findByEstado", query = "SELECT g FROM GrupoDeAsegurados g WHERE g.estado = :estado"),
    @NamedQuery(name = "GrupoDeAsegurados.findByNroEntrada", query = "SELECT g FROM GrupoDeAsegurados g WHERE g.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "GrupoDeAsegurados.findByExtraPrima", query = "SELECT g FROM GrupoDeAsegurados g WHERE g.extraPrima = :extraPrima")})
public class GrupoDeAsegurados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_GRUPO", nullable = false)
    private Short codGrupo;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;
    @Column(name = "CONTACTO", length = 30)
    private String contacto;
    @Column(name = "DIRECCION", length = 50)
    private String direccion;
    @Column(name = "TELEFONO", length = 15)
    private String telefono;
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
    @Column(name = "EXTRA_PRIMA", nullable = false)
    private short extraPrima;
    @OneToMany(mappedBy = "codGrupo")
    private List<Listaseg> listasegList;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public GrupoDeAsegurados() {
    }

    public GrupoDeAsegurados(Short codGrupo) {
        this.codGrupo = codGrupo;
    }

    public GrupoDeAsegurados(Short codGrupo, String nombre, Date fechaCarga, short estado, int nroEntrada, short extraPrima) {
        this.codGrupo = codGrupo;
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
        this.estado = estado;
        this.nroEntrada = nroEntrada;
        this.extraPrima = extraPrima;
    }

    public Short getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(Short codGrupo) {
        this.codGrupo = codGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
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

    public short getExtraPrima() {
        return extraPrima;
    }

    public void setExtraPrima(short extraPrima) {
        this.extraPrima = extraPrima;
    }

    public List<Listaseg> getListasegList() {
        return listasegList;
    }

    public void setListasegList(List<Listaseg> listasegList) {
        this.listasegList = listasegList;
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
        hash += (codGrupo != null ? codGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoDeAsegurados)) {
            return false;
        }
        GrupoDeAsegurados other = (GrupoDeAsegurados) object;
        if ((this.codGrupo == null && other.codGrupo != null) || (this.codGrupo != null && !this.codGrupo.equals(other.codGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.GrupoDeAsegurados[ codGrupo=" + codGrupo + " ]";
    }
    
}
