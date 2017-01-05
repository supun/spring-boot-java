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
@Table(name = "categorymaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorymaster.findAll", query = "SELECT c FROM Categorymaster c")
    , @NamedQuery(name = "Categorymaster.findByParentid", query = "SELECT c FROM Categorymaster c WHERE c.parentid = :parentid")
    , @NamedQuery(name = "Categorymaster.findByCategoryid", query = "SELECT c FROM Categorymaster c WHERE c.categoryid = :categoryid")
    , @NamedQuery(name = "Categorymaster.findByCategoryname", query = "SELECT c FROM Categorymaster c WHERE c.categoryname = :categoryname")
    , @NamedQuery(name = "Categorymaster.findByActiveStatus", query = "SELECT c FROM Categorymaster c WHERE c.activeStatus = :activeStatus")
    , @NamedQuery(name = "Categorymaster.findByCruser", query = "SELECT c FROM Categorymaster c WHERE c.cruser = :cruser")
    , @NamedQuery(name = "Categorymaster.findByCrdate", query = "SELECT c FROM Categorymaster c WHERE c.crdate = :crdate")
    , @NamedQuery(name = "Categorymaster.findByUpduser", query = "SELECT c FROM Categorymaster c WHERE c.upduser = :upduser")
    , @NamedQuery(name = "Categorymaster.findByUpddate", query = "SELECT c FROM Categorymaster c WHERE c.upddate = :upddate")})
public class Categorymaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "parentid")
    private String parentid;
    @Id
    @Basic(optional = false)
    @Column(name = "categoryid")
    private String categoryid;
    @Column(name = "categoryname")
    private String categoryname;
    @Column(name = "active_status")
    private String activeStatus;
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

    public Categorymaster() {
    }

    public Categorymaster(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
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
        hash += (categoryid != null ? categoryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorymaster)) {
            return false;
        }
        Categorymaster other = (Categorymaster) object;
        if ((this.categoryid == null && other.categoryid != null) || (this.categoryid != null && !this.categoryid.equals(other.categoryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Categorymaster[ categoryid=" + categoryid + " ]";
    }
    
}
