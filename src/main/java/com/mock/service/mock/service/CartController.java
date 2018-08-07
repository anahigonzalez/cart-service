package com.mock.service.mock.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	
	
	private ShoppingCart cart = new ShoppingCart();

	
	@RequestMapping(value = "/articles", method = RequestMethod.GET)
	public ShoppingCart articles() {
		return cart;
	}
	
	@RequestMapping(value = "/articles/{articleId}",  method = RequestMethod.GET)
	public String singleArticle(@PathVariable String articleId) {		
		return (cart.getArticles(Integer.parseInt(articleId)));	
	}
	
	
	@RequestMapping(value = "/articles/{articleId}", method = RequestMethod.PUT)
	public String updateArticle(@PathVariable String articleId) {		
		cart.updateArticles(Integer.parseInt(articleId),"item nuevo");	
		return HttpStatus.ACCEPTED.toString(); 
	}
	
	@RequestMapping(value = "/articles", method = RequestMethod.POST)
	public String createArticle() {		
		cart.addArticle("helado!");
		return HttpStatus.CREATED.toString();
	}
	
	@RequestMapping(value = "/articles/{articleId}", method = RequestMethod.DELETE)
	public String removeArticle(@PathVariable String articleId) {		
		cart.removeArticles(Integer.parseInt(articleId));;	
		return HttpStatus.NO_CONTENT.toString(); 
	}
}