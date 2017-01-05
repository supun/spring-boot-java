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
@Table(name = "compmoduleindex")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compmoduleindex.findAll", query = "SELECT c FROM Compmoduleindex c")
    , @NamedQuery(name = "Compmoduleindex.findById", query = "SELECT c FROM Compmoduleindex c WHERE c.id = :id")
    , @NamedQuery(name = "Compmoduleindex.findByIdxvalue", query = "SELECT c FROM Compmoduleindex c WHERE c.idxvalue = :idxvalue")
    , @NamedQuery(name = "Compmoduleindex.findByIdxprefix", query = "SELECT c FROM Compmoduleindex c WHERE c.idxprefix = :idxprefix")
    , @NamedQuery(name = "Compmoduleindex.findByIdxpatern", query = "SELECT c FROM Compmoduleindex c WHERE c.idxpatern = :idxpatern")
    , @NamedQuery(name = "Compmoduleindex.findByActiveStatus", query = "SELECT c FROM Compmoduleindex c WHERE c.activeStatus = :activeStatus")
    , @NamedQuery(name = "Compmoduleindex.findByCruser", query = "SELECT c FROM Compmoduleindex c WHERE c.cruser = :cruser")
    , @NamedQuery(name = "Compmoduleindex.findByCrdate", query = "SELECT c FROM Compmoduleindex c WHERE c.crdate = :crdate")
    , @NamedQuery(name = "Compmoduleindex.findByUpduser", query = "SELECT c FROM Compmoduleindex c WHERE c.upduser = :upduser")
    , @NamedQuery(name = "Compmoduleindex.findByUpddate", query = "SELECT c FROM Compmoduleindex c WHERE c.upddate = :upddate")})
public class Compmoduleindex implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idxvalue")
    private Integer idxvalue;
    @Column(name = "idxprefix")
    private String idxprefix;
    @Column(name = "idxpatern")
    private Integer idxpatern;
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
    @JoinColumn(name = "compcode", referencedColumnName = "compcode")
    @ManyToOne
    private Componentcreation compcode;

    public Compmoduleindex() {
    }

    public Compmoduleindex(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdxvalue() {
        return idxvalue;
    }

    public void setIdxvalue(Integer idxvalue) {
        this.idxvalue = idxvalue;
    }

    public String getIdxprefix() {
        return idxprefix;
    }

    public void setIdxprefix(String idxprefix) {
        this.idxprefix = idxprefix;
    }

    public Integer getIdxpatern() {
        return idxpatern;
    }

    public void setIdxpatern(Integer idxpatern) {
        this.idxpatern = idxpatern;
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

    public Componentcreation getCompcode() {
        return compcode;
    }

    public void setCompcode(Componentcreation compcode) {
        this.compcode = compcode;
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
        if (!(object instanceof Compmoduleindex)) {
            return false;
        }
        Compmoduleindex other = (Compmoduleindex) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Compmoduleindex[ id=" + id + " ]";
    }
    
}
