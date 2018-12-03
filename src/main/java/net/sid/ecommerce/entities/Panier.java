package net.sid.ecommerce.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Panier implements Serializable {
	private Map<Long,LigneCommande> items = new HashMap<Long, LigneCommande>();
	 
	 public void addArticle(Produit produit) {
		 if(items.get(produit.getIdProduit())== null) {
			 LigneCommande ligneCommande = new LigneCommande();
			 ligneCommande.setQuantite(ligneCommande.getQuantite()+1);
			 ligneCommande.setPrix(produit.getPrix());
			 items.put(produit.getIdProduit(),ligneCommande);
		 }else {
			items.get(produit.getIdProduit()).
			setQuantite(items.get(produit.getIdProduit()).getQuantite()+1);
			items.get(produit.getIdProduit()).
			setPrix(items.get(produit.getIdProduit()).getPrix()+produit.getPrix());
		 }
	 }
	 public void removeArticle(Long idProduit) {
		 if(idProduit != null && items.get(idProduit)!= null) {
			 items.remove(idProduit);
		 }
	 }
	 
	 public Collection<LigneCommande> getItems() {
		 return items.values();
	 }
	 
	 public double getTotal() {
		 double total = 0;
		/* items.values().stream().forEach(value -> {
			  total+= value.getPrix()* value.getQuantite();
		 });
		 
	 }*/
		 for(LigneCommande lc : items.values()) {
			  total+= lc.getPrix()* lc.getQuantite();
		 }
		 return total;
	 }
}
