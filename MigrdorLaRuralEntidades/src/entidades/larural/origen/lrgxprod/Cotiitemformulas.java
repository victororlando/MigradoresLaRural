/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen.lrgxprod;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "COTIITEMFORMULAS", schema = "RURAL")
@NamedQueries({
    @NamedQuery(name = "Cotiitemformulas.findAll", query = "SELECT c FROM Cotiitemformulas c"),
    @NamedQuery(name = "Cotiitemformulas.findByCotizacionesid", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasPK.cotizacionesid = :cotizacionesid"),
    @NamedQuery(name = "Cotiitemformulas.findByCotidetseccionesid", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasPK.cotidetseccionesid = :cotidetseccionesid"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulastipo", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasPK.cotiitemformulastipo = :cotiitemformulastipo"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasid", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasPK.cotiitemformulasid = :cotiitemformulasid"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasual", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasual = :cotiitemformulasual"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasfal", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasfal = :cotiitemformulasfal"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasumd", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasumd = :cotiitemformulasumd"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasfmd", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasfmd = :cotiitemformulasfmd"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasnom", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasnom = :cotiitemformulasnom"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasvalor", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasvalor = :cotiitemformulasvalor"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasresul", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasresul = :cotiitemformulasresul"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasvalc", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasvalc = :cotiitemformulasvalc"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasaux", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasaux = :cotiitemformulasaux"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasimp", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasimp = :cotiitemformulasimp"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasius", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasius = :cotiitemformulasius"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasfin", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasfin = :cotiitemformulasfin"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulastdet", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulastdet = :cotiitemformulastdet"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulascimpre", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulascimpre = :cotiitemformulascimpre"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasordimp", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasordimp = :cotiitemformulasordimp"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulasmuestvalc", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulasmuestvalc = :cotiitemformulasmuestvalc"),
    @NamedQuery(name = "Cotiitemformulas.findByCotiitemformulastipoplan", query = "SELECT c FROM Cotiitemformulas c WHERE c.cotiitemformulastipoplan = :cotiitemformulastipoplan")})
public class Cotiitemformulas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CotiitemformulasPK cotiitemformulasPK;
    @Basic(optional = false)
    @Column(name = "COTIITEMFORMULASUAL", nullable = false, length = 30)
    private String cotiitemformulasual;
    @Basic(optional = false)
    @Column(name = "COTIITEMFORMULASFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotiitemformulasfal;
    @Column(name = "COTIITEMFORMULASUMD", length = 30)
    private String cotiitemformulasumd;
    @Column(name = "COTIITEMFORMULASFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotiitemformulasfmd;
    @Column(name = "COTIITEMFORMULASNOM", length = 60)
    private String cotiitemformulasnom;
    @Column(name = "COTIITEMFORMULASVALOR", length = 4000)
    private String cotiitemformulasvalor;
    @Column(name = "COTIITEMFORMULASRESUL", length = 4000)
    private String cotiitemformulasresul;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COTIITEMFORMULASVALC", precision = 17, scale = 2)
    private BigDecimal cotiitemformulasvalc;
    @Column(name = "COTIITEMFORMULASAUX")
    private Character cotiitemformulasaux;
    @Column(name = "COTIITEMFORMULASIMP")
    private Character cotiitemformulasimp;
    @Column(name = "COTIITEMFORMULASIUS")
    private Character cotiitemformulasius;
    @Column(name = "COTIITEMFORMULASFIN")
    private Character cotiitemformulasfin;
    @Column(name = "COTIITEMFORMULASTDET")
    private Long cotiitemformulastdet;
    @Column(name = "COTIITEMFORMULASCIMPRE", length = 60)
    private String cotiitemformulascimpre;
    @Column(name = "COTIITEMFORMULASORDIMP")
    private Short cotiitemformulasordimp;
    @Column(name = "COTIITEMFORMULASMUESTVALC")
    private Character cotiitemformulasmuestvalc;
    @Column(name = "COTIITEMFORMULASTIPOPLAN")
    private Short cotiitemformulastipoplan;
    @JoinColumns({
        @JoinColumn(name = "COTIZACIONESID", referencedColumnName = "COTIZACIONESID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COTIDETSECCIONESID", referencedColumnName = "COTIDETSECCIONESID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Cotidetsecciones cotidetsecciones;

    public Cotiitemformulas() {
    }

    public Cotiitemformulas(CotiitemformulasPK cotiitemformulasPK) {
        this.cotiitemformulasPK = cotiitemformulasPK;
    }

    public Cotiitemformulas(CotiitemformulasPK cotiitemformulasPK, String cotiitemformulasual, Date cotiitemformulasfal) {
        this.cotiitemformulasPK = cotiitemformulasPK;
        this.cotiitemformulasual = cotiitemformulasual;
        this.cotiitemformulasfal = cotiitemformulasfal;
    }

    public Cotiitemformulas(long cotizacionesid, long cotidetseccionesid, long cotiitemformulastipo, long cotiitemformulasid) {
        this.cotiitemformulasPK = new CotiitemformulasPK(cotizacionesid, cotidetseccionesid, cotiitemformulastipo, cotiitemformulasid);
    }

    public CotiitemformulasPK getCotiitemformulasPK() {
        return cotiitemformulasPK;
    }

    public void setCotiitemformulasPK(CotiitemformulasPK cotiitemformulasPK) {
        this.cotiitemformulasPK = cotiitemformulasPK;
    }

    public String getCotiitemformulasual() {
        return cotiitemformulasual;
    }

    public void setCotiitemformulasual(String cotiitemformulasual) {
        this.cotiitemformulasual = cotiitemformulasual;
    }

    public Date getCotiitemformulasfal() {
        return cotiitemformulasfal;
    }

    public void setCotiitemformulasfal(Date cotiitemformulasfal) {
        this.cotiitemformulasfal = cotiitemformulasfal;
    }

    public String getCotiitemformulasumd() {
        return cotiitemformulasumd;
    }

    public void setCotiitemformulasumd(String cotiitemformulasumd) {
        this.cotiitemformulasumd = cotiitemformulasumd;
    }

    public Date getCotiitemformulasfmd() {
        return cotiitemformulasfmd;
    }

    public void setCotiitemformulasfmd(Date cotiitemformulasfmd) {
        this.cotiitemformulasfmd = cotiitemformulasfmd;
    }

    public String getCotiitemformulasnom() {
        return cotiitemformulasnom;
    }

    public void setCotiitemformulasnom(String cotiitemformulasnom) {
        this.cotiitemformulasnom = cotiitemformulasnom;
    }

    public String getCotiitemformulasvalor() {
        return cotiitemformulasvalor;
    }

    public void setCotiitemformulasvalor(String cotiitemformulasvalor) {
        this.cotiitemformulasvalor = cotiitemformulasvalor;
    }

    public String getCotiitemformulasresul() {
        return cotiitemformulasresul;
    }

    public void setCotiitemformulasresul(String cotiitemformulasresul) {
        this.cotiitemformulasresul = cotiitemformulasresul;
    }

    public BigDecimal getCotiitemformulasvalc() {
        return cotiitemformulasvalc;
    }

    public void setCotiitemformulasvalc(BigDecimal cotiitemformulasvalc) {
        this.cotiitemformulasvalc = cotiitemformulasvalc;
    }

    public Character getCotiitemformulasaux() {
        return cotiitemformulasaux;
    }

    public void setCotiitemformulasaux(Character cotiitemformulasaux) {
        this.cotiitemformulasaux = cotiitemformulasaux;
    }

    public Character getCotiitemformulasimp() {
        return cotiitemformulasimp;
    }

    public void setCotiitemformulasimp(Character cotiitemformulasimp) {
        this.cotiitemformulasimp = cotiitemformulasimp;
    }

    public Character getCotiitemformulasius() {
        return cotiitemformulasius;
    }

    public void setCotiitemformulasius(Character cotiitemformulasius) {
        this.cotiitemformulasius = cotiitemformulasius;
    }

    public Character getCotiitemformulasfin() {
        return cotiitemformulasfin;
    }

    public void setCotiitemformulasfin(Character cotiitemformulasfin) {
        this.cotiitemformulasfin = cotiitemformulasfin;
    }

    public Long getCotiitemformulastdet() {
        return cotiitemformulastdet;
    }

    public void setCotiitemformulastdet(Long cotiitemformulastdet) {
        this.cotiitemformulastdet = cotiitemformulastdet;
    }

    public String getCotiitemformulascimpre() {
        return cotiitemformulascimpre;
    }

    public void setCotiitemformulascimpre(String cotiitemformulascimpre) {
        this.cotiitemformulascimpre = cotiitemformulascimpre;
    }

    public Short getCotiitemformulasordimp() {
        return cotiitemformulasordimp;
    }

    public void setCotiitemformulasordimp(Short cotiitemformulasordimp) {
        this.cotiitemformulasordimp = cotiitemformulasordimp;
    }

    public Character getCotiitemformulasmuestvalc() {
        return cotiitemformulasmuestvalc;
    }

    public void setCotiitemformulasmuestvalc(Character cotiitemformulasmuestvalc) {
        this.cotiitemformulasmuestvalc = cotiitemformulasmuestvalc;
    }

    public Short getCotiitemformulastipoplan() {
        return cotiitemformulastipoplan;
    }

    public void setCotiitemformulastipoplan(Short cotiitemformulastipoplan) {
        this.cotiitemformulastipoplan = cotiitemformulastipoplan;
    }

    public Cotidetsecciones getCotidetsecciones() {
        return cotidetsecciones;
    }

    public void setCotidetsecciones(Cotidetsecciones cotidetsecciones) {
        this.cotidetsecciones = cotidetsecciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cotiitemformulasPK != null ? cotiitemformulasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotiitemformulas)) {
            return false;
        }
        Cotiitemformulas other = (Cotiitemformulas) object;
        if ((this.cotiitemformulasPK == null && other.cotiitemformulasPK != null) || (this.cotiitemformulasPK != null && !this.cotiitemformulasPK.equals(other.cotiitemformulasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.lrgxprod.Cotiitemformulas[ cotiitemformulasPK=" + cotiitemformulasPK + " ]";
    }
    
}
