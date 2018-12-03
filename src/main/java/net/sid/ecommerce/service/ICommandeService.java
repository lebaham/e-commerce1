package net.sid.ecommerce.service;

import net.sid.ecommerce.entities.Client;
import net.sid.ecommerce.entities.Commande;
import net.sid.ecommerce.entities.Panier;

public interface ICommandeService {
    Commande enregistrerCommande(Panier panier, Client client);
}
