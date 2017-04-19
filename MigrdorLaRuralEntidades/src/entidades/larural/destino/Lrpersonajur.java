/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
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
@Table(name = "LRPERSONAJUR")
@NamedQueries({
    @NamedQuery(name = "Lrpersonajur.findAll", query = "SELECT l FROM Lrpersonajur l"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurid", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurid = :lrpersonajurid"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurrazsoc", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurrazsoc = :lrpersonajurrazsoc"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurconst", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurconst = :lrpersonajurconst"),
    @NamedQuery(name = "Lrpersonajur.findByLrrubrosid", query = "SELECT l FROM Lrpersonajur l WHERE l.lrrubrosid = :lrrubrosid"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurcantsucu", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurcantsucu = :lrpersonajurcantsucu"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurcontacto", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurcontacto = :lrpersonajurcontacto"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurcantvehi", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurcantvehi = :lrpersonajurcantvehi"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurcantmoto", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurcantmoto = :lrpersonajurcantmoto"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurcantfunc", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurcantfunc = :lrpersonajurcantfunc"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurfuncvehi", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurfuncvehi = :lrpersonajurfuncvehi"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurcantfuncmoto", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurcantfuncmoto = :lrpersonajurcantfuncmoto"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurconocseg", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurconocseg = :lrpersonajurconocseg"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurdoctip", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurdoctip = :lrpersonajurdoctip"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurrepresentante", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurrepresentante = :lrpersonajurrepresentante"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajurnomfantasia", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajurnomfantasia = :lrpersonajurnomfantasia"),
    @NamedQuery(name = "Lrpersonajur.findByLrpersonajuractid", query = "SELECT l FROM Lrpersonajur l WHERE l.lrpersonajuractid = :lrpersonajuractid")})
public class Lrpersonajur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPERSONAJURID", nullable = false)
    private Long lrpersonajurid;
    @Column(name = "LRPERSONAJURRAZSOC", length = 140)
    private String lrpersonajurrazsoc;
    @Column(name = "LRPERSONAJURCONST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpersonajurconst;
    @Column(name = "LRRUBROSID")
    private Short lrrubrosid;
    @Column(name = "LRPERSONAJURCANTSUCU")
    private Short lrpersonajurcantsucu;
    @Column(name = "LRPERSONAJURCONTACTO", length = 80)
    private String lrpersonajurcontacto;
    @Column(name = "LRPERSONAJURCANTVEHI")
    private Short lrpersonajurcantvehi;
    @Column(name = "LRPERSONAJURCANTMOTO")
    private Short lrpersonajurcantmoto;
    @Column(name = "LRPERSONAJURCANTFUNC")
    private Short lrpersonajurcantfunc;
    @Column(name = "LRPERSONAJURFUNCVEHI")
    private Short lrpersonajurfuncvehi;
    @Column(name = "LRPERSONAJURCANTFUNCMOTO")
    private Short lrpersonajurcantfuncmoto;
    @Column(name = "LRPERSONAJURCONOCSEG", length = 1)
    private String lrpersonajurconocseg;
    @Column(name = "LRPERSONAJURDOCTIP")
    private Short lrpersonajurdoctip;
    @Column(name = "LRPERSONAJURREPRESENTANTE", length = 100)
    private String lrpersonajurrepresentante;
    @Column(name = "LRPERSONAJURNOMFANTASIA", length = 100)
    private String lrpersonajurnomfantasia;
    @Column(name = "LRPERSONAJURACTID")
    private Long lrpersonajuractid;
    @JoinColumn(name = "LRPERSONAJURCARGOCONTACTO", referencedColumnName = "LRCARGOID")
    @ManyToOne
    private Lrcargo lrpersonajurcargocontacto;
    @JoinColumn(name = "LRPERSONAJURCARGOREPRE", referencedColumnName = "LRCARGOID")
    @ManyToOne
    private Lrcargo lrpersonajurcargorepre;
    @JoinColumn(name = "LRTIPOENTIDADID", referencedColumnName = "LRTIPOENTIDADID")
    @ManyToOne
    private Lrtipoentidad lrtipoentidadid;
    @JoinColumn(name = "LRTIPOSOCIEDADID", referencedColumnName = "LRTIPOSOCIEDADID")
    @ManyToOne
    private Lrtiposociedad lrtiposociedadid;

    public Lrpersonajur() {
    }

    public Lrpersonajur(Long lrpersonajurid) {
        this.lrpersonajurid = lrpersonajurid;
    }

    public Long getLrpersonajurid() {
        return lrpersonajurid;
    }

    public void setLrpersonajurid(Long lrpersonajurid) {
        this.lrpersonajurid = lrpersonajurid;
    }

    public String getLrpersonajurrazsoc() {
        return lrpersonajurrazsoc;
    }

    public void setLrpersonajurrazsoc(String lrpersonajurrazsoc) {
        this.lrpersonajurrazsoc = lrpersonajurrazsoc;
    }

    public Date getLrpersonajurconst() {
        return lrpersonajurconst;
    }

    public void setLrpersonajurconst(Date lrpersonajurconst) {
        this.lrpersonajurconst = lrpersonajurconst;
    }

    public Short getLrrubrosid() {
        return lrrubrosid;
    }

    public void setLrrubrosid(Short lrrubrosid) {
        this.lrrubrosid = lrrubrosid;
    }

    public Short getLrpersonajurcantsucu() {
        return lrpersonajurcantsucu;
    }

    public void setLrpersonajurcantsucu(Short lrpersonajurcantsucu) {
        this.lrpersonajurcantsucu = lrpersonajurcantsucu;
    }

    public String getLrpersonajurcontacto() {
        return lrpersonajurcontacto;
    }

    public void setLrpersonajurcontacto(String lrpersonajurcontacto) {
        this.lrpersonajurcontacto = lrpersonajurcontacto;
    }

    public Short getLrpersonajurcantvehi() {
        return lrpersonajurcantvehi;
    }

    public void setLrpersonajurcantvehi(Short lrpersonajurcantvehi) {
        this.lrpersonajurcantvehi = lrpersonajurcantvehi;
    }

    public Short getLrpersonajurcantmoto() {
        return lrpersonajurcantmoto;
    }

    public void setLrpersonajurcantmoto(Short lrpersonajurcantmoto) {
        this.lrpersonajurcantmoto = lrpersonajurcantmoto;
    }

    public Short getLrpersonajurcantfunc() {
        return lrpersonajurcantfunc;
    }

    public void setLrpersonajurcantfunc(Short lrpersonajurcantfunc) {
        this.lrpersonajurcantfunc = lrpersonajurcantfunc;
    }

    public Short getLrpersonajurfuncvehi() {
        return lrpersonajurfuncvehi;
    }

    public void setLrpersonajurfuncvehi(Short lrpersonajurfuncvehi) {
        this.lrpersonajurfuncvehi = lrpersonajurfuncvehi;
    }

    public Short getLrpersonajurcantfuncmoto() {
        return lrpersonajurcantfuncmoto;
    }

    public void setLrpersonajurcantfuncmoto(Short lrpersonajurcantfuncmoto) {
        this.lrpersonajurcantfuncmoto = lrpersonajurcantfuncmoto;
    }

    public String getLrpersonajurconocseg() {
        return lrpersonajurconocseg;
    }

    public void setLrpersonajurconocseg(String lrpersonajurconocseg) {
        this.lrpersonajurconocseg = lrpersonajurconocseg;
    }

    public Short getLrpersonajurdoctip() {
        return lrpersonajurdoctip;
    }

    public void setLrpersonajurdoctip(Short lrpersonajurdoctip) {
        this.lrpersonajurdoctip = lrpersonajurdoctip;
    }

    public String getLrpersonajurrepresentante() {
        return lrpersonajurrepresentante;
    }

    public void setLrpersonajurrepresentante(String lrpersonajurrepresentante) {
        this.lrpersonajurrepresentante = lrpersonajurrepresentante;
    }

    public String getLrpersonajurnomfantasia() {
        return lrpersonajurnomfantasia;
    }

    public void setLrpersonajurnomfantasia(String lrpersonajurnomfantasia) {
        this.lrpersonajurnomfantasia = lrpersonajurnomfantasia;
    }

    public Long getLrpersonajuractid() {
        return lrpersonajuractid;
    }

    public void setLrpersonajuractid(Long lrpersonajuractid) {
        this.lrpersonajuractid = lrpersonajuractid;
    }

    public Lrcargo getLrpersonajurcargocontacto() {
        return lrpersonajurcargocontacto;
    }

    public void setLrpersonajurcargocontacto(Lrcargo lrpersonajurcargocontacto) {
        this.lrpersonajurcargocontacto = lrpersonajurcargocontacto;
    }

    public Lrcargo getLrpersonajurcargorepre() {
        return lrpersonajurcargorepre;
    }

    public void setLrpersonajurcargorepre(Lrcargo lrpersonajurcargorepre) {
        this.lrpersonajurcargorepre = lrpersonajurcargorepre;
    }

    public Lrtipoentidad getLrtipoentidadid() {
        return lrtipoentidadid;
    }

    public void setLrtipoentidadid(Lrtipoentidad lrtipoentidadid) {
        this.lrtipoentidadid = lrtipoentidadid;
    }

    public Lrtiposociedad getLrtiposociedadid() {
        return lrtiposociedadid;
    }

    public void setLrtiposociedadid(Lrtiposociedad lrtiposociedadid) {
        this.lrtiposociedadid = lrtiposociedadid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrpersonajurid != null ? lrpersonajurid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrpersonajur)) {
            return false;
        }
        Lrpersonajur other = (Lrpersonajur) object;
        if ((this.lrpersonajurid == null && other.lrpersonajurid != null) || (this.lrpersonajurid != null && !this.lrpersonajurid.equals(other.lrpersonajurid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrpersonajur[ lrpersonajurid=" + lrpersonajurid + " ]";
    }
    
}
