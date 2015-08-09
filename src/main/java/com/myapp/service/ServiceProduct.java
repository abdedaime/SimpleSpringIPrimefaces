package com.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.dao.ProduitRepository;
import com.myapp.entities.Produit;
/**
 * 
 * @author hicham-pc
 *
 */
@Transactional
@Service
public class ServiceProduct  implements   IServiceProduct {
	@Autowired
   private ProduitRepository  produitRepository;
	@Override
	public void add(Produit pr) {
		// TODO Auto-generated method stub
		produitRepository.save(pr);
	}

	@Override
	public List<Produit> findAall() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}
	
	
}

