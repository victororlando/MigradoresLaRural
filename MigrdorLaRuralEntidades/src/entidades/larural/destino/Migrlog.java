/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "MIGRLOG")
@NamedQueries({
    @NamedQuery(name = "Migrlog.findAll", query = "SELECT m FROM Migrlog m"),
    @NamedQuery(name = "Migrlog.findById", query = "SELECT m FROM Migrlog m WHERE m.id = :id"),
    @NamedQuery(name = "Migrlog.findByLogDate", query = "SELECT m FROM Migrlog m WHERE m.logDate = :logDate"),
    @NamedQuery(name = "Migrlog.findBySeverity", query = "SELECT m FROM Migrlog m WHERE m.severity = :severity"),
    @NamedQuery(name = "Migrlog.findByLogtext", query = "SELECT m FROM Migrlog m WHERE m.logtext = :logtext"),
    @NamedQuery(name = "Migrlog.findByPhase", query = "SELECT m FROM Migrlog m WHERE m.phase = :phase"),
    @NamedQuery(name = "Migrlog.findByRefObjectId", query = "SELECT m FROM Migrlog m WHERE m.refObjectId = :refObjectId"),
    @NamedQuery(name = "Migrlog.findByRefObjectType", query = "SELECT m FROM Migrlog m WHERE m.refObjectType = :refObjectType"),
    @NamedQuery(name = "Migrlog.findByConnectionIdFk", query = "SELECT m FROM Migrlog m WHERE m.connectionIdFk = :connectionIdFk")})
public class Migrlog implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "LOG_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date logDate;
    @Basic(optional = false)
    @Column(name = "SEVERITY", nullable = false)
    private short severity;
    @Column(name = "LOGTEXT", length = 4000)
    private String logtext;
    @Column(name = "PHASE", length = 100)
    private String phase;
    @Column(name = "REF_OBJECT_ID")
    private BigInteger refObjectId;
    @Column(name = "REF_OBJECT_TYPE", length = 4000)
    private String refObjectType;
    @Column(name = "CONNECTION_ID_FK")
    private BigInteger connectionIdFk;
    @OneToMany(mappedBy = "parentLogId")
    private List<Migrlog> migrlogList;
    @JoinColumn(name = "PARENT_LOG_ID", referencedColumnName = "ID")
    @ManyToOne
    private Migrlog parentLogId;

    public Migrlog() {
    }

    public Migrlog(BigDecimal id) {
        this.id = id;
    }

    public Migrlog(BigDecimal id, Date logDate, short severity) {
        this.id = id;
        this.logDate = logDate;
        this.severity = severity;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public short getSeverity() {
        return severity;
    }

    public void setSeverity(short severity) {
        this.severity = severity;
    }

    public String getLogtext() {
        return logtext;
    }

    public void setLogtext(String logtext) {
        this.logtext = logtext;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public BigInteger getRefObjectId() {
        return refObjectId;
    }

    public void setRefObjectId(BigInteger refObjectId) {
        this.refObjectId = refObjectId;
    }

    public String getRefObjectType() {
        return refObjectType;
    }

    public void setRefObjectType(String refObjectType) {
        this.refObjectType = refObjectType;
    }

    public BigInteger getConnectionIdFk() {
        return connectionIdFk;
    }

    public void setConnectionIdFk(BigInteger connectionIdFk) {
        this.connectionIdFk = connectionIdFk;
    }

    public List<Migrlog> getMigrlogList() {
        return migrlogList;
    }

    public void setMigrlogList(List<Migrlog> migrlogList) {
        this.migrlogList = migrlogList;
    }

    public Migrlog getParentLogId() {
        return parentLogId;
    }

    public void setParentLogId(Migrlog parentLogId) {
        this.parentLogId = parentLogId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Migrlog)) {
            return false;
        }
        Migrlog other = (Migrlog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Migrlog[ id=" + id + " ]";
    }
    
}
