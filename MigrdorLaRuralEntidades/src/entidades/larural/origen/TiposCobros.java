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
@Table(name = "TIPOS_COBROS",  schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"DESCRIPCION", "ABREVIATURA"})})
@NamedQueries({
    @NamedQuery(name = "TiposCobros.findAll", query = "SELECT t FROM TiposCobros t"),
    @NamedQuery(name = "TiposCobros.findByCodTipcobro", query = "SELECT t FROM TiposCobros t WHERE t.codTipcobro = :codTipcobro"),
    @NamedQuery(name = "TiposCobros.findByDescripcion", query = "SELECT t FROM TiposCobros t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TiposCobros.findByAbreviatura", query = "SELECT t FROM TiposCobros t WHERE t.abreviatura = :abreviatura"),
    @NamedQuery(name = "TiposCobros.findByNroEntrada", query = "SELECT t FROM TiposCobros t WHERE t.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "TiposCobros.findByCodUsuario", query = "SELECT t FROM TiposCobros t WHERE t.codUsuario = :codUsuario"),
    @NamedQuery(name = "TiposCobros.findByTarjeta", query = "SELECT t FROM TiposCobros t WHERE t.tarjeta = :tarjeta"),
    @NamedQuery(name = "TiposCobros.findByCuotas", query = "SELECT t FROM TiposCobros t WHERE t.cuotas = :cuotas")})
public class TiposCobros implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codTipcobro")
    private List<Propauto> propautoList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_TIPCOBRO", nullable = false)
    private Short codTipcobro;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 30)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ABREVIATURA", nullable = false, length = 3)
    private String abreviatura;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private long nroEntrada;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO", nullable = false)
    private short codUsuario;
    @Basic(optional = false)
    @Column(name = "TARJETA", nullable = false)
    private short tarjeta;
    @Basic(optional = false)
    @Column(name = "CUOTAS", nullable = false)
    private short cuotas;
    @OneToMany(mappedBy = "codTipcobro")
    private List<Polsdemi> polsdemiList;

    public TiposCobros() {
    }

    public TiposCobros(Short codTipcobro) {
        this.codTipcobro = codTipcobro;
    }

    public TiposCobros(Short codTipcobro, String descripcion, String abreviatura, long nroEntrada, short codUsuario, short tarjeta, short cuotas) {
        this.codTipcobro = codTipcobro;
        this.descripcion = descripcion;
        this.abreviatura = abreviatura;
        this.nroEntrada = nroEntrada;
        this.codUsuario = codUsuario;
        this.tarjeta = tarjeta;
        this.cuotas = cuotas;
    }

    public Short getCodTipcobro() {
        return codTipcobro;
    }

    public void setCodTipcobro(Short codTipcobro) {
        this.codTipcobro = codTipcobro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public long getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(long nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public short getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(short codUsuario) {
        this.codUsuario = codUsuario;
    }

    public short getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(short tarjeta) {
        this.tarjeta = tarjeta;
    }

    public short getCuotas() {
        return cuotas;
    }

    public void setCuotas(short cuotas) {
        this.cuotas = cuotas;
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
        hash += (codTipcobro != null ? codTipcobro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposCobros)) {
            return false;
        }
        TiposCobros other = (TiposCobros) object;
        if ((this.codTipcobro == null && other.codTipcobro != null) || (this.codTipcobro != null && !this.codTipcobro.equals(other.codTipcobro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.TiposCobros[ codTipcobro=" + codTipcobro + " ]";
    }

    public List<Propauto> getPropautoList() {
        return propautoList;
    }

    public void setPropautoList(List<Propauto> propautoList) {
        this.propautoList = propautoList;
    }
    
}
