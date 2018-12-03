package net.sid.ecommerce.service;

import net.sid.ecommerce.entities.Produit;

import java.util.List;

public interface IProduitService {
    Produit ajouterProduit(Produit produit);
    List<Produit> listProduit();
    List<Produit> listProduitParCategorie(Long idCategorie);
    List<Produit> listProduitSelectionnes();
    List<Produit> listProduitParMotCle(String cle);
    Produit getProduit(Long idProduit);
    void supprimerProduit(Long idProduit);
    void modifierProduit(Produit produit);
}
