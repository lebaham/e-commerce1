package net.sid.ecommerce.serviceImp;

import net.sid.ecommerce.entities.Categorie;
import net.sid.ecommerce.service.ICategorieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategorieServiceImp implements ICategorieService {

    @Autowired
    private ICategorieService categorieService;

    @Override
    public Categorie ajouterCategorie(Categorie categorie) {
        return categorieService.ajouterCategorie(categorie);
    }

    @Override
    public List<Categorie> listCategorie() {
        return categorieService.listCategorie();
    }

    @Override
    public Categorie getCategorie(Long idCategorie) {
        return categorieService.getCategorie(idCategorie);
    }

    @Override
    public void supprimerCategorie(Long idCategorie) {
        categorieService.supprimerCategorie(idCategorie);
    }

    @Override
    public void modifierCategorie(Categorie categorie) {
        categorieService.modifierCategorie(categorie);
    }
}
