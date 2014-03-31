package ul.dateroulette.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Administrateur extends Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String pseudo;

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String id) {
        this.pseudo = pseudo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pseudo != null ? pseudo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the pseudo fields are not set
        if (!(object instanceof Administrateur)) {
            return false;
        }
        Administrateur other = (Administrateur) object;
        if ((this.pseudo == null && other.pseudo != null) || (this.pseudo != null && !this.pseudo.equals(other.pseudo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ul.dateroulette.entity.Administrateur[ pseudo=" + pseudo + " ]";
    }
    
}
