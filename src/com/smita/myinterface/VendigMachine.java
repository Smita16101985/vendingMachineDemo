package com.smita.myinterface;

import com.smita.model.Coin;
import com.smita.model.Items;

public interface VendigMachine {
	public void insertCoin(Coin coin);
	public long selectItemAndGetPrice(Items item);
	public void reset();

}
