package net.sid.ecommerce.serviceImp;

import net.sid.ecommerce.dao.IcommandeDao;
import net.sid.ecommerce.entities.Client;
import net.sid.ecommerce.entities.Commande;
import net.sid.ecommerce.entities.Panier;
import net.sid.ecommerce.service.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CommandeServiceImp implements ICommandeService {
    @Autowired
    private IcommandeDao commandeDao;
    @Override
    public Commande enregistrerCommande(Panier panier, Client client) {
        return commandeDao.enregistrerCommande(panier, client);
    }
}
