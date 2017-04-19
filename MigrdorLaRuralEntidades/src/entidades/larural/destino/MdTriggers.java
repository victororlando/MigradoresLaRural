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
import javax.persistence.Lob;
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
@Table(name = "MD_TRIGGERS")
@NamedQueries({
    @NamedQuery(name = "MdTriggers.findAll", query = "SELECT m FROM MdTriggers m"),
    @NamedQuery(name = "MdTriggers.findById", query = "SELECT m FROM MdTriggers m WHERE m.id = :id"),
    @NamedQuery(name = "MdTriggers.findByTableOrViewIdFk", query = "SELECT m FROM MdTriggers m WHERE m.tableOrViewIdFk = :tableOrViewIdFk"),
    @NamedQuery(name = "MdTriggers.findByTriggerOnFlag", query = "SELECT m FROM MdTriggers m WHERE m.triggerOnFlag = :triggerOnFlag"),
    @NamedQuery(name = "MdTriggers.findByTriggerName", query = "SELECT m FROM MdTriggers m WHERE m.triggerName = :triggerName"),
    @NamedQuery(name = "MdTriggers.findByTriggerTiming", query = "SELECT m FROM MdTriggers m WHERE m.triggerTiming = :triggerTiming"),
    @NamedQuery(name = "MdTriggers.findByTriggerOperation", query = "SELECT m FROM MdTriggers m WHERE m.triggerOperation = :triggerOperation"),
    @NamedQuery(name = "MdTriggers.findByTriggerEvent", query = "SELECT m FROM MdTriggers m WHERE m.triggerEvent = :triggerEvent"),
    @NamedQuery(name = "MdTriggers.findByNativeKey", query = "SELECT m FROM MdTriggers m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdTriggers.findByLanguage", query = "SELECT m FROM MdTriggers m WHERE m.language = :language"),
    @NamedQuery(name = "MdTriggers.findByComments", query = "SELECT m FROM MdTriggers m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdTriggers.findByLinecount", query = "SELECT m FROM MdTriggers m WHERE m.linecount = :linecount"),
    @NamedQuery(name = "MdTriggers.findBySecurityGroupId", query = "SELECT m FROM MdTriggers m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdTriggers.findByCreatedOn", query = "SELECT m FROM MdTriggers m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdTriggers.findByCreatedBy", query = "SELECT m FROM MdTriggers m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdTriggers.findByLastUpdatedOn", query = "SELECT m FROM MdTriggers m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdTriggers.findByLastUpdatedBy", query = "SELECT m FROM MdTriggers m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdTriggers implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "TABLE_OR_VIEW_ID_FK", nullable = false)
    private BigInteger tableOrViewIdFk;
    @Basic(optional = false)
    @Column(name = "TRIGGER_ON_FLAG", nullable = false)
    private Character triggerOnFlag;
    @Column(name = "TRIGGER_NAME", length = 4000)
    private String triggerName;
    @Column(name = "TRIGGER_TIMING", length = 4000)
    private String triggerTiming;
    @Column(name = "TRIGGER_OPERATION", length = 4000)
    private String triggerOperation;
    @Column(name = "TRIGGER_EVENT", length = 4000)
    private String triggerEvent;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Column(name = "NATIVE_KEY", length = 4000)
    private String nativeKey;
    @Basic(optional = false)
    @Column(name = "LANGUAGE", nullable = false, length = 40)
    private String language;
    @Column(name = "COMMENTS", length = 4000)
    private String comments;
    @Column(name = "LINECOUNT")
    private BigInteger linecount;
    @Basic(optional = false)
    @Column(name = "SECURITY_GROUP_ID", nullable = false)
    private BigInteger securityGroupId;
    @Basic(optional = false)
    @Column(name = "CREATED_ON", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "CREATED_BY", length = 255)
    private String createdBy;
    @Column(name = "LAST_UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedOn;
    @Column(name = "LAST_UPDATED_BY", length = 255)
    private String lastUpdatedBy;

    public MdTriggers() {
    }

    public MdTriggers(BigDecimal id) {
        this.id = id;
    }

    public MdTriggers(BigDecimal id, BigInteger tableOrViewIdFk, Character triggerOnFlag, String language, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.tableOrViewIdFk = tableOrViewIdFk;
        this.triggerOnFlag = triggerOnFlag;
        this.language = language;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getTableOrViewIdFk() {
        return tableOrViewIdFk;
    }

    public void setTableOrViewIdFk(BigInteger tableOrViewIdFk) {
        this.tableOrViewIdFk = tableOrViewIdFk;
    }

    public Character getTriggerOnFlag() {
        return triggerOnFlag;
    }

    public void setTriggerOnFlag(Character triggerOnFlag) {
        this.triggerOnFlag = triggerOnFlag;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerTiming() {
        return triggerTiming;
    }

    public void setTriggerTiming(String triggerTiming) {
        this.triggerTiming = triggerTiming;
    }

    public String getTriggerOperation() {
        return triggerOperation;
    }

    public void setTriggerOperation(String triggerOperation) {
        this.triggerOperation = triggerOperation;
    }

    public String getTriggerEvent() {
        return triggerEvent;
    }

    public void setTriggerEvent(String triggerEvent) {
        this.triggerEvent = triggerEvent;
    }

    public String getNativeSql() {
        return nativeSql;
    }

    public void setNativeSql(String nativeSql) {
        this.nativeSql = nativeSql;
    }

    public String getNativeKey() {
        return nativeKey;
    }

    public void setNativeKey(String nativeKey) {
        this.nativeKey = nativeKey;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigInteger getLinecount() {
        return linecount;
    }

    public void setLinecount(BigInteger linecount) {
        this.linecount = linecount;
    }

    public BigInteger getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(BigInteger securityGroupId) {
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

    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
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
        if (!(object instanceof MdTriggers)) {
            return false;
        }
        MdTriggers other = (MdTriggers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdTriggers[ id=" + id + " ]";
    }
    
}
