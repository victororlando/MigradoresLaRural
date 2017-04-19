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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "ZONAS", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Zonas.findAll", query = "SELECT z FROM Zonas z"),
    @NamedQuery(name = "Zonas.findByCodDpto", query = "SELECT z FROM Zonas z WHERE z.zonasPK.codDpto = :codDpto"),
    @NamedQuery(name = "Zonas.findByCodCiudad", query = "SELECT z FROM Zonas z WHERE z.zonasPK.codCiudad = :codCiudad"),
    @NamedQuery(name = "Zonas.findByCodZona", query = "SELECT z FROM Zonas z WHERE z.zonasPK.codZona = :codZona"),
    @NamedQuery(name = "Zonas.findByNombre", query = "SELECT z FROM Zonas z WHERE z.nombre = :nombre"),
    @NamedQuery(name = "Zonas.findByCalles", query = "SELECT z FROM Zonas z WHERE z.calles = :calles"),
    @NamedQuery(name = "Zonas.findByFechaCarga", query = "SELECT z FROM Zonas z WHERE z.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Zonas.findByNroEntrada", query = "SELECT z FROM Zonas z WHERE z.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Zonas.findByCritica", query = "SELECT z FROM Zonas z WHERE z.critica = :critica")})
public class Zonas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ZonasPK zonasPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 60)
    private String nombre;
    @Column(name = "CALLES", length = 200)
    private String calles;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "CRITICA", length = 1)
    private String critica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zonas")
    private List<Listaseg> listasegList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zonas1")
    private List<Listaseg> listasegList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zonas")
    private List<Negocios> negociosList;
    @JoinColumns({
        @JoinColumn(name = "COD_CIUDAD", referencedColumnName = "COD_CIUDAD", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COD_DPTO", referencedColumnName = "COD_DPTO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Ciudades ciudades;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public Zonas() {
    }

    public Zonas(ZonasPK zonasPK) {
        this.zonasPK = zonasPK;
    }

    public Zonas(ZonasPK zonasPK, String nombre, Date fechaCarga, int nroEntrada) {
        this.zonasPK = zonasPK;
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
        this.nroEntrada = nroEntrada;
    }

    public Zonas(short codDpto, short codCiudad, short codZona) {
        this.zonasPK = new ZonasPK(codDpto, codCiudad, codZona);
    }

    public ZonasPK getZonasPK() {
        return zonasPK;
    }

    public void setZonasPK(ZonasPK zonasPK) {
        this.zonasPK = zonasPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalles() {
        return calles;
    }

    public void setCalles(String calles) {
        this.calles = calles;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public String getCritica() {
        return critica;
    }

    public void setCritica(String critica) {
        this.critica = critica;
    }

    public List<Listaseg> getListasegList() {
        return listasegList;
    }

    public void setListasegList(List<Listaseg> listasegList) {
        this.listasegList = listasegList;
    }

    public List<Listaseg> getListasegList1() {
        return listasegList1;
    }

    public void setListasegList1(List<Listaseg> listasegList1) {
        this.listasegList1 = listasegList1;
    }

    public List<Negocios> getNegociosList() {
        return negociosList;
    }

    public void setNegociosList(List<Negocios> negociosList) {
        this.negociosList = negociosList;
    }

    public Ciudades getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
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
        hash += (zonasPK != null ? zonasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zonas)) {
            return false;
        }
        Zonas other = (Zonas) object;
        if ((this.zonasPK == null && other.zonasPK != null) || (this.zonasPK != null && !this.zonasPK.equals(other.zonasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Zonas[ zonasPK=" + zonasPK + " ]";
    }
    
}
