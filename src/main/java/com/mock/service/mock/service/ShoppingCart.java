package com.mock.service.mock.service;

import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<String> articles = new ArrayList<String>();
	
	//Constructors
	public ShoppingCart() {
		this.articles.add("bread");
		this.articles.add("cheese");
		this.articles.add("patty");
	};
	
	public ShoppingCart(String article) {
		this.articles.add(article);
	}
	
	public ShoppingCart(String... articles) {
		for(String art : articles)
			this.articles.add(art);
	}
	
	public String getArticles() {
		StringBuilder listedArticles = new StringBuilder(30);
		if (articles == null)
			return "no articles added to cart yet!";
		for(String art : articles)
			listedArticles.append(art + " ");
		return listedArticles.toString().trim();
	}
	
	public String getArticles(int index) {
		if (articles == null || articles.size() <= index)
			return "no articles with that index!";
		return this.articles.get(index);
	}
	
	public void addArticle(String article) {
		this.articles.add(article);
	}
	
	public void updateArticles(int index, String article) {
		if(index<articles.size())
			articles.set(index, article);
	}
	
	public void removeArticles(int index) {
		if(index<articles.size())
			articles.remove(index);
	}
}
