package com.smita.myInventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T>{
	
	private Map<T,Integer> inventoryMap=new HashMap<T,Integer>();
	
	public int getQuantity(T invItem) {
		Integer value=inventoryMap.get(invItem);
		return value == null ? 0 : value;
	}
	
	public void add(T invItem) {
		int count = inventoryMap.get(invItem);
		if(count > 0) {
			inventoryMap.put(invItem, count+1);
		}
		
	}
	
	public void deduct(T invItem) {
		if(hasItem(invItem)) {
			int count = inventoryMap.get(invItem);
			inventoryMap.put(invItem, count - 1);
			
		}
	}

	private boolean hasItem(T invItem) {
		// TODO Auto-generated method stub
		return getQuantity(invItem) > 0;
	}
	
	public void clear() {
		inventoryMap.clear();
	}
	
	public void put(T invItem,int quantity) {
		inventoryMap.put(invItem, quantity);
	}
	

}
