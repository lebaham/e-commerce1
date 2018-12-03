package net.sid.ecommerce.serviceImp;

import net.sid.ecommerce.dao.ICategorieDao;
import net.sid.ecommerce.entities.Categorie;
import net.sid.ecommerce.service.ICategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class CategorieServiceImp implements ICategorieService {

    @Autowired
    private ICategorieDao categorieDao;

    @Override
    public Categorie ajouterCategorie(Categorie categorie) {
        return categorieDao.ajouterCategorie(categorie);
    }

    @Override
    public List<Categorie> listCategorie() {
        return categorieDao.listCategorie();
    }

    @Override
    public Categorie getCategorie(Long idCategorie) {
        return categorieDao.getCategorie(idCategorie);
    }

    @Override
    public void supprimerCategorie(Long idCategorie) {
        categorieDao.supprimerCategorie(idCategorie);
    }

    @Override
    public void modifierCategorie(Categorie categorie) {
        categorieDao.modifierCategorie(categorie);
    }
}
