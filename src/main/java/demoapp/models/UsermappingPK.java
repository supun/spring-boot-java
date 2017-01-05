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
public class UsermappingPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "ulid")
    private int ulid;

    public UsermappingPK() {
    }

    public UsermappingPK(int id, int ulid) {
        this.id = id;
        this.ulid = ulid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUlid() {
        return ulid;
    }

    public void setUlid(int ulid) {
        this.ulid = ulid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) ulid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsermappingPK)) {
            return false;
        }
        UsermappingPK other = (UsermappingPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.ulid != other.ulid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.UsermappingPK[ id=" + id + ", ulid=" + ulid + " ]";
    }
    
}
