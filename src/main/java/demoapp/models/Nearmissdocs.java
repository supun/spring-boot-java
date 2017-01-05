/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoapp.models;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "nearmissdocs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nearmissdocs.findAll", query = "SELECT n FROM Nearmissdocs n")
    , @NamedQuery(name = "Nearmissdocs.findByNearmissno", query = "SELECT n FROM Nearmissdocs n WHERE n.nearmissno = :nearmissno")
    , @NamedQuery(name = "Nearmissdocs.findByDocid", query = "SELECT n FROM Nearmissdocs n WHERE n.docid = :docid")
    , @NamedQuery(name = "Nearmissdocs.findByFileName", query = "SELECT n FROM Nearmissdocs n WHERE n.fileName = :fileName")
    , @NamedQuery(name = "Nearmissdocs.findByFileSize", query = "SELECT n FROM Nearmissdocs n WHERE n.fileSize = :fileSize")
    , @NamedQuery(name = "Nearmissdocs.findByFileType", query = "SELECT n FROM Nearmissdocs n WHERE n.fileType = :fileType")
    , @NamedQuery(name = "Nearmissdocs.findByFilepath", query = "SELECT n FROM Nearmissdocs n WHERE n.filepath = :filepath")})
public class Nearmissdocs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nearmissno")
    private String nearmissno;
    @Column(name = "docid")
    private BigInteger docid;
    @Column(name = "fileName")
    private String fileName;
    @Column(name = "fileSize")
    private BigInteger fileSize;
    @Column(name = "fileType")
    private String fileType;
    @Column(name = "filepath")
    private String filepath;

    public Nearmissdocs() {
    }

    public Nearmissdocs(String nearmissno) {
        this.nearmissno = nearmissno;
    }

    public String getNearmissno() {
        return nearmissno;
    }

    public void setNearmissno(String nearmissno) {
        this.nearmissno = nearmissno;
    }

    public BigInteger getDocid() {
        return docid;
    }

    public void setDocid(BigInteger docid) {
        this.docid = docid;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BigInteger getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigInteger fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nearmissno != null ? nearmissno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nearmissdocs)) {
            return false;
        }
        Nearmissdocs other = (Nearmissdocs) object;
        if ((this.nearmissno == null && other.nearmissno != null) || (this.nearmissno != null && !this.nearmissno.equals(other.nearmissno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demoapp.models.Nearmissdocs[ nearmissno=" + nearmissno + " ]";
    }
    
}
