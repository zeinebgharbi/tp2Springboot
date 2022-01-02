package com.zeineb.accessoires.service;

import java.util.List;

import com.zeineb.accessoires.entities.Accessoire;

public interface AccessoireService {
	Accessoire saveAccessoire(Accessoire a);
	Accessoire updateAccessoire(Accessoire a);
	void deleteAccessoire(Accessoire a);
	void deleteAccessoireById(Long id);
	Accessoire getAccessoire(Long id);
	List<Accessoire> getAllAccessoires();
	List<Accessoire> findByReferenceAccessoire(String reference);
	List<Accessoire> findByReferenceAccessoireContains(String reference);
	List<Accessoire> findByLabelPrix (String label, Double prix);
	//List<Accessoire>
	
	/*
	;
	
	List<Produit> findByCategorie (Categorie categorie);
	List<Produit> findByCategorieIdCat(Long id);
	List<Produit> findByOrderByNomProduitAsc();
	List<Produit> trierProduitsNomsPrix();*/


}
