package net.sid.ecommerce.daoImp;

import net.sid.ecommerce.dao.ICategorieDao;
import net.sid.ecommerce.entities.Categorie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class CategorieDaoImp implements ICategorieDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Categorie ajouterCategorie(Categorie categorie) {
        em.persist(categorie);
        return categorie;
    }

    @Override
    public List<Categorie> listCategorie() {
        Query req = em.createQuery("select c from Categorie c ");
        return req.getResultList();
    }

    @Override
    public Categorie getCategorie(Long idCategorie) {
        return em.find(Categorie.class,idCategorie);
    }

    @Override
    public void supprimerCategorie(Long idCategorie) {
        Categorie categorie = em.find(Categorie.class,idCategorie);
        if(categorie != null) {
            em.remove(categorie);
        }
    }

    @Override
    public void modifierCategorie(Categorie categorie) {
        em.merge(categorie);
    }
}
