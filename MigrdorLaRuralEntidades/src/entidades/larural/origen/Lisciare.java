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
@Table(name = "LISCIARE", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Lisciare.findAll", query = "SELECT l FROM Lisciare l"),
    @NamedQuery(name = "Lisciare.findByNCia", query = "SELECT l FROM Lisciare l WHERE l.nCia = :nCia"),
    @NamedQuery(name = "Lisciare.findByNombre", query = "SELECT l FROM Lisciare l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Lisciare.findByRuc", query = "SELECT l FROM Lisciare l WHERE l.ruc = :ruc"),
    @NamedQuery(name = "Lisciare.findByDireccion", query = "SELECT l FROM Lisciare l WHERE l.direccion = :direccion"),
    @NamedQuery(name = "Lisciare.findByTelefono", query = "SELECT l FROM Lisciare l WHERE l.telefono = :telefono"),
    @NamedQuery(name = "Lisciare.findByEmail", query = "SELECT l FROM Lisciare l WHERE l.email = :email"),
    @NamedQuery(name = "Lisciare.findByLocalExterior", query = "SELECT l FROM Lisciare l WHERE l.localExterior = :localExterior"),
    @NamedQuery(name = "Lisciare.findByCodUsuario", query = "SELECT l FROM Lisciare l WHERE l.codUsuario = :codUsuario"),
    @NamedQuery(name = "Lisciare.findByFechaCarga", query = "SELECT l FROM Lisciare l WHERE l.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Lisciare.findByCodPais", query = "SELECT l FROM Lisciare l WHERE l.codPais = :codPais"),
    @NamedQuery(name = "Lisciare.findByNroEntrada", query = "SELECT l FROM Lisciare l WHERE l.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Lisciare.findByCodBenef", query = "SELECT l FROM Lisciare l WHERE l.codBenef = :codBenef"),
    @NamedQuery(name = "Lisciare.findByCodSis", query = "SELECT l FROM Lisciare l WHERE l.codSis = :codSis")})
public class Lisciare implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "N_CIA", nullable = false)
    private Short nCia;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "RUC", length = 15)
    private String ruc;
    @Column(name = "DIRECCION", length = 80)
    private String direccion;
    @Column(name = "TELEFONO", length = 30)
    private String telefono;
    @Column(name = "EMAIL", length = 50)
    private String email;
    @Basic(optional = false)
    @Column(name = "LOCAL_EXTERIOR", nullable = false)
    private short localExterior;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO", nullable = false)
    private short codUsuario;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "COD_PAIS", nullable = false)
    private short codPais;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "COD_BENEF")
    private Integer codBenef;
    @Column(name = "COD_SIS")
    private Short codSis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lisciare")
    private List<Districoase> districoaseList;
    @OneToMany(mappedBy = "ciaCedente")
    private List<Polsdemi> polsdemiList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciaPiloto")
    private List<Policoase> policoaseList;

    public Lisciare() {
    }

    public Lisciare(Short nCia) {
        this.nCia = nCia;
    }

    public Lisciare(Short nCia, String nombre, short localExterior, short codUsuario, Date fechaCarga, short codPais, int nroEntrada) {
        this.nCia = nCia;
        this.nombre = nombre;
        this.localExterior = localExterior;
        this.codUsuario = codUsuario;
        this.fechaCarga = fechaCarga;
        this.codPais = codPais;
        this.nroEntrada = nroEntrada;
    }

    public Short getNCia() {
        return nCia;
    }

    public void setNCia(Short nCia) {
        this.nCia = nCia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public short getLocalExterior() {
        return localExterior;
    }

    public void setLocalExterior(short localExterior) {
        this.localExterior = localExterior;
    }

    public short getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(short codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public short getCodPais() {
        return codPais;
    }

    public void setCodPais(short codPais) {
        this.codPais = codPais;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public Integer getCodBenef() {
        return codBenef;
    }

    public void setCodBenef(Integer codBenef) {
        this.codBenef = codBenef;
    }

    public Short getCodSis() {
        return codSis;
    }

    public void setCodSis(Short codSis) {
        this.codSis = codSis;
    }

    public List<Districoase> getDistricoaseList() {
        return districoaseList;
    }

    public void setDistricoaseList(List<Districoase> districoaseList) {
        this.districoaseList = districoaseList;
    }

    public List<Polsdemi> getPolsdemiList() {
        return polsdemiList;
    }

    public void setPolsdemiList(List<Polsdemi> polsdemiList) {
        this.polsdemiList = polsdemiList;
    }

    public List<Policoase> getPolicoaseList() {
        return policoaseList;
    }

    public void setPolicoaseList(List<Policoase> policoaseList) {
        this.policoaseList = policoaseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nCia != null ? nCia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lisciare)) {
            return false;
        }
        Lisciare other = (Lisciare) object;
        if ((this.nCia == null && other.nCia != null) || (this.nCia != null && !this.nCia.equals(other.nCia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Lisciare[ nCia=" + nCia + " ]";
    }
    
}
