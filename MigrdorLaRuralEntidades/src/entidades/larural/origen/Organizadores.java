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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "ORGANIZADORES", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Organizadores.findAll", query = "SELECT o FROM Organizadores o"),
    @NamedQuery(name = "Organizadores.findByCodOrganizador", query = "SELECT o FROM Organizadores o WHERE o.codOrganizador = :codOrganizador"),
    @NamedQuery(name = "Organizadores.findByNombre", query = "SELECT o FROM Organizadores o WHERE o.nombre = :nombre"),
    @NamedQuery(name = "Organizadores.findByPctComis", query = "SELECT o FROM Organizadores o WHERE o.pctComis = :pctComis"),
    @NamedQuery(name = "Organizadores.findByEstado", query = "SELECT o FROM Organizadores o WHERE o.estado = :estado"),
    @NamedQuery(name = "Organizadores.findByNroEntrada", query = "SELECT o FROM Organizadores o WHERE o.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Organizadores.findByUsuarioModifica", query = "SELECT o FROM Organizadores o WHERE o.usuarioModifica = :usuarioModifica")})
public class Organizadores implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codOrganizador")
    private List<Propauto> propautoList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_ORGANIZADOR", nullable = false)
    private Integer codOrganizador;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 60)
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PCT_COMIS", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctComis;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "USUARIO_MODIFICA", nullable = false)
    private short usuarioModifica;
    @JoinColumn(name = "COD_AGCIA", referencedColumnName = "COD_AGCIA", nullable = false)
    @ManyToOne(optional = false)
    private Agencias codAgcia;
    @JoinColumn(name = "TIPO_ORGANIZADOR", referencedColumnName = "COD_TIPO", nullable = false)
    @ManyToOne(optional = false)
    private TiposOrganizadores tipoOrganizador;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codOrganizador")
    private List<Polsdemi> polsdemiList;

    public Organizadores() {
    }

    public Organizadores(Integer codOrganizador) {
        this.codOrganizador = codOrganizador;
    }

    public Organizadores(Integer codOrganizador, String nombre, BigDecimal pctComis, short estado, int nroEntrada, short usuarioModifica) {
        this.codOrganizador = codOrganizador;
        this.nombre = nombre;
        this.pctComis = pctComis;
        this.estado = estado;
        this.nroEntrada = nroEntrada;
        this.usuarioModifica = usuarioModifica;
    }

    public Integer getCodOrganizador() {
        return codOrganizador;
    }

    public void setCodOrganizador(Integer codOrganizador) {
        this.codOrganizador = codOrganizador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPctComis() {
        return pctComis;
    }

    public void setPctComis(BigDecimal pctComis) {
        this.pctComis = pctComis;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public Agencias getCodAgcia() {
        return codAgcia;
    }

    public void setCodAgcia(Agencias codAgcia) {
        this.codAgcia = codAgcia;
    }

    public TiposOrganizadores getTipoOrganizador() {
        return tipoOrganizador;
    }

    public void setTipoOrganizador(TiposOrganizadores tipoOrganizador) {
        this.tipoOrganizador = tipoOrganizador;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
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
        hash += (codOrganizador != null ? codOrganizador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Organizadores)) {
            return false;
        }
        Organizadores other = (Organizadores) object;
        if ((this.codOrganizador == null && other.codOrganizador != null) || (this.codOrganizador != null && !this.codOrganizador.equals(other.codOrganizador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Organizadores[ codOrganizador=" + codOrganizador + " ]";
    }

    public List<Propauto> getPropautoList() {
        return propautoList;
    }

    public void setPropautoList(List<Propauto> propautoList) {
        this.propautoList = propautoList;
    }
    
}
