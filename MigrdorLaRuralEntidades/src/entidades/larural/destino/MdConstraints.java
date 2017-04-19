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
@Table(name = "MD_CONSTRAINTS")
@NamedQueries({
    @NamedQuery(name = "MdConstraints.findAll", query = "SELECT m FROM MdConstraints m"),
    @NamedQuery(name = "MdConstraints.findById", query = "SELECT m FROM MdConstraints m WHERE m.id = :id"),
    @NamedQuery(name = "MdConstraints.findByDeleteClause", query = "SELECT m FROM MdConstraints m WHERE m.deleteClause = :deleteClause"),
    @NamedQuery(name = "MdConstraints.findByName", query = "SELECT m FROM MdConstraints m WHERE m.name = :name"),
    @NamedQuery(name = "MdConstraints.findByConstraintType", query = "SELECT m FROM MdConstraints m WHERE m.constraintType = :constraintType"),
    @NamedQuery(name = "MdConstraints.findByReftableIdFk", query = "SELECT m FROM MdConstraints m WHERE m.reftableIdFk = :reftableIdFk"),
    @NamedQuery(name = "MdConstraints.findByLanguage", query = "SELECT m FROM MdConstraints m WHERE m.language = :language"),
    @NamedQuery(name = "MdConstraints.findByComments", query = "SELECT m FROM MdConstraints m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdConstraints.findBySecurityGroupId", query = "SELECT m FROM MdConstraints m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdConstraints.findByCreatedOn", query = "SELECT m FROM MdConstraints m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdConstraints.findByCreatedBy", query = "SELECT m FROM MdConstraints m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdConstraints.findByLastUpdatedOn", query = "SELECT m FROM MdConstraints m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdConstraints.findByLastUpdatedBy", query = "SELECT m FROM MdConstraints m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdConstraints implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "DELETE_CLAUSE", length = 4000)
    private String deleteClause;
    @Column(name = "NAME", length = 4000)
    private String name;
    @Column(name = "CONSTRAINT_TYPE", length = 4000)
    private String constraintType;
    @Column(name = "REFTABLE_ID_FK")
    private BigInteger reftableIdFk;
    @Lob
    @Column(name = "CONSTRAINT_TEXT")
    private String constraintText;
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
    @JoinColumn(name = "TABLE_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdTables tableIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "constraintIdFk")
    private List<MdConstraintDetails> mdConstraintDetailsList;

    public MdConstraints() {
    }

    public MdConstraints(BigDecimal id) {
        this.id = id;
    }

    public MdConstraints(BigDecimal id, String language, BigInteger securityGroupId, Date createdOn) {
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

    public String getDeleteClause() {
        return deleteClause;
    }

    public void setDeleteClause(String deleteClause) {
        this.deleteClause = deleteClause;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }

    public BigInteger getReftableIdFk() {
        return reftableIdFk;
    }

    public void setReftableIdFk(BigInteger reftableIdFk) {
        this.reftableIdFk = reftableIdFk;
    }

    public String getConstraintText() {
        return constraintText;
    }

    public void setConstraintText(String constraintText) {
        this.constraintText = constraintText;
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

    public MdTables getTableIdFk() {
        return tableIdFk;
    }

    public void setTableIdFk(MdTables tableIdFk) {
        this.tableIdFk = tableIdFk;
    }

    public List<MdConstraintDetails> getMdConstraintDetailsList() {
        return mdConstraintDetailsList;
    }

    public void setMdConstraintDetailsList(List<MdConstraintDetails> mdConstraintDetailsList) {
        this.mdConstraintDetailsList = mdConstraintDetailsList;
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
        if (!(object instanceof MdConstraints)) {
            return false;
        }
        MdConstraints other = (MdConstraints) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdConstraints[ id=" + id + " ]";
    }
    
}
