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
@Table(name = "naturedeficientmaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Naturedeficientmaster.findAll", query = "SELECT n FROM Naturedeficientmaster n")
    , @NamedQuery(name = "Naturedeficientmaster.findByNaturedeficode", query = "SELECT n FROM Naturedeficientmaster n WHERE n.naturedeficode = :naturedeficode")
    , @NamedQuery(name = "Naturedeficientmaster.findByDefiname", query = "SELECT n FROM Naturedeficientmaster n WHERE n.definame = :definame")
    , @NamedQuery(name = "Naturedeficientmaster.findByActiveStatus", query = "SELECT n FROM Naturedeficientmaster n WHERE n.activeStatus = :activeStatus")
    , @NamedQuery(name = "Naturedeficientmaster.findByCruser", query = "SELECT n FROM Naturedeficientmaster n WHERE n.cruser = :cruser")
    , @NamedQuery(name = "Naturedeficientmaster.findByCrdate", query = "SELECT n FROM Naturedeficientmaster n WHERE n.crdate = :crdate")
    , @NamedQuery(name = "Naturedeficientmaster.findByUpduser", query = "SELECT n FROM Naturedeficientmaster n WHERE n.upduser = :upduser")
    , @NamedQuery(name = "Naturedeficientmaster.findByUpddate", query = "SELECT n FROM Naturedeficientmaster n WHERE n.upddate = :upddate")})
public class Naturedeficientmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "naturedeficode")
    private String naturedeficode;
    @Column(name = "definame")
    private String definame;
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

    public Naturedeficientmaster() {
    }

    public Naturedeficientmaster(String naturedeficode) {
        this.naturedeficode = naturedeficode;
    }

    public String getNaturedeficode() {
        return naturedeficode;
    }

    public void setNaturedeficode(String naturedeficode) {
        this.naturedeficode = naturedeficode;
    }

    public String getDefiname() {
        return definame;
    }

    public void setDefiname(String definame) {
        this.definame = definame;
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
        hash += (naturedeficode != null ? naturedeficode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Naturedeficientmaster)) {
            return false;
        }
        Naturedeficientmaster other = (Naturedeficientmaster) object;
        if ((this.naturedeficode == null && other.naturedeficode != null) || (this.naturedeficode != null && !this.naturedeficode.equals(other.naturedeficode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Naturedeficientmaster[ naturedeficode=" + naturedeficode + " ]";
    }
    
}
