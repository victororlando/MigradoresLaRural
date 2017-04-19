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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "TIPO_PROFESION",  schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "TipoProfesion.findAll", query = "SELECT t FROM TipoProfesion t"),
    @NamedQuery(name = "TipoProfesion.findByTipoProfesion", query = "SELECT t FROM TipoProfesion t WHERE t.tipoProfesion = :tipoProfesion"),
    @NamedQuery(name = "TipoProfesion.findByNombre", query = "SELECT t FROM TipoProfesion t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TipoProfesion.findByNroEntrada", query = "SELECT t FROM TipoProfesion t WHERE t.nroEntrada = :nroEntrada")})
public class TipoProfesion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TIPO_PROFESION", nullable = false)
    private Short tipoProfesion;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoProfesion1")
    private List<Profesion> profesionList;

    public TipoProfesion() {
    }

    public TipoProfesion(Short tipoProfesion) {
        this.tipoProfesion = tipoProfesion;
    }

    public TipoProfesion(Short tipoProfesion, String nombre, int nroEntrada) {
        this.tipoProfesion = tipoProfesion;
        this.nombre = nombre;
        this.nroEntrada = nroEntrada;
    }

    public Short getTipoProfesion() {
        return tipoProfesion;
    }

    public void setTipoProfesion(Short tipoProfesion) {
        this.tipoProfesion = tipoProfesion;
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

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public List<Profesion> getProfesionList() {
        return profesionList;
    }

    public void setProfesionList(List<Profesion> profesionList) {
        this.profesionList = profesionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoProfesion != null ? tipoProfesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoProfesion)) {
            return false;
        }
        TipoProfesion other = (TipoProfesion) object;
        if ((this.tipoProfesion == null && other.tipoProfesion != null) || (this.tipoProfesion != null && !this.tipoProfesion.equals(other.tipoProfesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.TipoProfesion[ tipoProfesion=" + tipoProfesion + " ]";
    }
    
}
