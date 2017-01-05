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
@Table(name = "safetytopicmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safetytopicmaster.findAll", query = "SELECT s FROM Safetytopicmaster s")
    , @NamedQuery(name = "Safetytopicmaster.findById", query = "SELECT s FROM Safetytopicmaster s WHERE s.id = :id")
    , @NamedQuery(name = "Safetytopicmaster.findByTopiccode", query = "SELECT s FROM Safetytopicmaster s WHERE s.topiccode = :topiccode")
    , @NamedQuery(name = "Safetytopicmaster.findByTopicdetail", query = "SELECT s FROM Safetytopicmaster s WHERE s.topicdetail = :topicdetail")
    , @NamedQuery(name = "Safetytopicmaster.findByActiveStatus", query = "SELECT s FROM Safetytopicmaster s WHERE s.activeStatus = :activeStatus")
    , @NamedQuery(name = "Safetytopicmaster.findByCruser", query = "SELECT s FROM Safetytopicmaster s WHERE s.cruser = :cruser")
    , @NamedQuery(name = "Safetytopicmaster.findByCrdate", query = "SELECT s FROM Safetytopicmaster s WHERE s.crdate = :crdate")
    , @NamedQuery(name = "Safetytopicmaster.findByUpduser", query = "SELECT s FROM Safetytopicmaster s WHERE s.upduser = :upduser")
    , @NamedQuery(name = "Safetytopicmaster.findByUpddate", query = "SELECT s FROM Safetytopicmaster s WHERE s.upddate = :upddate")})
public class Safetytopicmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "topiccode")
    private String topiccode;
    @Column(name = "topicdetail")
    private String topicdetail;
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

    public Safetytopicmaster() {
    }

    public Safetytopicmaster(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopiccode() {
        return topiccode;
    }

    public void setTopiccode(String topiccode) {
        this.topiccode = topiccode;
    }

    public String getTopicdetail() {
        return topicdetail;
    }

    public void setTopicdetail(String topicdetail) {
        this.topicdetail = topicdetail;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Safetytopicmaster)) {
            return false;
        }
        Safetytopicmaster other = (Safetytopicmaster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safetytopicmaster[ id=" + id + " ]";
    }
    
}
