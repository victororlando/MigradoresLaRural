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
@Table(name = "MD_APPLICATIONS")
@NamedQueries({
    @NamedQuery(name = "MdApplications.findAll", query = "SELECT m FROM MdApplications m"),
    @NamedQuery(name = "MdApplications.findById", query = "SELECT m FROM MdApplications m WHERE m.id = :id"),
    @NamedQuery(name = "MdApplications.findByName", query = "SELECT m FROM MdApplications m WHERE m.name = :name"),
    @NamedQuery(name = "MdApplications.findByDescription", query = "SELECT m FROM MdApplications m WHERE m.description = :description"),
    @NamedQuery(name = "MdApplications.findByBaseDir", query = "SELECT m FROM MdApplications m WHERE m.baseDir = :baseDir"),
    @NamedQuery(name = "MdApplications.findByOutputDir", query = "SELECT m FROM MdApplications m WHERE m.outputDir = :outputDir"),
    @NamedQuery(name = "MdApplications.findByBackupDir", query = "SELECT m FROM MdApplications m WHERE m.backupDir = :backupDir"),
    @NamedQuery(name = "MdApplications.findByInplace", query = "SELECT m FROM MdApplications m WHERE m.inplace = :inplace"),
    @NamedQuery(name = "MdApplications.findBySecurityGroupId", query = "SELECT m FROM MdApplications m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdApplications.findByCreatedOn", query = "SELECT m FROM MdApplications m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdApplications.findByCreatedBy", query = "SELECT m FROM MdApplications m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdApplications.findByLastUpdatedOn", query = "SELECT m FROM MdApplications m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdApplications.findByLastUpdatedBy", query = "SELECT m FROM MdApplications m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdApplications implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "NAME", length = 4000)
    private String name;
    @Column(name = "DESCRIPTION", length = 4000)
    private String description;
    @Column(name = "BASE_DIR", length = 4000)
    private String baseDir;
    @Column(name = "OUTPUT_DIR", length = 4000)
    private String outputDir;
    @Column(name = "BACKUP_DIR", length = 4000)
    private String backupDir;
    @Column(name = "INPLACE")
    private BigInteger inplace;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicationsIdFk")
    private List<MdApplicationfiles> mdApplicationfilesList;
    @JoinColumn(name = "PROJECT_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdProjects projectIdFk;

    public MdApplications() {
    }

    public MdApplications(BigDecimal id) {
        this.id = id;
    }

    public MdApplications(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public String getBackupDir() {
        return backupDir;
    }

    public void setBackupDir(String backupDir) {
        this.backupDir = backupDir;
    }

    public BigInteger getInplace() {
        return inplace;
    }

    public void setInplace(BigInteger inplace) {
        this.inplace = inplace;
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

    public List<MdApplicationfiles> getMdApplicationfilesList() {
        return mdApplicationfilesList;
    }

    public void setMdApplicationfilesList(List<MdApplicationfiles> mdApplicationfilesList) {
        this.mdApplicationfilesList = mdApplicationfilesList;
    }

    public MdProjects getProjectIdFk() {
        return projectIdFk;
    }

    public void setProjectIdFk(MdProjects projectIdFk) {
        this.projectIdFk = projectIdFk;
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
        if (!(object instanceof MdApplications)) {
            return false;
        }
        MdApplications other = (MdApplications) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdApplications[ id=" + id + " ]";
    }
    
}
