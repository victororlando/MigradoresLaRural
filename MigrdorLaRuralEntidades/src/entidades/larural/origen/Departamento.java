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
@Table(name = "DEPARTAMENTO", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d"),
    @NamedQuery(name = "Departamento.findByCodDpto", query = "SELECT d FROM Departamento d WHERE d.codDpto = :codDpto"),
    @NamedQuery(name = "Departamento.findByNombre", query = "SELECT d FROM Departamento d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Departamento.findByFechaCarga", query = "SELECT d FROM Departamento d WHERE d.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Departamento.findByNroEntrada", query = "SELECT d FROM Departamento d WHERE d.nroEntrada = :nroEntrada")})
public class Departamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_DPTO", nullable = false)
    private Short codDpto;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamento")
    private List<Ciudades> ciudadesList;

    public Departamento() {
    }

    public Departamento(Short codDpto) {
        this.codDpto = codDpto;
    }

    public Departamento(Short codDpto, String nombre, Date fechaCarga, int nroEntrada) {
        this.codDpto = codDpto;
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
        this.nroEntrada = nroEntrada;
    }

    public Short getCodDpto() {
        return codDpto;
    }

    public void setCodDpto(Short codDpto) {
        this.codDpto = codDpto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public List<Ciudades> getCiudadesList() {
        return ciudadesList;
    }

    public void setCiudadesList(List<Ciudades> ciudadesList) {
        this.ciudadesList = ciudadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDpto != null ? codDpto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.codDpto == null && other.codDpto != null) || (this.codDpto != null && !this.codDpto.equals(other.codDpto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Departamento[ codDpto=" + codDpto + " ]";
    }
    
}
