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
@Table(name = "causemaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Causemaster.findAll", query = "SELECT c FROM Causemaster c")
    , @NamedQuery(name = "Causemaster.findByCausecode", query = "SELECT c FROM Causemaster c WHERE c.causecode = :causecode")
    , @NamedQuery(name = "Causemaster.findByCausetype", query = "SELECT c FROM Causemaster c WHERE c.causetype = :causetype")
    , @NamedQuery(name = "Causemaster.findByCausedesc", query = "SELECT c FROM Causemaster c WHERE c.causedesc = :causedesc")
    , @NamedQuery(name = "Causemaster.findByActiveStatus", query = "SELECT c FROM Causemaster c WHERE c.activeStatus = :activeStatus")
    , @NamedQuery(name = "Causemaster.findByCruser", query = "SELECT c FROM Causemaster c WHERE c.cruser = :cruser")
    , @NamedQuery(name = "Causemaster.findByCrdate", query = "SELECT c FROM Causemaster c WHERE c.crdate = :crdate")
    , @NamedQuery(name = "Causemaster.findByUpduser", query = "SELECT c FROM Causemaster c WHERE c.upduser = :upduser")
    , @NamedQuery(name = "Causemaster.findByUpddate", query = "SELECT c FROM Causemaster c WHERE c.upddate = :upddate")})
public class Causemaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "causecode")
    private String causecode;
    @Basic(optional = false)
    @Column(name = "causetype")
    private int causetype;
    @Column(name = "causedesc")
    private String causedesc;
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

    public Causemaster() {
    }

    public Causemaster(String causecode) {
        this.causecode = causecode;
    }

    public Causemaster(String causecode, int causetype) {
        this.causecode = causecode;
        this.causetype = causetype;
    }

    public String getCausecode() {
        return causecode;
    }

    public void setCausecode(String causecode) {
        this.causecode = causecode;
    }

    public int getCausetype() {
        return causetype;
    }

    public void setCausetype(int causetype) {
        this.causetype = causetype;
    }

    public String getCausedesc() {
        return causedesc;
    }

    public void setCausedesc(String causedesc) {
        this.causedesc = causedesc;
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
        hash += (causecode != null ? causecode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Causemaster)) {
            return false;
        }
        Causemaster other = (Causemaster) object;
        if ((this.causecode == null && other.causecode != null) || (this.causecode != null && !this.causecode.equals(other.causecode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Causemaster[ causecode=" + causecode + " ]";
    }
    
}
