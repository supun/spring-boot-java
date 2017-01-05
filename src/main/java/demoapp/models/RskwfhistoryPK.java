/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author supun
 */
@Embeddable
public class RskwfhistoryPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "vslcode")
    private String vslcode;

    public RskwfhistoryPK() {
    }

    public RskwfhistoryPK(int id, String vslcode) {
        this.id = id;
        this.vslcode = vslcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVslcode() {
        return vslcode;
    }

    public void setVslcode(String vslcode) {
        this.vslcode = vslcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (vslcode != null ? vslcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RskwfhistoryPK)) {
            return false;
        }
        RskwfhistoryPK other = (RskwfhistoryPK) object;
        if (this.id != other.id) {
            return false;
        }
        if ((this.vslcode == null && other.vslcode != null) || (this.vslcode != null && !this.vslcode.equals(other.vslcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.RskwfhistoryPK[ id=" + id + ", vslcode=" + vslcode + " ]";
    }
    
}
