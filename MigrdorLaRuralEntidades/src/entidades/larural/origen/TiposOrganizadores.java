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
@Table(name = "TIPOS_ORGANIZADORES",  schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"DESCRIPCION"})})
@NamedQueries({
    @NamedQuery(name = "TiposOrganizadores.findAll", query = "SELECT t FROM TiposOrganizadores t"),
    @NamedQuery(name = "TiposOrganizadores.findByCodTipo", query = "SELECT t FROM TiposOrganizadores t WHERE t.codTipo = :codTipo"),
    @NamedQuery(name = "TiposOrganizadores.findByDescripcion", query = "SELECT t FROM TiposOrganizadores t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TiposOrganizadores.findByNroEntrada", query = "SELECT t FROM TiposOrganizadores t WHERE t.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "TiposOrganizadores.findByActivo", query = "SELECT t FROM TiposOrganizadores t WHERE t.activo = :activo")})
public class TiposOrganizadores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_TIPO", nullable = false)
    private Short codTipo;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 60)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private long nroEntrada;
    @Basic(optional = false)
    @Column(name = "ACTIVO", nullable = false, length = 1)
    private String activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoOrganizador")
    private List<Organizadores> organizadoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoOrganizador")
    private List<Polsdemi> polsdemiList;
    @JoinColumn(name = "USUARIO_MODIFICA", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios usuarioModifica;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public TiposOrganizadores() {
    }

    public TiposOrganizadores(Short codTipo) {
        this.codTipo = codTipo;
    }

    public TiposOrganizadores(Short codTipo, String descripcion, long nroEntrada, String activo) {
        this.codTipo = codTipo;
        this.descripcion = descripcion;
        this.nroEntrada = nroEntrada;
        this.activo = activo;
    }

    public Short getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(Short codTipo) {
        this.codTipo = codTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(long nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public List<Organizadores> getOrganizadoresList() {
        return organizadoresList;
    }

    public void setOrganizadoresList(List<Organizadores> organizadoresList) {
        this.organizadoresList = organizadoresList;
    }

    public List<Polsdemi> getPolsdemiList() {
        return polsdemiList;
    }

    public void setPolsdemiList(List<Polsdemi> polsdemiList) {
        this.polsdemiList = polsdemiList;
    }

    public Usuarios getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(Usuarios usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
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
        if (!(object instanceof TiposOrganizadores)) {
            return false;
        }
        TiposOrganizadores other = (TiposOrganizadores) object;
        if ((this.codTipo == null && other.codTipo != null) || (this.codTipo != null && !this.codTipo.equals(other.codTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.TiposOrganizadores[ codTipo=" + codTipo + " ]";
    }
    
}
