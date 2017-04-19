/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "ITEM_DE_POLIZAS", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "ItemDePolizas.findAll", query = "SELECT i FROM ItemDePolizas i"),
    @NamedQuery(name = "ItemDePolizas.findByEjercicio", query = "SELECT i FROM ItemDePolizas i WHERE i.itemDePolizasPK.ejercicio = :ejercicio"),
    @NamedQuery(name = "ItemDePolizas.findByTipoOperacion", query = "SELECT i FROM ItemDePolizas i WHERE i.itemDePolizasPK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "ItemDePolizas.findByTipoSeguro", query = "SELECT i FROM ItemDePolizas i WHERE i.itemDePolizasPK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "ItemDePolizas.findBySecc", query = "SELECT i FROM ItemDePolizas i WHERE i.itemDePolizasPK.secc = :secc"),
    @NamedQuery(name = "ItemDePolizas.findByPolnro", query = "SELECT i FROM ItemDePolizas i WHERE i.itemDePolizasPK.polnro = :polnro"),
    @NamedQuery(name = "ItemDePolizas.findByAnexo", query = "SELECT i FROM ItemDePolizas i WHERE i.itemDePolizasPK.anexo = :anexo"),
    @NamedQuery(name = "ItemDePolizas.findByItem", query = "SELECT i FROM ItemDePolizas i WHERE i.itemDePolizasPK.item = :item"),
    @NamedQuery(name = "ItemDePolizas.findBySumaseg", query = "SELECT i FROM ItemDePolizas i WHERE i.sumaseg = :sumaseg"),
    @NamedQuery(name = "ItemDePolizas.findByUbivia", query = "SELECT i FROM ItemDePolizas i WHERE i.ubivia = :ubivia"),
    @NamedQuery(name = "ItemDePolizas.findByPrima", query = "SELECT i FROM ItemDePolizas i WHERE i.prima = :prima"),
    @NamedQuery(name = "ItemDePolizas.findByTexto", query = "SELECT i FROM ItemDePolizas i WHERE i.texto = :texto"),
    @NamedQuery(name = "ItemDePolizas.findByFechaVctoInspeccion", query = "SELECT i FROM ItemDePolizas i WHERE i.fechaVctoInspeccion = :fechaVctoInspeccion"),
    @NamedQuery(name = "ItemDePolizas.findByTextoInspeccion", query = "SELECT i FROM ItemDePolizas i WHERE i.textoInspeccion = :textoInspeccion"),
    @NamedQuery(name = "ItemDePolizas.findByNroEntrada", query = "SELECT i FROM ItemDePolizas i WHERE i.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "ItemDePolizas.findByCtaCatastral", query = "SELECT i FROM ItemDePolizas i WHERE i.ctaCatastral = :ctaCatastral"),
    @NamedQuery(name = "ItemDePolizas.findByNroFinca", query = "SELECT i FROM ItemDePolizas i WHERE i.nroFinca = :nroFinca"),
    @NamedQuery(name = "ItemDePolizas.findByNroPadron", query = "SELECT i FROM ItemDePolizas i WHERE i.nroPadron = :nroPadron"),
    @NamedQuery(name = "ItemDePolizas.findByUsuarioModifica", query = "SELECT i FROM ItemDePolizas i WHERE i.usuarioModifica = :usuarioModifica")})
public class ItemDePolizas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemDePolizasPK itemDePolizasPK;
    @Basic(optional = false)
    @Column(name = "SUMASEG", nullable = false)
    private long sumaseg;
    @Column(name = "UBIVIA", length = 200)
    private String ubivia;
    @Basic(optional = false)
    @Column(name = "PRIMA", nullable = false)
    private long prima;
    @Column(name = "TEXTO", length = 4000)
    private String texto;
    @Column(name = "FECHA_VCTO_INSPECCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVctoInspeccion;
    @Column(name = "TEXTO_INSPECCION", length = 2000)
    private String textoInspeccion;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "CTA_CATASTRAL", length = 100)
    private String ctaCatastral;
    @Column(name = "NRO_FINCA")
    private Integer nroFinca;
    @Column(name = "NRO_PADRON")
    private Integer nroPadron;
    @Column(name = "USUARIO_MODIFICA")
    private Short usuarioModifica;
    @JoinColumn(name = "COD_ACTIVIDAD", referencedColumnName = "COD_ACTIVIDAD")
    @ManyToOne
    private Actividad codActividad;
    @JoinColumn(name = "COD_NEGOCIO", referencedColumnName = "COD_NEGOCIO")
    @ManyToOne
    private Negocios codNegocio;
    @JoinColumns({
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Polsdemi polsdemi;
    @JoinColumns({
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COD_RIESGO", referencedColumnName = "COD_RIESGO", nullable = false)})
    @ManyToOne(optional = false)
    private RiesgosAsegurados riesgosAsegurados;
    @JoinColumn(name = "COD_RUBRO", referencedColumnName = "COD_RUBRO")
    @ManyToOne
    private Rubros codRubro;
    @JoinColumn(name = "SUB_RUBRO", referencedColumnName = "SUB_RUBRO")
    @ManyToOne
    private SubRubro subRubro;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "itemDePolizas")
    private ItemPolizasCoaseguro itemPolizasCoaseguro;

    public ItemDePolizas() {
    }

    public ItemDePolizas(ItemDePolizasPK itemDePolizasPK) {
        this.itemDePolizasPK = itemDePolizasPK;
    }

    public ItemDePolizas(ItemDePolizasPK itemDePolizasPK, long sumaseg, long prima, int nroEntrada) {
        this.itemDePolizasPK = itemDePolizasPK;
        this.sumaseg = sumaseg;
        this.prima = prima;
        this.nroEntrada = nroEntrada;
    }

    public ItemDePolizas(short ejercicio, short tipoOperacion, short tipoSeguro, short secc, int polnro, short anexo, int item) {
        this.itemDePolizasPK = new ItemDePolizasPK(ejercicio, tipoOperacion, tipoSeguro, secc, polnro, anexo, item);
    }

    public ItemDePolizasPK getItemDePolizasPK() {
        return itemDePolizasPK;
    }

    public void setItemDePolizasPK(ItemDePolizasPK itemDePolizasPK) {
        this.itemDePolizasPK = itemDePolizasPK;
    }

    public long getSumaseg() {
        return sumaseg;
    }

    public void setSumaseg(long sumaseg) {
        this.sumaseg = sumaseg;
    }

    public String getUbivia() {
        return ubivia;
    }

    public void setUbivia(String ubivia) {
        this.ubivia = ubivia;
    }

    public long getPrima() {
        return prima;
    }

    public void setPrima(long prima) {
        this.prima = prima;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFechaVctoInspeccion() {
        return fechaVctoInspeccion;
    }

    public void setFechaVctoInspeccion(Date fechaVctoInspeccion) {
        this.fechaVctoInspeccion = fechaVctoInspeccion;
    }

    public String getTextoInspeccion() {
        return textoInspeccion;
    }

    public void setTextoInspeccion(String textoInspeccion) {
        this.textoInspeccion = textoInspeccion;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public String getCtaCatastral() {
        return ctaCatastral;
    }

    public void setCtaCatastral(String ctaCatastral) {
        this.ctaCatastral = ctaCatastral;
    }

    public Integer getNroFinca() {
        return nroFinca;
    }

    public void setNroFinca(Integer nroFinca) {
        this.nroFinca = nroFinca;
    }

    public Integer getNroPadron() {
        return nroPadron;
    }

    public void setNroPadron(Integer nroPadron) {
        this.nroPadron = nroPadron;
    }

    public Short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(Short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public Actividad getCodActividad() {
        return codActividad;
    }

    public void setCodActividad(Actividad codActividad) {
        this.codActividad = codActividad;
    }

    public Negocios getCodNegocio() {
        return codNegocio;
    }

    public void setCodNegocio(Negocios codNegocio) {
        this.codNegocio = codNegocio;
    }

    public Polsdemi getPolsdemi() {
        return polsdemi;
    }

    public void setPolsdemi(Polsdemi polsdemi) {
        this.polsdemi = polsdemi;
    }

    public RiesgosAsegurados getRiesgosAsegurados() {
        return riesgosAsegurados;
    }

    public void setRiesgosAsegurados(RiesgosAsegurados riesgosAsegurados) {
        this.riesgosAsegurados = riesgosAsegurados;
    }

    public Rubros getCodRubro() {
        return codRubro;
    }

    public void setCodRubro(Rubros codRubro) {
        this.codRubro = codRubro;
    }

    public SubRubro getSubRubro() {
        return subRubro;
    }

    public void setSubRubro(SubRubro subRubro) {
        this.subRubro = subRubro;
    }

    public ItemPolizasCoaseguro getItemPolizasCoaseguro() {
        return itemPolizasCoaseguro;
    }

    public void setItemPolizasCoaseguro(ItemPolizasCoaseguro itemPolizasCoaseguro) {
        this.itemPolizasCoaseguro = itemPolizasCoaseguro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemDePolizasPK != null ? itemDePolizasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemDePolizas)) {
            return false;
        }
        ItemDePolizas other = (ItemDePolizas) object;
        if ((this.itemDePolizasPK == null && other.itemDePolizasPK != null) || (this.itemDePolizasPK != null && !this.itemDePolizasPK.equals(other.itemDePolizasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ItemDePolizas[ itemDePolizasPK=" + itemDePolizasPK + " ]";
    }
    
}
