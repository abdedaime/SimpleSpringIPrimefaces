package com.myapp.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myapp.entities.Produit;
import com.myapp.service.IServiceProduct;

/**
 * 
 * @author hicham-pc
 *
 */

/**
 * 
 * @author hicham-pc al 2éme solution pour injecter l'interface ServiceProduct
 * @ManagedBean()
 * @RequestScoped public class ManagedBeanProduit {
 * @ManagedProperty(#{"productdao" ) dans la classe ServiceProduct add to
 *                                 service("productdao" ) private serviceProduct
 *                                 daoproduit; //getters setters daoproduit
 * 
 *                                 }
 * 
 * 
 */

@Component
@RequestScoped
public class ManagedBeanProduit implements Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private IServiceProduct daoproduit;
	private List<Produit> produits;

	@PostConstruct
	public void init() {
		produits = daoproduit.findAall();
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	private Produit pr = new Produit();

	public Produit getPr() {
		return pr;
	}

	public void setPr(Produit pr) {
		this.pr = pr;
	}

	public void action() {

		daoproduit.add(pr);
		produits = daoproduit.findAall();

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Ajout", "."));
	}

}
