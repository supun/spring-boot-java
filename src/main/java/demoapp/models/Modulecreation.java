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
@Table(name = "modulecreation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modulecreation.findAll", query = "SELECT m FROM Modulecreation m")
    , @NamedQuery(name = "Modulecreation.findByMdlcode", query = "SELECT m FROM Modulecreation m WHERE m.mdlcode = :mdlcode")
    , @NamedQuery(name = "Modulecreation.findByMdlname", query = "SELECT m FROM Modulecreation m WHERE m.mdlname = :mdlname")
    , @NamedQuery(name = "Modulecreation.findByActiveStatus", query = "SELECT m FROM Modulecreation m WHERE m.activeStatus = :activeStatus")
    , @NamedQuery(name = "Modulecreation.findByCruser", query = "SELECT m FROM Modulecreation m WHERE m.cruser = :cruser")
    , @NamedQuery(name = "Modulecreation.findByCrdate", query = "SELECT m FROM Modulecreation m WHERE m.crdate = :crdate")
    , @NamedQuery(name = "Modulecreation.findByUpduser", query = "SELECT m FROM Modulecreation m WHERE m.upduser = :upduser")
    , @NamedQuery(name = "Modulecreation.findByUpddate", query = "SELECT m FROM Modulecreation m WHERE m.upddate = :upddate")})
public class Modulecreation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "mdlcode")
    private String mdlcode;
    @Column(name = "mdlname")
    private String mdlname;
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
    @OneToMany(mappedBy = "mdlcode")
    private List<Moduleindex> moduleindexList;
    @OneToMany(mappedBy = "mdlcode")
    private List<Formmaster> formmasterList;
    @OneToMany(mappedBy = "mdlcode")
    private List<Componentdetails> componentdetailsList;

    public Modulecreation() {
    }

    public Modulecreation(String mdlcode) {
        this.mdlcode = mdlcode;
    }

    public String getMdlcode() {
        return mdlcode;
    }

    public void setMdlcode(String mdlcode) {
        this.mdlcode = mdlcode;
    }

    public String getMdlname() {
        return mdlname;
    }

    public void setMdlname(String mdlname) {
        this.mdlname = mdlname;
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

    @XmlTransient
    public List<Moduleindex> getModuleindexList() {
        return moduleindexList;
    }

    public void setModuleindexList(List<Moduleindex> moduleindexList) {
        this.moduleindexList = moduleindexList;
    }

    @XmlTransient
    public List<Formmaster> getFormmasterList() {
        return formmasterList;
    }

    public void setFormmasterList(List<Formmaster> formmasterList) {
        this.formmasterList = formmasterList;
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
        hash += (mdlcode != null ? mdlcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modulecreation)) {
            return false;
        }
        Modulecreation other = (Modulecreation) object;
        if ((this.mdlcode == null && other.mdlcode != null) || (this.mdlcode != null && !this.mdlcode.equals(other.mdlcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Modulecreation[ mdlcode=" + mdlcode + " ]";
    }
    
}
