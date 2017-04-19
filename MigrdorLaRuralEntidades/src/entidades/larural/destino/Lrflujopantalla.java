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
@Table(name = "LRFLUJOPANTALLA")
@NamedQueries({
    @NamedQuery(name = "Lrflujopantalla.findAll", query = "SELECT l FROM Lrflujopantalla l"),
    @NamedQuery(name = "Lrflujopantalla.findByLrflujopantallaid", query = "SELECT l FROM Lrflujopantalla l WHERE l.lrflujopantallaid = :lrflujopantallaid"),
    @NamedQuery(name = "Lrflujopantalla.findByLrflujopantalladesc", query = "SELECT l FROM Lrflujopantalla l WHERE l.lrflujopantalladesc = :lrflujopantalladesc"),
    @NamedQuery(name = "Lrflujopantalla.findByPolizastipoid", query = "SELECT l FROM Lrflujopantalla l WHERE l.polizastipoid = :polizastipoid"),
    @NamedQuery(name = "Lrflujopantalla.findByLrflujopantallamodo", query = "SELECT l FROM Lrflujopantalla l WHERE l.lrflujopantallamodo = :lrflujopantallamodo"),
    @NamedQuery(name = "Lrflujopantalla.findByLrflujopantallaorden", query = "SELECT l FROM Lrflujopantalla l WHERE l.lrflujopantallaorden = :lrflujopantallaorden"),
    @NamedQuery(name = "Lrflujopantalla.findByLrflujopantallaac", query = "SELECT l FROM Lrflujopantalla l WHERE l.lrflujopantallaac = :lrflujopantallaac"),
    @NamedQuery(name = "Lrflujopantalla.findByLrflujopantallaual", query = "SELECT l FROM Lrflujopantalla l WHERE l.lrflujopantallaual = :lrflujopantallaual"),
    @NamedQuery(name = "Lrflujopantalla.findByLrflujopantallafal", query = "SELECT l FROM Lrflujopantalla l WHERE l.lrflujopantallafal = :lrflujopantallafal"),
    @NamedQuery(name = "Lrflujopantalla.findByLrflujopantallaumd", query = "SELECT l FROM Lrflujopantalla l WHERE l.lrflujopantallaumd = :lrflujopantallaumd"),
    @NamedQuery(name = "Lrflujopantalla.findByLrflujopantallafmd", query = "SELECT l FROM Lrflujopantalla l WHERE l.lrflujopantallafmd = :lrflujopantallafmd"),
    @NamedQuery(name = "Lrflujopantalla.findByLrflujopantallaboton", query = "SELECT l FROM Lrflujopantalla l WHERE l.lrflujopantallaboton = :lrflujopantallaboton")})
public class Lrflujopantalla implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRFLUJOPANTALLAID", nullable = false)
    private Long lrflujopantallaid;
    @Basic(optional = false)
    @Column(name = "LRFLUJOPANTALLADESC", nullable = false, length = 500)
    private String lrflujopantalladesc;
    @Basic(optional = false)
    @Column(name = "POLIZASTIPOID", nullable = false)
    private short polizastipoid;
    @Basic(optional = false)
    @Column(name = "LRFLUJOPANTALLAMODO", nullable = false, length = 3)
    private String lrflujopantallamodo;
    @Basic(optional = false)
    @Column(name = "LRFLUJOPANTALLAORDEN", nullable = false)
    private short lrflujopantallaorden;
    @Basic(optional = false)
    @Column(name = "LRFLUJOPANTALLAAC", nullable = false)
    private Character lrflujopantallaac;
    @Basic(optional = false)
    @Column(name = "LRFLUJOPANTALLAUAL", nullable = false, length = 30)
    private String lrflujopantallaual;
    @Basic(optional = false)
    @Column(name = "LRFLUJOPANTALLAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrflujopantallafal;
    @Column(name = "LRFLUJOPANTALLAUMD", length = 30)
    private String lrflujopantallaumd;
    @Column(name = "LRFLUJOPANTALLAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrflujopantallafmd;
    @Column(name = "LRFLUJOPANTALLABOTON", length = 40)
    private String lrflujopantallaboton;
    @JoinColumns({
        @JoinColumn(name = "LRPERFILESID", referencedColumnName = "LRPERFILESID", nullable = false),
        @JoinColumn(name = "SOBJETOATRASID", referencedColumnName = "LROBJETOSID")})
    @ManyToOne(optional = false)
    private Lrobjperf lrobjperf;
    @JoinColumns({
        @JoinColumn(name = "LRPERFILESID", referencedColumnName = "LRPERFILESID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SOBJETOSGTEID", referencedColumnName = "LROBJETOSID")})
    @ManyToOne(optional = false)
    private Lrobjperf lrobjperf1;
    @JoinColumns({
        @JoinColumn(name = "LRPERFILESID", referencedColumnName = "LRPERFILESID", nullable = false,insertable = false,updatable = false),
        @JoinColumn(name = "SOBJETOID", referencedColumnName = "LROBJETOSID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrobjperf lrobjperf2;
    @JoinColumn(name = "LRPERFILESID", referencedColumnName = "LRPERFILESID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrperfiles lrperfilesid;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrflujopantalla() {
    }

    public Lrflujopantalla(Long lrflujopantallaid) {
        this.lrflujopantallaid = lrflujopantallaid;
    }

    public Lrflujopantalla(Long lrflujopantallaid, String lrflujopantalladesc, short polizastipoid, String lrflujopantallamodo, short lrflujopantallaorden, Character lrflujopantallaac, String lrflujopantallaual, Date lrflujopantallafal) {
        this.lrflujopantallaid = lrflujopantallaid;
        this.lrflujopantalladesc = lrflujopantalladesc;
        this.polizastipoid = polizastipoid;
        this.lrflujopantallamodo = lrflujopantallamodo;
        this.lrflujopantallaorden = lrflujopantallaorden;
        this.lrflujopantallaac = lrflujopantallaac;
        this.lrflujopantallaual = lrflujopantallaual;
        this.lrflujopantallafal = lrflujopantallafal;
    }

    public Long getLrflujopantallaid() {
        return lrflujopantallaid;
    }

    public void setLrflujopantallaid(Long lrflujopantallaid) {
        this.lrflujopantallaid = lrflujopantallaid;
    }

    public String getLrflujopantalladesc() {
        return lrflujopantalladesc;
    }

    public void setLrflujopantalladesc(String lrflujopantalladesc) {
        this.lrflujopantalladesc = lrflujopantalladesc;
    }

    public short getPolizastipoid() {
        return polizastipoid;
    }

    public void setPolizastipoid(short polizastipoid) {
        this.polizastipoid = polizastipoid;
    }

    public String getLrflujopantallamodo() {
        return lrflujopantallamodo;
    }

    public void setLrflujopantallamodo(String lrflujopantallamodo) {
        this.lrflujopantallamodo = lrflujopantallamodo;
    }

    public short getLrflujopantallaorden() {
        return lrflujopantallaorden;
    }

    public void setLrflujopantallaorden(short lrflujopantallaorden) {
        this.lrflujopantallaorden = lrflujopantallaorden;
    }

    public Character getLrflujopantallaac() {
        return lrflujopantallaac;
    }

    public void setLrflujopantallaac(Character lrflujopantallaac) {
        this.lrflujopantallaac = lrflujopantallaac;
    }

    public String getLrflujopantallaual() {
        return lrflujopantallaual;
    }

    public void setLrflujopantallaual(String lrflujopantallaual) {
        this.lrflujopantallaual = lrflujopantallaual;
    }

    public Date getLrflujopantallafal() {
        return lrflujopantallafal;
    }

    public void setLrflujopantallafal(Date lrflujopantallafal) {
        this.lrflujopantallafal = lrflujopantallafal;
    }

    public String getLrflujopantallaumd() {
        return lrflujopantallaumd;
    }

    public void setLrflujopantallaumd(String lrflujopantallaumd) {
        this.lrflujopantallaumd = lrflujopantallaumd;
    }

    public Date getLrflujopantallafmd() {
        return lrflujopantallafmd;
    }

    public void setLrflujopantallafmd(Date lrflujopantallafmd) {
        this.lrflujopantallafmd = lrflujopantallafmd;
    }

    public String getLrflujopantallaboton() {
        return lrflujopantallaboton;
    }

    public void setLrflujopantallaboton(String lrflujopantallaboton) {
        this.lrflujopantallaboton = lrflujopantallaboton;
    }

    public Lrobjperf getLrobjperf() {
        return lrobjperf;
    }

    public void setLrobjperf(Lrobjperf lrobjperf) {
        this.lrobjperf = lrobjperf;
    }

    public Lrobjperf getLrobjperf1() {
        return lrobjperf1;
    }

    public void setLrobjperf1(Lrobjperf lrobjperf1) {
        this.lrobjperf1 = lrobjperf1;
    }

    public Lrobjperf getLrobjperf2() {
        return lrobjperf2;
    }

    public void setLrobjperf2(Lrobjperf lrobjperf2) {
        this.lrobjperf2 = lrobjperf2;
    }

    public Lrperfiles getLrperfilesid() {
        return lrperfilesid;
    }

    public void setLrperfilesid(Lrperfiles lrperfilesid) {
        this.lrperfilesid = lrperfilesid;
    }

    public Lrseccdetalle getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(Lrseccdetalle lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrflujopantallaid != null ? lrflujopantallaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrflujopantalla)) {
            return false;
        }
        Lrflujopantalla other = (Lrflujopantalla) object;
        if ((this.lrflujopantallaid == null && other.lrflujopantallaid != null) || (this.lrflujopantallaid != null && !this.lrflujopantallaid.equals(other.lrflujopantallaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrflujopantalla[ lrflujopantallaid=" + lrflujopantallaid + " ]";
    }
    
}
