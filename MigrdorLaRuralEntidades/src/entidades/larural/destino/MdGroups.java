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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "MD_GROUPS")
@NamedQueries({
    @NamedQuery(name = "MdGroups.findAll", query = "SELECT m FROM MdGroups m"),
    @NamedQuery(name = "MdGroups.findById", query = "SELECT m FROM MdGroups m WHERE m.id = :id"),
    @NamedQuery(name = "MdGroups.findByGroupName", query = "SELECT m FROM MdGroups m WHERE m.groupName = :groupName"),
    @NamedQuery(name = "MdGroups.findByGroupFlag", query = "SELECT m FROM MdGroups m WHERE m.groupFlag = :groupFlag"),
    @NamedQuery(name = "MdGroups.findByNativeKey", query = "SELECT m FROM MdGroups m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdGroups.findByComments", query = "SELECT m FROM MdGroups m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdGroups.findBySecurityGroupId", query = "SELECT m FROM MdGroups m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdGroups.findByCreatedOn", query = "SELECT m FROM MdGroups m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdGroups.findByCreatedBy", query = "SELECT m FROM MdGroups m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdGroups.findByLastUpdatedOn", query = "SELECT m FROM MdGroups m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdGroups.findByLastUpdatedBy", query = "SELECT m FROM MdGroups m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdGroups implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "GROUP_NAME", length = 4000)
    private String groupName;
    @Column(name = "GROUP_FLAG")
    private Character groupFlag;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Column(name = "NATIVE_KEY", length = 4000)
    private String nativeKey;
    @Column(name = "COMMENTS", length = 4000)
    private String comments;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupIdFk")
    private List<MdGroupPrivileges> mdGroupPrivilegesList;
    @JoinColumn(name = "SCHEMA_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdSchemas schemaIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupIdFk")
    private List<MdGroupMembers> mdGroupMembersList;
    @OneToMany(mappedBy = "groupMemberIdFk")
    private List<MdGroupMembers> mdGroupMembersList1;

    public MdGroups() {
    }

    public MdGroups(BigDecimal id) {
        this.id = id;
    }

    public MdGroups(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Character getGroupFlag() {
        return groupFlag;
    }

    public void setGroupFlag(Character groupFlag) {
        this.groupFlag = groupFlag;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public List<MdGroupPrivileges> getMdGroupPrivilegesList() {
        return mdGroupPrivilegesList;
    }

    public void setMdGroupPrivilegesList(List<MdGroupPrivileges> mdGroupPrivilegesList) {
        this.mdGroupPrivilegesList = mdGroupPrivilegesList;
    }

    public MdSchemas getSchemaIdFk() {
        return schemaIdFk;
    }

    public void setSchemaIdFk(MdSchemas schemaIdFk) {
        this.schemaIdFk = schemaIdFk;
    }

    public List<MdGroupMembers> getMdGroupMembersList() {
        return mdGroupMembersList;
    }

    public void setMdGroupMembersList(List<MdGroupMembers> mdGroupMembersList) {
        this.mdGroupMembersList = mdGroupMembersList;
    }

    public List<MdGroupMembers> getMdGroupMembersList1() {
        return mdGroupMembersList1;
    }

    public void setMdGroupMembersList1(List<MdGroupMembers> mdGroupMembersList1) {
        this.mdGroupMembersList1 = mdGroupMembersList1;
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
        if (!(object instanceof MdGroups)) {
            return false;
        }
        MdGroups other = (MdGroups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdGroups[ id=" + id + " ]";
    }
    
}
