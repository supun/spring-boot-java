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
@Table(name = "safetyoffice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safetyoffice.findAll", query = "SELECT s FROM Safetyoffice s")
    , @NamedQuery(name = "Safetyoffice.findById", query = "SELECT s FROM Safetyoffice s WHERE s.id = :id")
    , @NamedQuery(name = "Safetyoffice.findByGeneralsafety", query = "SELECT s FROM Safetyoffice s WHERE s.generalsafety = :generalsafety")
    , @NamedQuery(name = "Safetyoffice.findByDrillfeedback", query = "SELECT s FROM Safetyoffice s WHERE s.drillfeedback = :drillfeedback")
    , @NamedQuery(name = "Safetyoffice.findByHealthissue", query = "SELECT s FROM Safetyoffice s WHERE s.healthissue = :healthissue")
    , @NamedQuery(name = "Safetyoffice.findByCrewcomplaint", query = "SELECT s FROM Safetyoffice s WHERE s.crewcomplaint = :crewcomplaint")
    , @NamedQuery(name = "Safetyoffice.findByDatereviewed", query = "SELECT s FROM Safetyoffice s WHERE s.datereviewed = :datereviewed")
    , @NamedQuery(name = "Safetyoffice.findByName", query = "SELECT s FROM Safetyoffice s WHERE s.name = :name")
    , @NamedQuery(name = "Safetyoffice.findByRoleid", query = "SELECT s FROM Safetyoffice s WHERE s.roleid = :roleid")})
public class Safetyoffice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "generalsafety")
    private String generalsafety;
    @Column(name = "drillfeedback")
    private String drillfeedback;
    @Column(name = "healthissue")
    private String healthissue;
    @Column(name = "crewcomplaint")
    private String crewcomplaint;
    @Column(name = "datereviewed")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datereviewed;
    @Column(name = "name")
    private String name;
    @Column(name = "roleid")
    private String roleid;
    @JoinColumn(name = "safid", referencedColumnName = "safid")
    @ManyToOne
    private Safetymeetingmaster safid;

    public Safetyoffice() {
    }

    public Safetyoffice(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGeneralsafety() {
        return generalsafety;
    }

    public void setGeneralsafety(String generalsafety) {
        this.generalsafety = generalsafety;
    }

    public String getDrillfeedback() {
        return drillfeedback;
    }

    public void setDrillfeedback(String drillfeedback) {
        this.drillfeedback = drillfeedback;
    }

    public String getHealthissue() {
        return healthissue;
    }

    public void setHealthissue(String healthissue) {
        this.healthissue = healthissue;
    }

    public String getCrewcomplaint() {
        return crewcomplaint;
    }

    public void setCrewcomplaint(String crewcomplaint) {
        this.crewcomplaint = crewcomplaint;
    }

    public Date getDatereviewed() {
        return datereviewed;
    }

    public void setDatereviewed(Date datereviewed) {
        this.datereviewed = datereviewed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
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
        if (!(object instanceof Safetyoffice)) {
            return false;
        }
        Safetyoffice other = (Safetyoffice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safetyoffice[ id=" + id + " ]";
    }
    
}
