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
@Table(name = "PROCEDENCIA",schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Procedencia.findAll", query = "SELECT p FROM Procedencia p"),
    @NamedQuery(name = "Procedencia.findByCodProcedencia", query = "SELECT p FROM Procedencia p WHERE p.codProcedencia = :codProcedencia"),
    @NamedQuery(name = "Procedencia.findByDescripcion", query = "SELECT p FROM Procedencia p WHERE p.descripcion = :descripcion")})
public class Procedencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PROCEDENCIA", nullable = false)
    private Short codProcedencia;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 25)
    private String descripcion;
    @OneToMany(mappedBy = "codProcedencia")
    private List<Proauemi> proauemiList;

    public Procedencia() {
    }

    public Procedencia(Short codProcedencia) {
        this.codProcedencia = codProcedencia;
    }

    public Procedencia(Short codProcedencia, String descripcion) {
        this.codProcedencia = codProcedencia;
        this.descripcion = descripcion;
    }

    public Short getCodProcedencia() {
        return codProcedencia;
    }

    public void setCodProcedencia(Short codProcedencia) {
        this.codProcedencia = codProcedencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Proauemi> getProauemiList() {
        return proauemiList;
    }

    public void setProauemiList(List<Proauemi> proauemiList) {
        this.proauemiList = proauemiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProcedencia != null ? codProcedencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procedencia)) {
            return false;
        }
        Procedencia other = (Procedencia) object;
        if ((this.codProcedencia == null && other.codProcedencia != null) || (this.codProcedencia != null && !this.codProcedencia.equals(other.codProcedencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Procedencia[ codProcedencia=" + codProcedencia + " ]";
    }
    
}
