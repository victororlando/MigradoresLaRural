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
@Table(name = "MD_USERS")
@NamedQueries({
    @NamedQuery(name = "MdUsers.findAll", query = "SELECT m FROM MdUsers m"),
    @NamedQuery(name = "MdUsers.findById", query = "SELECT m FROM MdUsers m WHERE m.id = :id"),
    @NamedQuery(name = "MdUsers.findByUsername", query = "SELECT m FROM MdUsers m WHERE m.username = :username"),
    @NamedQuery(name = "MdUsers.findByPassword", query = "SELECT m FROM MdUsers m WHERE m.password = :password"),
    @NamedQuery(name = "MdUsers.findByNativeKey", query = "SELECT m FROM MdUsers m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdUsers.findByComments", query = "SELECT m FROM MdUsers m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdUsers.findBySecurityGroupId", query = "SELECT m FROM MdUsers m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdUsers.findByCreatedOn", query = "SELECT m FROM MdUsers m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdUsers.findByCreatedBy", query = "SELECT m FROM MdUsers m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdUsers.findByLastUpdatedOn", query = "SELECT m FROM MdUsers m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdUsers.findByLastUpdatedBy", query = "SELECT m FROM MdUsers m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "USERNAME", nullable = false, length = 4000)
    private String username;
    @Column(name = "PASSWORD", length = 4000)
    private String password;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userIdFk")
    private List<MdUserPrivileges> mdUserPrivilegesList;
    @OneToMany(mappedBy = "userIdFk")
    private List<MdGroupMembers> mdGroupMembersList;
    @JoinColumn(name = "SCHEMA_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdSchemas schemaIdFk;

    public MdUsers() {
    }

    public MdUsers(BigDecimal id) {
        this.id = id;
    }

    public MdUsers(BigDecimal id, String username, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.username = username;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<MdUserPrivileges> getMdUserPrivilegesList() {
        return mdUserPrivilegesList;
    }

    public void setMdUserPrivilegesList(List<MdUserPrivileges> mdUserPrivilegesList) {
        this.mdUserPrivilegesList = mdUserPrivilegesList;
    }

    public List<MdGroupMembers> getMdGroupMembersList() {
        return mdGroupMembersList;
    }

    public void setMdGroupMembersList(List<MdGroupMembers> mdGroupMembersList) {
        this.mdGroupMembersList = mdGroupMembersList;
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
        if (!(object instanceof MdUsers)) {
            return false;
        }
        MdUsers other = (MdUsers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdUsers[ id=" + id + " ]";
    }
    
}
