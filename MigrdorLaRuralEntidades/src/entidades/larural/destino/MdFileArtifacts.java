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
@Table(name = "MD_FILE_ARTIFACTS")
@NamedQueries({
    @NamedQuery(name = "MdFileArtifacts.findAll", query = "SELECT m FROM MdFileArtifacts m"),
    @NamedQuery(name = "MdFileArtifacts.findById", query = "SELECT m FROM MdFileArtifacts m WHERE m.id = :id"),
    @NamedQuery(name = "MdFileArtifacts.findByPattern", query = "SELECT m FROM MdFileArtifacts m WHERE m.pattern = :pattern"),
    @NamedQuery(name = "MdFileArtifacts.findByStringFound", query = "SELECT m FROM MdFileArtifacts m WHERE m.stringFound = :stringFound"),
    @NamedQuery(name = "MdFileArtifacts.findByStringReplaced", query = "SELECT m FROM MdFileArtifacts m WHERE m.stringReplaced = :stringReplaced"),
    @NamedQuery(name = "MdFileArtifacts.findByType", query = "SELECT m FROM MdFileArtifacts m WHERE m.type = :type"),
    @NamedQuery(name = "MdFileArtifacts.findByStatus", query = "SELECT m FROM MdFileArtifacts m WHERE m.status = :status"),
    @NamedQuery(name = "MdFileArtifacts.findByLine", query = "SELECT m FROM MdFileArtifacts m WHERE m.line = :line"),
    @NamedQuery(name = "MdFileArtifacts.findByPatternStart", query = "SELECT m FROM MdFileArtifacts m WHERE m.patternStart = :patternStart"),
    @NamedQuery(name = "MdFileArtifacts.findByPatternEnd", query = "SELECT m FROM MdFileArtifacts m WHERE m.patternEnd = :patternEnd"),
    @NamedQuery(name = "MdFileArtifacts.findByDueDate", query = "SELECT m FROM MdFileArtifacts m WHERE m.dueDate = :dueDate"),
    @NamedQuery(name = "MdFileArtifacts.findByDbType", query = "SELECT m FROM MdFileArtifacts m WHERE m.dbType = :dbType"),
    @NamedQuery(name = "MdFileArtifacts.findByCodeType", query = "SELECT m FROM MdFileArtifacts m WHERE m.codeType = :codeType"),
    @NamedQuery(name = "MdFileArtifacts.findByDescription", query = "SELECT m FROM MdFileArtifacts m WHERE m.description = :description"),
    @NamedQuery(name = "MdFileArtifacts.findByPriority", query = "SELECT m FROM MdFileArtifacts m WHERE m.priority = :priority"),
    @NamedQuery(name = "MdFileArtifacts.findBySecurityGroupId", query = "SELECT m FROM MdFileArtifacts m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdFileArtifacts.findByCreatedOn", query = "SELECT m FROM MdFileArtifacts m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdFileArtifacts.findByCreatedBy", query = "SELECT m FROM MdFileArtifacts m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdFileArtifacts.findByLastUpdated", query = "SELECT m FROM MdFileArtifacts m WHERE m.lastUpdated = :lastUpdated"),
    @NamedQuery(name = "MdFileArtifacts.findByLastUpdatedBy", query = "SELECT m FROM MdFileArtifacts m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdFileArtifacts implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "PATTERN", length = 4000)
    private String pattern;
    @Column(name = "STRING_FOUND", length = 4000)
    private String stringFound;
    @Column(name = "STRING_REPLACED", length = 4000)
    private String stringReplaced;
    @Column(name = "TYPE", length = 200)
    private String type;
    @Column(name = "STATUS", length = 4000)
    private String status;
    @Column(name = "LINE")
    private BigInteger line;
    @Column(name = "PATTERN_START")
    private BigInteger patternStart;
    @Column(name = "PATTERN_END")
    private BigInteger patternEnd;
    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    @Column(name = "DB_TYPE", length = 100)
    private String dbType;
    @Column(name = "CODE_TYPE", length = 1000)
    private String codeType;
    @Column(name = "DESCRIPTION", length = 4000)
    private String description;
    @Column(name = "PRIORITY")
    private BigInteger priority;
    @Basic(optional = false)
    @Column(name = "SECURITY_GROUP_ID", nullable = false, length = 20)
    private String securityGroupId;
    @Basic(optional = false)
    @Column(name = "CREATED_ON", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "CREATED_BY", length = 4000)
    private String createdBy;
    @Column(name = "LAST_UPDATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @Column(name = "LAST_UPDATED_BY", length = 4000)
    private String lastUpdatedBy;
    @JoinColumn(name = "APPLICATIONFILES_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdApplicationfiles applicationfilesId;

    public MdFileArtifacts() {
    }

    public MdFileArtifacts(BigDecimal id) {
        this.id = id;
    }

    public MdFileArtifacts(BigDecimal id, String securityGroupId, Date createdOn) {
        this.id = id;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getStringFound() {
        return stringFound;
    }

    public void setStringFound(String stringFound) {
        this.stringFound = stringFound;
    }

    public String getStringReplaced() {
        return stringReplaced;
    }

    public void setStringReplaced(String stringReplaced) {
        this.stringReplaced = stringReplaced;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getLine() {
        return line;
    }

    public void setLine(BigInteger line) {
        this.line = line;
    }

    public BigInteger getPatternStart() {
        return patternStart;
    }

    public void setPatternStart(BigInteger patternStart) {
        this.patternStart = patternStart;
    }

    public BigInteger getPatternEnd() {
        return patternEnd;
    }

    public void setPatternEnd(BigInteger patternEnd) {
        this.patternEnd = patternEnd;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getPriority() {
        return priority;
    }

    public void setPriority(BigInteger priority) {
        this.priority = priority;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public MdApplicationfiles getApplicationfilesId() {
        return applicationfilesId;
    }

    public void setApplicationfilesId(MdApplicationfiles applicationfilesId) {
        this.applicationfilesId = applicationfilesId;
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
        if (!(object instanceof MdFileArtifacts)) {
            return false;
        }
        MdFileArtifacts other = (MdFileArtifacts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdFileArtifacts[ id=" + id + " ]";
    }
    
}
