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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "SECCIONES_EMPRESA", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "SeccionesEmpresa.findAll", query = "SELECT s FROM SeccionesEmpresa s"),
    @NamedQuery(name = "SeccionesEmpresa.findByCodDpto", query = "SELECT s FROM SeccionesEmpresa s WHERE s.codDpto = :codDpto"),
    @NamedQuery(name = "SeccionesEmpresa.findByNombre", query = "SELECT s FROM SeccionesEmpresa s WHERE s.nombre = :nombre")})
public class SeccionesEmpresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_DPTO", nullable = false)
    private Short codDpto;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;
    @OneToMany(mappedBy = "departamento")
    private List<Usuarios> usuariosList;

    public SeccionesEmpresa() {
    }

    public SeccionesEmpresa(Short codDpto) {
        this.codDpto = codDpto;
    }

    public SeccionesEmpresa(Short codDpto, String nombre) {
        this.codDpto = codDpto;
        this.nombre = nombre;
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

    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
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
        if (!(object instanceof SeccionesEmpresa)) {
            return false;
        }
        SeccionesEmpresa other = (SeccionesEmpresa) object;
        if ((this.codDpto == null && other.codDpto != null) || (this.codDpto != null && !this.codDpto.equals(other.codDpto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.SeccionesEmpresa[ codDpto=" + codDpto + " ]";
    }
    
}
