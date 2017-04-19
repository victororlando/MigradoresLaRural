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
public class BenefAsegVidaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COD_ASEG_VIDA", nullable = false)
    private int codAsegVida;
    @Basic(optional = false)
    @Column(name = "COD_BENEF", nullable = false)
    private int codBenef;

    public BenefAsegVidaPK() {
    }

    public BenefAsegVidaPK(int codAsegVida, int codBenef) {
        this.codAsegVida = codAsegVida;
        this.codBenef = codBenef;
    }

    public int getCodAsegVida() {
        return codAsegVida;
    }

    public void setCodAsegVida(int codAsegVida) {
        this.codAsegVida = codAsegVida;
    }

    public int getCodBenef() {
        return codBenef;
    }

    public void setCodBenef(int codBenef) {
        this.codBenef = codBenef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codAsegVida;
        hash += (int) codBenef;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BenefAsegVidaPK)) {
            return false;
        }
        BenefAsegVidaPK other = (BenefAsegVidaPK) object;
        if (this.codAsegVida != other.codAsegVida) {
            return false;
        }
        if (this.codBenef != other.codBenef) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.BenefAsegVidaPK[ codAsegVida=" + codAsegVida + ", codBenef=" + codBenef + " ]";
    }
    
}
