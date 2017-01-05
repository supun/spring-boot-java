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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author supun
 */
@Embeddable
public class RskinitialriskPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "vslcode")
    private String vslcode;
    @Basic(optional = false)
    @Column(name = "hazardno")
    private String hazardno;

    public RskinitialriskPK() {
    }

    public RskinitialriskPK(int id, String vslcode, String hazardno) {
        this.id = id;
        this.vslcode = vslcode;
        this.hazardno = hazardno;
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

    public String getHazardno() {
        return hazardno;
    }

    public void setHazardno(String hazardno) {
        this.hazardno = hazardno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (vslcode != null ? vslcode.hashCode() : 0);
        hash += (hazardno != null ? hazardno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RskinitialriskPK)) {
            return false;
        }
        RskinitialriskPK other = (RskinitialriskPK) object;
        if (this.id != other.id) {
            return false;
        }
        if ((this.vslcode == null && other.vslcode != null) || (this.vslcode != null && !this.vslcode.equals(other.vslcode))) {
            return false;
        }
        if ((this.hazardno == null && other.hazardno != null) || (this.hazardno != null && !this.hazardno.equals(other.hazardno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.RskinitialriskPK[ id=" + id + ", vslcode=" + vslcode + ", hazardno=" + hazardno + " ]";
    }
    
}
