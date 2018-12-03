package net.sid.ecommerce.service;

import net.sid.ecommerce.entities.Categorie;

import java.util.List;

public interface ICategorieService {
    Categorie ajouterCategorie(Categorie categorie);
    List<Categorie> listCategorie();
    Categorie getCategorie(Long idCategorie);
    void supprimerCategorie(Long idCategorie);
    void modifierCategorie(Categorie categorie);
}
