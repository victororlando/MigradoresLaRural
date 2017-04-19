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

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "SUB_RUBRO", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "SubRubro.findAll", query = "SELECT s FROM SubRubro s"),
    @NamedQuery(name = "SubRubro.findBySubRubro", query = "SELECT s FROM SubRubro s WHERE s.subRubro = :subRubro"),
    @NamedQuery(name = "SubRubro.findByNombre", query = "SELECT s FROM SubRubro s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "SubRubro.findByFechaCarga", query = "SELECT s FROM SubRubro s WHERE s.fechaCarga = :fechaCarga")})
public class SubRubro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUB_RUBRO", nullable = false)
    private Short subRubro;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(mappedBy = "subRubro")
    private List<ItemDePolizas> itemDePolizasList;

    public SubRubro() {
    }

    public SubRubro(Short subRubro) {
        this.subRubro = subRubro;
    }

    public SubRubro(Short subRubro, String nombre, Date fechaCarga) {
        this.subRubro = subRubro;
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
    }

    public Short getSubRubro() {
        return subRubro;
    }

    public void setSubRubro(Short subRubro) {
        this.subRubro = subRubro;
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

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public List<ItemDePolizas> getItemDePolizasList() {
        return itemDePolizasList;
    }

    public void setItemDePolizasList(List<ItemDePolizas> itemDePolizasList) {
        this.itemDePolizasList = itemDePolizasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subRubro != null ? subRubro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubRubro)) {
            return false;
        }
        SubRubro other = (SubRubro) object;
        if ((this.subRubro == null && other.subRubro != null) || (this.subRubro != null && !this.subRubro.equals(other.subRubro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.SubRubro[ subRubro=" + subRubro + " ]";
    }
    
}
