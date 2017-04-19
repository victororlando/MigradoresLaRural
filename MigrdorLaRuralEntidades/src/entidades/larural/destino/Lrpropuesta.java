/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRPROPUESTA")
@NamedQueries({
    @NamedQuery(name = "Lrpropuesta.findAll", query = "SELECT l FROM Lrpropuesta l"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestaid", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestaid = :lrpropuestaid"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestamonid", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestamonid = :lrpropuestamonid"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestafecprop", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestafecprop = :lrpropuestafecprop"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestamontototal", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestamontototal = :lrpropuestamontototal"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestavalortipcamb", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestavalortipcamb = :lrpropuestavalortipcamb"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestacomentario", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestacomentario = :lrpropuestacomentario"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestaflota", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestaflota = :lrpropuestaflota"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestaagenciaid", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestaagenciaid = :lrpropuestaagenciaid"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestaususuc", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestaususuc = :lrpropuestaususuc"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestaac", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestaac = :lrpropuestaac"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestaual", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestaual = :lrpropuestaual"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestafal", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestafal = :lrpropuestafal"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestaumd", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestaumd = :lrpropuestaumd"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestafmd", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestafmd = :lrpropuestafmd"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestaoficialid", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestaoficialid = :lrpropuestaoficialid"),
    @NamedQuery(name = "Lrpropuesta.findByLrpropuestaescoaseguro", query = "SELECT l FROM Lrpropuesta l WHERE l.lrpropuestaescoaseguro = :lrpropuestaescoaseguro"),
    @NamedQuery(name = "Lrpropuesta.findByLrtipopropuestaid", query = "SELECT l FROM Lrpropuesta l WHERE l.lrtipopropuestaid = :lrtipopropuestaid")})
public class Lrpropuesta implements Serializable {
    @Column(name = "LRPROPUESTALRTIPOPLANGRUPID")
    private Long lrpropuestalrtipoplangrupid;
    @Column(name = "LRPROPUESTATIPOPLANID")
    private Long lrpropuestatipoplanid;
    @JoinColumn(name = "LRTIPOPROPUESTAID", referencedColumnName = "LRTIPOPROPUESTAID")
    @ManyToOne
    private Lrtipopropuesta lrtipopropuestaid;

    @Column(name = "LRPROPUESTAESPACK")
    private Character lrpropuestaespack;
    @Column(name = "LRPROPUESTATODORIESGO")
    private Character lrpropuestatodoriesgo;
    @Column(name = "LRPROPUESTANROFLOTA")
    private Long lrpropuestanroflota;
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRPROPUESTA_SEQ_GENERATOR", sequenceName = "LRPROPUESTAID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRPROPUESTA_SEQ_GENERATOR")
//    @org.hibernate.annotations.GenericGenerator(name="LRPROPUESTAID", strategy = "sequence", 
//    parameters = { 
//            @Parameter(name="sequence", value="LRPROPUESTAID") } 
//    )
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LRPROPUESTAID")
    @Basic(optional = false)
    @Column(name = "LRPROPUESTAID", nullable = false)
    private Long lrpropuestaid;
    @Column(name = "LRPROPUESTAMONID")
    private Short lrpropuestamonid;
    @Column(name = "LRPROPUESTAFECPROP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpropuestafecprop;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LRPROPUESTAMONTOTOTAL", precision = 17, scale = 2)
    private BigDecimal lrpropuestamontototal;
    @Column(name = "LRPROPUESTAVALORTIPCAMB", precision = 17, scale = 2)
    private BigDecimal lrpropuestavalortipcamb;
    @Column(name = "LRPROPUESTACOMENTARIO", length = 4000)
    private String lrpropuestacomentario;
    @Column(name = "LRPROPUESTAFLOTA")
    private Character lrpropuestaflota;
    @Column(name = "LRPROPUESTAAGENCIAID")
    private Long lrpropuestaagenciaid;
    @Column(name = "LRPROPUESTAUSUSUC")
    private Long lrpropuestaususuc;
    @Basic(optional = false)
    @Column(name = "LRPROPUESTAAC", nullable = false)
    private Character lrpropuestaac;
    @Column(name = "LRPROPUESTAUAL", length = 30)
    private String lrpropuestaual;
    @Column(name = "LRPROPUESTAFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpropuestafal;
    @Column(name = "LRPROPUESTAUMD", length = 30)
    private String lrpropuestaumd;
    @Column(name = "LRPROPUESTAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpropuestafmd;
    @Column(name = "LRPROPUESTAOFICIALID")
    private Long lrpropuestaoficialid;
    @Column(name = "LRPROPUESTAESCOASEGURO")
    private Character lrpropuestaescoaseguro;
    @JoinColumn(name = "LRCLASEASEGID", referencedColumnName = "LRCLASEASEGID")
    @ManyToOne
    private Lrclaseaseg lrclaseasegid;
    @JoinColumn(name = "LRESTADOPROPUESTAID", referencedColumnName = "LRESTADOPROPUESTAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrestadopropuesta lrestadopropuestaid;
    @JoinColumn(name = "LRPERSONAID", referencedColumnName = "LRPERSONAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrpersona lrpersonaid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrpropuestaid")
    private List<Lrcotizacion> lrcotizacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrpropuestaid")
    private List<Lrcontacto> lrcontactoList;

    public Lrpropuesta() {
    }

    public Lrpropuesta(Long lrpropuestaid) {
        this.lrpropuestaid = lrpropuestaid;
    }

    public Lrpropuesta(Long lrpropuestaid, Character lrpropuestaac) {
        this.lrpropuestaid = lrpropuestaid;
        this.lrpropuestaac = lrpropuestaac;
    }

    public Long getLrpropuestaid() {
        return lrpropuestaid;
    }

    public void setLrpropuestaid(Long lrpropuestaid) {
        this.lrpropuestaid = lrpropuestaid;
    }

    public Short getLrpropuestamonid() {
        return lrpropuestamonid;
    }

    public void setLrpropuestamonid(Short lrpropuestamonid) {
        this.lrpropuestamonid = lrpropuestamonid;
    }

    public Date getLrpropuestafecprop() {
        return lrpropuestafecprop;
    }

    public void setLrpropuestafecprop(Date lrpropuestafecprop) {
        this.lrpropuestafecprop = lrpropuestafecprop;
    }

    public BigDecimal getLrpropuestamontototal() {
        return lrpropuestamontototal;
    }

    public void setLrpropuestamontototal(BigDecimal lrpropuestamontototal) {
        this.lrpropuestamontototal = lrpropuestamontototal;
    }

    public BigDecimal getLrpropuestavalortipcamb() {
        return lrpropuestavalortipcamb;
    }

    public void setLrpropuestavalortipcamb(BigDecimal lrpropuestavalortipcamb) {
        this.lrpropuestavalortipcamb = lrpropuestavalortipcamb;
    }

    public String getLrpropuestacomentario() {
        return lrpropuestacomentario;
    }

    public void setLrpropuestacomentario(String lrpropuestacomentario) {
        this.lrpropuestacomentario = lrpropuestacomentario;
    }

    public Character getLrpropuestaflota() {
        return lrpropuestaflota;
    }

    public void setLrpropuestaflota(Character lrpropuestaflota) {
        this.lrpropuestaflota = lrpropuestaflota;
    }

    public Long getLrpropuestaagenciaid() {
        return lrpropuestaagenciaid;
    }

    public void setLrpropuestaagenciaid(Long lrpropuestaagenciaid) {
        this.lrpropuestaagenciaid = lrpropuestaagenciaid;
    }

    public Long getLrpropuestaususuc() {
        return lrpropuestaususuc;
    }

    public void setLrpropuestaususuc(Long lrpropuestaususuc) {
        this.lrpropuestaususuc = lrpropuestaususuc;
    }

    public Character getLrpropuestaac() {
        return lrpropuestaac;
    }

    public void setLrpropuestaac(Character lrpropuestaac) {
        this.lrpropuestaac = lrpropuestaac;
    }

    public String getLrpropuestaual() {
        return lrpropuestaual;
    }

    public void setLrpropuestaual(String lrpropuestaual) {
        this.lrpropuestaual = lrpropuestaual;
    }

    public Date getLrpropuestafal() {
        return lrpropuestafal;
    }

    public void setLrpropuestafal(Date lrpropuestafal) {
        this.lrpropuestafal = lrpropuestafal;
    }

    public String getLrpropuestaumd() {
        return lrpropuestaumd;
    }

    public void setLrpropuestaumd(String lrpropuestaumd) {
        this.lrpropuestaumd = lrpropuestaumd;
    }

    public Date getLrpropuestafmd() {
        return lrpropuestafmd;
    }

    public void setLrpropuestafmd(Date lrpropuestafmd) {
        this.lrpropuestafmd = lrpropuestafmd;
    }

    public Long getLrpropuestaoficialid() {
        return lrpropuestaoficialid;
    }

    public void setLrpropuestaoficialid(Long lrpropuestaoficialid) {
        this.lrpropuestaoficialid = lrpropuestaoficialid;
    }

    public Character getLrpropuestaescoaseguro() {
        return lrpropuestaescoaseguro;
    }

    public void setLrpropuestaescoaseguro(Character lrpropuestaescoaseguro) {
        this.lrpropuestaescoaseguro = lrpropuestaescoaseguro;
    }

    public Lrclaseaseg getLrclaseasegid() {
        return lrclaseasegid;
    }

    public void setLrclaseasegid(Lrclaseaseg lrclaseasegid) {
        this.lrclaseasegid = lrclaseasegid;
    }

    public Lrestadopropuesta getLrestadopropuestaid() {
        return lrestadopropuestaid;
    }

    public void setLrestadopropuestaid(Lrestadopropuesta lrestadopropuestaid) {
        this.lrestadopropuestaid = lrestadopropuestaid;
    }

    public Lrpersona getLrpersonaid() {
        return lrpersonaid;
    }

    public void setLrpersonaid(Lrpersona lrpersonaid) {
        this.lrpersonaid = lrpersonaid;
    }

    public List<Lrcotizacion> getLrcotizacionList() {
        return lrcotizacionList;
    }

    public void setLrcotizacionList(List<Lrcotizacion> lrcotizacionList) {
        this.lrcotizacionList = lrcotizacionList;
    }

    public List<Lrcontacto> getLrcontactoList() {
        return lrcontactoList;
    }

    public void setLrcontactoList(List<Lrcontacto> lrcontactoList) {
        this.lrcontactoList = lrcontactoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrpropuestaid != null ? lrpropuestaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrpropuesta)) {
            return false;
        }
        Lrpropuesta other = (Lrpropuesta) object;
        if ((this.lrpropuestaid == null && other.lrpropuestaid != null) || (this.lrpropuestaid != null && !this.lrpropuestaid.equals(other.lrpropuestaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrpropuesta[ lrpropuestaid=" + lrpropuestaid + " ]";
    }

    public Character getLrpropuestatodoriesgo() {
        return lrpropuestatodoriesgo;
    }

    public void setLrpropuestatodoriesgo(Character lrpropuestatodoriesgo) {
        this.lrpropuestatodoriesgo = lrpropuestatodoriesgo;
    }

    public Long getLrpropuestanroflota() {
        return lrpropuestanroflota;
    }

    public void setLrpropuestanroflota(Long lrpropuestanroflota) {
        this.lrpropuestanroflota = lrpropuestanroflota;
    }

    public Character getLrpropuestaespack() {
        return lrpropuestaespack;
    }

    public void setLrpropuestaespack(Character lrpropuestaespack) {
        this.lrpropuestaespack = lrpropuestaespack;
    }

    public Long getLrpropuestalrtipoplangrupid() {
        return lrpropuestalrtipoplangrupid;
    }

    public void setLrpropuestalrtipoplangrupid(Long lrpropuestalrtipoplangrupid) {
        this.lrpropuestalrtipoplangrupid = lrpropuestalrtipoplangrupid;
    }

    public Long getLrpropuestatipoplanid() {
        return lrpropuestatipoplanid;
    }

    public void setLrpropuestatipoplanid(Long lrpropuestatipoplanid) {
        this.lrpropuestatipoplanid = lrpropuestatipoplanid;
    }

    public Lrtipopropuesta getLrtipopropuestaid() {
        return lrtipopropuestaid;
    }

    public void setLrtipopropuestaid(Lrtipopropuesta lrtipopropuestaid) {
        this.lrtipopropuestaid = lrtipopropuestaid;
    }

}
