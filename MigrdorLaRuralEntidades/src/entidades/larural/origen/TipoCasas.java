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
@Table(name = "TIPO_CASAS", schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "TipoCasas.findAll", query = "SELECT t FROM TipoCasas t"),
    @NamedQuery(name = "TipoCasas.findByTipoCasa", query = "SELECT t FROM TipoCasas t WHERE t.tipoCasa = :tipoCasa"),
    @NamedQuery(name = "TipoCasas.findByNombre", query = "SELECT t FROM TipoCasas t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TipoCasas.findByFechaCarga", query = "SELECT t FROM TipoCasas t WHERE t.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "TipoCasas.findByUsuarioCarga", query = "SELECT t FROM TipoCasas t WHERE t.usuarioCarga = :usuarioCarga"),
    @NamedQuery(name = "TipoCasas.findByFechaModi", query = "SELECT t FROM TipoCasas t WHERE t.fechaModi = :fechaModi"),
    @NamedQuery(name = "TipoCasas.findByUsuarioModi", query = "SELECT t FROM TipoCasas t WHERE t.usuarioModi = :usuarioModi")})
public class TipoCasas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TIPO_CASA", nullable = false)
    private Short tipoCasa;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 60)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "USUARIO_CARGA", nullable = false)
    private short usuarioCarga;
    @Basic(optional = false)
    @Column(name = "FECHA_MODI", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModi;
    @Basic(optional = false)
    @Column(name = "USUARIO_MODI", nullable = false)
    private short usuarioModi;
    @OneToMany(mappedBy = "tipoCasa")
    private List<Archbene> archbeneList;

    public TipoCasas() {
    }

    public TipoCasas(Short tipoCasa) {
        this.tipoCasa = tipoCasa;
    }

    public TipoCasas(Short tipoCasa, String nombre, Date fechaCarga, short usuarioCarga, Date fechaModi, short usuarioModi) {
        this.tipoCasa = tipoCasa;
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
        this.usuarioCarga = usuarioCarga;
        this.fechaModi = fechaModi;
        this.usuarioModi = usuarioModi;
    }

    public Short getTipoCasa() {
        return tipoCasa;
    }

    public void setTipoCasa(Short tipoCasa) {
        this.tipoCasa = tipoCasa;
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

    public short getUsuarioCarga() {
        return usuarioCarga;
    }

    public void setUsuarioCarga(short usuarioCarga) {
        this.usuarioCarga = usuarioCarga;
    }

    public Date getFechaModi() {
        return fechaModi;
    }

    public void setFechaModi(Date fechaModi) {
        this.fechaModi = fechaModi;
    }

    public short getUsuarioModi() {
        return usuarioModi;
    }

    public void setUsuarioModi(short usuarioModi) {
        this.usuarioModi = usuarioModi;
    }

    public List<Archbene> getArchbeneList() {
        return archbeneList;
    }

    public void setArchbeneList(List<Archbene> archbeneList) {
        this.archbeneList = archbeneList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoCasa != null ? tipoCasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCasas)) {
            return false;
        }
        TipoCasas other = (TipoCasas) object;
        if ((this.tipoCasa == null && other.tipoCasa != null) || (this.tipoCasa != null && !this.tipoCasa.equals(other.tipoCasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.TipoCasas[ tipoCasa=" + tipoCasa + " ]";
    }
    
}
