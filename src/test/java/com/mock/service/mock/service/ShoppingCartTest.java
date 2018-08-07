package com.mock.service.mock.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingCartTest {
	
	@Test
	public void getArticle() {
		ShoppingCart testCart = new ShoppingCart();
		
		assertEquals("bread", testCart.getArticles(0));
	}
	@Test
	public void getArticles() {
		ShoppingCart testCart = new ShoppingCart();
		
		assertNotNull(testCart.getArticles());
	}
}
