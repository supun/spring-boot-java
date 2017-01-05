/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author supun
 */
@Entity
@Table(name = "nearmisscategorymaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nearmisscategorymaster.findAll", query = "SELECT n FROM Nearmisscategorymaster n")
    , @NamedQuery(name = "Nearmisscategorymaster.findByCategorycode", query = "SELECT n FROM Nearmisscategorymaster n WHERE n.categorycode = :categorycode")
    , @NamedQuery(name = "Nearmisscategorymaster.findByCategoryname", query = "SELECT n FROM Nearmisscategorymaster n WHERE n.categoryname = :categoryname")
    , @NamedQuery(name = "Nearmisscategorymaster.findByActiveStatus", query = "SELECT n FROM Nearmisscategorymaster n WHERE n.activeStatus = :activeStatus")
    , @NamedQuery(name = "Nearmisscategorymaster.findByCruser", query = "SELECT n FROM Nearmisscategorymaster n WHERE n.cruser = :cruser")
    , @NamedQuery(name = "Nearmisscategorymaster.findByCrdate", query = "SELECT n FROM Nearmisscategorymaster n WHERE n.crdate = :crdate")
    , @NamedQuery(name = "Nearmisscategorymaster.findByUpduser", query = "SELECT n FROM Nearmisscategorymaster n WHERE n.upduser = :upduser")
    , @NamedQuery(name = "Nearmisscategorymaster.findByUpddate", query = "SELECT n FROM Nearmisscategorymaster n WHERE n.upddate = :upddate")})
public class Nearmisscategorymaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "categorycode")
    private String categorycode;
    @Column(name = "categoryname")
    private String categoryname;
    @Column(name = "active_status")
    private Character activeStatus;
    @Column(name = "cruser")
    private String cruser;
    @Column(name = "crdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdate;
    @Column(name = "upduser")
    private String upduser;
    @Column(name = "upddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date upddate;

    public Nearmisscategorymaster() {
    }

    public Nearmisscategorymaster(String categorycode) {
        this.categorycode = categorycode;
    }

    public String getCategorycode() {
        return categorycode;
    }

    public void setCategorycode(String categorycode) {
        this.categorycode = categorycode;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public Character getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Character activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getCruser() {
        return cruser;
    }

    public void setCruser(String cruser) {
        this.cruser = cruser;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public String getUpduser() {
        return upduser;
    }

    public void setUpduser(String upduser) {
        this.upduser = upduser;
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categorycode != null ? categorycode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nearmisscategorymaster)) {
            return false;
        }
        Nearmisscategorymaster other = (Nearmisscategorymaster) object;
        if ((this.categorycode == null && other.categorycode != null) || (this.categorycode != null && !this.categorycode.equals(other.categorycode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Nearmisscategorymaster[ categorycode=" + categorycode + " ]";
    }
    
}
