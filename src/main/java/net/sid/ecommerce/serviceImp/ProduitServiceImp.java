package net.sid.ecommerce.serviceImp;

import net.sid.ecommerce.dao.IproduitDao;
import net.sid.ecommerce.entities.Produit;
import net.sid.ecommerce.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class ProduitServiceImp implements IProduitService {
    @Autowired
    private IproduitDao produitDao;
    @Override
    public Produit ajouterProduit(Produit produit) {
        return produitDao.ajouterProduit(produit);
    }

    @Override
    public List<Produit> listProduit() {
        return produitDao.listProduit();
    }

    @Override
    public List<Produit> listProduitParCategorie(Long idCategorie) {
        return produitDao.listProduitParCategorie(idCategorie);
    }

    @Override
    public List<Produit> listProduitSelectionnes() {
        return produitDao.listProduitSelectionnes();
    }

    @Override
    public List<Produit> listProduitParMotCle(String cle) {
        return produitDao.listProduitParMotCle(cle);
    }

    @Override
    public Produit getProduit(Long idProduit) {
        return produitDao.getProduit(idProduit);
    }

    @Override
    public void supprimerProduit(Long idProduit) {
        produitDao.supprimerProduit(idProduit);
    }

    @Override
    public void modifierProduit(Produit produit) {
        produitDao.modifierProduit(produit);
    }
}
