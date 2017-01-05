/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author supun
 */
@Entity
@Table(name = "safetycommittee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safetycommittee.findAll", query = "SELECT s FROM Safetycommittee s")
    , @NamedQuery(name = "Safetycommittee.findById", query = "SELECT s FROM Safetycommittee s WHERE s.id = :id")
    , @NamedQuery(name = "Safetycommittee.findByRoleid", query = "SELECT s FROM Safetycommittee s WHERE s.roleid = :roleid")
    , @NamedQuery(name = "Safetycommittee.findByName", query = "SELECT s FROM Safetycommittee s WHERE s.name = :name")
    , @NamedQuery(name = "Safetycommittee.findBySignpath", query = "SELECT s FROM Safetycommittee s WHERE s.signpath = :signpath")})
public class Safetycommittee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "roleid")
    private String roleid;
    @Column(name = "name")
    private String name;
    @Column(name = "signpath")
    private String signpath;
    @JoinColumn(name = "safid", referencedColumnName = "safid")
    @ManyToOne
    private Safetymeetingmaster safid;

    public Safetycommittee() {
    }

    public Safetycommittee(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSignpath() {
        return signpath;
    }

    public void setSignpath(String signpath) {
        this.signpath = signpath;
    }

    public Safetymeetingmaster getSafid() {
        return safid;
    }

    public void setSafid(Safetymeetingmaster safid) {
        this.safid = safid;
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
        if (!(object instanceof Safetycommittee)) {
            return false;
        }
        Safetycommittee other = (Safetycommittee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safetycommittee[ id=" + id + " ]";
    }
    
}
