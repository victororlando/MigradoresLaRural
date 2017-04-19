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
@Table(name = "MD_SCHEMAS")
@NamedQueries({
    @NamedQuery(name = "MdSchemas.findAll", query = "SELECT m FROM MdSchemas m"),
    @NamedQuery(name = "MdSchemas.findById", query = "SELECT m FROM MdSchemas m WHERE m.id = :id"),
    @NamedQuery(name = "MdSchemas.findByName", query = "SELECT m FROM MdSchemas m WHERE m.name = :name"),
    @NamedQuery(name = "MdSchemas.findByType", query = "SELECT m FROM MdSchemas m WHERE m.type = :type"),
    @NamedQuery(name = "MdSchemas.findByCharacterSet", query = "SELECT m FROM MdSchemas m WHERE m.characterSet = :characterSet"),
    @NamedQuery(name = "MdSchemas.findByVersionTag", query = "SELECT m FROM MdSchemas m WHERE m.versionTag = :versionTag"),
    @NamedQuery(name = "MdSchemas.findByNativeKey", query = "SELECT m FROM MdSchemas m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdSchemas.findByComments", query = "SELECT m FROM MdSchemas m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdSchemas.findBySecurityGroupId", query = "SELECT m FROM MdSchemas m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdSchemas.findByCreatedOn", query = "SELECT m FROM MdSchemas m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdSchemas.findByCreatedBy", query = "SELECT m FROM MdSchemas m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdSchemas.findByLastUpdatedOn", query = "SELECT m FROM MdSchemas m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdSchemas.findByLastUpdatedBy", query = "SELECT m FROM MdSchemas m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdSchemas implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "NAME", length = 4000)
    private String name;
    @Column(name = "TYPE")
    private Character type;
    @Column(name = "CHARACTER_SET", length = 4000)
    private String characterSet;
    @Column(name = "VERSION_TAG", length = 40)
    private String versionTag;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdUserDefinedDataTypes> mdUserDefinedDataTypesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdSequences> mdSequencesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdPrivileges> mdPrivilegesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdOtherObjects> mdOtherObjectsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdTables> mdTablesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdSynonyms> mdSynonymsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdGroups> mdGroupsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdMigrWeakdep> mdMigrWeakdepList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdStoredPrograms> mdStoredProgramsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdTablespaces> mdTablespacesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdViews> mdViewsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdPackages> mdPackagesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk")
    private List<MdUsers> mdUsersList;
    @JoinColumn(name = "CATALOG_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdCatalogs catalogIdFk;

    public MdSchemas() {
    }

    public MdSchemas(BigDecimal id) {
        this.id = id;
    }

    public MdSchemas(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    public String getVersionTag() {
        return versionTag;
    }

    public void setVersionTag(String versionTag) {
        this.versionTag = versionTag;
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

    public List<MdUserDefinedDataTypes> getMdUserDefinedDataTypesList() {
        return mdUserDefinedDataTypesList;
    }

    public void setMdUserDefinedDataTypesList(List<MdUserDefinedDataTypes> mdUserDefinedDataTypesList) {
        this.mdUserDefinedDataTypesList = mdUserDefinedDataTypesList;
    }

    public List<MdSequences> getMdSequencesList() {
        return mdSequencesList;
    }

    public void setMdSequencesList(List<MdSequences> mdSequencesList) {
        this.mdSequencesList = mdSequencesList;
    }

    public List<MdPrivileges> getMdPrivilegesList() {
        return mdPrivilegesList;
    }

    public void setMdPrivilegesList(List<MdPrivileges> mdPrivilegesList) {
        this.mdPrivilegesList = mdPrivilegesList;
    }

    public List<MdOtherObjects> getMdOtherObjectsList() {
        return mdOtherObjectsList;
    }

    public void setMdOtherObjectsList(List<MdOtherObjects> mdOtherObjectsList) {
        this.mdOtherObjectsList = mdOtherObjectsList;
    }

    public List<MdTables> getMdTablesList() {
        return mdTablesList;
    }

    public void setMdTablesList(List<MdTables> mdTablesList) {
        this.mdTablesList = mdTablesList;
    }

    public List<MdSynonyms> getMdSynonymsList() {
        return mdSynonymsList;
    }

    public void setMdSynonymsList(List<MdSynonyms> mdSynonymsList) {
        this.mdSynonymsList = mdSynonymsList;
    }

    public List<MdGroups> getMdGroupsList() {
        return mdGroupsList;
    }

    public void setMdGroupsList(List<MdGroups> mdGroupsList) {
        this.mdGroupsList = mdGroupsList;
    }

    public List<MdMigrWeakdep> getMdMigrWeakdepList() {
        return mdMigrWeakdepList;
    }

    public void setMdMigrWeakdepList(List<MdMigrWeakdep> mdMigrWeakdepList) {
        this.mdMigrWeakdepList = mdMigrWeakdepList;
    }

    public List<MdStoredPrograms> getMdStoredProgramsList() {
        return mdStoredProgramsList;
    }

    public void setMdStoredProgramsList(List<MdStoredPrograms> mdStoredProgramsList) {
        this.mdStoredProgramsList = mdStoredProgramsList;
    }

    public List<MdTablespaces> getMdTablespacesList() {
        return mdTablespacesList;
    }

    public void setMdTablespacesList(List<MdTablespaces> mdTablespacesList) {
        this.mdTablespacesList = mdTablespacesList;
    }

    public List<MdViews> getMdViewsList() {
        return mdViewsList;
    }

    public void setMdViewsList(List<MdViews> mdViewsList) {
        this.mdViewsList = mdViewsList;
    }

    public List<MdPackages> getMdPackagesList() {
        return mdPackagesList;
    }

    public void setMdPackagesList(List<MdPackages> mdPackagesList) {
        this.mdPackagesList = mdPackagesList;
    }

    public List<MdUsers> getMdUsersList() {
        return mdUsersList;
    }

    public void setMdUsersList(List<MdUsers> mdUsersList) {
        this.mdUsersList = mdUsersList;
    }

    public MdCatalogs getCatalogIdFk() {
        return catalogIdFk;
    }

    public void setCatalogIdFk(MdCatalogs catalogIdFk) {
        this.catalogIdFk = catalogIdFk;
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
        if (!(object instanceof MdSchemas)) {
            return false;
        }
        MdSchemas other = (MdSchemas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdSchemas[ id=" + id + " ]";
    }
    
}
