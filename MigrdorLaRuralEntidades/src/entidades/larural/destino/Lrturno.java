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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRTURNO")
@NamedQueries({
    @NamedQuery(name = "Lrturno.findAll", query = "SELECT l FROM Lrturno l"),
    @NamedQuery(name = "Lrturno.findByLrturnoid", query = "SELECT l FROM Lrturno l WHERE l.lrturnoid = :lrturnoid"),
    @NamedQuery(name = "Lrturno.findByLrturnodesc", query = "SELECT l FROM Lrturno l WHERE l.lrturnodesc = :lrturnodesc"),
    @NamedQuery(name = "Lrturno.findByLrturnoac", query = "SELECT l FROM Lrturno l WHERE l.lrturnoac = :lrturnoac"),
    @NamedQuery(name = "Lrturno.findByLrturnoual", query = "SELECT l FROM Lrturno l WHERE l.lrturnoual = :lrturnoual"),
    @NamedQuery(name = "Lrturno.findByLrturnofal", query = "SELECT l FROM Lrturno l WHERE l.lrturnofal = :lrturnofal"),
    @NamedQuery(name = "Lrturno.findByLrturnoumd", query = "SELECT l FROM Lrturno l WHERE l.lrturnoumd = :lrturnoumd"),
    @NamedQuery(name = "Lrturno.findByLrturnofmd", query = "SELECT l FROM Lrturno l WHERE l.lrturnofmd = :lrturnofmd")})
public class Lrturno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTURNOID", nullable = false)
    private Long lrturnoid;
    @Basic(optional = false)
    @Column(name = "LRTURNODESC", nullable = false, length = 50)
    private String lrturnodesc;
    @Basic(optional = false)
    @Column(name = "LRTURNOAC", nullable = false)
    private Character lrturnoac;
    @Column(name = "LRTURNOUAL", length = 30)
    private String lrturnoual;
    @Column(name = "LRTURNOFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrturnofal;
    @Column(name = "LRTURNOUMD", length = 30)
    private String lrturnoumd;
    @Column(name = "LRTURNOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrturnofmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrturnoid")
    private List<Lrpersonaasegurada> lrpersonaaseguradaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrturnoid")
    private List<Lragrupacargoturno> lragrupacargoturnoList;

    public Lrturno() {
    }

    public Lrturno(Long lrturnoid) {
        this.lrturnoid = lrturnoid;
    }

    public Lrturno(Long lrturnoid, String lrturnodesc, Character lrturnoac) {
        this.lrturnoid = lrturnoid;
        this.lrturnodesc = lrturnodesc;
        this.lrturnoac = lrturnoac;
    }

    public Long getLrturnoid() {
        return lrturnoid;
    }

    public void setLrturnoid(Long lrturnoid) {
        this.lrturnoid = lrturnoid;
    }

    public String getLrturnodesc() {
        return lrturnodesc;
    }

    public void setLrturnodesc(String lrturnodesc) {
        this.lrturnodesc = lrturnodesc;
    }

    public Character getLrturnoac() {
        return lrturnoac;
    }

    public void setLrturnoac(Character lrturnoac) {
        this.lrturnoac = lrturnoac;
    }

    public String getLrturnoual() {
        return lrturnoual;
    }

    public void setLrturnoual(String lrturnoual) {
        this.lrturnoual = lrturnoual;
    }

    public Date getLrturnofal() {
        return lrturnofal;
    }

    public void setLrturnofal(Date lrturnofal) {
        this.lrturnofal = lrturnofal;
    }

    public String getLrturnoumd() {
        return lrturnoumd;
    }

    public void setLrturnoumd(String lrturnoumd) {
        this.lrturnoumd = lrturnoumd;
    }

    public Date getLrturnofmd() {
        return lrturnofmd;
    }

    public void setLrturnofmd(Date lrturnofmd) {
        this.lrturnofmd = lrturnofmd;
    }

    public List<Lrpersonaasegurada> getLrpersonaaseguradaList() {
        return lrpersonaaseguradaList;
    }

    public void setLrpersonaaseguradaList(List<Lrpersonaasegurada> lrpersonaaseguradaList) {
        this.lrpersonaaseguradaList = lrpersonaaseguradaList;
    }

    public List<Lragrupacargoturno> getLragrupacargoturnoList() {
        return lragrupacargoturnoList;
    }

    public void setLragrupacargoturnoList(List<Lragrupacargoturno> lragrupacargoturnoList) {
        this.lragrupacargoturnoList = lragrupacargoturnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrturnoid != null ? lrturnoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrturno)) {
            return false;
        }
        Lrturno other = (Lrturno) object;
        if ((this.lrturnoid == null && other.lrturnoid != null) || (this.lrturnoid != null && !this.lrturnoid.equals(other.lrturnoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrturno[ lrturnoid=" + lrturnoid + " ]";
    }
    
}
