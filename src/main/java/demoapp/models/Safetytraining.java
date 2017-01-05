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
@Table(name = "safetytraining")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safetytraining.findAll", query = "SELECT s FROM Safetytraining s")
    , @NamedQuery(name = "Safetytraining.findById", query = "SELECT s FROM Safetytraining s WHERE s.id = :id")
    , @NamedQuery(name = "Safetytraining.findByTrainingtype", query = "SELECT s FROM Safetytraining s WHERE s.trainingtype = :trainingtype")
    , @NamedQuery(name = "Safetytraining.findByTraining", query = "SELECT s FROM Safetytraining s WHERE s.training = :training")
    , @NamedQuery(name = "Safetytraining.findByTrainingdate", query = "SELECT s FROM Safetytraining s WHERE s.trainingdate = :trainingdate")})
public class Safetytraining implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "trainingtype")
    private String trainingtype;
    @Column(name = "training")
    private String training;
    @Column(name = "trainingdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trainingdate;
    @JoinColumn(name = "safid", referencedColumnName = "safid")
    @ManyToOne
    private Safetymeetingmaster safid;

    public Safetytraining() {
    }

    public Safetytraining(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainingtype() {
        return trainingtype;
    }

    public void setTrainingtype(String trainingtype) {
        this.trainingtype = trainingtype;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public Date getTrainingdate() {
        return trainingdate;
    }

    public void setTrainingdate(Date trainingdate) {
        this.trainingdate = trainingdate;
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
        if (!(object instanceof Safetytraining)) {
            return false;
        }
        Safetytraining other = (Safetytraining) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safetytraining[ id=" + id + " ]";
    }
    
}
