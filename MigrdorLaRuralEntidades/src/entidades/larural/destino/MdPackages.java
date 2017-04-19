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
@Table(name = "MD_PACKAGES")
@NamedQueries({
    @NamedQuery(name = "MdPackages.findAll", query = "SELECT m FROM MdPackages m"),
    @NamedQuery(name = "MdPackages.findById", query = "SELECT m FROM MdPackages m WHERE m.id = :id"),
    @NamedQuery(name = "MdPackages.findByName", query = "SELECT m FROM MdPackages m WHERE m.name = :name"),
    @NamedQuery(name = "MdPackages.findByNativeKey", query = "SELECT m FROM MdPackages m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdPackages.findByLanguage", query = "SELECT m FROM MdPackages m WHERE m.language = :language"),
    @NamedQuery(name = "MdPackages.findByComments", query = "SELECT m FROM MdPackages m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdPackages.findBySecurityGroupId", query = "SELECT m FROM MdPackages m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdPackages.findByCreatedOn", query = "SELECT m FROM MdPackages m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdPackages.findByCreatedBy", query = "SELECT m FROM MdPackages m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdPackages.findByLastUpdatedOn", query = "SELECT m FROM MdPackages m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdPackages.findByLastUpdatedBy", query = "SELECT m FROM MdPackages m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdPackages implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 4000)
    private String name;
    @Lob
    @Column(name = "PACKAGE_HEADER")
    private String packageHeader;
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
    @OneToMany(mappedBy = "packageIdFk")
    private List<MdStoredPrograms> mdStoredProgramsList;
    @JoinColumn(name = "SCHEMA_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdSchemas schemaIdFk;

    public MdPackages() {
    }

    public MdPackages(BigDecimal id) {
        this.id = id;
    }

    public MdPackages(BigDecimal id, String name, String language, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageHeader() {
        return packageHeader;
    }

    public void setPackageHeader(String packageHeader) {
        this.packageHeader = packageHeader;
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

    public List<MdStoredPrograms> getMdStoredProgramsList() {
        return mdStoredProgramsList;
    }

    public void setMdStoredProgramsList(List<MdStoredPrograms> mdStoredProgramsList) {
        this.mdStoredProgramsList = mdStoredProgramsList;
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
        if (!(object instanceof MdPackages)) {
            return false;
        }
        MdPackages other = (MdPackages) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdPackages[ id=" + id + " ]";
    }
    
}
