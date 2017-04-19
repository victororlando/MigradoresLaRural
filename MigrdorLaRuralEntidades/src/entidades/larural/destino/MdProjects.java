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
@Table(name = "MD_PROJECTS")
@NamedQueries({
    @NamedQuery(name = "MdProjects.findAll", query = "SELECT m FROM MdProjects m"),
    @NamedQuery(name = "MdProjects.findById", query = "SELECT m FROM MdProjects m WHERE m.id = :id"),
    @NamedQuery(name = "MdProjects.findByProjectName", query = "SELECT m FROM MdProjects m WHERE m.projectName = :projectName"),
    @NamedQuery(name = "MdProjects.findByComments", query = "SELECT m FROM MdProjects m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdProjects.findBySecurityGroupId", query = "SELECT m FROM MdProjects m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdProjects.findByCreatedOn", query = "SELECT m FROM MdProjects m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdProjects.findByCreatedBy", query = "SELECT m FROM MdProjects m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdProjects.findByLastUpdatedOn", query = "SELECT m FROM MdProjects m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdProjects.findByLastUpdatedBy", query = "SELECT m FROM MdProjects m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdProjects implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "PROJECT_NAME", nullable = false, length = 4000)
    private String projectName;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projectIdFk")
    private List<MdConnections> mdConnectionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projectIdFk")
    private List<MdApplications> mdApplicationsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projectIdFk")
    private List<MigrDatatypeTransformMap> migrDatatypeTransformMapList;

    public MdProjects() {
    }

    public MdProjects(BigDecimal id) {
        this.id = id;
    }

    public MdProjects(BigDecimal id, String projectName, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.projectName = projectName;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public List<MdConnections> getMdConnectionsList() {
        return mdConnectionsList;
    }

    public void setMdConnectionsList(List<MdConnections> mdConnectionsList) {
        this.mdConnectionsList = mdConnectionsList;
    }

    public List<MdApplications> getMdApplicationsList() {
        return mdApplicationsList;
    }

    public void setMdApplicationsList(List<MdApplications> mdApplicationsList) {
        this.mdApplicationsList = mdApplicationsList;
    }

    public List<MigrDatatypeTransformMap> getMigrDatatypeTransformMapList() {
        return migrDatatypeTransformMapList;
    }

    public void setMigrDatatypeTransformMapList(List<MigrDatatypeTransformMap> migrDatatypeTransformMapList) {
        this.migrDatatypeTransformMapList = migrDatatypeTransformMapList;
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
        if (!(object instanceof MdProjects)) {
            return false;
        }
        MdProjects other = (MdProjects) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdProjects[ id=" + id + " ]";
    }
    
}
