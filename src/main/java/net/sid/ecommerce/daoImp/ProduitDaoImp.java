package net.sid.ecommerce.daoImp;

import net.sid.ecommerce.dao.IproduitDao;
import net.sid.ecommerce.entities.Produit;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class ProduitDaoImp implements IproduitDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Produit ajouterProduit(Produit produit) {
        em.persist(produit);
        return produit;
    }

    @Override
    public List<Produit> listProduit() {
        Query req = em.createQuery("select p from Produit p");
        return req.getResultList();
    }

    @Override
    public List<Produit> listProduitParCategorie(Long idCategorie) {
        Query req = em.createQuery("select p from Produit p where p.categorie.idCategorie = :x");
        req.setParameter("x",idCategorie);
        return req.getResultList();
    }

    @Override
    public List<Produit> listProduitSelectionnes() {
        Query req = em.createQuery("select p from Produit p where p.selected = true");
        return req.getResultList();
    }

    @Override
    public List<Produit> listProduitParMotCle(String cle) {
        Query req = em.createQuery("select p from Produit p where p.designation like :x or p.description like :x");
        req.setParameter("x","%"+cle+"%");
        return req.getResultList();
    }

    @Override
    public Produit getProduit(Long idProduit) {
        return  em.find(Produit.class, idProduit);
    }

    @Override
    public void supprimerProduit(Long idProduit) {
        Produit produit = em.find(Produit.class, idProduit);
        em.remove(produit);
    }

    @Override
    public void modifierProduit(Produit produit) {
        em.merge(produit);
    }
}
