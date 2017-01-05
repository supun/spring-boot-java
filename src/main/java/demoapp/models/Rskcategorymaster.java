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
@Table(name = "rskcategorymaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rskcategorymaster.findAll", query = "SELECT r FROM Rskcategorymaster r")
    , @NamedQuery(name = "Rskcategorymaster.findByCatcode", query = "SELECT r FROM Rskcategorymaster r WHERE r.catcode = :catcode")
    , @NamedQuery(name = "Rskcategorymaster.findByCategoryname", query = "SELECT r FROM Rskcategorymaster r WHERE r.categoryname = :categoryname")
    , @NamedQuery(name = "Rskcategorymaster.findByActiveStatus", query = "SELECT r FROM Rskcategorymaster r WHERE r.activeStatus = :activeStatus")
    , @NamedQuery(name = "Rskcategorymaster.findByCruser", query = "SELECT r FROM Rskcategorymaster r WHERE r.cruser = :cruser")
    , @NamedQuery(name = "Rskcategorymaster.findByCrdate", query = "SELECT r FROM Rskcategorymaster r WHERE r.crdate = :crdate")
    , @NamedQuery(name = "Rskcategorymaster.findByUpduser", query = "SELECT r FROM Rskcategorymaster r WHERE r.upduser = :upduser")
    , @NamedQuery(name = "Rskcategorymaster.findByUpddate", query = "SELECT r FROM Rskcategorymaster r WHERE r.upddate = :upddate")})
public class Rskcategorymaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "catcode")
    private String catcode;
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

    public Rskcategorymaster() {
    }

    public Rskcategorymaster(String catcode) {
        this.catcode = catcode;
    }

    public String getCatcode() {
        return catcode;
    }

    public void setCatcode(String catcode) {
        this.catcode = catcode;
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
        hash += (catcode != null ? catcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rskcategorymaster)) {
            return false;
        }
        Rskcategorymaster other = (Rskcategorymaster) object;
        if ((this.catcode == null && other.catcode != null) || (this.catcode != null && !this.catcode.equals(other.catcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Rskcategorymaster[ catcode=" + catcode + " ]";
    }
    
}
