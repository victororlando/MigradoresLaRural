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
@Table(name = "RUBROS", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Rubros.findAll", query = "SELECT r FROM Rubros r"),
    @NamedQuery(name = "Rubros.findByCodRubro", query = "SELECT r FROM Rubros r WHERE r.codRubro = :codRubro"),
    @NamedQuery(name = "Rubros.findByNombre", query = "SELECT r FROM Rubros r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Rubros.findByEspecial", query = "SELECT r FROM Rubros r WHERE r.especial = :especial"),
    @NamedQuery(name = "Rubros.findByFechaCarga", query = "SELECT r FROM Rubros r WHERE r.fechaCarga = :fechaCarga")})
public class Rubros implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_RUBRO", nullable = false)
    private Short codRubro;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "ESPECIAL", nullable = false)
    private short especial;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(mappedBy = "codRubro")
    private List<ItemDePolizas> itemDePolizasList;

    public Rubros() {
    }

    public Rubros(Short codRubro) {
        this.codRubro = codRubro;
    }

    public Rubros(Short codRubro, String nombre, short especial, Date fechaCarga) {
        this.codRubro = codRubro;
        this.nombre = nombre;
        this.especial = especial;
        this.fechaCarga = fechaCarga;
    }

    public Short getCodRubro() {
        return codRubro;
    }

    public void setCodRubro(Short codRubro) {
        this.codRubro = codRubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEspecial() {
        return especial;
    }

    public void setEspecial(short especial) {
        this.especial = especial;
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
        hash += (codRubro != null ? codRubro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rubros)) {
            return false;
        }
        Rubros other = (Rubros) object;
        if ((this.codRubro == null && other.codRubro != null) || (this.codRubro != null && !this.codRubro.equals(other.codRubro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Rubros[ codRubro=" + codRubro + " ]";
    }
    
}
