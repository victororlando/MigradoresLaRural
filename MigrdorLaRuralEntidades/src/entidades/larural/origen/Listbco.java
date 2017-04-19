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

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LISTBCO",schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Listbco.findAll", query = "SELECT l FROM Listbco l"),
    @NamedQuery(name = "Listbco.findByCodEntidad", query = "SELECT l FROM Listbco l WHERE l.codEntidad = :codEntidad"),
    @NamedQuery(name = "Listbco.findByNombre", query = "SELECT l FROM Listbco l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Listbco.findByDireccion", query = "SELECT l FROM Listbco l WHERE l.direccion = :direccion"),
    @NamedQuery(name = "Listbco.findByTelefono", query = "SELECT l FROM Listbco l WHERE l.telefono = :telefono"),
    @NamedQuery(name = "Listbco.findByEmail", query = "SELECT l FROM Listbco l WHERE l.email = :email"),
    @NamedQuery(name = "Listbco.findByContacto", query = "SELECT l FROM Listbco l WHERE l.contacto = :contacto"),
    @NamedQuery(name = "Listbco.findByFechaCarga", query = "SELECT l FROM Listbco l WHERE l.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Listbco.findByNroEntrada", query = "SELECT l FROM Listbco l WHERE l.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Listbco.findByActivo", query = "SELECT l FROM Listbco l WHERE l.activo = :activo")})
public class Listbco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_ENTIDAD", nullable = false)
    private Short codEntidad;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;
    @Column(name = "DIRECCION", length = 50)
    private String direccion;
    @Column(name = "TELEFONO", length = 20)
    private String telefono;
    @Column(name = "EMAIL", length = 50)
    private String email;
    @Column(name = "CONTACTO", length = 40)
    private String contacto;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "ACTIVO", nullable = false, length = 1)
    private String activo;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listbco")
    private List<Tarjetas> tarjetasList;

    public Listbco() {
    }

    public Listbco(Short codEntidad) {
        this.codEntidad = codEntidad;
    }

    public Listbco(Short codEntidad, String nombre, Date fechaCarga, int nroEntrada, String activo) {
        this.codEntidad = codEntidad;
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
        this.nroEntrada = nroEntrada;
        this.activo = activo;
    }

    public Short getCodEntidad() {
        return codEntidad;
    }

    public void setCodEntidad(Short codEntidad) {
        this.codEntidad = codEntidad;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
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

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public List<Tarjetas> getTarjetasList() {
        return tarjetasList;
    }

    public void setTarjetasList(List<Tarjetas> tarjetasList) {
        this.tarjetasList = tarjetasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEntidad != null ? codEntidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Listbco)) {
            return false;
        }
        Listbco other = (Listbco) object;
        if ((this.codEntidad == null && other.codEntidad != null) || (this.codEntidad != null && !this.codEntidad.equals(other.codEntidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Listbco[ codEntidad=" + codEntidad + " ]";
    }
    
}
