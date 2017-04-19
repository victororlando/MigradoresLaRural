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
@Table(name = "FORMAS_PAGO",  schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"DESCRIPCION"})})
@NamedQueries({
    @NamedQuery(name = "FormasPago.findAll", query = "SELECT f FROM FormasPago f"),
    @NamedQuery(name = "FormasPago.findByCodFormaPago", query = "SELECT f FROM FormasPago f WHERE f.codFormaPago = :codFormaPago"),
    @NamedQuery(name = "FormasPago.findByDescripcion", query = "SELECT f FROM FormasPago f WHERE f.descripcion = :descripcion"),
    @NamedQuery(name = "FormasPago.findByCalculo", query = "SELECT f FROM FormasPago f WHERE f.calculo = :calculo")})
public class FormasPago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_FORMA_PAGO", nullable = false)
    private Short codFormaPago;
    @Column(name = "DESCRIPCION", length = 40)
    private String descripcion;
    @Column(name = "CALCULO")
    private Short calculo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codFormaPago")
    private List<Polsdemi> polsdemiList;

    public FormasPago() {
    }

    public FormasPago(Short codFormaPago) {
        this.codFormaPago = codFormaPago;
    }

    public Short getCodFormaPago() {
        return codFormaPago;
    }

    public void setCodFormaPago(Short codFormaPago) {
        this.codFormaPago = codFormaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Short getCalculo() {
        return calculo;
    }

    public void setCalculo(Short calculo) {
        this.calculo = calculo;
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
        hash += (codFormaPago != null ? codFormaPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormasPago)) {
            return false;
        }
        FormasPago other = (FormasPago) object;
        if ((this.codFormaPago == null && other.codFormaPago != null) || (this.codFormaPago != null && !this.codFormaPago.equals(other.codFormaPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.FormasPago[ codFormaPago=" + codFormaPago + " ]";
    }
    
}
