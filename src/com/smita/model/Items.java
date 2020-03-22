package com.smita.model;

public enum Items {
	COKE("coke",25),PEPSI("pepsi",35),SODA("soda",45); 	
	
	private String name;
	private int price;
	
	private Items(String name,int price) {
		this.name = name;
		this.price =price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
