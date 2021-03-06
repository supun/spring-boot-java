/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author supun
 */
@Entity
@Table(name = "shoremaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shoremaster.findAll", query = "SELECT s FROM Shoremaster s")
    , @NamedQuery(name = "Shoremaster.findByShorecode", query = "SELECT s FROM Shoremaster s WHERE s.shorecode = :shorecode")
    , @NamedQuery(name = "Shoremaster.findByShorename", query = "SELECT s FROM Shoremaster s WHERE s.shorename = :shorename")
    , @NamedQuery(name = "Shoremaster.findByActiveStatus", query = "SELECT s FROM Shoremaster s WHERE s.activeStatus = :activeStatus")
    , @NamedQuery(name = "Shoremaster.findByCruser", query = "SELECT s FROM Shoremaster s WHERE s.cruser = :cruser")
    , @NamedQuery(name = "Shoremaster.findByCrdate", query = "SELECT s FROM Shoremaster s WHERE s.crdate = :crdate")
    , @NamedQuery(name = "Shoremaster.findByUpduser", query = "SELECT s FROM Shoremaster s WHERE s.upduser = :upduser")
    , @NamedQuery(name = "Shoremaster.findByUpddate", query = "SELECT s FROM Shoremaster s WHERE s.upddate = :upddate")})
public class Shoremaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "shorecode")
    private String shorecode;
    @Column(name = "shorename")
    private String shorename;
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
    @OneToMany(mappedBy = "shorecode")
    private List<Vesselmaster> vesselmasterList;

    public Shoremaster() {
    }

    public Shoremaster(String shorecode) {
        this.shorecode = shorecode;
    }

    public String getShorecode() {
        return shorecode;
    }

    public void setShorecode(String shorecode) {
        this.shorecode = shorecode;
    }

    public String getShorename() {
        return shorename;
    }

    public void setShorename(String shorename) {
        this.shorename = shorename;
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

    @XmlTransient
    public List<Vesselmaster> getVesselmasterList() {
        return vesselmasterList;
    }

    public void setVesselmasterList(List<Vesselmaster> vesselmasterList) {
        this.vesselmasterList = vesselmasterList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shorecode != null ? shorecode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shoremaster)) {
            return false;
        }
        Shoremaster other = (Shoremaster) object;
        if ((this.shorecode == null && other.shorecode != null) || (this.shorecode != null && !this.shorecode.equals(other.shorecode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Shoremaster[ shorecode=" + shorecode + " ]";
    }
    
}
