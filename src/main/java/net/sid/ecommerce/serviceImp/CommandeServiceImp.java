package net.sid.ecommerce.serviceImp;

import net.sid.ecommerce.entities.Client;
import net.sid.ecommerce.entities.Commande;
import net.sid.ecommerce.entities.Panier;
import net.sid.ecommerce.service.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;

public class CommandeServiceImp implements ICommandeService {
    @Autowired
    private ICommandeService commandeService;
    @Override
    public Commande enregistrerCommande(Panier panier, Client client) {
        return commandeService.enregistrerCommande(panier, client);
    }
}
