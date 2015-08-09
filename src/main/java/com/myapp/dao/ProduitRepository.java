package com.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.entities.Produit;


/**
 * 
 * @author hicham-pc
 *  JpaRepository  &(spring data jpa ) 
 */
public interface ProduitRepository   extends JpaRepository<Produit,  Integer>{

}
