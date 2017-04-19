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
@Table(name = "MD_PRIVILEGES")
@NamedQueries({
    @NamedQuery(name = "MdPrivileges.findAll", query = "SELECT m FROM MdPrivileges m"),
    @NamedQuery(name = "MdPrivileges.findById", query = "SELECT m FROM MdPrivileges m WHERE m.id = :id"),
    @NamedQuery(name = "MdPrivileges.findByPrivilegeName", query = "SELECT m FROM MdPrivileges m WHERE m.privilegeName = :privilegeName"),
    @NamedQuery(name = "MdPrivileges.findByPrivelegeObjectId", query = "SELECT m FROM MdPrivileges m WHERE m.privelegeObjectId = :privelegeObjectId"),
    @NamedQuery(name = "MdPrivileges.findByPrivelegeobjecttype", query = "SELECT m FROM MdPrivileges m WHERE m.privelegeobjecttype = :privelegeobjecttype"),
    @NamedQuery(name = "MdPrivileges.findByPrivelegeType", query = "SELECT m FROM MdPrivileges m WHERE m.privelegeType = :privelegeType"),
    @NamedQuery(name = "MdPrivileges.findByAdminOption", query = "SELECT m FROM MdPrivileges m WHERE m.adminOption = :adminOption"),
    @NamedQuery(name = "MdPrivileges.findByNativeKey", query = "SELECT m FROM MdPrivileges m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdPrivileges.findByComments", query = "SELECT m FROM MdPrivileges m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdPrivileges.findBySecurityGroupId", query = "SELECT m FROM MdPrivileges m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdPrivileges.findByCreatedOn", query = "SELECT m FROM MdPrivileges m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdPrivileges.findByCreatedBy", query = "SELECT m FROM MdPrivileges m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdPrivileges.findByLastUpdatedOn", query = "SELECT m FROM MdPrivileges m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdPrivileges.findByLastUpdatedBy", query = "SELECT m FROM MdPrivileges m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdPrivileges implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "PRIVILEGE_NAME", nullable = false, length = 4000)
    private String privilegeName;
    @Column(name = "PRIVELEGE_OBJECT_ID")
    private BigInteger privelegeObjectId;
    @Basic(optional = false)
    @Column(name = "PRIVELEGEOBJECTTYPE", nullable = false, length = 4000)
    private String privelegeobjecttype;
    @Basic(optional = false)
    @Column(name = "PRIVELEGE_TYPE", nullable = false, length = 4000)
    private String privelegeType;
    @Column(name = "ADMIN_OPTION")
    private Character adminOption;
    @Basic(optional = false)
    @Lob
    @Column(name = "NATIVE_SQL", nullable = false)
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "privilegeIdFk")
    private List<MdGroupPrivileges> mdGroupPrivilegesList;
    @JoinColumn(name = "SCHEMA_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdSchemas schemaIdFk;
    @OneToMany(mappedBy = "privilegeIdFk")
    private List<MdUserPrivileges> mdUserPrivilegesList;

    public MdPrivileges() {
    }

    public MdPrivileges(BigDecimal id) {
        this.id = id;
    }

    public MdPrivileges(BigDecimal id, String privilegeName, String privelegeobjecttype, String privelegeType, String nativeSql, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.privilegeName = privilegeName;
        this.privelegeobjecttype = privelegeobjecttype;
        this.privelegeType = privelegeType;
        this.nativeSql = nativeSql;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public BigInteger getPrivelegeObjectId() {
        return privelegeObjectId;
    }

    public void setPrivelegeObjectId(BigInteger privelegeObjectId) {
        this.privelegeObjectId = privelegeObjectId;
    }

    public String getPrivelegeobjecttype() {
        return privelegeobjecttype;
    }

    public void setPrivelegeobjecttype(String privelegeobjecttype) {
        this.privelegeobjecttype = privelegeobjecttype;
    }

    public String getPrivelegeType() {
        return privelegeType;
    }

    public void setPrivelegeType(String privelegeType) {
        this.privelegeType = privelegeType;
    }

    public Character getAdminOption() {
        return adminOption;
    }

    public void setAdminOption(Character adminOption) {
        this.adminOption = adminOption;
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

    public List<MdUserPrivileges> getMdUserPrivilegesList() {
        return mdUserPrivilegesList;
    }

    public void setMdUserPrivilegesList(List<MdUserPrivileges> mdUserPrivilegesList) {
        this.mdUserPrivilegesList = mdUserPrivilegesList;
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
        if (!(object instanceof MdPrivileges)) {
            return false;
        }
        MdPrivileges other = (MdPrivileges) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdPrivileges[ id=" + id + " ]";
    }
    
}
