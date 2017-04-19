/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victoro
 */
@Embeddable
public class MdRegistryPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "OBJECT_TYPE", nullable = false, length = 30)
    private String objectType;
    @Basic(optional = false)
    @Column(name = "OBJECT_NAME", nullable = false, length = 30)
    private String objectName;

    public MdRegistryPK() {
    }

    public MdRegistryPK(String objectType, String objectName) {
        this.objectType = objectType;
        this.objectName = objectName;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (objectType != null ? objectType.hashCode() : 0);
        hash += (objectName != null ? objectName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdRegistryPK)) {
            return false;
        }
        MdRegistryPK other = (MdRegistryPK) object;
        if ((this.objectType == null && other.objectType != null) || (this.objectType != null && !this.objectType.equals(other.objectType))) {
            return false;
        }
        if ((this.objectName == null && other.objectName != null) || (this.objectName != null && !this.objectName.equals(other.objectName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdRegistryPK[ objectType=" + objectType + ", objectName=" + objectName + " ]";
    }
    
}
