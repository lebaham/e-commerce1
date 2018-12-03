package net.sid.ecommerce.serviceImp;

import net.sid.ecommerce.entities.Produit;
import net.sid.ecommerce.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProduitServiceImp implements IProduitService {
    @Autowired
    private IProduitService produitService;
    @Override
    public Produit ajouterProduit(Produit produit) {
        return produitService.ajouterProduit(produit);
    }

    @Override
    public List<Produit> listProduit() {
        return produitService.listProduit();
    }

    @Override
    public List<Produit> listProduitParCategorie(Long idCategorie) {
        return produitService.listProduitParCategorie(idCategorie);
    }

    @Override
    public List<Produit> listProduitSelectionnes() {
        return produitService.listProduitSelectionnes();
    }

    @Override
    public List<Produit> listProduitParMotCle(String cle) {
        return produitService.listProduitParMotCle(cle);
    }

    @Override
    public Produit getProduit(Long idProduit) {
        return produitService.getProduit(idProduit);
    }

    @Override
    public void supprimerProduit(Long idProduit) {
        produitService.supprimerProduit(idProduit);
    }

    @Override
    public void modifierProduit(Produit produit) {
        produitService.modifierProduit(produit);
    }
}
