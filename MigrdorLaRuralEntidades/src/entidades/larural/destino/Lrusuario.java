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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRUSUARIO")
@NamedQueries({
    @NamedQuery(name = "Lrusuario.findAll", query = "SELECT l FROM Lrusuario l"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosid", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosid = :lrusuariosid"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosnom", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosnom = :lrusuariosnom"),
    @NamedQuery(name = "Lrusuario.findByLrusuariocon", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariocon = :lrusuariocon"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosconloc", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosconloc = :lrusuariosconloc"),
    @NamedQuery(name = "Lrusuario.findByLrusuarioshab", query = "SELECT l FROM Lrusuario l WHERE l.lrusuarioshab = :lrusuarioshab"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosfchval", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosfchval = :lrusuariosfchval"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosfal", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosfal = :lrusuariosfal"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosual", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosual = :lrusuariosual"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosfmd", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosfmd = :lrusuariosfmd"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosumd", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosumd = :lrusuariosumd"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosidagen", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosidagen = :lrusuariosidagen"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosidst", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosidst = :lrusuariosidst"),
    @NamedQuery(name = "Lrusuario.findByLrusuariosessup", query = "SELECT l FROM Lrusuario l WHERE l.lrusuariosessup = :lrusuariosessup"),
    @NamedQuery(name = "Lrusuario.findByOrgadoresid", query = "SELECT l FROM Lrusuario l WHERE l.orgadoresid = :orgadoresid")})
public class Lrusuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSID", nullable = false, length = 30)
    private String lrusuariosid;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSNOM", nullable = false, length = 60)
    private String lrusuariosnom;
    @Column(name = "LRUSUARIOCON", length = 256)
    private String lrusuariocon;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSCONLOC", nullable = false)
    private Character lrusuariosconloc;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSHAB", nullable = false)
    private Character lrusuarioshab;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSFCHVAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrusuariosfchval;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrusuariosfal;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSUAL", nullable = false, length = 30)
    private String lrusuariosual;
    @Column(name = "LRUSUARIOSFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrusuariosfmd;
    @Column(name = "LRUSUARIOSUMD", length = 30)
    private String lrusuariosumd;
    @Column(name = "LRUSUARIOSIDAGEN")
    private Short lrusuariosidagen;
    @Column(name = "LRUSUARIOSIDST")
    private Long lrusuariosidst;
    @Column(name = "LRUSUARIOSESSUP")
    private Character lrusuariosessup;
    @Basic(optional = false)
    @Column(name = "ORGADORESID", nullable = false)
    private int orgadoresid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrusuario")
    private List<Lrusuperfiles> lrusuperfilesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrusuario")
    private List<Lrparmcotidetperfilesusu> lrparmcotidetperfilesusuList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "lrusuariosid")
    private Lrinspector lrinspector;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrusuariossuid")
    private List<Lrusuariosuperior> lrusuariosuperiorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrusuariosid")
    private List<Lrusuariosuperior> lrusuariosuperiorList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrusuariosid")
    private List<Lrusuariosoficiales> lrusuariosoficialesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrusuario")
    private List<Lrplangrupusuario> lrplangrupusuarioList;

    public Lrusuario() {
    }

    public Lrusuario(String lrusuariosid) {
        this.lrusuariosid = lrusuariosid;
    }

    public Lrusuario(String lrusuariosid, String lrusuariosnom, Character lrusuariosconloc, Character lrusuarioshab, Date lrusuariosfchval, Date lrusuariosfal, String lrusuariosual, int orgadoresid) {
        this.lrusuariosid = lrusuariosid;
        this.lrusuariosnom = lrusuariosnom;
        this.lrusuariosconloc = lrusuariosconloc;
        this.lrusuarioshab = lrusuarioshab;
        this.lrusuariosfchval = lrusuariosfchval;
        this.lrusuariosfal = lrusuariosfal;
        this.lrusuariosual = lrusuariosual;
        this.orgadoresid = orgadoresid;
    }

    public String getLrusuariosid() {
        return lrusuariosid;
    }

    public void setLrusuariosid(String lrusuariosid) {
        this.lrusuariosid = lrusuariosid;
    }

    public String getLrusuariosnom() {
        return lrusuariosnom;
    }

    public void setLrusuariosnom(String lrusuariosnom) {
        this.lrusuariosnom = lrusuariosnom;
    }

    public String getLrusuariocon() {
        return lrusuariocon;
    }

    public void setLrusuariocon(String lrusuariocon) {
        this.lrusuariocon = lrusuariocon;
    }

    public Character getLrusuariosconloc() {
        return lrusuariosconloc;
    }

    public void setLrusuariosconloc(Character lrusuariosconloc) {
        this.lrusuariosconloc = lrusuariosconloc;
    }

    public Character getLrusuarioshab() {
        return lrusuarioshab;
    }

    public void setLrusuarioshab(Character lrusuarioshab) {
        this.lrusuarioshab = lrusuarioshab;
    }

    public Date getLrusuariosfchval() {
        return lrusuariosfchval;
    }

    public void setLrusuariosfchval(Date lrusuariosfchval) {
        this.lrusuariosfchval = lrusuariosfchval;
    }

    public Date getLrusuariosfal() {
        return lrusuariosfal;
    }

    public void setLrusuariosfal(Date lrusuariosfal) {
        this.lrusuariosfal = lrusuariosfal;
    }

    public String getLrusuariosual() {
        return lrusuariosual;
    }

    public void setLrusuariosual(String lrusuariosual) {
        this.lrusuariosual = lrusuariosual;
    }

    public Date getLrusuariosfmd() {
        return lrusuariosfmd;
    }

    public void setLrusuariosfmd(Date lrusuariosfmd) {
        this.lrusuariosfmd = lrusuariosfmd;
    }

    public String getLrusuariosumd() {
        return lrusuariosumd;
    }

    public void setLrusuariosumd(String lrusuariosumd) {
        this.lrusuariosumd = lrusuariosumd;
    }

    public Short getLrusuariosidagen() {
        return lrusuariosidagen;
    }

    public void setLrusuariosidagen(Short lrusuariosidagen) {
        this.lrusuariosidagen = lrusuariosidagen;
    }

    public Long getLrusuariosidst() {
        return lrusuariosidst;
    }

    public void setLrusuariosidst(Long lrusuariosidst) {
        this.lrusuariosidst = lrusuariosidst;
    }

    public Character getLrusuariosessup() {
        return lrusuariosessup;
    }

    public void setLrusuariosessup(Character lrusuariosessup) {
        this.lrusuariosessup = lrusuariosessup;
    }

    public int getOrgadoresid() {
        return orgadoresid;
    }

    public void setOrgadoresid(int orgadoresid) {
        this.orgadoresid = orgadoresid;
    }

    public List<Lrusuperfiles> getLrusuperfilesList() {
        return lrusuperfilesList;
    }

    public void setLrusuperfilesList(List<Lrusuperfiles> lrusuperfilesList) {
        this.lrusuperfilesList = lrusuperfilesList;
    }

    public List<Lrparmcotidetperfilesusu> getLrparmcotidetperfilesusuList() {
        return lrparmcotidetperfilesusuList;
    }

    public void setLrparmcotidetperfilesusuList(List<Lrparmcotidetperfilesusu> lrparmcotidetperfilesusuList) {
        this.lrparmcotidetperfilesusuList = lrparmcotidetperfilesusuList;
    }

    public Lrinspector getLrinspector() {
        return lrinspector;
    }

    public void setLrinspector(Lrinspector lrinspector) {
        this.lrinspector = lrinspector;
    }

    public List<Lrusuariosuperior> getLrusuariosuperiorList() {
        return lrusuariosuperiorList;
    }

    public void setLrusuariosuperiorList(List<Lrusuariosuperior> lrusuariosuperiorList) {
        this.lrusuariosuperiorList = lrusuariosuperiorList;
    }

    public List<Lrusuariosuperior> getLrusuariosuperiorList1() {
        return lrusuariosuperiorList1;
    }

    public void setLrusuariosuperiorList1(List<Lrusuariosuperior> lrusuariosuperiorList1) {
        this.lrusuariosuperiorList1 = lrusuariosuperiorList1;
    }

    public List<Lrusuariosoficiales> getLrusuariosoficialesList() {
        return lrusuariosoficialesList;
    }

    public void setLrusuariosoficialesList(List<Lrusuariosoficiales> lrusuariosoficialesList) {
        this.lrusuariosoficialesList = lrusuariosoficialesList;
    }

    public List<Lrplangrupusuario> getLrplangrupusuarioList() {
        return lrplangrupusuarioList;
    }

    public void setLrplangrupusuarioList(List<Lrplangrupusuario> lrplangrupusuarioList) {
        this.lrplangrupusuarioList = lrplangrupusuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrusuariosid != null ? lrusuariosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrusuario)) {
            return false;
        }
        Lrusuario other = (Lrusuario) object;
        if ((this.lrusuariosid == null && other.lrusuariosid != null) || (this.lrusuariosid != null && !this.lrusuariosid.equals(other.lrusuariosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrusuario[ lrusuariosid=" + lrusuariosid + " ]";
    }
    
}
