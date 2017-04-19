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
@Table(name = "MARCAS",schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Marcas.findAll", query = "SELECT m FROM Marcas m"),
    @NamedQuery(name = "Marcas.findByCodMarca", query = "SELECT m FROM Marcas m WHERE m.codMarca = :codMarca"),
    @NamedQuery(name = "Marcas.findByNombre", query = "SELECT m FROM Marcas m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Marcas.findByNroEntrada", query = "SELECT m FROM Marcas m WHERE m.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Marcas.findByFechaCarga", query = "SELECT m FROM Marcas m WHERE m.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Marcas.findByEspecial", query = "SELECT m FROM Marcas m WHERE m.especial = :especial"),
    @NamedQuery(name = "Marcas.findByRexluido", query = "SELECT m FROM Marcas m WHERE m.rexluido = :rexluido"),
    @NamedQuery(name = "Marcas.findByAcepesp", query = "SELECT m FROM Marcas m WHERE m.acepesp = :acepesp")})
public class Marcas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_MARCA", nullable = false)
    private Short codMarca;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 60)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Column(name = "ESPECIAL")
    private Short especial;
    @Column(name = "REXLUIDO")
    private Character rexluido;
    @Column(name = "ACEPESP")
    private Character acepesp;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marcas")
    private List<ModelosVehiculos> modelosVehiculosList;

    public Marcas() {
    }

    public Marcas(Short codMarca) {
        this.codMarca = codMarca;
    }

    public Marcas(Short codMarca, String nombre, int nroEntrada, Date fechaCarga) {
        this.codMarca = codMarca;
        this.nombre = nombre;
        this.nroEntrada = nroEntrada;
        this.fechaCarga = fechaCarga;
    }

    public Short getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(Short codMarca) {
        this.codMarca = codMarca;
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

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Short getEspecial() {
        return especial;
    }

    public void setEspecial(Short especial) {
        this.especial = especial;
    }

    public Character getRexluido() {
        return rexluido;
    }

    public void setRexluido(Character rexluido) {
        this.rexluido = rexluido;
    }

    public Character getAcepesp() {
        return acepesp;
    }

    public void setAcepesp(Character acepesp) {
        this.acepesp = acepesp;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public List<ModelosVehiculos> getModelosVehiculosList() {
        return modelosVehiculosList;
    }

    public void setModelosVehiculosList(List<ModelosVehiculos> modelosVehiculosList) {
        this.modelosVehiculosList = modelosVehiculosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMarca != null ? codMarca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcas)) {
            return false;
        }
        Marcas other = (Marcas) object;
        if ((this.codMarca == null && other.codMarca != null) || (this.codMarca != null && !this.codMarca.equals(other.codMarca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Marcas[ codMarca=" + codMarca + " ]";
    }
    
}
