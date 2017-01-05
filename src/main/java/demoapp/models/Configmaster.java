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
@Table(name = "configmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Configmaster.findAll", query = "SELECT c FROM Configmaster c")
    , @NamedQuery(name = "Configmaster.findById", query = "SELECT c FROM Configmaster c WHERE c.id = :id")
    , @NamedQuery(name = "Configmaster.findByModulename", query = "SELECT c FROM Configmaster c WHERE c.modulename = :modulename")
    , @NamedQuery(name = "Configmaster.findByAttribute", query = "SELECT c FROM Configmaster c WHERE c.attribute = :attribute")
    , @NamedQuery(name = "Configmaster.findByValue", query = "SELECT c FROM Configmaster c WHERE c.value = :value")
    , @NamedQuery(name = "Configmaster.findByActiveStatus", query = "SELECT c FROM Configmaster c WHERE c.activeStatus = :activeStatus")
    , @NamedQuery(name = "Configmaster.findByCruser", query = "SELECT c FROM Configmaster c WHERE c.cruser = :cruser")
    , @NamedQuery(name = "Configmaster.findByCrdate", query = "SELECT c FROM Configmaster c WHERE c.crdate = :crdate")
    , @NamedQuery(name = "Configmaster.findByUpduser", query = "SELECT c FROM Configmaster c WHERE c.upduser = :upduser")
    , @NamedQuery(name = "Configmaster.findByUpddate", query = "SELECT c FROM Configmaster c WHERE c.upddate = :upddate")})
public class Configmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "modulename")
    private String modulename;
    @Column(name = "attribute")
    private String attribute;
    @Column(name = "value")
    private String value;
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

    public Configmaster() {
    }

    public Configmaster(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        if (!(object instanceof Configmaster)) {
            return false;
        }
        Configmaster other = (Configmaster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Configmaster[ id=" + id + " ]";
    }
    
}
