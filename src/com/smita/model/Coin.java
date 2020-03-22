package com.smita.model;

public enum Coin {
	PENNY(1),NICKLE(2),DIME(3),QUARTER(25);
	
	private int dimenssion;

	public int getDimenssion() {
		return dimenssion;
	}

	private Coin(int dimenssion) {
		this.dimenssion = dimenssion;
	}
	
	

}
