/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victoro
 */
@Embeddable
public class ProfesionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TIPO_PROFESION", nullable = false)
    private short tipoProfesion;
    @Basic(optional = false)
    @Column(name = "PROFESION", nullable = false)
    private short profesion;

    public ProfesionPK() {
    }

    public ProfesionPK(short tipoProfesion, short profesion) {
        this.tipoProfesion = tipoProfesion;
        this.profesion = profesion;
    }

    public short getTipoProfesion() {
        return tipoProfesion;
    }

    public void setTipoProfesion(short tipoProfesion) {
        this.tipoProfesion = tipoProfesion;
    }

    public short getProfesion() {
        return profesion;
    }

    public void setProfesion(short profesion) {
        this.profesion = profesion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tipoProfesion;
        hash += (int) profesion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfesionPK)) {
            return false;
        }
        ProfesionPK other = (ProfesionPK) object;
        if (this.tipoProfesion != other.tipoProfesion) {
            return false;
        }
        if (this.profesion != other.profesion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ProfesionPK[ tipoProfesion=" + tipoProfesion + ", profesion=" + profesion + " ]";
    }
    
}
