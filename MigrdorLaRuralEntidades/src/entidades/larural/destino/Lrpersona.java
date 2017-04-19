/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRPERSONA")
@NamedQueries({
    @NamedQuery(name = "Lrpersona.findAll", query = "SELECT l FROM Lrpersona l"),
    @NamedQuery(name = "Lrpersona.findByLrpersonaid", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonaid = :lrpersonaid"),
    @NamedQuery(name = "Lrpersona.findByLrpersonatipo", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonatipo = :lrpersonatipo"),
    @NamedQuery(name = "Lrpersona.findByLrpaisesid", query = "SELECT l FROM Lrpersona l WHERE l.lrpaisesid = :lrpaisesid"),
    @NamedQuery(name = "Lrpersona.findByLrciuid", query = "SELECT l FROM Lrpersona l WHERE l.lrciuid = :lrciuid"),
    @NamedQuery(name = "Lrpersona.findByLrzonasid", query = "SELECT l FROM Lrpersona l WHERE l.lrzonasid = :lrzonasid"),
    @NamedQuery(name = "Lrpersona.findByLrpersonacalleprin", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonacalleprin = :lrpersonacalleprin"),
    @NamedQuery(name = "Lrpersona.findByLrpersonacalletrans1", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonacalletrans1 = :lrpersonacalletrans1"),
    @NamedQuery(name = "Lrpersona.findByLrpersonacalletrans2", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonacalletrans2 = :lrpersonacalletrans2"),
    @NamedQuery(name = "Lrpersona.findByLrpersonacasanro", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonacasanro = :lrpersonacasanro"),
    @NamedQuery(name = "Lrpersona.findByLrpersonaedificio", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonaedificio = :lrpersonaedificio"),
    @NamedQuery(name = "Lrpersona.findByLrpersonabloque", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonabloque = :lrpersonabloque"),
    @NamedQuery(name = "Lrpersona.findByLrpersonapisonro", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonapisonro = :lrpersonapisonro"),
    @NamedQuery(name = "Lrpersona.findByLrpersonacel", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonacel = :lrpersonacel"),
    @NamedQuery(name = "Lrpersona.findByLrpersonatel", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonatel = :lrpersonatel"),
    @NamedQuery(name = "Lrpersona.findByLrpersonacel2", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonacel2 = :lrpersonacel2"),
    @NamedQuery(name = "Lrpersona.findByLrpersonamailprin", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonamailprin = :lrpersonamailprin"),
    @NamedQuery(name = "Lrpersona.findByLrpersonamailalter", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonamailalter = :lrpersonamailalter"),
    @NamedQuery(name = "Lrpersona.findByLrpersonafal", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonafal = :lrpersonafal"),
    @NamedQuery(name = "Lrpersona.findByLrpersonaual", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonaual = :lrpersonaual"),
    @NamedQuery(name = "Lrpersona.findByLrpersonafmd", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonafmd = :lrpersonafmd"),
    @NamedQuery(name = "Lrpersona.findByLrpersonaumd", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonaumd = :lrpersonaumd"),
    @NamedQuery(name = "Lrpersona.findByLrpersonaaseid", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonaaseid = :lrpersonaaseid"),
    @NamedQuery(name = "Lrpersona.findByLrpersonaruc", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonaruc = :lrpersonaruc"),
    @NamedQuery(name = "Lrpersona.findByLrpersonapaginaweb", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonapaginaweb = :lrpersonapaginaweb"),
    @NamedQuery(name = "Lrpersona.findByLrpersonafchnac", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonafchnac = :lrpersonafchnac"),
    @NamedQuery(name = "Lrpersona.findByLrpersonaestado", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonaestado = :lrpersonaestado"),
    @NamedQuery(name = "Lrpersona.findByLrdepid", query = "SELECT l FROM Lrpersona l WHERE l.lrdepid = :lrdepid"),
    @NamedQuery(name = "Lrpersona.findByLrpersonanrodoc", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonanrodoc = :lrpersonanrodoc"),
    @NamedQuery(name = "Lrpersona.findByLrpersonadoctip", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonadoctip = :lrpersonadoctip"),
    @NamedQuery(name = "Lrpersona.findByLrpersonapuertanro", query = "SELECT l FROM Lrpersona l WHERE l.lrpersonapuertanro = :lrpersonapuertanro")})
public class Lrpersona implements Serializable {
    @Column(name = "LRPERSONAASEIDCAUCION")
    private Long lrpersonaaseidcaucion;
    @Column(name = "LRPERSONAASEIDVIDA")
    private Long lrpersonaaseidvida;
    @Column(name = "LRPERSONAASEIDAP")
    private Long lrpersonaaseidap;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "LRPERSONAIDSEQ_GENERATOR", sequenceName = "LRPERSONAID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRPERSONAIDSEQ_GENERATOR")
    @Column(name = "LRPERSONAID", nullable = false)
    private Long lrpersonaid;
    @Basic(optional = false)
    @Column(name = "LRPERSONATIPO", nullable = false, length = 1)
    private String lrpersonatipo;
    @Column(name = "LRPAISESID")
    private Long lrpaisesid;
    @Column(name = "LRCIUID")
    private Short lrciuid;
    @Column(name = "LRZONASID")
    private Short lrzonasid;
    @Column(name = "LRPERSONACALLEPRIN", length = 60)
    private String lrpersonacalleprin;
    @Column(name = "LRPERSONACALLETRANS1", length = 60)
    private String lrpersonacalletrans1;
    @Column(name = "LRPERSONACALLETRANS2", length = 60)
    private String lrpersonacalletrans2;
    @Column(name = "LRPERSONACASANRO")
    private Short lrpersonacasanro;
    @Column(name = "LRPERSONAEDIFICIO", length = 30)
    private String lrpersonaedificio;
    @Column(name = "LRPERSONABLOQUE", length = 10)
    private String lrpersonabloque;
    @Column(name = "LRPERSONAPISONRO")
    private Short lrpersonapisonro;
    @Column(name = "LRPERSONACEL", length = 15)
    private String lrpersonacel;
    @Column(name = "LRPERSONATEL", length = 15)
    private String lrpersonatel;
    @Column(name = "LRPERSONACEL2", length = 15)
    private String lrpersonacel2;
    @Column(name = "LRPERSONAMAILPRIN", length = 40)
    private String lrpersonamailprin;
    @Column(name = "LRPERSONAMAILALTER", length = 40)
    private String lrpersonamailalter;
    @Basic(optional = false)
    @Column(name = "LRPERSONAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpersonafal;
    @Basic(optional = false)
    @Column(name = "LRPERSONAUAL", nullable = false, length = 30)
    private String lrpersonaual;
    @Column(name = "LRPERSONAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpersonafmd;
    @Column(name = "LRPERSONAUMD", length = 30)
    private String lrpersonaumd;
    @Column(name = "LRPERSONAASEID")
    private Long lrpersonaaseid;
    @Column(name = "LRPERSONARUC", length = 15)
    private String lrpersonaruc;
    @Column(name = "LRPERSONAPAGINAWEB", length = 120)
    private String lrpersonapaginaweb;
    @Column(name = "LRPERSONAFCHNAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpersonafchnac;
    @Column(name = "LRPERSONAESTADO")
    private Character lrpersonaestado;
    @Column(name = "LRDEPID")
    private Long lrdepid;
    @Column(name = "LRPERSONANRODOC", length = 15)
    private String lrpersonanrodoc;
    @Column(name = "LRPERSONADOCTIP")
    private Short lrpersonadoctip;
    @Column(name = "LRPERSONAPUERTANRO", length = 10)
    private String lrpersonapuertanro;
    @OneToMany(mappedBy = "slrpersonaid")
    private List<Lrcotidatbienase> lrcotidatbienaseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrpersona")
    private List<Lrpersonatc> lrpersonatcList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrpersonaid")
    private List<Lrpropuesta> lrpropuestaList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "lrpersonaid")
    private Lrfichacliente lrfichacliente;
    @JoinColumn(name = "LRBARRIOSID", referencedColumnName = "LRBARRIOSID")
    @ManyToOne
    private Lrbarrios lrbarriosid;
    @OneToMany(mappedBy = "lrpersonaid")
    private List<Lrtasapersonaperiodo> lrtasapersonaperiodoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrpersona")
    private List<Lrasegvinc> lrasegvincList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "spersonaidvinc")
    private List<Lrasegvinc> lrasegvincList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sperautolrpersonaid")
    private List<Lrpersonasautorizadas> lrpersonasautorizadasList;

    public Lrpersona() {
    }

    public Lrpersona(Long lrpersonaid) {
        this.lrpersonaid = lrpersonaid;
    }

    public Lrpersona(Long lrpersonaid, String lrpersonatipo, Date lrpersonafal, String lrpersonaual) {
        this.lrpersonaid = lrpersonaid;
        this.lrpersonatipo = lrpersonatipo;
        this.lrpersonafal = lrpersonafal;
        this.lrpersonaual = lrpersonaual;
    }

    public Long getLrpersonaid() {
        return lrpersonaid;
    }

    public void setLrpersonaid(Long lrpersonaid) {
        this.lrpersonaid = lrpersonaid;
    }

    public String getLrpersonatipo() {
        return lrpersonatipo;
    }

    public void setLrpersonatipo(String lrpersonatipo) {
        this.lrpersonatipo = lrpersonatipo;
    }

    public Long getLrpaisesid() {
        return lrpaisesid;
    }

    public void setLrpaisesid(Long lrpaisesid) {
        this.lrpaisesid = lrpaisesid;
    }

    public Short getLrciuid() {
        return lrciuid;
    }

    public void setLrciuid(Short lrciuid) {
        this.lrciuid = lrciuid;
    }

    public Short getLrzonasid() {
        return lrzonasid;
    }

    public void setLrzonasid(Short lrzonasid) {
        this.lrzonasid = lrzonasid;
    }

    public String getLrpersonacalleprin() {
        return lrpersonacalleprin;
    }

    public void setLrpersonacalleprin(String lrpersonacalleprin) {
        this.lrpersonacalleprin = lrpersonacalleprin;
    }

    public String getLrpersonacalletrans1() {
        return lrpersonacalletrans1;
    }

    public void setLrpersonacalletrans1(String lrpersonacalletrans1) {
        this.lrpersonacalletrans1 = lrpersonacalletrans1;
    }

    public String getLrpersonacalletrans2() {
        return lrpersonacalletrans2;
    }

    public void setLrpersonacalletrans2(String lrpersonacalletrans2) {
        this.lrpersonacalletrans2 = lrpersonacalletrans2;
    }

    public Short getLrpersonacasanro() {
        return lrpersonacasanro;
    }

    public void setLrpersonacasanro(Short lrpersonacasanro) {
        this.lrpersonacasanro = lrpersonacasanro;
    }

    public String getLrpersonaedificio() {
        return lrpersonaedificio;
    }

    public void setLrpersonaedificio(String lrpersonaedificio) {
        this.lrpersonaedificio = lrpersonaedificio;
    }

    public String getLrpersonabloque() {
        return lrpersonabloque;
    }

    public void setLrpersonabloque(String lrpersonabloque) {
        this.lrpersonabloque = lrpersonabloque;
    }

    public Short getLrpersonapisonro() {
        return lrpersonapisonro;
    }

    public void setLrpersonapisonro(Short lrpersonapisonro) {
        this.lrpersonapisonro = lrpersonapisonro;
    }

    public String getLrpersonacel() {
        return lrpersonacel;
    }

    public void setLrpersonacel(String lrpersonacel) {
        this.lrpersonacel = lrpersonacel;
    }

    public String getLrpersonatel() {
        return lrpersonatel;
    }

    public void setLrpersonatel(String lrpersonatel) {
        this.lrpersonatel = lrpersonatel;
    }

    public String getLrpersonacel2() {
        return lrpersonacel2;
    }

    public void setLrpersonacel2(String lrpersonacel2) {
        this.lrpersonacel2 = lrpersonacel2;
    }

    public String getLrpersonamailprin() {
        return lrpersonamailprin;
    }

    public void setLrpersonamailprin(String lrpersonamailprin) {
        this.lrpersonamailprin = lrpersonamailprin;
    }

    public String getLrpersonamailalter() {
        return lrpersonamailalter;
    }

    public void setLrpersonamailalter(String lrpersonamailalter) {
        this.lrpersonamailalter = lrpersonamailalter;
    }

    public Date getLrpersonafal() {
        return lrpersonafal;
    }

    public void setLrpersonafal(Date lrpersonafal) {
        this.lrpersonafal = lrpersonafal;
    }

    public String getLrpersonaual() {
        return lrpersonaual;
    }

    public void setLrpersonaual(String lrpersonaual) {
        this.lrpersonaual = lrpersonaual;
    }

    public Date getLrpersonafmd() {
        return lrpersonafmd;
    }

    public void setLrpersonafmd(Date lrpersonafmd) {
        this.lrpersonafmd = lrpersonafmd;
    }

    public String getLrpersonaumd() {
        return lrpersonaumd;
    }

    public void setLrpersonaumd(String lrpersonaumd) {
        this.lrpersonaumd = lrpersonaumd;
    }

    public Long getLrpersonaaseid() {
        return lrpersonaaseid;
    }

    public void setLrpersonaaseid(Long lrpersonaaseid) {
        this.lrpersonaaseid = lrpersonaaseid;
    }

    public String getLrpersonaruc() {
        return lrpersonaruc;
    }

    public void setLrpersonaruc(String lrpersonaruc) {
        this.lrpersonaruc = lrpersonaruc;
    }

    public String getLrpersonapaginaweb() {
        return lrpersonapaginaweb;
    }

    public void setLrpersonapaginaweb(String lrpersonapaginaweb) {
        this.lrpersonapaginaweb = lrpersonapaginaweb;
    }

    public Date getLrpersonafchnac() {
        return lrpersonafchnac;
    }

    public void setLrpersonafchnac(Date lrpersonafchnac) {
        this.lrpersonafchnac = lrpersonafchnac;
    }

    public Character getLrpersonaestado() {
        return lrpersonaestado;
    }

    public void setLrpersonaestado(Character lrpersonaestado) {
        this.lrpersonaestado = lrpersonaestado;
    }

    public Long getLrdepid() {
        return lrdepid;
    }

    public void setLrdepid(Long lrdepid) {
        this.lrdepid = lrdepid;
    }

    public String getLrpersonanrodoc() {
        return lrpersonanrodoc;
    }

    public void setLrpersonanrodoc(String lrpersonanrodoc) {
        this.lrpersonanrodoc = lrpersonanrodoc;
    }

    public Short getLrpersonadoctip() {
        return lrpersonadoctip;
    }

    public void setLrpersonadoctip(Short lrpersonadoctip) {
        this.lrpersonadoctip = lrpersonadoctip;
    }

    public String getLrpersonapuertanro() {
        return lrpersonapuertanro;
    }

    public void setLrpersonapuertanro(String lrpersonapuertanro) {
        this.lrpersonapuertanro = lrpersonapuertanro;
    }

    public List<Lrcotidatbienase> getLrcotidatbienaseList() {
        return lrcotidatbienaseList;
    }

    public void setLrcotidatbienaseList(List<Lrcotidatbienase> lrcotidatbienaseList) {
        this.lrcotidatbienaseList = lrcotidatbienaseList;
    }

    public List<Lrpersonatc> getLrpersonatcList() {
        return lrpersonatcList;
    }

    public void setLrpersonatcList(List<Lrpersonatc> lrpersonatcList) {
        this.lrpersonatcList = lrpersonatcList;
    }

    public List<Lrpropuesta> getLrpropuestaList() {
        return lrpropuestaList;
    }

    public void setLrpropuestaList(List<Lrpropuesta> lrpropuestaList) {
        this.lrpropuestaList = lrpropuestaList;
    }

    public Lrfichacliente getLrfichacliente() {
        return lrfichacliente;
    }

    public void setLrfichacliente(Lrfichacliente lrfichacliente) {
        this.lrfichacliente = lrfichacliente;
    }

    public Lrbarrios getLrbarriosid() {
        return lrbarriosid;
    }

    public void setLrbarriosid(Lrbarrios lrbarriosid) {
        this.lrbarriosid = lrbarriosid;
    }

    public List<Lrtasapersonaperiodo> getLrtasapersonaperiodoList() {
        return lrtasapersonaperiodoList;
    }

    public void setLrtasapersonaperiodoList(List<Lrtasapersonaperiodo> lrtasapersonaperiodoList) {
        this.lrtasapersonaperiodoList = lrtasapersonaperiodoList;
    }

    public List<Lrasegvinc> getLrasegvincList() {
        return lrasegvincList;
    }

    public void setLrasegvincList(List<Lrasegvinc> lrasegvincList) {
        this.lrasegvincList = lrasegvincList;
    }

    public List<Lrasegvinc> getLrasegvincList1() {
        return lrasegvincList1;
    }

    public void setLrasegvincList1(List<Lrasegvinc> lrasegvincList1) {
        this.lrasegvincList1 = lrasegvincList1;
    }

    public List<Lrpersonasautorizadas> getLrpersonasautorizadasList() {
        return lrpersonasautorizadasList;
    }

    public void setLrpersonasautorizadasList(List<Lrpersonasautorizadas> lrpersonasautorizadasList) {
        this.lrpersonasautorizadasList = lrpersonasautorizadasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrpersonaid != null ? lrpersonaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrpersona)) {
            return false;
        }
        Lrpersona other = (Lrpersona) object;
        if ((this.lrpersonaid == null && other.lrpersonaid != null) || (this.lrpersonaid != null && !this.lrpersonaid.equals(other.lrpersonaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrpersona[ lrpersonaid=" + lrpersonaid + " ]";
    }

    public Long getLrpersonaaseidcaucion() {
        return lrpersonaaseidcaucion;
    }

    public void setLrpersonaaseidcaucion(Long lrpersonaaseidcaucion) {
        this.lrpersonaaseidcaucion = lrpersonaaseidcaucion;
    }

    public Long getLrpersonaaseidvida() {
        return lrpersonaaseidvida;
    }

    public void setLrpersonaaseidvida(Long lrpersonaaseidvida) {
        this.lrpersonaaseidvida = lrpersonaaseidvida;
    }

    public Long getLrpersonaaseidap() {
        return lrpersonaaseidap;
    }

    public void setLrpersonaaseidap(Long lrpersonaaseidap) {
        this.lrpersonaaseidap = lrpersonaaseidap;
    }

}
