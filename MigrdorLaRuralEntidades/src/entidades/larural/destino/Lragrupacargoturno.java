/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRAGRUPACARGOTURNO")
@NamedQueries({
    @NamedQuery(name = "Lragrupacargoturno.findAll", query = "SELECT l FROM Lragrupacargoturno l"),
    @NamedQuery(name = "Lragrupacargoturno.findByLragrupacargoturnoid", query = "SELECT l FROM Lragrupacargoturno l WHERE l.lragrupacargoturnoid = :lragrupacargoturnoid"),
    @NamedQuery(name = "Lragrupacargoturno.findByLraLrubicacionid", query = "SELECT l FROM Lragrupacargoturno l WHERE l.lraLrubicacionid = :lraLrubicacionid"),
    @NamedQuery(name = "Lragrupacargoturno.findByLragrupacargoturnocant", query = "SELECT l FROM Lragrupacargoturno l WHERE l.lragrupacargoturnocant = :lragrupacargoturnocant")})
public class Lragrupacargoturno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRAGRUPACARGOTURNOID_SEQ_GENERATOR", sequenceName = "LRAGRUPACARGOTURNOID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRAGRUPACARGOTURNOID_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRAGRUPACARGOTURNOID", nullable = false)
    private Long lragrupacargoturnoid;
    @Basic(optional = false)
    @Column(name = "LRA_LRUBICACIONID", nullable = false)
    private long lraLrubicacionid;
    @Basic(optional = false)
    @Column(name = "LRAGRUPACARGOTURNOCANT", nullable = false)
    private long lragrupacargoturnocant;
    @JoinColumn(name = "LRAGRUPACARGOID", referencedColumnName = "LRAGRUPACARGOID", nullable = false)
    @ManyToOne(optional = false)
    private Lragrupacargo lragrupacargoid;
    @JoinColumn(name = "LRTURNOID", referencedColumnName = "LRTURNOID", nullable = false)
    @ManyToOne(optional = false)
    private Lrturno lrturnoid;
    @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrubicacion lrubicacionid;

    public Lragrupacargoturno() {
    }

    public Lragrupacargoturno(Long lragrupacargoturnoid) {
        this.lragrupacargoturnoid = lragrupacargoturnoid;
    }

    public Lragrupacargoturno(Long lragrupacargoturnoid, long lraLrubicacionid, long lragrupacargoturnocant) {
        this.lragrupacargoturnoid = lragrupacargoturnoid;
        this.lraLrubicacionid = lraLrubicacionid;
        this.lragrupacargoturnocant = lragrupacargoturnocant;
    }

    public Long getLragrupacargoturnoid() {
        return lragrupacargoturnoid;
    }

    public void setLragrupacargoturnoid(Long lragrupacargoturnoid) {
        this.lragrupacargoturnoid = lragrupacargoturnoid;
    }

    public long getLraLrubicacionid() {
        return lraLrubicacionid;
    }

    public void setLraLrubicacionid(long lraLrubicacionid) {
        this.lraLrubicacionid = lraLrubicacionid;
    }

    public long getLragrupacargoturnocant() {
        return lragrupacargoturnocant;
    }

    public void setLragrupacargoturnocant(long lragrupacargoturnocant) {
        this.lragrupacargoturnocant = lragrupacargoturnocant;
    }

    public Lragrupacargo getLragrupacargoid() {
        return lragrupacargoid;
    }

    public void setLragrupacargoid(Lragrupacargo lragrupacargoid) {
        this.lragrupacargoid = lragrupacargoid;
    }

    public Lrturno getLrturnoid() {
        return lrturnoid;
    }

    public void setLrturnoid(Lrturno lrturnoid) {
        this.lrturnoid = lrturnoid;
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
        hash += (lragrupacargoturnoid != null ? lragrupacargoturnoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lragrupacargoturno)) {
            return false;
        }
        Lragrupacargoturno other = (Lragrupacargoturno) object;
        if ((this.lragrupacargoturnoid == null && other.lragrupacargoturnoid != null) || (this.lragrupacargoturnoid != null && !this.lragrupacargoturnoid.equals(other.lragrupacargoturnoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lragrupacargoturno[ lragrupacargoturnoid=" + lragrupacargoturnoid + " ]";
    }

}
