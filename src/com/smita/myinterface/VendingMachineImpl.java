package com.smita.myinterface;

import com.smita.model.Coin;
import com.smita.model.Items;
import com.smita.myInventory.Inventory;

public class VendingMachineImpl implements VendigMachine{
	
	private Inventory<Coin> cashInventory = new Inventory<Coin>();
	private Inventory<Items> itemInventory = new Inventory<Items>();
	private long currentBalance;
	private Items currentItem;
	private long totaleSale;
	@Override
	public void insertCoin(Coin coin) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public long selectItemAndGetPrice(Items item) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

}
