/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRDETRIESGOTEC")
@NamedQueries({
    @NamedQuery(name = "Lrdetriesgotec.findAll", query = "SELECT l FROM Lrdetriesgotec l"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecid", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecid = :lrdetriesgotecid"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdesignacion", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdesignacion = :lrdetriesgotecdesignacion"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecpais", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecpais = :lrdetriesgotecpais"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecpropietario", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecpropietario = :lrdetriesgotecpropietario"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdirecprop", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdirecprop = :lrdetriesgotecdirecprop"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecsubcontr", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecsubcontr = :lrdetriesgotecsubcontr"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdirecsubcontr", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdirecsubcontr = :lrdetriesgotecdirecsubcontr"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecingconsu", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecingconsu = :lrdetriesgotecingconsu"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdirecingcons", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdirecingcons = :lrdetriesgotecdirecingcons"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdimension", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdimension = :lrdetriesgotecdimension"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteccimentacion", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteccimentacion = :lrdetriesgoteccimentacion"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecprofund", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecprofund = :lrdetriesgotecprofund"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecmetodo", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecmetodo = :lrdetriesgotecmetodo"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecmateriales", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecmateriales = :lrdetriesgotecmateriales"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecexperiencia", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecexperiencia = :lrdetriesgotecexperiencia"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecpercons", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecpercons = :lrdetriesgotecpercons"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecpermant", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecpermant = :lrdetriesgotecpermant"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotectrabajo", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotectrabajo = :lrdetriesgotectrabajo"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecincendio", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecincendio = :lrdetriesgotecincendio"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecderrumbe", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecderrumbe = :lrdetriesgotecderrumbe"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecvulcanismo", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecvulcanismo = :lrdetriesgotecvulcanismo"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecinuncacion", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecinuncacion = :lrdetriesgotecinuncacion"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecvoladuras", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecvoladuras = :lrdetriesgotecvoladuras"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecotro", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecotro = :lrdetriesgotecotro"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecterremoto", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecterremoto = :lrdetriesgotecterremoto"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecintensidad", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecintensidad = :lrdetriesgotecintensidad"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecnormas", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecnormas = :lrdetriesgotecnormas"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecestricta", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecestricta = :lrdetriesgotecestricta"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecroca", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecroca = :lrdetriesgotecroca"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecgrava", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecgrava = :lrdetriesgotecgrava"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecarena", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecarena = :lrdetriesgotecarena"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecarcilla", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecarcilla = :lrdetriesgotecarcilla"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecrelleno", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecrelleno = :lrdetriesgotecrelleno"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecotrosubs", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecotrosubs = :lrdetriesgotecotrosubs"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdescotrosubs", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdescotrosubs = :lrdetriesgotecdescotrosubs"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecnivelfreat", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecnivelfreat = :lrdetriesgotecnivelfreat"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecrionombre", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecrionombre = :lrdetriesgotecrionombre"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdist", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdist = :lrdetriesgotecdist"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecnivagua", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecnivagua = :lrdetriesgotecnivagua"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecnivmin", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecnivmin = :lrdetriesgotecnivmin"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecnivmax", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecnivmax = :lrdetriesgotecnivmax"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecnivmaxreg", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecnivmaxreg = :lrdetriesgotecnivmaxreg"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecfecnivmax", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecfecnivmax = :lrdetriesgotecfecnivmax"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteclluviadesde", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteclluviadesde = :lrdetriesgoteclluviadesde"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteclluviahasta", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteclluviahasta = :lrdetriesgoteclluviahasta"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteclluviahora", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteclluviahora = :lrdetriesgoteclluviahora"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteclluviadia", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteclluviadia = :lrdetriesgoteclluviadia"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteclluviames", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteclluviames = :lrdetriesgoteclluviames"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecriesgo", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecriesgo = :lrdetriesgotecriesgo"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecgastosadic", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecgastosadic = :lrdetriesgotecgastosadic"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteccoberc", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteccoberc = :lrdetriesgoteccoberc"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteccobercotro", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteccobercotro = :lrdetriesgoteccobercotro"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdetedif", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdetedif = :lrdetriesgotecdetedif"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecedifady", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecedifady = :lrdetriesgotecedifady"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdescedif", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdescedif = :lrdetriesgotecdescedif"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteccontratprinc", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteccontratprinc = :lrdetriesgoteccontratprinc"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecobjcontratprinc", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecobjcontratprinc = :lrdetriesgotecobjcontratprinc"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecobjtrabprinc", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecobjtrabprinc = :lrdetriesgotecobjtrabprinc"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecobjtrabsub", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecobjtrabsub = :lrdetriesgotecobjtrabsub"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecequipoprinc", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecequipoprinc = :lrdetriesgotecequipoprinc"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecestudiogeo", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecestudiogeo = :lrdetriesgotecestudiogeo"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteccodconstrucc", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteccodconstrucc = :lrdetriesgoteccodconstrucc"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteccondiclimat", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteccondiclimat = :lrdetriesgoteccondiclimat"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecbienesdesc", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecbienesdesc = :lrdetriesgotecbienesdesc"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecavancesconst", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecavancesconst = :lrdetriesgotecavancesconst"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteclimiteresp", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteclimiteresp = :lrdetriesgoteclimiteresp"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteccobperdida", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteccobperdida = :lrdetriesgoteccobperdida"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecclimresponady", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecclimresponady = :lrdetriesgotecclimresponady"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecsiniestro", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecsiniestro = :lrdetriesgotecsiniestro"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecperdida", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecperdida = :lrdetriesgotecperdida"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteccausa", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteccausa = :lrdetriesgoteccausa"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecotraspol", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecotraspol = :lrdetriesgotecotraspol"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdatosaseg", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdatosaseg = :lrdetriesgotecdatosaseg"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecotracompanhia", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecotracompanhia = :lrdetriesgotecotracompanhia"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecrechazo", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecrechazo = :lrdetriesgotecrechazo"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecexpliquerechazo", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecexpliquerechazo = :lrdetriesgotecexpliquerechazo"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteccambios", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteccambios = :lrdetriesgoteccambios"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdescambios", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdescambios = :lrdetriesgotecdescambios"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecmaquinpropias", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecmaquinpropias = :lrdetriesgotecmaquinpropias"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecexpersiniestral", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecexpersiniestral = :lrdetriesgotecexpersiniestral"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecuso", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecuso = :lrdetriesgotecuso"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecubicacfuerahorar", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecubicacfuerahorar = :lrdetriesgotecubicacfuerahorar"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecalquilados", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecalquilados = :lrdetriesgotecalquilados"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotechuracan", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotechuracan = :lrdetriesgotechuracan"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecexplosivos", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecexplosivos = :lrdetriesgotecexplosivos"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgoteclabsubterraneas", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgoteclabsubterraneas = :lrdetriesgoteclabsubterraneas"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecposeefotog", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecposeefotog = :lrdetriesgotecposeefotog"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecdetalleanhos", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecdetalleanhos = :lrdetriesgotecdetalleanhos"),
    @NamedQuery(name = "Lrdetriesgotec.findByLrdetriesgotecexplicproyecto", query = "SELECT l FROM Lrdetriesgotec l WHERE l.lrdetriesgotecexplicproyecto = :lrdetriesgotecexplicproyecto")})
public class Lrdetriesgotec implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRDETRIESGOTECID", nullable = false)
    private Long lrdetriesgotecid;
    @Column(name = "LRDETRIESGOTECDESIGNACION", length = 300)
    private String lrdetriesgotecdesignacion;
    @Column(name = "LRDETRIESGOTECPAIS", length = 300)
    private String lrdetriesgotecpais;
    @Column(name = "LRDETRIESGOTECPROPIETARIO", length = 100)
    private String lrdetriesgotecpropietario;
    @Column(name = "LRDETRIESGOTECDIRECPROP", length = 300)
    private String lrdetriesgotecdirecprop;
    @Column(name = "LRDETRIESGOTECSUBCONTR", length = 100)
    private String lrdetriesgotecsubcontr;
    @Column(name = "LRDETRIESGOTECDIRECSUBCONTR", length = 300)
    private String lrdetriesgotecdirecsubcontr;
    @Column(name = "LRDETRIESGOTECINGCONSU", length = 100)
    private String lrdetriesgotecingconsu;
    @Column(name = "LRDETRIESGOTECDIRECINGCONS", length = 300)
    private String lrdetriesgotecdirecingcons;
    @Column(name = "LRDETRIESGOTECDIMENSION", length = 300)
    private String lrdetriesgotecdimension;
    @Column(name = "LRDETRIESGOTECCIMENTACION", length = 100)
    private String lrdetriesgoteccimentacion;
    @Column(name = "LRDETRIESGOTECPROFUND", length = 100)
    private String lrdetriesgotecprofund;
    @Column(name = "LRDETRIESGOTECMETODO", length = 100)
    private String lrdetriesgotecmetodo;
    @Column(name = "LRDETRIESGOTECMATERIALES", length = 100)
    private String lrdetriesgotecmateriales;
    @Column(name = "LRDETRIESGOTECEXPERIENCIA")
    private Character lrdetriesgotecexperiencia;
    @Column(name = "LRDETRIESGOTECPERCONS", length = 30)
    private String lrdetriesgotecpercons;
    @Column(name = "LRDETRIESGOTECPERMANT", length = 30)
    private String lrdetriesgotecpermant;
    @Column(name = "LRDETRIESGOTECTRABAJO", length = 300)
    private String lrdetriesgotectrabajo;
    @Column(name = "LRDETRIESGOTECINCENDIO")
    private Character lrdetriesgotecincendio;
    @Column(name = "LRDETRIESGOTECDERRUMBE")
    private Character lrdetriesgotecderrumbe;
    @Column(name = "LRDETRIESGOTECVULCANISMO")
    private Character lrdetriesgotecvulcanismo;
    @Column(name = "LRDETRIESGOTECINUNCACION")
    private Character lrdetriesgotecinuncacion;
    @Column(name = "LRDETRIESGOTECVOLADURAS")
    private Character lrdetriesgotecvoladuras;
    @Column(name = "LRDETRIESGOTECOTRO")
    private Character lrdetriesgotecotro;
    @Column(name = "LRDETRIESGOTECTERREMOTO")
    private Character lrdetriesgotecterremoto;
    @Column(name = "LRDETRIESGOTECINTENSIDAD", length = 30)
    private String lrdetriesgotecintensidad;
    @Column(name = "LRDETRIESGOTECNORMAS")
    private Character lrdetriesgotecnormas;
    @Column(name = "LRDETRIESGOTECESTRICTA")
    private Character lrdetriesgotecestricta;
    @Column(name = "LRDETRIESGOTECROCA")
    private Character lrdetriesgotecroca;
    @Column(name = "LRDETRIESGOTECGRAVA")
    private Character lrdetriesgotecgrava;
    @Column(name = "LRDETRIESGOTECARENA")
    private Character lrdetriesgotecarena;
    @Column(name = "LRDETRIESGOTECARCILLA")
    private Character lrdetriesgotecarcilla;
    @Column(name = "LRDETRIESGOTECRELLENO")
    private Character lrdetriesgotecrelleno;
    @Column(name = "LRDETRIESGOTECOTROSUBS")
    private Character lrdetriesgotecotrosubs;
    @Column(name = "LRDETRIESGOTECDESCOTROSUBS", length = 100)
    private String lrdetriesgotecdescotrosubs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LRDETRIESGOTECNIVELFREAT", precision = 7, scale = 2)
    private BigDecimal lrdetriesgotecnivelfreat;
    @Column(name = "LRDETRIESGOTECRIONOMBRE", length = 100)
    private String lrdetriesgotecrionombre;
    @Column(name = "LRDETRIESGOTECDIST", length = 100)
    private String lrdetriesgotecdist;
    @Column(name = "LRDETRIESGOTECNIVAGUA", precision = 7, scale = 2)
    private BigDecimal lrdetriesgotecnivagua;
    @Column(name = "LRDETRIESGOTECNIVMIN", precision = 7, scale = 2)
    private BigDecimal lrdetriesgotecnivmin;
    @Column(name = "LRDETRIESGOTECNIVMAX", precision = 7, scale = 2)
    private BigDecimal lrdetriesgotecnivmax;
    @Column(name = "LRDETRIESGOTECNIVMAXREG", precision = 7, scale = 2)
    private BigDecimal lrdetriesgotecnivmaxreg;
    @Column(name = "LRDETRIESGOTECFECNIVMAX")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdetriesgotecfecnivmax;
    @Column(name = "LRDETRIESGOTECLLUVIADESDE", length = 100)
    private String lrdetriesgoteclluviadesde;
    @Column(name = "LRDETRIESGOTECLLUVIAHASTA", length = 100)
    private String lrdetriesgoteclluviahasta;
    @Column(name = "LRDETRIESGOTECLLUVIAHORA", length = 100)
    private String lrdetriesgoteclluviahora;
    @Column(name = "LRDETRIESGOTECLLUVIADIA", length = 100)
    private String lrdetriesgoteclluviadia;
    @Column(name = "LRDETRIESGOTECLLUVIAMES", length = 100)
    private String lrdetriesgoteclluviames;
    @Column(name = "LRDETRIESGOTECRIESGO", length = 100)
    private String lrdetriesgotecriesgo;
    @Column(name = "LRDETRIESGOTECGASTOSADIC")
    private Character lrdetriesgotecgastosadic;
    @Column(name = "LRDETRIESGOTECCOBERC")
    private Character lrdetriesgoteccoberc;
    @Column(name = "LRDETRIESGOTECCOBERCOTRO")
    private Character lrdetriesgoteccobercotro;
    @Column(name = "LRDETRIESGOTECDETEDIF", length = 300)
    private String lrdetriesgotecdetedif;
    @Column(name = "LRDETRIESGOTECEDIFADY")
    private Character lrdetriesgotecedifady;
    @Column(name = "LRDETRIESGOTECDESCEDIF", length = 300)
    private String lrdetriesgotecdescedif;
    @Column(name = "LRDETRIESGOTECCONTRATPRINC", length = 100)
    private String lrdetriesgoteccontratprinc;
    @Column(name = "LRDETRIESGOTECOBJCONTRATPRINC", length = 100)
    private String lrdetriesgotecobjcontratprinc;
    @Column(name = "LRDETRIESGOTECOBJTRABPRINC", length = 300)
    private String lrdetriesgotecobjtrabprinc;
    @Column(name = "LRDETRIESGOTECOBJTRABSUB", length = 300)
    private String lrdetriesgotecobjtrabsub;
    @Column(name = "LRDETRIESGOTECEQUIPOPRINC", length = 300)
    private String lrdetriesgotecequipoprinc;
    @Column(name = "LRDETRIESGOTECESTUDIOGEO", length = 300)
    private String lrdetriesgotecestudiogeo;
    @Column(name = "LRDETRIESGOTECCODCONSTRUCC", length = 300)
    private String lrdetriesgoteccodconstrucc;
    @Column(name = "LRDETRIESGOTECCONDICLIMAT", length = 300)
    private String lrdetriesgoteccondiclimat;
    @Column(name = "LRDETRIESGOTECBIENESDESC", length = 300)
    private String lrdetriesgotecbienesdesc;
    @Column(name = "LRDETRIESGOTECAVANCESCONST", length = 300)
    private String lrdetriesgotecavancesconst;
    @Column(name = "LRDETRIESGOTECLIMITERESP", length = 300)
    private String lrdetriesgoteclimiteresp;
    @Column(name = "LRDETRIESGOTECCOBPERDIDA")
    private Character lrdetriesgoteccobperdida;
    @Column(name = "LRDETRIESGOTECCLIMRESPONADY", length = 30)
    private String lrdetriesgotecclimresponady;
    @Column(name = "LRDETRIESGOTECSINIESTRO")
    private Character lrdetriesgotecsiniestro;
    @Column(name = "LRDETRIESGOTECPERDIDA", precision = 7, scale = 2)
    private BigDecimal lrdetriesgotecperdida;
    @Column(name = "LRDETRIESGOTECCAUSA", length = 300)
    private String lrdetriesgoteccausa;
    @Column(name = "LRDETRIESGOTECOTRASPOL")
    private Character lrdetriesgotecotraspol;
    @Column(name = "LRDETRIESGOTECDATOSASEG", length = 300)
    private String lrdetriesgotecdatosaseg;
    @Column(name = "LRDETRIESGOTECOTRACOMPANHIA")
    private Character lrdetriesgotecotracompanhia;
    @Column(name = "LRDETRIESGOTECRECHAZO")
    private Character lrdetriesgotecrechazo;
    @Column(name = "LRDETRIESGOTECEXPLIQUERECHAZO", length = 300)
    private String lrdetriesgotecexpliquerechazo;
    @Column(name = "LRDETRIESGOTECCAMBIOS")
    private Character lrdetriesgoteccambios;
    @Column(name = "LRDETRIESGOTECDESCAMBIOS", length = 300)
    private String lrdetriesgotecdescambios;
    @Column(name = "LRDETRIESGOTECMAQUINPROPIAS")
    private Character lrdetriesgotecmaquinpropias;
    @Column(name = "LRDETRIESGOTECEXPERSINIESTRAL", length = 300)
    private String lrdetriesgotecexpersiniestral;
    @Column(name = "LRDETRIESGOTECUSO", length = 300)
    private String lrdetriesgotecuso;
    @Column(name = "LRDETRIESGOTECUBICACFUERAHORAR", length = 300)
    private String lrdetriesgotecubicacfuerahorar;
    @Column(name = "LRDETRIESGOTECALQUILADOS")
    private Character lrdetriesgotecalquilados;
    @Column(name = "LRDETRIESGOTECHURACAN")
    private Character lrdetriesgotechuracan;
    @Column(name = "LRDETRIESGOTECEXPLOSIVOS")
    private Character lrdetriesgotecexplosivos;
    @Column(name = "LRDETRIESGOTECLABSUBTERRANEAS")
    private Character lrdetriesgoteclabsubterraneas;
    @Column(name = "LRDETRIESGOTECPOSEEFOTOG")
    private Character lrdetriesgotecposeefotog;
    @Column(name = "LRDETRIESGOTECDETALLEANHOS", length = 300)
    private String lrdetriesgotecdetalleanhos;
    @Column(name = "LRDETRIESGOTECEXPLICPROYECTO", length = 300)
    private String lrdetriesgotecexplicproyecto;
    @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrubicacion lrubicacionid;

    public Lrdetriesgotec() {
    }

    public Lrdetriesgotec(Long lrdetriesgotecid) {
        this.lrdetriesgotecid = lrdetriesgotecid;
    }

    public Long getLrdetriesgotecid() {
        return lrdetriesgotecid;
    }

    public void setLrdetriesgotecid(Long lrdetriesgotecid) {
        this.lrdetriesgotecid = lrdetriesgotecid;
    }

    public String getLrdetriesgotecdesignacion() {
        return lrdetriesgotecdesignacion;
    }

    public void setLrdetriesgotecdesignacion(String lrdetriesgotecdesignacion) {
        this.lrdetriesgotecdesignacion = lrdetriesgotecdesignacion;
    }

    public String getLrdetriesgotecpais() {
        return lrdetriesgotecpais;
    }

    public void setLrdetriesgotecpais(String lrdetriesgotecpais) {
        this.lrdetriesgotecpais = lrdetriesgotecpais;
    }

    public String getLrdetriesgotecpropietario() {
        return lrdetriesgotecpropietario;
    }

    public void setLrdetriesgotecpropietario(String lrdetriesgotecpropietario) {
        this.lrdetriesgotecpropietario = lrdetriesgotecpropietario;
    }

    public String getLrdetriesgotecdirecprop() {
        return lrdetriesgotecdirecprop;
    }

    public void setLrdetriesgotecdirecprop(String lrdetriesgotecdirecprop) {
        this.lrdetriesgotecdirecprop = lrdetriesgotecdirecprop;
    }

    public String getLrdetriesgotecsubcontr() {
        return lrdetriesgotecsubcontr;
    }

    public void setLrdetriesgotecsubcontr(String lrdetriesgotecsubcontr) {
        this.lrdetriesgotecsubcontr = lrdetriesgotecsubcontr;
    }

    public String getLrdetriesgotecdirecsubcontr() {
        return lrdetriesgotecdirecsubcontr;
    }

    public void setLrdetriesgotecdirecsubcontr(String lrdetriesgotecdirecsubcontr) {
        this.lrdetriesgotecdirecsubcontr = lrdetriesgotecdirecsubcontr;
    }

    public String getLrdetriesgotecingconsu() {
        return lrdetriesgotecingconsu;
    }

    public void setLrdetriesgotecingconsu(String lrdetriesgotecingconsu) {
        this.lrdetriesgotecingconsu = lrdetriesgotecingconsu;
    }

    public String getLrdetriesgotecdirecingcons() {
        return lrdetriesgotecdirecingcons;
    }

    public void setLrdetriesgotecdirecingcons(String lrdetriesgotecdirecingcons) {
        this.lrdetriesgotecdirecingcons = lrdetriesgotecdirecingcons;
    }

    public String getLrdetriesgotecdimension() {
        return lrdetriesgotecdimension;
    }

    public void setLrdetriesgotecdimension(String lrdetriesgotecdimension) {
        this.lrdetriesgotecdimension = lrdetriesgotecdimension;
    }

    public String getLrdetriesgoteccimentacion() {
        return lrdetriesgoteccimentacion;
    }

    public void setLrdetriesgoteccimentacion(String lrdetriesgoteccimentacion) {
        this.lrdetriesgoteccimentacion = lrdetriesgoteccimentacion;
    }

    public String getLrdetriesgotecprofund() {
        return lrdetriesgotecprofund;
    }

    public void setLrdetriesgotecprofund(String lrdetriesgotecprofund) {
        this.lrdetriesgotecprofund = lrdetriesgotecprofund;
    }

    public String getLrdetriesgotecmetodo() {
        return lrdetriesgotecmetodo;
    }

    public void setLrdetriesgotecmetodo(String lrdetriesgotecmetodo) {
        this.lrdetriesgotecmetodo = lrdetriesgotecmetodo;
    }

    public String getLrdetriesgotecmateriales() {
        return lrdetriesgotecmateriales;
    }

    public void setLrdetriesgotecmateriales(String lrdetriesgotecmateriales) {
        this.lrdetriesgotecmateriales = lrdetriesgotecmateriales;
    }

    public Character getLrdetriesgotecexperiencia() {
        return lrdetriesgotecexperiencia;
    }

    public void setLrdetriesgotecexperiencia(Character lrdetriesgotecexperiencia) {
        this.lrdetriesgotecexperiencia = lrdetriesgotecexperiencia;
    }

    public String getLrdetriesgotecpercons() {
        return lrdetriesgotecpercons;
    }

    public void setLrdetriesgotecpercons(String lrdetriesgotecpercons) {
        this.lrdetriesgotecpercons = lrdetriesgotecpercons;
    }

    public String getLrdetriesgotecpermant() {
        return lrdetriesgotecpermant;
    }

    public void setLrdetriesgotecpermant(String lrdetriesgotecpermant) {
        this.lrdetriesgotecpermant = lrdetriesgotecpermant;
    }

    public String getLrdetriesgotectrabajo() {
        return lrdetriesgotectrabajo;
    }

    public void setLrdetriesgotectrabajo(String lrdetriesgotectrabajo) {
        this.lrdetriesgotectrabajo = lrdetriesgotectrabajo;
    }

    public Character getLrdetriesgotecincendio() {
        return lrdetriesgotecincendio;
    }

    public void setLrdetriesgotecincendio(Character lrdetriesgotecincendio) {
        this.lrdetriesgotecincendio = lrdetriesgotecincendio;
    }

    public Character getLrdetriesgotecderrumbe() {
        return lrdetriesgotecderrumbe;
    }

    public void setLrdetriesgotecderrumbe(Character lrdetriesgotecderrumbe) {
        this.lrdetriesgotecderrumbe = lrdetriesgotecderrumbe;
    }

    public Character getLrdetriesgotecvulcanismo() {
        return lrdetriesgotecvulcanismo;
    }

    public void setLrdetriesgotecvulcanismo(Character lrdetriesgotecvulcanismo) {
        this.lrdetriesgotecvulcanismo = lrdetriesgotecvulcanismo;
    }

    public Character getLrdetriesgotecinuncacion() {
        return lrdetriesgotecinuncacion;
    }

    public void setLrdetriesgotecinuncacion(Character lrdetriesgotecinuncacion) {
        this.lrdetriesgotecinuncacion = lrdetriesgotecinuncacion;
    }

    public Character getLrdetriesgotecvoladuras() {
        return lrdetriesgotecvoladuras;
    }

    public void setLrdetriesgotecvoladuras(Character lrdetriesgotecvoladuras) {
        this.lrdetriesgotecvoladuras = lrdetriesgotecvoladuras;
    }

    public Character getLrdetriesgotecotro() {
        return lrdetriesgotecotro;
    }

    public void setLrdetriesgotecotro(Character lrdetriesgotecotro) {
        this.lrdetriesgotecotro = lrdetriesgotecotro;
    }

    public Character getLrdetriesgotecterremoto() {
        return lrdetriesgotecterremoto;
    }

    public void setLrdetriesgotecterremoto(Character lrdetriesgotecterremoto) {
        this.lrdetriesgotecterremoto = lrdetriesgotecterremoto;
    }

    public String getLrdetriesgotecintensidad() {
        return lrdetriesgotecintensidad;
    }

    public void setLrdetriesgotecintensidad(String lrdetriesgotecintensidad) {
        this.lrdetriesgotecintensidad = lrdetriesgotecintensidad;
    }

    public Character getLrdetriesgotecnormas() {
        return lrdetriesgotecnormas;
    }

    public void setLrdetriesgotecnormas(Character lrdetriesgotecnormas) {
        this.lrdetriesgotecnormas = lrdetriesgotecnormas;
    }

    public Character getLrdetriesgotecestricta() {
        return lrdetriesgotecestricta;
    }

    public void setLrdetriesgotecestricta(Character lrdetriesgotecestricta) {
        this.lrdetriesgotecestricta = lrdetriesgotecestricta;
    }

    public Character getLrdetriesgotecroca() {
        return lrdetriesgotecroca;
    }

    public void setLrdetriesgotecroca(Character lrdetriesgotecroca) {
        this.lrdetriesgotecroca = lrdetriesgotecroca;
    }

    public Character getLrdetriesgotecgrava() {
        return lrdetriesgotecgrava;
    }

    public void setLrdetriesgotecgrava(Character lrdetriesgotecgrava) {
        this.lrdetriesgotecgrava = lrdetriesgotecgrava;
    }

    public Character getLrdetriesgotecarena() {
        return lrdetriesgotecarena;
    }

    public void setLrdetriesgotecarena(Character lrdetriesgotecarena) {
        this.lrdetriesgotecarena = lrdetriesgotecarena;
    }

    public Character getLrdetriesgotecarcilla() {
        return lrdetriesgotecarcilla;
    }

    public void setLrdetriesgotecarcilla(Character lrdetriesgotecarcilla) {
        this.lrdetriesgotecarcilla = lrdetriesgotecarcilla;
    }

    public Character getLrdetriesgotecrelleno() {
        return lrdetriesgotecrelleno;
    }

    public void setLrdetriesgotecrelleno(Character lrdetriesgotecrelleno) {
        this.lrdetriesgotecrelleno = lrdetriesgotecrelleno;
    }

    public Character getLrdetriesgotecotrosubs() {
        return lrdetriesgotecotrosubs;
    }

    public void setLrdetriesgotecotrosubs(Character lrdetriesgotecotrosubs) {
        this.lrdetriesgotecotrosubs = lrdetriesgotecotrosubs;
    }

    public String getLrdetriesgotecdescotrosubs() {
        return lrdetriesgotecdescotrosubs;
    }

    public void setLrdetriesgotecdescotrosubs(String lrdetriesgotecdescotrosubs) {
        this.lrdetriesgotecdescotrosubs = lrdetriesgotecdescotrosubs;
    }

    public BigDecimal getLrdetriesgotecnivelfreat() {
        return lrdetriesgotecnivelfreat;
    }

    public void setLrdetriesgotecnivelfreat(BigDecimal lrdetriesgotecnivelfreat) {
        this.lrdetriesgotecnivelfreat = lrdetriesgotecnivelfreat;
    }

    public String getLrdetriesgotecrionombre() {
        return lrdetriesgotecrionombre;
    }

    public void setLrdetriesgotecrionombre(String lrdetriesgotecrionombre) {
        this.lrdetriesgotecrionombre = lrdetriesgotecrionombre;
    }

    public String getLrdetriesgotecdist() {
        return lrdetriesgotecdist;
    }

    public void setLrdetriesgotecdist(String lrdetriesgotecdist) {
        this.lrdetriesgotecdist = lrdetriesgotecdist;
    }

    public BigDecimal getLrdetriesgotecnivagua() {
        return lrdetriesgotecnivagua;
    }

    public void setLrdetriesgotecnivagua(BigDecimal lrdetriesgotecnivagua) {
        this.lrdetriesgotecnivagua = lrdetriesgotecnivagua;
    }

    public BigDecimal getLrdetriesgotecnivmin() {
        return lrdetriesgotecnivmin;
    }

    public void setLrdetriesgotecnivmin(BigDecimal lrdetriesgotecnivmin) {
        this.lrdetriesgotecnivmin = lrdetriesgotecnivmin;
    }

    public BigDecimal getLrdetriesgotecnivmax() {
        return lrdetriesgotecnivmax;
    }

    public void setLrdetriesgotecnivmax(BigDecimal lrdetriesgotecnivmax) {
        this.lrdetriesgotecnivmax = lrdetriesgotecnivmax;
    }

    public BigDecimal getLrdetriesgotecnivmaxreg() {
        return lrdetriesgotecnivmaxreg;
    }

    public void setLrdetriesgotecnivmaxreg(BigDecimal lrdetriesgotecnivmaxreg) {
        this.lrdetriesgotecnivmaxreg = lrdetriesgotecnivmaxreg;
    }

    public Date getLrdetriesgotecfecnivmax() {
        return lrdetriesgotecfecnivmax;
    }

    public void setLrdetriesgotecfecnivmax(Date lrdetriesgotecfecnivmax) {
        this.lrdetriesgotecfecnivmax = lrdetriesgotecfecnivmax;
    }

    public String getLrdetriesgoteclluviadesde() {
        return lrdetriesgoteclluviadesde;
    }

    public void setLrdetriesgoteclluviadesde(String lrdetriesgoteclluviadesde) {
        this.lrdetriesgoteclluviadesde = lrdetriesgoteclluviadesde;
    }

    public String getLrdetriesgoteclluviahasta() {
        return lrdetriesgoteclluviahasta;
    }

    public void setLrdetriesgoteclluviahasta(String lrdetriesgoteclluviahasta) {
        this.lrdetriesgoteclluviahasta = lrdetriesgoteclluviahasta;
    }

    public String getLrdetriesgoteclluviahora() {
        return lrdetriesgoteclluviahora;
    }

    public void setLrdetriesgoteclluviahora(String lrdetriesgoteclluviahora) {
        this.lrdetriesgoteclluviahora = lrdetriesgoteclluviahora;
    }

    public String getLrdetriesgoteclluviadia() {
        return lrdetriesgoteclluviadia;
    }

    public void setLrdetriesgoteclluviadia(String lrdetriesgoteclluviadia) {
        this.lrdetriesgoteclluviadia = lrdetriesgoteclluviadia;
    }

    public String getLrdetriesgoteclluviames() {
        return lrdetriesgoteclluviames;
    }

    public void setLrdetriesgoteclluviames(String lrdetriesgoteclluviames) {
        this.lrdetriesgoteclluviames = lrdetriesgoteclluviames;
    }

    public String getLrdetriesgotecriesgo() {
        return lrdetriesgotecriesgo;
    }

    public void setLrdetriesgotecriesgo(String lrdetriesgotecriesgo) {
        this.lrdetriesgotecriesgo = lrdetriesgotecriesgo;
    }

    public Character getLrdetriesgotecgastosadic() {
        return lrdetriesgotecgastosadic;
    }

    public void setLrdetriesgotecgastosadic(Character lrdetriesgotecgastosadic) {
        this.lrdetriesgotecgastosadic = lrdetriesgotecgastosadic;
    }

    public Character getLrdetriesgoteccoberc() {
        return lrdetriesgoteccoberc;
    }

    public void setLrdetriesgoteccoberc(Character lrdetriesgoteccoberc) {
        this.lrdetriesgoteccoberc = lrdetriesgoteccoberc;
    }

    public Character getLrdetriesgoteccobercotro() {
        return lrdetriesgoteccobercotro;
    }

    public void setLrdetriesgoteccobercotro(Character lrdetriesgoteccobercotro) {
        this.lrdetriesgoteccobercotro = lrdetriesgoteccobercotro;
    }

    public String getLrdetriesgotecdetedif() {
        return lrdetriesgotecdetedif;
    }

    public void setLrdetriesgotecdetedif(String lrdetriesgotecdetedif) {
        this.lrdetriesgotecdetedif = lrdetriesgotecdetedif;
    }

    public Character getLrdetriesgotecedifady() {
        return lrdetriesgotecedifady;
    }

    public void setLrdetriesgotecedifady(Character lrdetriesgotecedifady) {
        this.lrdetriesgotecedifady = lrdetriesgotecedifady;
    }

    public String getLrdetriesgotecdescedif() {
        return lrdetriesgotecdescedif;
    }

    public void setLrdetriesgotecdescedif(String lrdetriesgotecdescedif) {
        this.lrdetriesgotecdescedif = lrdetriesgotecdescedif;
    }

    public String getLrdetriesgoteccontratprinc() {
        return lrdetriesgoteccontratprinc;
    }

    public void setLrdetriesgoteccontratprinc(String lrdetriesgoteccontratprinc) {
        this.lrdetriesgoteccontratprinc = lrdetriesgoteccontratprinc;
    }

    public String getLrdetriesgotecobjcontratprinc() {
        return lrdetriesgotecobjcontratprinc;
    }

    public void setLrdetriesgotecobjcontratprinc(String lrdetriesgotecobjcontratprinc) {
        this.lrdetriesgotecobjcontratprinc = lrdetriesgotecobjcontratprinc;
    }

    public String getLrdetriesgotecobjtrabprinc() {
        return lrdetriesgotecobjtrabprinc;
    }

    public void setLrdetriesgotecobjtrabprinc(String lrdetriesgotecobjtrabprinc) {
        this.lrdetriesgotecobjtrabprinc = lrdetriesgotecobjtrabprinc;
    }

    public String getLrdetriesgotecobjtrabsub() {
        return lrdetriesgotecobjtrabsub;
    }

    public void setLrdetriesgotecobjtrabsub(String lrdetriesgotecobjtrabsub) {
        this.lrdetriesgotecobjtrabsub = lrdetriesgotecobjtrabsub;
    }

    public String getLrdetriesgotecequipoprinc() {
        return lrdetriesgotecequipoprinc;
    }

    public void setLrdetriesgotecequipoprinc(String lrdetriesgotecequipoprinc) {
        this.lrdetriesgotecequipoprinc = lrdetriesgotecequipoprinc;
    }

    public String getLrdetriesgotecestudiogeo() {
        return lrdetriesgotecestudiogeo;
    }

    public void setLrdetriesgotecestudiogeo(String lrdetriesgotecestudiogeo) {
        this.lrdetriesgotecestudiogeo = lrdetriesgotecestudiogeo;
    }

    public String getLrdetriesgoteccodconstrucc() {
        return lrdetriesgoteccodconstrucc;
    }

    public void setLrdetriesgoteccodconstrucc(String lrdetriesgoteccodconstrucc) {
        this.lrdetriesgoteccodconstrucc = lrdetriesgoteccodconstrucc;
    }

    public String getLrdetriesgoteccondiclimat() {
        return lrdetriesgoteccondiclimat;
    }

    public void setLrdetriesgoteccondiclimat(String lrdetriesgoteccondiclimat) {
        this.lrdetriesgoteccondiclimat = lrdetriesgoteccondiclimat;
    }

    public String getLrdetriesgotecbienesdesc() {
        return lrdetriesgotecbienesdesc;
    }

    public void setLrdetriesgotecbienesdesc(String lrdetriesgotecbienesdesc) {
        this.lrdetriesgotecbienesdesc = lrdetriesgotecbienesdesc;
    }

    public String getLrdetriesgotecavancesconst() {
        return lrdetriesgotecavancesconst;
    }

    public void setLrdetriesgotecavancesconst(String lrdetriesgotecavancesconst) {
        this.lrdetriesgotecavancesconst = lrdetriesgotecavancesconst;
    }

    public String getLrdetriesgoteclimiteresp() {
        return lrdetriesgoteclimiteresp;
    }

    public void setLrdetriesgoteclimiteresp(String lrdetriesgoteclimiteresp) {
        this.lrdetriesgoteclimiteresp = lrdetriesgoteclimiteresp;
    }

    public Character getLrdetriesgoteccobperdida() {
        return lrdetriesgoteccobperdida;
    }

    public void setLrdetriesgoteccobperdida(Character lrdetriesgoteccobperdida) {
        this.lrdetriesgoteccobperdida = lrdetriesgoteccobperdida;
    }

    public String getLrdetriesgotecclimresponady() {
        return lrdetriesgotecclimresponady;
    }

    public void setLrdetriesgotecclimresponady(String lrdetriesgotecclimresponady) {
        this.lrdetriesgotecclimresponady = lrdetriesgotecclimresponady;
    }

    public Character getLrdetriesgotecsiniestro() {
        return lrdetriesgotecsiniestro;
    }

    public void setLrdetriesgotecsiniestro(Character lrdetriesgotecsiniestro) {
        this.lrdetriesgotecsiniestro = lrdetriesgotecsiniestro;
    }

    public BigDecimal getLrdetriesgotecperdida() {
        return lrdetriesgotecperdida;
    }

    public void setLrdetriesgotecperdida(BigDecimal lrdetriesgotecperdida) {
        this.lrdetriesgotecperdida = lrdetriesgotecperdida;
    }

    public String getLrdetriesgoteccausa() {
        return lrdetriesgoteccausa;
    }

    public void setLrdetriesgoteccausa(String lrdetriesgoteccausa) {
        this.lrdetriesgoteccausa = lrdetriesgoteccausa;
    }

    public Character getLrdetriesgotecotraspol() {
        return lrdetriesgotecotraspol;
    }

    public void setLrdetriesgotecotraspol(Character lrdetriesgotecotraspol) {
        this.lrdetriesgotecotraspol = lrdetriesgotecotraspol;
    }

    public String getLrdetriesgotecdatosaseg() {
        return lrdetriesgotecdatosaseg;
    }

    public void setLrdetriesgotecdatosaseg(String lrdetriesgotecdatosaseg) {
        this.lrdetriesgotecdatosaseg = lrdetriesgotecdatosaseg;
    }

    public Character getLrdetriesgotecotracompanhia() {
        return lrdetriesgotecotracompanhia;
    }

    public void setLrdetriesgotecotracompanhia(Character lrdetriesgotecotracompanhia) {
        this.lrdetriesgotecotracompanhia = lrdetriesgotecotracompanhia;
    }

    public Character getLrdetriesgotecrechazo() {
        return lrdetriesgotecrechazo;
    }

    public void setLrdetriesgotecrechazo(Character lrdetriesgotecrechazo) {
        this.lrdetriesgotecrechazo = lrdetriesgotecrechazo;
    }

    public String getLrdetriesgotecexpliquerechazo() {
        return lrdetriesgotecexpliquerechazo;
    }

    public void setLrdetriesgotecexpliquerechazo(String lrdetriesgotecexpliquerechazo) {
        this.lrdetriesgotecexpliquerechazo = lrdetriesgotecexpliquerechazo;
    }

    public Character getLrdetriesgoteccambios() {
        return lrdetriesgoteccambios;
    }

    public void setLrdetriesgoteccambios(Character lrdetriesgoteccambios) {
        this.lrdetriesgoteccambios = lrdetriesgoteccambios;
    }

    public String getLrdetriesgotecdescambios() {
        return lrdetriesgotecdescambios;
    }

    public void setLrdetriesgotecdescambios(String lrdetriesgotecdescambios) {
        this.lrdetriesgotecdescambios = lrdetriesgotecdescambios;
    }

    public Character getLrdetriesgotecmaquinpropias() {
        return lrdetriesgotecmaquinpropias;
    }

    public void setLrdetriesgotecmaquinpropias(Character lrdetriesgotecmaquinpropias) {
        this.lrdetriesgotecmaquinpropias = lrdetriesgotecmaquinpropias;
    }

    public String getLrdetriesgotecexpersiniestral() {
        return lrdetriesgotecexpersiniestral;
    }

    public void setLrdetriesgotecexpersiniestral(String lrdetriesgotecexpersiniestral) {
        this.lrdetriesgotecexpersiniestral = lrdetriesgotecexpersiniestral;
    }

    public String getLrdetriesgotecuso() {
        return lrdetriesgotecuso;
    }

    public void setLrdetriesgotecuso(String lrdetriesgotecuso) {
        this.lrdetriesgotecuso = lrdetriesgotecuso;
    }

    public String getLrdetriesgotecubicacfuerahorar() {
        return lrdetriesgotecubicacfuerahorar;
    }

    public void setLrdetriesgotecubicacfuerahorar(String lrdetriesgotecubicacfuerahorar) {
        this.lrdetriesgotecubicacfuerahorar = lrdetriesgotecubicacfuerahorar;
    }

    public Character getLrdetriesgotecalquilados() {
        return lrdetriesgotecalquilados;
    }

    public void setLrdetriesgotecalquilados(Character lrdetriesgotecalquilados) {
        this.lrdetriesgotecalquilados = lrdetriesgotecalquilados;
    }

    public Character getLrdetriesgotechuracan() {
        return lrdetriesgotechuracan;
    }

    public void setLrdetriesgotechuracan(Character lrdetriesgotechuracan) {
        this.lrdetriesgotechuracan = lrdetriesgotechuracan;
    }

    public Character getLrdetriesgotecexplosivos() {
        return lrdetriesgotecexplosivos;
    }

    public void setLrdetriesgotecexplosivos(Character lrdetriesgotecexplosivos) {
        this.lrdetriesgotecexplosivos = lrdetriesgotecexplosivos;
    }

    public Character getLrdetriesgoteclabsubterraneas() {
        return lrdetriesgoteclabsubterraneas;
    }

    public void setLrdetriesgoteclabsubterraneas(Character lrdetriesgoteclabsubterraneas) {
        this.lrdetriesgoteclabsubterraneas = lrdetriesgoteclabsubterraneas;
    }

    public Character getLrdetriesgotecposeefotog() {
        return lrdetriesgotecposeefotog;
    }

    public void setLrdetriesgotecposeefotog(Character lrdetriesgotecposeefotog) {
        this.lrdetriesgotecposeefotog = lrdetriesgotecposeefotog;
    }

    public String getLrdetriesgotecdetalleanhos() {
        return lrdetriesgotecdetalleanhos;
    }

    public void setLrdetriesgotecdetalleanhos(String lrdetriesgotecdetalleanhos) {
        this.lrdetriesgotecdetalleanhos = lrdetriesgotecdetalleanhos;
    }

    public String getLrdetriesgotecexplicproyecto() {
        return lrdetriesgotecexplicproyecto;
    }

    public void setLrdetriesgotecexplicproyecto(String lrdetriesgotecexplicproyecto) {
        this.lrdetriesgotecexplicproyecto = lrdetriesgotecexplicproyecto;
    }

    public Lrubicacion getLrubicacionid() {
        return lrubicacionid;
    }

    public void setLrubicacionid(Lrubicacion lrubicacionid) {
        this.lrubicacionid = lrubicacionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrdetriesgotecid != null ? lrdetriesgotecid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrdetriesgotec)) {
            return false;
        }
        Lrdetriesgotec other = (Lrdetriesgotec) object;
        if ((this.lrdetriesgotecid == null && other.lrdetriesgotecid != null) || (this.lrdetriesgotecid != null && !this.lrdetriesgotecid.equals(other.lrdetriesgotecid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrdetriesgotec[ lrdetriesgotecid=" + lrdetriesgotecid + " ]";
    }
    
}
