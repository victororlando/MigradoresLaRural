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
@Table(name = "CIUDADES", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Ciudades.findAll", query = "SELECT c FROM Ciudades c"),
    @NamedQuery(name = "Ciudades.findByCodCiudad", query = "SELECT c FROM Ciudades c WHERE c.ciudadesPK.codCiudad = :codCiudad"),
    @NamedQuery(name = "Ciudades.findByCodDpto", query = "SELECT c FROM Ciudades c WHERE c.ciudadesPK.codDpto = :codDpto"),
    @NamedQuery(name = "Ciudades.findByCiudadNombre", query = "SELECT c FROM Ciudades c WHERE c.ciudadNombre = :ciudadNombre"),
    @NamedQuery(name = "Ciudades.findByFechaCarga", query = "SELECT c FROM Ciudades c WHERE c.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Ciudades.findByNroEntrada", query = "SELECT c FROM Ciudades c WHERE c.nroEntrada = :nroEntrada")})
public class Ciudades implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CiudadesPK ciudadesPK;
    @Basic(optional = false)
    @Column(name = "CIUDAD_NOMBRE", nullable = false, length = 60)
    private String ciudadNombre;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudades")
    private List<Agencias> agenciasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudades")
    private List<Zonas> zonasList;
    @JoinColumn(name = "COD_DPTO", referencedColumnName = "COD_DPTO", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Departamento departamento;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudades")
    private List<AgentesBroker> agentesBrokerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudades")
    private List<Centros> centrosList;

    public Ciudades() {
    }

    public Ciudades(CiudadesPK ciudadesPK) {
        this.ciudadesPK = ciudadesPK;
    }

    public Ciudades(CiudadesPK ciudadesPK, String ciudadNombre, Date fechaCarga, int nroEntrada) {
        this.ciudadesPK = ciudadesPK;
        this.ciudadNombre = ciudadNombre;
        this.fechaCarga = fechaCarga;
        this.nroEntrada = nroEntrada;
    }

    public Ciudades(short codCiudad, short codDpto) {
        this.ciudadesPK = new CiudadesPK(codCiudad, codDpto);
    }

    public CiudadesPK getCiudadesPK() {
        return ciudadesPK;
    }

    public void setCiudadesPK(CiudadesPK ciudadesPK) {
        this.ciudadesPK = ciudadesPK;
    }

    public String getCiudadNombre() {
        return ciudadNombre;
    }

    public void setCiudadNombre(String ciudadNombre) {
        this.ciudadNombre = ciudadNombre;
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

    public List<Agencias> getAgenciasList() {
        return agenciasList;
    }

    public void setAgenciasList(List<Agencias> agenciasList) {
        this.agenciasList = agenciasList;
    }

    public List<Zonas> getZonasList() {
        return zonasList;
    }

    public void setZonasList(List<Zonas> zonasList) {
        this.zonasList = zonasList;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public List<AgentesBroker> getAgentesBrokerList() {
        return agentesBrokerList;
    }

    public void setAgentesBrokerList(List<AgentesBroker> agentesBrokerList) {
        this.agentesBrokerList = agentesBrokerList;
    }

    public List<Centros> getCentrosList() {
        return centrosList;
    }

    public void setCentrosList(List<Centros> centrosList) {
        this.centrosList = centrosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ciudadesPK != null ? ciudadesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudades)) {
            return false;
        }
        Ciudades other = (Ciudades) object;
        if ((this.ciudadesPK == null && other.ciudadesPK != null) || (this.ciudadesPK != null && !this.ciudadesPK.equals(other.ciudadesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Ciudades[ ciudadesPK=" + ciudadesPK + " ]";
    }
    
}
