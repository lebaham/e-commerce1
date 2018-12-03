package net.sid.ecommerce.dao;

import net.sid.ecommerce.entities.Categorie;

import java.util.List;

public interface ICategorieDao {
    Categorie ajouterCategorie(Categorie categorie);
    List<Categorie> listCategorie();
    Categorie getCategorie(Long idCategorie);
    void supprimerCategorie(Long idCategorie);
    void modifierCategorie(Categorie categorie);
}
