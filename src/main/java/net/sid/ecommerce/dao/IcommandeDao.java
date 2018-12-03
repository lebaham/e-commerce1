package net.sid.ecommerce.dao;

import net.sid.ecommerce.entities.Client;
import net.sid.ecommerce.entities.Commande;
import net.sid.ecommerce.entities.Panier;

public interface IcommandeDao {
    Commande enregistrerCommande(Panier panier, Client client);
}
