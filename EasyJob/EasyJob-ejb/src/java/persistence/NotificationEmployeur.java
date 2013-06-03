/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author celie
 */
@Entity
public class NotificationEmployeur implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String message;
    
    @ManyToOne
    private Employeur destinataire;
    
    @OneToOne
    private CandidatureAnnonce candidature;
    
    
    public NotificationEmployeur() {
        
    }
    
    public NotificationEmployeur(Employeur dest, CandidatureAnnonce cand, String m) {
        message = m;
        destinataire = dest;
        candidature = cand;
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
        if (!(object instanceof NotificationEmployeur)) {
            return false;
        }
        NotificationEmployeur other = (NotificationEmployeur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistance.NotificationEmployeur[ id=" + id + " ]";
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the destinataire
     */
    public Employeur getDestinataire() {
        return destinataire;
    }

    /**
     * @param destinataire the destinataire to set
     */
    public void setDestinataire(Employeur destinataire) {
        this.destinataire = destinataire;
    }

    /**
     * @return the candidature
     */
    public CandidatureAnnonce getCandidature() {
        return candidature;
    }

    /**
     * @param candidature the candidature to set
     */
    public void setCandidature(CandidatureAnnonce candidature) {
        this.candidature = candidature;
    }

}
