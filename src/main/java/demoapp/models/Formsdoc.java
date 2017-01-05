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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author supun
 */
@Entity
@Table(name = "formsdoc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formsdoc.findAll", query = "SELECT f FROM Formsdoc f")
    , @NamedQuery(name = "Formsdoc.findByDocid", query = "SELECT f FROM Formsdoc f WHERE f.docid = :docid")
    , @NamedQuery(name = "Formsdoc.findByFilename", query = "SELECT f FROM Formsdoc f WHERE f.filename = :filename")
    , @NamedQuery(name = "Formsdoc.findByFiletype", query = "SELECT f FROM Formsdoc f WHERE f.filetype = :filetype")
    , @NamedQuery(name = "Formsdoc.findByFilesize", query = "SELECT f FROM Formsdoc f WHERE f.filesize = :filesize")
    , @NamedQuery(name = "Formsdoc.findByFilepath", query = "SELECT f FROM Formsdoc f WHERE f.filepath = :filepath")
    , @NamedQuery(name = "Formsdoc.findByFormid", query = "SELECT f FROM Formsdoc f WHERE f.formid = :formid")
    , @NamedQuery(name = "Formsdoc.findByModuleid", query = "SELECT f FROM Formsdoc f WHERE f.moduleid = :moduleid")})
public class Formsdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "docid")
    private Long docid;
    @Column(name = "filename")
    private String filename;
    @Column(name = "filetype")
    private String filetype;
    @Column(name = "filesize")
    private Integer filesize;
    @Column(name = "filepath")
    private String filepath;
    @Column(name = "formid")
    private String formid;
    @Column(name = "moduleid")
    private String moduleid;

    public Formsdoc() {
    }

    public Formsdoc(Long docid) {
        this.docid = docid;
    }

    public Long getDocid() {
        return docid;
    }

    public void setDocid(Long docid) {
        this.docid = docid;
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

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (docid != null ? docid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formsdoc)) {
            return false;
        }
        Formsdoc other = (Formsdoc) object;
        if ((this.docid == null && other.docid != null) || (this.docid != null && !this.docid.equals(other.docid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Formsdoc[ docid=" + docid + " ]";
    }
    
}
