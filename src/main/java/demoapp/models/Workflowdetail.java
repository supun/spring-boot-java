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
@Table(name = "workflowdetail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Workflowdetail.findAll", query = "SELECT w FROM Workflowdetail w")
    , @NamedQuery(name = "Workflowdetail.findById", query = "SELECT w FROM Workflowdetail w WHERE w.id = :id")
    , @NamedQuery(name = "Workflowdetail.findByStage", query = "SELECT w FROM Workflowdetail w WHERE w.stage = :stage")
    , @NamedQuery(name = "Workflowdetail.findByRankid", query = "SELECT w FROM Workflowdetail w WHERE w.rankid = :rankid")
    , @NamedQuery(name = "Workflowdetail.findByType", query = "SELECT w FROM Workflowdetail w WHERE w.type = :type")})
public class Workflowdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "stage")
    private String stage;
    @Column(name = "rankid")
    private String rankid;
    @Column(name = "type")
    @Temporal(TemporalType.TIMESTAMP)
    private Date type;
    @JoinColumn(name = "wfmid", referencedColumnName = "wfmid")
    @ManyToOne
    private Workflowmaster wfmid;

    public Workflowdetail() {
    }

    public Workflowdetail(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getRankid() {
        return rankid;
    }

    public void setRankid(String rankid) {
        this.rankid = rankid;
    }

    public Date getType() {
        return type;
    }

    public void setType(Date type) {
        this.type = type;
    }

    public Workflowmaster getWfmid() {
        return wfmid;
    }

    public void setWfmid(Workflowmaster wfmid) {
        this.wfmid = wfmid;
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
        if (!(object instanceof Workflowdetail)) {
            return false;
        }
        Workflowdetail other = (Workflowdetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Workflowdetail[ id=" + id + " ]";
    }
    
}
