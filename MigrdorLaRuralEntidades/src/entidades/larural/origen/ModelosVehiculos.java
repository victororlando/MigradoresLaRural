/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "MODELOS_VEHICULOS",schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "ModelosVehiculos.findAll", query = "SELECT m FROM ModelosVehiculos m"),
    @NamedQuery(name = "ModelosVehiculos.findByCodMarca", query = "SELECT m FROM ModelosVehiculos m WHERE m.modelosVehiculosPK.codMarca = :codMarca"),
    @NamedQuery(name = "ModelosVehiculos.findByCodModelo", query = "SELECT m FROM ModelosVehiculos m WHERE m.modelosVehiculosPK.codModelo = :codModelo"),
    @NamedQuery(name = "ModelosVehiculos.findByNombre", query = "SELECT m FROM ModelosVehiculos m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "ModelosVehiculos.findByCodMoney", query = "SELECT m FROM ModelosVehiculos m WHERE m.codMoney = :codMoney"),
    @NamedQuery(name = "ModelosVehiculos.findByValor", query = "SELECT m FROM ModelosVehiculos m WHERE m.valor = :valor"),
    @NamedQuery(name = "ModelosVehiculos.findByCodTipo", query = "SELECT m FROM ModelosVehiculos m WHERE m.modelosVehiculosPK.codTipo = :codTipo"),
    @NamedQuery(name = "ModelosVehiculos.findByNroEntrada", query = "SELECT m FROM ModelosVehiculos m WHERE m.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "ModelosVehiculos.findByFechaCarga", query = "SELECT m FROM ModelosVehiculos m WHERE m.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "ModelosVehiculos.findByRexluido", query = "SELECT m FROM ModelosVehiculos m WHERE m.rexluido = :rexluido"),
    @NamedQuery(name = "ModelosVehiculos.findByAcepesp", query = "SELECT m FROM ModelosVehiculos m WHERE m.acepesp = :acepesp"),
    @NamedQuery(name = "ModelosVehiculos.findByCantocu", query = "SELECT m FROM ModelosVehiculos m WHERE m.cantocu = :cantocu")})
public class ModelosVehiculos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModelosVehiculosPK modelosVehiculosPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "COD_MONEY", nullable = false)
    private short codMoney;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "VALOR", nullable = false, precision = 15, scale = 2)
    private BigDecimal valor;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Column(name = "REXLUIDO")
    private Character rexluido;
    @Column(name = "ACEPESP")
    private Character acepesp;
    @Column(name = "CANTOCU")
    private Short cantocu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modelosVehiculos")
    private List<Proauemi> proauemiList;
    @JoinColumn(name = "COD_MARCA", referencedColumnName = "COD_MARCA", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Marcas marcas;
    @JoinColumn(name = "COD_TIPO", referencedColumnName = "COD_TIPO", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TiposVehiculos tiposVehiculos;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public ModelosVehiculos() {
    }

    public ModelosVehiculos(ModelosVehiculosPK modelosVehiculosPK) {
        this.modelosVehiculosPK = modelosVehiculosPK;
    }

    public ModelosVehiculos(ModelosVehiculosPK modelosVehiculosPK, String nombre, short codMoney, BigDecimal valor, int nroEntrada, Date fechaCarga) {
        this.modelosVehiculosPK = modelosVehiculosPK;
        this.nombre = nombre;
        this.codMoney = codMoney;
        this.valor = valor;
        this.nroEntrada = nroEntrada;
        this.fechaCarga = fechaCarga;
    }

    public ModelosVehiculos(short codMarca, short codModelo, short codTipo) {
        this.modelosVehiculosPK = new ModelosVehiculosPK(codMarca, codModelo, codTipo);
    }

    public ModelosVehiculosPK getModelosVehiculosPK() {
        return modelosVehiculosPK;
    }

    public void setModelosVehiculosPK(ModelosVehiculosPK modelosVehiculosPK) {
        this.modelosVehiculosPK = modelosVehiculosPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getCodMoney() {
        return codMoney;
    }

    public void setCodMoney(short codMoney) {
        this.codMoney = codMoney;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
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

    public Short getCantocu() {
        return cantocu;
    }

    public void setCantocu(Short cantocu) {
        this.cantocu = cantocu;
    }

    public List<Proauemi> getProauemiList() {
        return proauemiList;
    }

    public void setProauemiList(List<Proauemi> proauemiList) {
        this.proauemiList = proauemiList;
    }

    public Marcas getMarcas() {
        return marcas;
    }

    public void setMarcas(Marcas marcas) {
        this.marcas = marcas;
    }

    public TiposVehiculos getTiposVehiculos() {
        return tiposVehiculos;
    }

    public void setTiposVehiculos(TiposVehiculos tiposVehiculos) {
        this.tiposVehiculos = tiposVehiculos;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modelosVehiculosPK != null ? modelosVehiculosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelosVehiculos)) {
            return false;
        }
        ModelosVehiculos other = (ModelosVehiculos) object;
        if ((this.modelosVehiculosPK == null && other.modelosVehiculosPK != null) || (this.modelosVehiculosPK != null && !this.modelosVehiculosPK.equals(other.modelosVehiculosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ModelosVehiculos[ modelosVehiculosPK=" + modelosVehiculosPK + " ]";
    }
    
}
