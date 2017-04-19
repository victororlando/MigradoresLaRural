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
@Table(name = "LRHISTORICOREGLAS")
@NamedQueries({
    @NamedQuery(name = "Lrhistoricoreglas.findAll", query = "SELECT l FROM Lrhistoricoreglas l"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLrhistoricoreglasid", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.lrhistoricoreglasid = :lrhistoricoreglasid"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLrhistoricoreglascoditem", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.lrhistoricoreglascoditem = :lrhistoricoreglascoditem"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasformula", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasformula = :llrhistoricoreglasformula"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasordenejecuci", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasordenejecuci = :llrhistoricoreglasordenejecuci"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasordenenvisua", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasordenenvisua = :llrhistoricoreglasordenenvisua"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglascampaux", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglascampaux = :llrhistoricoreglascampaux"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasingresa", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasingresa = :llrhistoricoreglasingresa"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasviscarga", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasviscarga = :llrhistoricoreglasviscarga"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglascotfin", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglascotfin = :llrhistoricoreglascotfin"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasimprime", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasimprime = :llrhistoricoreglasimprime"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglascomimprime", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglascomimprime = :llrhistoricoreglascomimprime"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasprgejecuta", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasprgejecuta = :llrhistoricoreglasprgejecuta"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasmuestraval", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasmuestraval = :llrhistoricoreglasmuestraval"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasact", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasact = :llrhistoricoreglasact"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasual", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasual = :llrhistoricoreglasual"),
    @NamedQuery(name = "Lrhistoricoreglas.findByLlrhistoricoreglasfal", query = "SELECT l FROM Lrhistoricoreglas l WHERE l.llrhistoricoreglasfal = :llrhistoricoreglasfal")})
public class Lrhistoricoreglas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRHISTORICOREGLASID", nullable = false)
    private Long lrhistoricoreglasid;
    @Column(name = "LRHISTORICOREGLASCODITEM")
    private Long lrhistoricoreglascoditem;
    @Column(name = "LLRHISTORICOREGLASFORMULA", length = 4000)
    private String llrhistoricoreglasformula;
    @Column(name = "LLRHISTORICOREGLASORDENEJECUCI")
    private Short llrhistoricoreglasordenejecuci;
    @Column(name = "LLRHISTORICOREGLASORDENENVISUA")
    private Long llrhistoricoreglasordenenvisua;
    @Column(name = "LLRHISTORICOREGLASCAMPAUX")
    private Character llrhistoricoreglascampaux;
    @Column(name = "LLRHISTORICOREGLASINGRESA")
    private Character llrhistoricoreglasingresa;
    @Column(name = "LLRHISTORICOREGLASVISCARGA")
    private Character llrhistoricoreglasviscarga;
    @Column(name = "LLRHISTORICOREGLASCOTFIN")
    private Character llrhistoricoreglascotfin;
    @Column(name = "LLRHISTORICOREGLASIMPRIME")
    private Character llrhistoricoreglasimprime;
    @Column(name = "LLRHISTORICOREGLASCOMIMPRIME", length = 60)
    private String llrhistoricoreglascomimprime;
    @Column(name = "LLRHISTORICOREGLASPRGEJECUTA", length = 60)
    private String llrhistoricoreglasprgejecuta;
    @Column(name = "LLRHISTORICOREGLASMUESTRAVAL")
    private Character llrhistoricoreglasmuestraval;
    @Basic(optional = false)
    @Column(name = "LLRHISTORICOREGLASACT", nullable = false)
    private Character llrhistoricoreglasact;
    @Basic(optional = false)
    @Column(name = "LLRHISTORICOREGLASUAL", nullable = false, length = 30)
    private String llrhistoricoreglasual;
    @Basic(optional = false)
    @Column(name = "LLRHISTORICOREGLASFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date llrhistoricoreglasfal;
    @JoinColumns({
        @JoinColumn(name = "MONID", referencedColumnName = "MONID", nullable = false),
        @JoinColumn(name = "LRPARMITEMID", referencedColumnName = "LRPARMITEMID", nullable = false),
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false),
        @JoinColumn(name = "LRPARMCOTIPLANID", referencedColumnName = "LRPARMCOTIPLANID", nullable = false),
        @JoinColumn(name = "LRTIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false),
        @JoinColumn(name = "LRAGRUPAIMPRESIONID", referencedColumnName = "LRAGRUPAIMPRESIONID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrparmcotireglas lrparmcotireglas;

    public Lrhistoricoreglas() {
    }

    public Lrhistoricoreglas(Long lrhistoricoreglasid) {
        this.lrhistoricoreglasid = lrhistoricoreglasid;
    }

    public Lrhistoricoreglas(Long lrhistoricoreglasid, Character llrhistoricoreglasact, String llrhistoricoreglasual, Date llrhistoricoreglasfal) {
        this.lrhistoricoreglasid = lrhistoricoreglasid;
        this.llrhistoricoreglasact = llrhistoricoreglasact;
        this.llrhistoricoreglasual = llrhistoricoreglasual;
        this.llrhistoricoreglasfal = llrhistoricoreglasfal;
    }

    public Long getLrhistoricoreglasid() {
        return lrhistoricoreglasid;
    }

    public void setLrhistoricoreglasid(Long lrhistoricoreglasid) {
        this.lrhistoricoreglasid = lrhistoricoreglasid;
    }

    public Long getLrhistoricoreglascoditem() {
        return lrhistoricoreglascoditem;
    }

    public void setLrhistoricoreglascoditem(Long lrhistoricoreglascoditem) {
        this.lrhistoricoreglascoditem = lrhistoricoreglascoditem;
    }

    public String getLlrhistoricoreglasformula() {
        return llrhistoricoreglasformula;
    }

    public void setLlrhistoricoreglasformula(String llrhistoricoreglasformula) {
        this.llrhistoricoreglasformula = llrhistoricoreglasformula;
    }

    public Short getLlrhistoricoreglasordenejecuci() {
        return llrhistoricoreglasordenejecuci;
    }

    public void setLlrhistoricoreglasordenejecuci(Short llrhistoricoreglasordenejecuci) {
        this.llrhistoricoreglasordenejecuci = llrhistoricoreglasordenejecuci;
    }

    public Long getLlrhistoricoreglasordenenvisua() {
        return llrhistoricoreglasordenenvisua;
    }

    public void setLlrhistoricoreglasordenenvisua(Long llrhistoricoreglasordenenvisua) {
        this.llrhistoricoreglasordenenvisua = llrhistoricoreglasordenenvisua;
    }

    public Character getLlrhistoricoreglascampaux() {
        return llrhistoricoreglascampaux;
    }

    public void setLlrhistoricoreglascampaux(Character llrhistoricoreglascampaux) {
        this.llrhistoricoreglascampaux = llrhistoricoreglascampaux;
    }

    public Character getLlrhistoricoreglasingresa() {
        return llrhistoricoreglasingresa;
    }

    public void setLlrhistoricoreglasingresa(Character llrhistoricoreglasingresa) {
        this.llrhistoricoreglasingresa = llrhistoricoreglasingresa;
    }

    public Character getLlrhistoricoreglasviscarga() {
        return llrhistoricoreglasviscarga;
    }

    public void setLlrhistoricoreglasviscarga(Character llrhistoricoreglasviscarga) {
        this.llrhistoricoreglasviscarga = llrhistoricoreglasviscarga;
    }

    public Character getLlrhistoricoreglascotfin() {
        return llrhistoricoreglascotfin;
    }

    public void setLlrhistoricoreglascotfin(Character llrhistoricoreglascotfin) {
        this.llrhistoricoreglascotfin = llrhistoricoreglascotfin;
    }

    public Character getLlrhistoricoreglasimprime() {
        return llrhistoricoreglasimprime;
    }

    public void setLlrhistoricoreglasimprime(Character llrhistoricoreglasimprime) {
        this.llrhistoricoreglasimprime = llrhistoricoreglasimprime;
    }

    public String getLlrhistoricoreglascomimprime() {
        return llrhistoricoreglascomimprime;
    }

    public void setLlrhistoricoreglascomimprime(String llrhistoricoreglascomimprime) {
        this.llrhistoricoreglascomimprime = llrhistoricoreglascomimprime;
    }

    public String getLlrhistoricoreglasprgejecuta() {
        return llrhistoricoreglasprgejecuta;
    }

    public void setLlrhistoricoreglasprgejecuta(String llrhistoricoreglasprgejecuta) {
        this.llrhistoricoreglasprgejecuta = llrhistoricoreglasprgejecuta;
    }

    public Character getLlrhistoricoreglasmuestraval() {
        return llrhistoricoreglasmuestraval;
    }

    public void setLlrhistoricoreglasmuestraval(Character llrhistoricoreglasmuestraval) {
        this.llrhistoricoreglasmuestraval = llrhistoricoreglasmuestraval;
    }

    public Character getLlrhistoricoreglasact() {
        return llrhistoricoreglasact;
    }

    public void setLlrhistoricoreglasact(Character llrhistoricoreglasact) {
        this.llrhistoricoreglasact = llrhistoricoreglasact;
    }

    public String getLlrhistoricoreglasual() {
        return llrhistoricoreglasual;
    }

    public void setLlrhistoricoreglasual(String llrhistoricoreglasual) {
        this.llrhistoricoreglasual = llrhistoricoreglasual;
    }

    public Date getLlrhistoricoreglasfal() {
        return llrhistoricoreglasfal;
    }

    public void setLlrhistoricoreglasfal(Date llrhistoricoreglasfal) {
        this.llrhistoricoreglasfal = llrhistoricoreglasfal;
    }

    public Lrparmcotireglas getLrparmcotireglas() {
        return lrparmcotireglas;
    }

    public void setLrparmcotireglas(Lrparmcotireglas lrparmcotireglas) {
        this.lrparmcotireglas = lrparmcotireglas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrhistoricoreglasid != null ? lrhistoricoreglasid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrhistoricoreglas)) {
            return false;
        }
        Lrhistoricoreglas other = (Lrhistoricoreglas) object;
        if ((this.lrhistoricoreglasid == null && other.lrhistoricoreglasid != null) || (this.lrhistoricoreglasid != null && !this.lrhistoricoreglasid.equals(other.lrhistoricoreglasid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrhistoricoreglas[ lrhistoricoreglasid=" + lrhistoricoreglasid + " ]";
    }
    
}
