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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "TIPO_DOCUMENTO",  schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "TipoDocumento.findAll", query = "SELECT t FROM TipoDocumento t"),
    @NamedQuery(name = "TipoDocumento.findByCodTipo", query = "SELECT t FROM TipoDocumento t WHERE t.codTipo = :codTipo"),
    @NamedQuery(name = "TipoDocumento.findByNombre", query = "SELECT t FROM TipoDocumento t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TipoDocumento.findByNroEntrada", query = "SELECT t FROM TipoDocumento t WHERE t.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "TipoDocumento.findByCodDocumSeprelad", query = "SELECT t FROM TipoDocumento t WHERE t.codDocumSeprelad = :codDocumSeprelad"),
    @NamedQuery(name = "TipoDocumento.findByDescripcion", query = "SELECT t FROM TipoDocumento t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TipoDocumento.findByTipoDocumentoSis", query = "SELECT t FROM TipoDocumento t WHERE t.tipoDocumentoSis = :tipoDocumentoSis"),
    @NamedQuery(name = "TipoDocumento.findByUsuarioModifica", query = "SELECT t FROM TipoDocumento t WHERE t.usuarioModifica = :usuarioModifica")})
public class TipoDocumento implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoDocumento")
    private List<AsegVida> asegVidaList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_TIPO", nullable = false)
    private Short codTipo;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 30)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "COD_DOCUM_SEPRELAD")
    private Short codDocumSeprelad;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 50)
    private String descripcion;
    @Column(name = "TIPO_DOCUMENTO_SIS")
    private Short tipoDocumentoSis;
    @Basic(optional = false)
    @Column(name = "USUARIO_MODIFICA", nullable = false)
    private short usuarioModifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoDocumento")
    private List<Listaseg> listasegList;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public TipoDocumento() {
    }

    public TipoDocumento(Short codTipo) {
        this.codTipo = codTipo;
    }

    public TipoDocumento(Short codTipo, String nombre, int nroEntrada, String descripcion, short usuarioModifica) {
        this.codTipo = codTipo;
        this.nombre = nombre;
        this.nroEntrada = nroEntrada;
        this.descripcion = descripcion;
        this.usuarioModifica = usuarioModifica;
    }

    public Short getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(Short codTipo) {
        this.codTipo = codTipo;
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

    public Short getCodDocumSeprelad() {
        return codDocumSeprelad;
    }

    public void setCodDocumSeprelad(Short codDocumSeprelad) {
        this.codDocumSeprelad = codDocumSeprelad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Short getTipoDocumentoSis() {
        return tipoDocumentoSis;
    }

    public void setTipoDocumentoSis(Short tipoDocumentoSis) {
        this.tipoDocumentoSis = tipoDocumentoSis;
    }

    public short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public List<Listaseg> getListasegList() {
        return listasegList;
    }

    public void setListasegList(List<Listaseg> listasegList) {
        this.listasegList = listasegList;
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
        hash += (codTipo != null ? codTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocumento)) {
            return false;
        }
        TipoDocumento other = (TipoDocumento) object;
        if ((this.codTipo == null && other.codTipo != null) || (this.codTipo != null && !this.codTipo.equals(other.codTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.TipoDocumento[ codTipo=" + codTipo + " ]";
    }

    public List<AsegVida> getAsegVidaList() {
        return asegVidaList;
    }

    public void setAsegVidaList(List<AsegVida> asegVidaList) {
        this.asegVidaList = asegVidaList;
    }
    
}
