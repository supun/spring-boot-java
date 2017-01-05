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
public class RskriskcontrolPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
    @Column(name = "rcid")
    private int rcid;
    @Basic(optional = false)
    @Column(name = "rcvslcode")
    private String rcvslcode;

    public RskriskcontrolPK() {
    }

    public RskriskcontrolPK(int rcid, String rcvslcode) {
        this.rcid = rcid;
        this.rcvslcode = rcvslcode;
    }

    public int getRcid() {
        return rcid;
    }

    public void setRcid(int rcid) {
        this.rcid = rcid;
    }

    public String getRcvslcode() {
        return rcvslcode;
    }

    public void setRcvslcode(String rcvslcode) {
        this.rcvslcode = rcvslcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rcid;
        hash += (rcvslcode != null ? rcvslcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RskriskcontrolPK)) {
            return false;
        }
        RskriskcontrolPK other = (RskriskcontrolPK) object;
        if (this.rcid != other.rcid) {
            return false;
        }
        if ((this.rcvslcode == null && other.rcvslcode != null) || (this.rcvslcode != null && !this.rcvslcode.equals(other.rcvslcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.RskriskcontrolPK[ rcid=" + rcid + ", rcvslcode=" + rcvslcode + " ]";
    }
    
}
