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
import javax.persistence.Lob;
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
@Table(name = "MD_VIEWS")
@NamedQueries({
    @NamedQuery(name = "MdViews.findAll", query = "SELECT m FROM MdViews m"),
    @NamedQuery(name = "MdViews.findById", query = "SELECT m FROM MdViews m WHERE m.id = :id"),
    @NamedQuery(name = "MdViews.findByViewName", query = "SELECT m FROM MdViews m WHERE m.viewName = :viewName"),
    @NamedQuery(name = "MdViews.findByNativeKey", query = "SELECT m FROM MdViews m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdViews.findByLanguage", query = "SELECT m FROM MdViews m WHERE m.language = :language"),
    @NamedQuery(name = "MdViews.findByComments", query = "SELECT m FROM MdViews m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdViews.findByLinecount", query = "SELECT m FROM MdViews m WHERE m.linecount = :linecount"),
    @NamedQuery(name = "MdViews.findBySecurityGroupId", query = "SELECT m FROM MdViews m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdViews.findByCreatedOn", query = "SELECT m FROM MdViews m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdViews.findByCreatedBy", query = "SELECT m FROM MdViews m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdViews.findByLastUpdatedOn", query = "SELECT m FROM MdViews m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdViews.findByLastUpdatedBy", query = "SELECT m FROM MdViews m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdViews implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "VIEW_NAME", length = 4000)
    private String viewName;
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
    @JoinColumn(name = "SCHEMA_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdSchemas schemaIdFk;

    public MdViews() {
    }

    public MdViews(BigDecimal id) {
        this.id = id;
    }

    public MdViews(BigDecimal id, String language, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
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

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
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
        if (!(object instanceof MdViews)) {
            return false;
        }
        MdViews other = (MdViews) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdViews[ id=" + id + " ]";
    }
    
}
