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
@Table(name = "MD_INDEXES")
@NamedQueries({
    @NamedQuery(name = "MdIndexes.findAll", query = "SELECT m FROM MdIndexes m"),
    @NamedQuery(name = "MdIndexes.findById", query = "SELECT m FROM MdIndexes m WHERE m.id = :id"),
    @NamedQuery(name = "MdIndexes.findByIndexType", query = "SELECT m FROM MdIndexes m WHERE m.indexType = :indexType"),
    @NamedQuery(name = "MdIndexes.findByIndexName", query = "SELECT m FROM MdIndexes m WHERE m.indexName = :indexName"),
    @NamedQuery(name = "MdIndexes.findByNativeKey", query = "SELECT m FROM MdIndexes m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdIndexes.findByComments", query = "SELECT m FROM MdIndexes m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdIndexes.findBySecurityGroupId", query = "SELECT m FROM MdIndexes m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdIndexes.findByCreatedOn", query = "SELECT m FROM MdIndexes m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdIndexes.findByCreatedBy", query = "SELECT m FROM MdIndexes m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdIndexes.findByLastUpdatedOn", query = "SELECT m FROM MdIndexes m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdIndexes.findByLastUpdatedBy", query = "SELECT m FROM MdIndexes m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdIndexes implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "INDEX_TYPE", length = 4000)
    private String indexType;
    @Column(name = "INDEX_NAME", length = 4000)
    private String indexName;
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
    @Column(name = "LAST_UPDATED_BY", length = 4000)
    private String lastUpdatedBy;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "indexIdFk")
    private List<MdIndexDetails> mdIndexDetailsList;
    @JoinColumn(name = "TABLE_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdTables tableIdFk;

    public MdIndexes() {
    }

    public MdIndexes(BigDecimal id) {
        this.id = id;
    }

    public MdIndexes(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
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

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
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

    public List<MdIndexDetails> getMdIndexDetailsList() {
        return mdIndexDetailsList;
    }

    public void setMdIndexDetailsList(List<MdIndexDetails> mdIndexDetailsList) {
        this.mdIndexDetailsList = mdIndexDetailsList;
    }

    public MdTables getTableIdFk() {
        return tableIdFk;
    }

    public void setTableIdFk(MdTables tableIdFk) {
        this.tableIdFk = tableIdFk;
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
        if (!(object instanceof MdIndexes)) {
            return false;
        }
        MdIndexes other = (MdIndexes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdIndexes[ id=" + id + " ]";
    }
    
}
