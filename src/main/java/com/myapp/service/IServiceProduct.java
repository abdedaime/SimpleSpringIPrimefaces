package com.myapp.service;

import java.util.List;

import com.myapp.entities.Produit;
/**
 * 
 * @author hicham-pc
 *
 */
public interface IServiceProduct {
	void add(Produit pr);

	List<Produit> findAall();
}
