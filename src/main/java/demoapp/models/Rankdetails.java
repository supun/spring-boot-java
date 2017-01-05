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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "rankdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rankdetails.findAll", query = "SELECT r FROM Rankdetails r")
    , @NamedQuery(name = "Rankdetails.findById", query = "SELECT r FROM Rankdetails r WHERE r.id = :id")
    , @NamedQuery(name = "Rankdetails.findByActiveStatus", query = "SELECT r FROM Rankdetails r WHERE r.activeStatus = :activeStatus")
    , @NamedQuery(name = "Rankdetails.findByCruser", query = "SELECT r FROM Rankdetails r WHERE r.cruser = :cruser")
    , @NamedQuery(name = "Rankdetails.findByCrdate", query = "SELECT r FROM Rankdetails r WHERE r.crdate = :crdate")
    , @NamedQuery(name = "Rankdetails.findByUpduser", query = "SELECT r FROM Rankdetails r WHERE r.upduser = :upduser")
    , @NamedQuery(name = "Rankdetails.findByUpddate", query = "SELECT r FROM Rankdetails r WHERE r.upddate = :upddate")})
public class Rankdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
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
    @JoinColumn(name = "depcode", referencedColumnName = "depcode")
    @ManyToOne
    private Departmentmaster depcode;
    @JoinColumn(name = "rankcode", referencedColumnName = "rankcode")
    @ManyToOne
    private Rankmaster rankcode;
    @JoinColumn(name = "rolecode", referencedColumnName = "rolecode")
    @ManyToOne
    private Rolemaster rolecode;

    public Rankdetails() {
    }

    public Rankdetails(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Departmentmaster getDepcode() {
        return depcode;
    }

    public void setDepcode(Departmentmaster depcode) {
        this.depcode = depcode;
    }

    public Rankmaster getRankcode() {
        return rankcode;
    }

    public void setRankcode(Rankmaster rankcode) {
        this.rankcode = rankcode;
    }

    public Rolemaster getRolecode() {
        return rolecode;
    }

    public void setRolecode(Rolemaster rolecode) {
        this.rolecode = rolecode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rankdetails)) {
            return false;
        }
        Rankdetails other = (Rankdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Rankdetails[ id=" + id + " ]";
    }
    
}
