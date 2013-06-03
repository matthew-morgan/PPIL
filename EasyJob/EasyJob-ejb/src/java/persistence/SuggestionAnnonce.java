/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author celie
 */
@Entity
public class SuggestionAnnonce implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne
    private Annonce annonce;
    
    @OneToOne
    private Candidat emetteur;
    
    @ManyToOne
    private  Candidat destinataire;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCreation;
    
    
    public SuggestionAnnonce() {
        
    }
    
    public SuggestionAnnonce(Annonce annonce, Candidat emetteur, Candidat destinataire) {
        this.annonce = annonce;
        this.emetteur = emetteur;
        this.destinataire = destinataire;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof SuggestionAnnonce)) {
            return false;
        }
        SuggestionAnnonce other = (SuggestionAnnonce) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistance.SuggestionAnnonce[ id=" + id + " ]";
    }

    /**
     * @return the annonce
     */
    public Annonce getAnnonce() {
        return annonce;
    }

    /**
     * @param annonce the annonce to set
     */
    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }

    /**
     * @return the emetteur
     */
    public Candidat getEmetteur() {
        return emetteur;
    }

    /**
     * @param emetteur the emetteur to set
     */
    public void setEmetteur(Candidat emetteur) {
        this.emetteur = emetteur;
    }

    /**
     * @return the destinataire
     */
    public Candidat getDestinataire() {
        return destinataire;
    }

    /**
     * @param destinataire the destinataire to set
     */
    public void setDestinataire(Candidat destinataire) {
        this.destinataire = destinataire;
    }

    /**
     * @return the dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    
}
