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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "MONEDAS", schema = "SOFTTEN",  uniqueConstraints = {
    @UniqueConstraint(columnNames = {"SIMBOLO"}),
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "Monedas.findAll", query = "SELECT m FROM Monedas m"),
    @NamedQuery(name = "Monedas.findByCodMoney", query = "SELECT m FROM Monedas m WHERE m.codMoney = :codMoney"),
    @NamedQuery(name = "Monedas.findByNombre", query = "SELECT m FROM Monedas m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Monedas.findBySimbolo", query = "SELECT m FROM Monedas m WHERE m.simbolo = :simbolo"),
    @NamedQuery(name = "Monedas.findByFechaCarga", query = "SELECT m FROM Monedas m WHERE m.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Monedas.findByCodUsuario", query = "SELECT m FROM Monedas m WHERE m.codUsuario = :codUsuario"),
    @NamedQuery(name = "Monedas.findByCodMonedaSeprelad", query = "SELECT m FROM Monedas m WHERE m.codMonedaSeprelad = :codMonedaSeprelad"),
    @NamedQuery(name = "Monedas.findByFormato", query = "SELECT m FROM Monedas m WHERE m.formato = :formato"),
    @NamedQuery(name = "Monedas.findByCantDecimales", query = "SELECT m FROM Monedas m WHERE m.cantDecimales = :cantDecimales"),
    @NamedQuery(name = "Monedas.findBySimboloTesaka", query = "SELECT m FROM Monedas m WHERE m.simboloTesaka = :simboloTesaka")})
public class Monedas implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codMoney")
    private List<CoberturasDetalle> coberturasDetalleList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_MONEY", nullable = false)
    private Short codMoney;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "SIMBOLO", nullable = false, length = 4)
    private String simbolo;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO", nullable = false)
    private short codUsuario;
    @Column(name = "COD_MONEDA_SEPRELAD")
    private Short codMonedaSeprelad;
    @Column(name = "FORMATO", length = 8)
    private String formato;
    @Basic(optional = false)
    @Column(name = "CANT_DECIMALES", nullable = false)
    private short cantDecimales;
    @Column(name = "SIMBOLO_TESAKA", length = 4)
    private String simboloTesaka;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codMoney")
    private List<Polsdemi> polsdemiList;

    public Monedas() {
    }

    public Monedas(Short codMoney) {
        this.codMoney = codMoney;
    }

    public Monedas(Short codMoney, String nombre, String simbolo, Date fechaCarga, short codUsuario, short cantDecimales) {
        this.codMoney = codMoney;
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.fechaCarga = fechaCarga;
        this.codUsuario = codUsuario;
        this.cantDecimales = cantDecimales;
    }

    public Short getCodMoney() {
        return codMoney;
    }

    public void setCodMoney(Short codMoney) {
        this.codMoney = codMoney;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public short getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(short codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Short getCodMonedaSeprelad() {
        return codMonedaSeprelad;
    }

    public void setCodMonedaSeprelad(Short codMonedaSeprelad) {
        this.codMonedaSeprelad = codMonedaSeprelad;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public short getCantDecimales() {
        return cantDecimales;
    }

    public void setCantDecimales(short cantDecimales) {
        this.cantDecimales = cantDecimales;
    }

    public String getSimboloTesaka() {
        return simboloTesaka;
    }

    public void setSimboloTesaka(String simboloTesaka) {
        this.simboloTesaka = simboloTesaka;
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
        hash += (codMoney != null ? codMoney.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Monedas)) {
            return false;
        }
        Monedas other = (Monedas) object;
        if ((this.codMoney == null && other.codMoney != null) || (this.codMoney != null && !this.codMoney.equals(other.codMoney))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Monedas[ codMoney=" + codMoney + " ]";
    }

    public List<CoberturasDetalle> getCoberturasDetalleList() {
        return coberturasDetalleList;
    }

    public void setCoberturasDetalleList(List<CoberturasDetalle> coberturasDetalleList) {
        this.coberturasDetalleList = coberturasDetalleList;
    }
    
}
