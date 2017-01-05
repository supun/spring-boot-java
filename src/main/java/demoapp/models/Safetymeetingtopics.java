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
@Table(name = "safetymeetingtopics")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Safetymeetingtopics.findAll", query = "SELECT s FROM Safetymeetingtopics s")
    , @NamedQuery(name = "Safetymeetingtopics.findById", query = "SELECT s FROM Safetymeetingtopics s WHERE s.id = :id")
    , @NamedQuery(name = "Safetymeetingtopics.findByTopiccode", query = "SELECT s FROM Safetymeetingtopics s WHERE s.topiccode = :topiccode")
    , @NamedQuery(name = "Safetymeetingtopics.findByTopicdetail", query = "SELECT s FROM Safetymeetingtopics s WHERE s.topicdetail = :topicdetail")})
public class Safetymeetingtopics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "topiccode")
    private String topiccode;
    @Column(name = "topicdetail")
    private String topicdetail;
    @JoinColumn(name = "safid", referencedColumnName = "safid")
    @ManyToOne
    private Safetymeetingmaster safid;

    public Safetymeetingtopics() {
    }

    public Safetymeetingtopics(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopiccode() {
        return topiccode;
    }

    public void setTopiccode(String topiccode) {
        this.topiccode = topiccode;
    }

    public String getTopicdetail() {
        return topicdetail;
    }

    public void setTopicdetail(String topicdetail) {
        this.topicdetail = topicdetail;
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
        if (!(object instanceof Safetymeetingtopics)) {
            return false;
        }
        Safetymeetingtopics other = (Safetymeetingtopics) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Safetymeetingtopics[ id=" + id + " ]";
    }
    
}
