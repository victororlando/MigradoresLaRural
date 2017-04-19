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
@Table(name = "MD_MIGR_WEAKDEP")
@NamedQueries({
    @NamedQuery(name = "MdMigrWeakdep.findAll", query = "SELECT m FROM MdMigrWeakdep m"),
    @NamedQuery(name = "MdMigrWeakdep.findById", query = "SELECT m FROM MdMigrWeakdep m WHERE m.id = :id"),
    @NamedQuery(name = "MdMigrWeakdep.findByParentId", query = "SELECT m FROM MdMigrWeakdep m WHERE m.parentId = :parentId"),
    @NamedQuery(name = "MdMigrWeakdep.findByChildName", query = "SELECT m FROM MdMigrWeakdep m WHERE m.childName = :childName"),
    @NamedQuery(name = "MdMigrWeakdep.findByParentType", query = "SELECT m FROM MdMigrWeakdep m WHERE m.parentType = :parentType"),
    @NamedQuery(name = "MdMigrWeakdep.findByChildType", query = "SELECT m FROM MdMigrWeakdep m WHERE m.childType = :childType"),
    @NamedQuery(name = "MdMigrWeakdep.findBySecurityGroupId", query = "SELECT m FROM MdMigrWeakdep m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdMigrWeakdep.findByCreatedOn", query = "SELECT m FROM MdMigrWeakdep m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdMigrWeakdep.findByCreatedBy", query = "SELECT m FROM MdMigrWeakdep m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdMigrWeakdep.findByLastUpdatedOn", query = "SELECT m FROM MdMigrWeakdep m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdMigrWeakdep.findByLastUpdatedBy", query = "SELECT m FROM MdMigrWeakdep m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdMigrWeakdep implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "PARENT_ID", nullable = false)
    private BigInteger parentId;
    @Basic(optional = false)
    @Column(name = "CHILD_NAME", nullable = false, length = 4000)
    private String childName;
    @Basic(optional = false)
    @Column(name = "PARENT_TYPE", nullable = false, length = 4000)
    private String parentType;
    @Basic(optional = false)
    @Column(name = "CHILD_TYPE", nullable = false, length = 4000)
    private String childType;
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
    @JoinColumn(name = "CONNECTION_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdConnections connectionIdFk;
    @JoinColumn(name = "SCHEMA_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdSchemas schemaIdFk;

    public MdMigrWeakdep() {
    }

    public MdMigrWeakdep(BigDecimal id) {
        this.id = id;
    }

    public MdMigrWeakdep(BigDecimal id, BigInteger parentId, String childName, String parentType, String childType, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.parentId = parentId;
        this.childName = childName;
        this.parentType = parentType;
        this.childType = childType;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getParentId() {
        return parentId;
    }

    public void setParentId(BigInteger parentId) {
        this.parentId = parentId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getChildType() {
        return childType;
    }

    public void setChildType(String childType) {
        this.childType = childType;
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

    public MdConnections getConnectionIdFk() {
        return connectionIdFk;
    }

    public void setConnectionIdFk(MdConnections connectionIdFk) {
        this.connectionIdFk = connectionIdFk;
    }

    public MdSchemas getSchemaIdFk() {
        return schemaIdFk;
    }

    public void setSchemaIdFk(MdSchemas schemaIdFk) {
        this.schemaIdFk = schemaIdFk;
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
        if (!(object instanceof MdMigrWeakdep)) {
            return false;
        }
        MdMigrWeakdep other = (MdMigrWeakdep) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdMigrWeakdep[ id=" + id + " ]";
    }
    
}
