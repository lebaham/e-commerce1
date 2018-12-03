package net.sid.ecommerce.daoImp;

import net.sid.ecommerce.dao.IcommandeDao;
import net.sid.ecommerce.entities.Client;
import net.sid.ecommerce.entities.Commande;
import net.sid.ecommerce.entities.Panier;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

public class CommandeDaoImp implements IcommandeDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Commande enregistrerCommande(Panier panier, Client client) {
        Client cl   = em.find(Client.class, client.getIdClient());
        if(cl==null){
            em.persist(client);
        }
        Commande commande = new Commande();
        commande.setClient(client);
        commande.setItems(panier.getItems());
        commande.setDateCommande(new Date());
        em.persist(commande);
        return commande;
    }
}
