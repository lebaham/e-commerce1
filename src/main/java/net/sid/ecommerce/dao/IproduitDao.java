package net.sid.ecommerce.dao;

import net.sid.ecommerce.entities.Produit;

import java.util.List;

public interface IproduitDao {
    Produit ajouterProduit(Produit produit);
    List<Produit> listProduit();
    List<Produit> listProduitParCategorie(Long idCategorie);
    List<Produit> listProduitSelectionnes();
    List<Produit> listProduitParMotCle(String cle);
    Produit getProduit(Long idProduit);
    void supprimerProduit(Long idProduit);
    void modifierProduit(Produit produit);
}
