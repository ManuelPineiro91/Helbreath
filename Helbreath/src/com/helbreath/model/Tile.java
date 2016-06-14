package com.helbreath.model;

public class Tile {
	
	private boolean _available = true;
	
	public boolean isAvailable(){
		return this._available;
	}
	
	public void setAvailable(){
		this._available = true;
	}
	
	public void setUnavailable(){
		this._available = false;
	}
}
