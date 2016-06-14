package com.helbreath.model;

import com.helbreath.model.exception.CoordinateUnexistantException;

public class Grid {
	
	private Tile[][] _tiles = null;
	
	public Grid(int width, int height){
		this.createGrid(width, height);
	}
	
	private Tile[][] getTiles(){
		return this._tiles;
	}
	
	public Tile getTileAt(int x, int y){
		return this.getTiles()[x][y];
	}
	
	public int getWidth(){
		return this.getTiles()[0].length;
	}
	
	public int getHeight(){
		return this.getTiles().length;
	}
	
	private void createGrid(int width, int height){
		this._tiles = new Tile[height][width];
		for(int i = 0; i < height - 1; i++){
			for(int j = 0; j < width - 1; j++){
				this._tiles[i][j] = new Tile();
			}
		}
	}
	
	private boolean coordExists(int x, int y){
		return (x >= 0 || x <= this.getWidth()) && (y >= 0 || y <= this.getHeight());
	}
	
	public void setAvailable(int x, int y){
		if(!this.coordExists(x, y)) throw new CoordinateUnexistantException();
		this.getTileAt(x, y).setAvailable();
	}
	
	public void setUnavailable(int x, int y){
		if(!this.coordExists(x, y)) throw new CoordinateUnexistantException();
		this.getTileAt(x, y).setUnavailable();
	}
}
