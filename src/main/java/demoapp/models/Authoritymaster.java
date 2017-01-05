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
@Table(name = "authoritymaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Authoritymaster.findAll", query = "SELECT a FROM Authoritymaster a")
    , @NamedQuery(name = "Authoritymaster.findByAuthoritycode", query = "SELECT a FROM Authoritymaster a WHERE a.authoritycode = :authoritycode")
    , @NamedQuery(name = "Authoritymaster.findByAuthorityname", query = "SELECT a FROM Authoritymaster a WHERE a.authorityname = :authorityname")
    , @NamedQuery(name = "Authoritymaster.findByActiveStatus", query = "SELECT a FROM Authoritymaster a WHERE a.activeStatus = :activeStatus")
    , @NamedQuery(name = "Authoritymaster.findByCruser", query = "SELECT a FROM Authoritymaster a WHERE a.cruser = :cruser")
    , @NamedQuery(name = "Authoritymaster.findByCrdate", query = "SELECT a FROM Authoritymaster a WHERE a.crdate = :crdate")
    , @NamedQuery(name = "Authoritymaster.findByUpduser", query = "SELECT a FROM Authoritymaster a WHERE a.upduser = :upduser")
    , @NamedQuery(name = "Authoritymaster.findByUpddate", query = "SELECT a FROM Authoritymaster a WHERE a.upddate = :upddate")})
public class Authoritymaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "authoritycode")
    private String authoritycode;
    @Column(name = "authorityname")
    private String authorityname;
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

    public Authoritymaster() {
    }

    public Authoritymaster(String authoritycode) {
        this.authoritycode = authoritycode;
    }

    public String getAuthoritycode() {
        return authoritycode;
    }

    public void setAuthoritycode(String authoritycode) {
        this.authoritycode = authoritycode;
    }

    public String getAuthorityname() {
        return authorityname;
    }

    public void setAuthorityname(String authorityname) {
        this.authorityname = authorityname;
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
        hash += (authoritycode != null ? authoritycode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Authoritymaster)) {
            return false;
        }
        Authoritymaster other = (Authoritymaster) object;
        if ((this.authoritycode == null && other.authoritycode != null) || (this.authoritycode != null && !this.authoritycode.equals(other.authoritycode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Authoritymaster[ authoritycode=" + authoritycode + " ]";
    }
    
}
