package com.myapp.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.entities.Produit;
import com.myapp.service.ServiceProduct;
/**
 * 
 * @author hicham-pc
 *
 */

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/META-INF/applicationContext.xml")
public class DbunitProduit {
	@Autowired
	private ServiceProduct produitRepository;

	@Test
	public void test() {

		Produit pr = new Produit("produit2", 12.0);
		 produitRepository.add(pr);
		// produitRepository.flush();
		List<Produit> all = produitRepository.findAall();

		for (Produit pre : all) {
			System.out.println(pre.getName());
		}

		// assertEquals(all.size(), 2);
	}

}
