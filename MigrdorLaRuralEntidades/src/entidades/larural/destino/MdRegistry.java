/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "MD_REGISTRY")
@NamedQueries({
    @NamedQuery(name = "MdRegistry.findAll", query = "SELECT m FROM MdRegistry m"),
    @NamedQuery(name = "MdRegistry.findByObjectType", query = "SELECT m FROM MdRegistry m WHERE m.mdRegistryPK.objectType = :objectType"),
    @NamedQuery(name = "MdRegistry.findByObjectName", query = "SELECT m FROM MdRegistry m WHERE m.mdRegistryPK.objectName = :objectName"),
    @NamedQuery(name = "MdRegistry.findByDescObjectName", query = "SELECT m FROM MdRegistry m WHERE m.descObjectName = :descObjectName")})
public class MdRegistry implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MdRegistryPK mdRegistryPK;
    @Column(name = "DESC_OBJECT_NAME", length = 30)
    private String descObjectName;

    public MdRegistry() {
    }

    public MdRegistry(MdRegistryPK mdRegistryPK) {
        this.mdRegistryPK = mdRegistryPK;
    }

    public MdRegistry(String objectType, String objectName) {
        this.mdRegistryPK = new MdRegistryPK(objectType, objectName);
    }

    public MdRegistryPK getMdRegistryPK() {
        return mdRegistryPK;
    }

    public void setMdRegistryPK(MdRegistryPK mdRegistryPK) {
        this.mdRegistryPK = mdRegistryPK;
    }

    public String getDescObjectName() {
        return descObjectName;
    }

    public void setDescObjectName(String descObjectName) {
        this.descObjectName = descObjectName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdRegistryPK != null ? mdRegistryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdRegistry)) {
            return false;
        }
        MdRegistry other = (MdRegistry) object;
        if ((this.mdRegistryPK == null && other.mdRegistryPK != null) || (this.mdRegistryPK != null && !this.mdRegistryPK.equals(other.mdRegistryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdRegistry[ mdRegistryPK=" + mdRegistryPK + " ]";
    }
    
}
