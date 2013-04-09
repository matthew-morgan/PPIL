/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import interfaces.AnnonceLocal;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persistence.Annonce;

/**
 *
 * @author Marie
 */

@Stateless
@LocalBean
public class AnnonceEJB implements AnnonceLocal{
    
    @PersistenceContext(unitName = "EasyJob-PU")
    private EntityManager em;

    @Override
    public Annonce getAnnonceById(long id){
        Annonce a = em.find(Annonce.class, id);
        return a ;
    }
}
