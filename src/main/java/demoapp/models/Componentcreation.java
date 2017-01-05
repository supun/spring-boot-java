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
@Table(name = "componentcreation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Componentcreation.findAll", query = "SELECT c FROM Componentcreation c")
    , @NamedQuery(name = "Componentcreation.findByCompcode", query = "SELECT c FROM Componentcreation c WHERE c.compcode = :compcode")
    , @NamedQuery(name = "Componentcreation.findByCompname", query = "SELECT c FROM Componentcreation c WHERE c.compname = :compname")
    , @NamedQuery(name = "Componentcreation.findByActiveStatus", query = "SELECT c FROM Componentcreation c WHERE c.activeStatus = :activeStatus")
    , @NamedQuery(name = "Componentcreation.findByCruser", query = "SELECT c FROM Componentcreation c WHERE c.cruser = :cruser")
    , @NamedQuery(name = "Componentcreation.findByCrdate", query = "SELECT c FROM Componentcreation c WHERE c.crdate = :crdate")
    , @NamedQuery(name = "Componentcreation.findByUpduser", query = "SELECT c FROM Componentcreation c WHERE c.upduser = :upduser")
    , @NamedQuery(name = "Componentcreation.findByUpddate", query = "SELECT c FROM Componentcreation c WHERE c.upddate = :upddate")})
public class Componentcreation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "compcode")
    private String compcode;
    @Column(name = "compname")
    private String compname;
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
    @OneToMany(mappedBy = "compcode")
    private List<Compmoduleindex> compmoduleindexList;
    @OneToMany(mappedBy = "compcode")
    private List<Componentdetails> componentdetailsList;

    public Componentcreation() {
    }

    public Componentcreation(String compcode) {
        this.compcode = compcode;
    }

    public String getCompcode() {
        return compcode;
    }

    public void setCompcode(String compcode) {
        this.compcode = compcode;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
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
    public List<Compmoduleindex> getCompmoduleindexList() {
        return compmoduleindexList;
    }

    public void setCompmoduleindexList(List<Compmoduleindex> compmoduleindexList) {
        this.compmoduleindexList = compmoduleindexList;
    }

    @XmlTransient
    public List<Componentdetails> getComponentdetailsList() {
        return componentdetailsList;
    }

    public void setComponentdetailsList(List<Componentdetails> componentdetailsList) {
        this.componentdetailsList = componentdetailsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compcode != null ? compcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Componentcreation)) {
            return false;
        }
        Componentcreation other = (Componentcreation) object;
        if ((this.compcode == null && other.compcode != null) || (this.compcode != null && !this.compcode.equals(other.compcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Componentcreation[ compcode=" + compcode + " ]";
    }
    
}
