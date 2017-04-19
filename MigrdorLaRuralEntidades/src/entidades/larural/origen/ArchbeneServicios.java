/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "ARCHBENE_SERVICIOS",  schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "ArchbeneServicios.findAll", query = "SELECT a FROM ArchbeneServicios a"),
    @NamedQuery(name = "ArchbeneServicios.findBySecc", query = "SELECT a FROM ArchbeneServicios a WHERE a.archbeneServiciosPK.secc = :secc"),
    @NamedQuery(name = "ArchbeneServicios.findByCodigoServicio", query = "SELECT a FROM ArchbeneServicios a WHERE a.archbeneServiciosPK.codigoServicio = :codigoServicio"),
    @NamedQuery(name = "ArchbeneServicios.findByCodBenef", query = "SELECT a FROM ArchbeneServicios a WHERE a.archbeneServiciosPK.codBenef = :codBenef"),
    @NamedQuery(name = "ArchbeneServicios.findByActivo", query = "SELECT a FROM ArchbeneServicios a WHERE a.activo = :activo"),
    @NamedQuery(name = "ArchbeneServicios.findByCodMoney", query = "SELECT a FROM ArchbeneServicios a WHERE a.codMoney = :codMoney"),
    @NamedQuery(name = "ArchbeneServicios.findByValor", query = "SELECT a FROM ArchbeneServicios a WHERE a.valor = :valor"),
    @NamedQuery(name = "ArchbeneServicios.findByNroEntrada", query = "SELECT a FROM ArchbeneServicios a WHERE a.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "ArchbeneServicios.findByCodUsuario", query = "SELECT a FROM ArchbeneServicios a WHERE a.codUsuario = :codUsuario"),
    @NamedQuery(name = "ArchbeneServicios.findByUsuarioModifica", query = "SELECT a FROM ArchbeneServicios a WHERE a.usuarioModifica = :usuarioModifica")})
public class ArchbeneServicios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArchbeneServiciosPK archbeneServiciosPK;
    @Basic(optional = false)
    @Column(name = "ACTIVO", nullable = false, length = 1)
    private String activo;
    @Basic(optional = false)
    @Column(name = "COD_MONEY", nullable = false)
    private short codMoney;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "VALOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal valor;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO", nullable = false)
    private short codUsuario;
    @Basic(optional = false)
    @Column(name = "USUARIO_MODIFICA", nullable = false)
    private short usuarioModifica;
    @JoinColumn(name = "COD_BENEF", referencedColumnName = "COD_BENEF", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Archbene archbene;
    @JoinColumns({
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "CODIGO_SERVICIO", referencedColumnName = "CODIGO_SERVICIO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ListseccTiposServicios listseccTiposServicios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "archbeneServicios")
    private List<PolsdemiServicios> polsdemiServiciosList;

    public ArchbeneServicios() {
    }

    public ArchbeneServicios(ArchbeneServiciosPK archbeneServiciosPK) {
        this.archbeneServiciosPK = archbeneServiciosPK;
    }

    public ArchbeneServicios(ArchbeneServiciosPK archbeneServiciosPK, String activo, short codMoney, BigDecimal valor, int nroEntrada, short codUsuario, short usuarioModifica) {
        this.archbeneServiciosPK = archbeneServiciosPK;
        this.activo = activo;
        this.codMoney = codMoney;
        this.valor = valor;
        this.nroEntrada = nroEntrada;
        this.codUsuario = codUsuario;
        this.usuarioModifica = usuarioModifica;
    }

    public ArchbeneServicios(short secc, short codigoServicio, int codBenef) {
        this.archbeneServiciosPK = new ArchbeneServiciosPK(secc, codigoServicio, codBenef);
    }

    public ArchbeneServiciosPK getArchbeneServiciosPK() {
        return archbeneServiciosPK;
    }

    public void setArchbeneServiciosPK(ArchbeneServiciosPK archbeneServiciosPK) {
        this.archbeneServiciosPK = archbeneServiciosPK;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public short getCodMoney() {
        return codMoney;
    }

    public void setCodMoney(short codMoney) {
        this.codMoney = codMoney;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
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

    public Archbene getArchbene() {
        return archbene;
    }

    public void setArchbene(Archbene archbene) {
        this.archbene = archbene;
    }

    public ListseccTiposServicios getListseccTiposServicios() {
        return listseccTiposServicios;
    }

    public void setListseccTiposServicios(ListseccTiposServicios listseccTiposServicios) {
        this.listseccTiposServicios = listseccTiposServicios;
    }

    public List<PolsdemiServicios> getPolsdemiServiciosList() {
        return polsdemiServiciosList;
    }

    public void setPolsdemiServiciosList(List<PolsdemiServicios> polsdemiServiciosList) {
        this.polsdemiServiciosList = polsdemiServiciosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (archbeneServiciosPK != null ? archbeneServiciosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArchbeneServicios)) {
            return false;
        }
        ArchbeneServicios other = (ArchbeneServicios) object;
        if ((this.archbeneServiciosPK == null && other.archbeneServiciosPK != null) || (this.archbeneServiciosPK != null && !this.archbeneServiciosPK.equals(other.archbeneServiciosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ArchbeneServicios[ archbeneServiciosPK=" + archbeneServiciosPK + " ]";
    }
    
}
