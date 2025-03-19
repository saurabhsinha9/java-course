package com.jlcindia.hibernate;

public class Category {
	private int catId;
	private String catName;

	public Category() {
	}

	public Category(String catName) {
		this.catName = catName;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

}
