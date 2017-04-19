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
@Table(name = "ASEG_ACC_PER", schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "AsegAccPer.findAll", query = "SELECT a FROM AsegAccPer a"),
    @NamedQuery(name = "AsegAccPer.findByNAseg", query = "SELECT a FROM AsegAccPer a WHERE a.nAseg = :nAseg"),
    @NamedQuery(name = "AsegAccPer.findByNombre", query = "SELECT a FROM AsegAccPer a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "AsegAccPer.findByDocumento", query = "SELECT a FROM AsegAccPer a WHERE a.documento = :documento"),
    @NamedQuery(name = "AsegAccPer.findByNroEntrada", query = "SELECT a FROM AsegAccPer a WHERE a.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "AsegAccPer.findByCodUsuario", query = "SELECT a FROM AsegAccPer a WHERE a.codUsuario = :codUsuario"),
    @NamedQuery(name = "AsegAccPer.findByFechaCarga", query = "SELECT a FROM AsegAccPer a WHERE a.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "AsegAccPer.findByCodUsuarioModifica", query = "SELECT a FROM AsegAccPer a WHERE a.codUsuarioModifica = :codUsuarioModifica"),
    @NamedQuery(name = "AsegAccPer.findByFechaModifica", query = "SELECT a FROM AsegAccPer a WHERE a.fechaModifica = :fechaModifica"),
    @NamedQuery(name = "AsegAccPer.findByFechaNacimiento", query = "SELECT a FROM AsegAccPer a WHERE a.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "AsegAccPer.findByOcupacion", query = "SELECT a FROM AsegAccPer a WHERE a.ocupacion = :ocupacion")})
public class AsegAccPer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "N_ASEG", nullable = false)
    private Integer nAseg;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DOCUMENTO", nullable = false, length = 20)
    private String documento;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private long nroEntrada;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO", nullable = false)
    private short codUsuario;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO_MODIFICA", nullable = false)
    private short codUsuarioModifica;
    @Basic(optional = false)
    @Column(name = "FECHA_MODIFICA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModifica;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "OCUPACION", length = 80)
    private String ocupacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nAseg")
    private List<AccPersonales> accPersonalesList;

    public AsegAccPer() {
    }

    public AsegAccPer(Integer nAseg) {
        this.nAseg = nAseg;
    }

    public AsegAccPer(Integer nAseg, String nombre, String documento, long nroEntrada, short codUsuario, Date fechaCarga, short codUsuarioModifica, Date fechaModifica) {
        this.nAseg = nAseg;
        this.nombre = nombre;
        this.documento = documento;
        this.nroEntrada = nroEntrada;
        this.codUsuario = codUsuario;
        this.fechaCarga = fechaCarga;
        this.codUsuarioModifica = codUsuarioModifica;
        this.fechaModifica = fechaModifica;
    }

    public Integer getNAseg() {
        return nAseg;
    }

    public void setNAseg(Integer nAseg) {
        this.nAseg = nAseg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public short getCodUsuarioModifica() {
        return codUsuarioModifica;
    }

    public void setCodUsuarioModifica(short codUsuarioModifica) {
        this.codUsuarioModifica = codUsuarioModifica;
    }

    public Date getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(Date fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public List<AccPersonales> getAccPersonalesList() {
        return accPersonalesList;
    }

    public void setAccPersonalesList(List<AccPersonales> accPersonalesList) {
        this.accPersonalesList = accPersonalesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nAseg != null ? nAseg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsegAccPer)) {
            return false;
        }
        AsegAccPer other = (AsegAccPer) object;
        if ((this.nAseg == null && other.nAseg != null) || (this.nAseg != null && !this.nAseg.equals(other.nAseg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.AsegAccPer[ nAseg=" + nAseg + " ]";
    }
    
}
