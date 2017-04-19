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
@Table(name = "LISTSECC_TIPOS_SERVICIOS", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "ListseccTiposServicios.findAll", query = "SELECT l FROM ListseccTiposServicios l"),
    @NamedQuery(name = "ListseccTiposServicios.findBySecc", query = "SELECT l FROM ListseccTiposServicios l WHERE l.listseccTiposServiciosPK.secc = :secc"),
    @NamedQuery(name = "ListseccTiposServicios.findByCodigoServicio", query = "SELECT l FROM ListseccTiposServicios l WHERE l.listseccTiposServiciosPK.codigoServicio = :codigoServicio"),
    @NamedQuery(name = "ListseccTiposServicios.findByNombre", query = "SELECT l FROM ListseccTiposServicios l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "ListseccTiposServicios.findByDescripcion", query = "SELECT l FROM ListseccTiposServicios l WHERE l.descripcion = :descripcion"),
    @NamedQuery(name = "ListseccTiposServicios.findByTipo", query = "SELECT l FROM ListseccTiposServicios l WHERE l.tipo = :tipo"),
    @NamedQuery(name = "ListseccTiposServicios.findByFormaAplicacion", query = "SELECT l FROM ListseccTiposServicios l WHERE l.formaAplicacion = :formaAplicacion"),
    @NamedQuery(name = "ListseccTiposServicios.findByObligatorio", query = "SELECT l FROM ListseccTiposServicios l WHERE l.obligatorio = :obligatorio"),
    @NamedQuery(name = "ListseccTiposServicios.findByFechaCarga", query = "SELECT l FROM ListseccTiposServicios l WHERE l.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "ListseccTiposServicios.findByFechaModifica", query = "SELECT l FROM ListseccTiposServicios l WHERE l.fechaModifica = :fechaModifica"),
    @NamedQuery(name = "ListseccTiposServicios.findByBloqueado", query = "SELECT l FROM ListseccTiposServicios l WHERE l.bloqueado = :bloqueado")})
public class ListseccTiposServicios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ListseccTiposServiciosPK listseccTiposServiciosPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 20)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "TIPO", nullable = false, length = 3)
    private String tipo;
    @Basic(optional = false)
    @Column(name = "FORMA_APLICACION", nullable = false, length = 2)
    private String formaAplicacion;
    @Basic(optional = false)
    @Column(name = "OBLIGATORIO", nullable = false, length = 1)
    private String obligatorio;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "FECHA_MODIFICA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModifica;
    @Basic(optional = false)
    @Column(name = "BLOQUEADO", nullable = false, length = 1)
    private String bloqueado;
    @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Listsecc listsecc;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @JoinColumn(name = "USUARIO_MODIFICA", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios usuarioModifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listseccTiposServicios")
    private List<ArchbeneServicios> archbeneServiciosList;

    public ListseccTiposServicios() {
    }

    public ListseccTiposServicios(ListseccTiposServiciosPK listseccTiposServiciosPK) {
        this.listseccTiposServiciosPK = listseccTiposServiciosPK;
    }

    public ListseccTiposServicios(ListseccTiposServiciosPK listseccTiposServiciosPK, String nombre, String descripcion, String tipo, String formaAplicacion, String obligatorio, Date fechaCarga, Date fechaModifica, String bloqueado) {
        this.listseccTiposServiciosPK = listseccTiposServiciosPK;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.formaAplicacion = formaAplicacion;
        this.obligatorio = obligatorio;
        this.fechaCarga = fechaCarga;
        this.fechaModifica = fechaModifica;
        this.bloqueado = bloqueado;
    }

    public ListseccTiposServicios(short secc, short codigoServicio) {
        this.listseccTiposServiciosPK = new ListseccTiposServiciosPK(secc, codigoServicio);
    }

    public ListseccTiposServiciosPK getListseccTiposServiciosPK() {
        return listseccTiposServiciosPK;
    }

    public void setListseccTiposServiciosPK(ListseccTiposServiciosPK listseccTiposServiciosPK) {
        this.listseccTiposServiciosPK = listseccTiposServiciosPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFormaAplicacion() {
        return formaAplicacion;
    }

    public void setFormaAplicacion(String formaAplicacion) {
        this.formaAplicacion = formaAplicacion;
    }

    public String getObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(String obligatorio) {
        this.obligatorio = obligatorio;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Date getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(Date fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

    public String getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(String bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Listsecc getListsecc() {
        return listsecc;
    }

    public void setListsecc(Listsecc listsecc) {
        this.listsecc = listsecc;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Usuarios getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(Usuarios usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public List<ArchbeneServicios> getArchbeneServiciosList() {
        return archbeneServiciosList;
    }

    public void setArchbeneServiciosList(List<ArchbeneServicios> archbeneServiciosList) {
        this.archbeneServiciosList = archbeneServiciosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (listseccTiposServiciosPK != null ? listseccTiposServiciosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListseccTiposServicios)) {
            return false;
        }
        ListseccTiposServicios other = (ListseccTiposServicios) object;
        if ((this.listseccTiposServiciosPK == null && other.listseccTiposServiciosPK != null) || (this.listseccTiposServiciosPK != null && !this.listseccTiposServiciosPK.equals(other.listseccTiposServiciosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ListseccTiposServicios[ listseccTiposServiciosPK=" + listseccTiposServiciosPK + " ]";
    }
    
}
