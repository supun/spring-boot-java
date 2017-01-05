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
@Table(name = "extinsformsdoc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Extinsformsdoc.findAll", query = "SELECT e FROM Extinsformsdoc e")
    , @NamedQuery(name = "Extinsformsdoc.findByVsldocid", query = "SELECT e FROM Extinsformsdoc e WHERE e.vsldocid = :vsldocid")
    , @NamedQuery(name = "Extinsformsdoc.findByFilename", query = "SELECT e FROM Extinsformsdoc e WHERE e.filename = :filename")
    , @NamedQuery(name = "Extinsformsdoc.findByFiletype", query = "SELECT e FROM Extinsformsdoc e WHERE e.filetype = :filetype")
    , @NamedQuery(name = "Extinsformsdoc.findByFilepath", query = "SELECT e FROM Extinsformsdoc e WHERE e.filepath = :filepath")
    , @NamedQuery(name = "Extinsformsdoc.findByFilesize", query = "SELECT e FROM Extinsformsdoc e WHERE e.filesize = :filesize")})
public class Extinsformsdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "vsldocid")
    private String vsldocid;
    @Column(name = "filename")
    private String filename;
    @Column(name = "filetype")
    private String filetype;
    @Column(name = "filepath")
    private String filepath;
    @Column(name = "filesize")
    private Integer filesize;
    @JoinColumn(name = "vslrefid", referencedColumnName = "vslrefid")
    @ManyToOne
    private Extinspectiondetails vslrefid;

    public Extinsformsdoc() {
    }

    public Extinsformsdoc(String vsldocid) {
        this.vsldocid = vsldocid;
    }

    public String getVsldocid() {
        return vsldocid;
    }

    public void setVsldocid(String vsldocid) {
        this.vsldocid = vsldocid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public Extinspectiondetails getVslrefid() {
        return vslrefid;
    }

    public void setVslrefid(Extinspectiondetails vslrefid) {
        this.vslrefid = vslrefid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vsldocid != null ? vsldocid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Extinsformsdoc)) {
            return false;
        }
        Extinsformsdoc other = (Extinsformsdoc) object;
        if ((this.vsldocid == null && other.vsldocid != null) || (this.vsldocid != null && !this.vsldocid.equals(other.vsldocid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Extinsformsdoc[ vsldocid=" + vsldocid + " ]";
    }
    
}
