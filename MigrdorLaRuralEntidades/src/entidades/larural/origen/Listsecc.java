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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "LISTSECC", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Listsecc.findAll", query = "SELECT l FROM Listsecc l"),
    @NamedQuery(name = "Listsecc.findBySecc", query = "SELECT l FROM Listsecc l WHERE l.secc = :secc"),
    @NamedQuery(name = "Listsecc.findByNombre", query = "SELECT l FROM Listsecc l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Listsecc.findByNivel", query = "SELECT l FROM Listsecc l WHERE l.nivel = :nivel"),
    @NamedQuery(name = "Listsecc.findByComision", query = "SELECT l FROM Listsecc l WHERE l.comision = :comision"),
    @NamedQuery(name = "Listsecc.findByTipo", query = "SELECT l FROM Listsecc l WHERE l.tipo = :tipo"),
    @NamedQuery(name = "Listsecc.findByMaxCapital", query = "SELECT l FROM Listsecc l WHERE l.maxCapital = :maxCapital"),
    @NamedQuery(name = "Listsecc.findByGeneraActividad", query = "SELECT l FROM Listsecc l WHERE l.generaActividad = :generaActividad"),
    @NamedQuery(name = "Listsecc.findByNroEntrada", query = "SELECT l FROM Listsecc l WHERE l.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Listsecc.findByFechaCarga", query = "SELECT l FROM Listsecc l WHERE l.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Listsecc.findByCodUsuario", query = "SELECT l FROM Listsecc l WHERE l.codUsuario = :codUsuario"),
    @NamedQuery(name = "Listsecc.findByUsuarioModifica", query = "SELECT l FROM Listsecc l WHERE l.usuarioModifica = :usuarioModifica"),
    @NamedQuery(name = "Listsecc.findByResolucion", query = "SELECT l FROM Listsecc l WHERE l.resolucion = :resolucion"),
    @NamedQuery(name = "Listsecc.findByFechaResolucion", query = "SELECT l FROM Listsecc l WHERE l.fechaResolucion = :fechaResolucion"),
    @NamedQuery(name = "Listsecc.findByCodPlan", query = "SELECT l FROM Listsecc l WHERE l.codPlan = :codPlan"),
    @NamedQuery(name = "Listsecc.findByArticuloColacionado", query = "SELECT l FROM Listsecc l WHERE l.articuloColacionado = :articuloColacionado"),
    @NamedQuery(name = "Listsecc.findByTextoItem", query = "SELECT l FROM Listsecc l WHERE l.textoItem = :textoItem"),
    @NamedQuery(name = "Listsecc.findByTextoFrente", query = "SELECT l FROM Listsecc l WHERE l.textoFrente = :textoFrente"),
    @NamedQuery(name = "Listsecc.findByTextoEspecial", query = "SELECT l FROM Listsecc l WHERE l.textoEspecial = :textoEspecial"),
    @NamedQuery(name = "Listsecc.findByTextoPieCaucion", query = "SELECT l FROM Listsecc l WHERE l.textoPieCaucion = :textoPieCaucion"),
    @NamedQuery(name = "Listsecc.findByTextoTomadorCaucion", query = "SELECT l FROM Listsecc l WHERE l.textoTomadorCaucion = :textoTomadorCaucion"),
    @NamedQuery(name = "Listsecc.findByFirmaFacsimil", query = "SELECT l FROM Listsecc l WHERE l.firmaFacsimil = :firmaFacsimil")})
public class Listsecc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SECC", nullable = false)
    private Short secc;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "NIVEL", nullable = false)
    private short nivel;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "COMISION", nullable = false, precision = 4, scale = 2)
    private BigDecimal comision;
    @Column(name = "TIPO")
    private Short tipo;
    @Basic(optional = false)
    @Column(name = "MAX_CAPITAL", nullable = false)
    private long maxCapital;
    @Basic(optional = false)
    @Column(name = "GENERA_ACTIVIDAD", nullable = false)
    private short generaActividad;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "FECHA_CARGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO", nullable = false)
    private short codUsuario;
    @Basic(optional = false)
    @Column(name = "USUARIO_MODIFICA", nullable = false)
    private short usuarioModifica;
    @Column(name = "RESOLUCION", length = 200)
    private String resolucion;
    @Column(name = "FECHA_RESOLUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaResolucion;
    @Column(name = "COD_PLAN", length = 12)
    private String codPlan;
    @Column(name = "ARTICULO_COLACIONADO")
    private Integer articuloColacionado;
    @Column(name = "TEXTO_ITEM", length = 4000)
    private String textoItem;
    @Column(name = "TEXTO_FRENTE", length = 1000)
    private String textoFrente;
    @Column(name = "TEXTO_ESPECIAL", length = 4000)
    private String textoEspecial;
    @Column(name = "TEXTO_PIE_CAUCION", length = 4000)
    private String textoPieCaucion;
    @Column(name = "TEXTO_TOMADOR_CAUCION", length = 4000)
    private String textoTomadorCaucion;
    @Basic(optional = false)
    @Column(name = "FIRMA_FACSIMIL", nullable = false, length = 1)
    private String firmaFacsimil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listsecc")
    private List<ListseccTiposServicios> listseccTiposServiciosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listsecc")
    private List<Polsdemi> polsdemiList;

    public Listsecc() {
    }

    public Listsecc(Short secc) {
        this.secc = secc;
    }

    public Listsecc(Short secc, String nombre, short nivel, BigDecimal comision, long maxCapital, short generaActividad, int nroEntrada, short codUsuario, short usuarioModifica, String firmaFacsimil) {
        this.secc = secc;
        this.nombre = nombre;
        this.nivel = nivel;
        this.comision = comision;
        this.maxCapital = maxCapital;
        this.generaActividad = generaActividad;
        this.nroEntrada = nroEntrada;
        this.codUsuario = codUsuario;
        this.usuarioModifica = usuarioModifica;
        this.firmaFacsimil = firmaFacsimil;
    }

    public Short getSecc() {
        return secc;
    }

    public void setSecc(Short secc) {
        this.secc = secc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getNivel() {
        return nivel;
    }

    public void setNivel(short nivel) {
        this.nivel = nivel;
    }

    public BigDecimal getComision() {
        return comision;
    }

    public void setComision(BigDecimal comision) {
        this.comision = comision;
    }

    public Short getTipo() {
        return tipo;
    }

    public void setTipo(Short tipo) {
        this.tipo = tipo;
    }

    public long getMaxCapital() {
        return maxCapital;
    }

    public void setMaxCapital(long maxCapital) {
        this.maxCapital = maxCapital;
    }

    public short getGeneraActividad() {
        return generaActividad;
    }

    public void setGeneraActividad(short generaActividad) {
        this.generaActividad = generaActividad;
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

    public short getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(short codUsuario) {
        this.codUsuario = codUsuario;
    }

    public short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public String getCodPlan() {
        return codPlan;
    }

    public void setCodPlan(String codPlan) {
        this.codPlan = codPlan;
    }

    public Integer getArticuloColacionado() {
        return articuloColacionado;
    }

    public void setArticuloColacionado(Integer articuloColacionado) {
        this.articuloColacionado = articuloColacionado;
    }

    public String getTextoItem() {
        return textoItem;
    }

    public void setTextoItem(String textoItem) {
        this.textoItem = textoItem;
    }

    public String getTextoFrente() {
        return textoFrente;
    }

    public void setTextoFrente(String textoFrente) {
        this.textoFrente = textoFrente;
    }

    public String getTextoEspecial() {
        return textoEspecial;
    }

    public void setTextoEspecial(String textoEspecial) {
        this.textoEspecial = textoEspecial;
    }

    public String getTextoPieCaucion() {
        return textoPieCaucion;
    }

    public void setTextoPieCaucion(String textoPieCaucion) {
        this.textoPieCaucion = textoPieCaucion;
    }

    public String getTextoTomadorCaucion() {
        return textoTomadorCaucion;
    }

    public void setTextoTomadorCaucion(String textoTomadorCaucion) {
        this.textoTomadorCaucion = textoTomadorCaucion;
    }

    public String getFirmaFacsimil() {
        return firmaFacsimil;
    }

    public void setFirmaFacsimil(String firmaFacsimil) {
        this.firmaFacsimil = firmaFacsimil;
    }

    public List<ListseccTiposServicios> getListseccTiposServiciosList() {
        return listseccTiposServiciosList;
    }

    public void setListseccTiposServiciosList(List<ListseccTiposServicios> listseccTiposServiciosList) {
        this.listseccTiposServiciosList = listseccTiposServiciosList;
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
        hash += (secc != null ? secc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Listsecc)) {
            return false;
        }
        Listsecc other = (Listsecc) object;
        if ((this.secc == null && other.secc != null) || (this.secc != null && !this.secc.equals(other.secc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Listsecc[ secc=" + secc + " ]";
    }
    
}
