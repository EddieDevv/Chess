package game;

import pieces.Piece;

public class Square {
	private int x;
	private int y;
	private Piece p;
	
	public Square(int x, int y, Piece p) {
		this.x = x;
		this.y = y;
		this.p = p;
	}
	
	public Square getSquare() {
		
		return this;
	}
	
	public Piece getPiece() {
		
		return p;
	}
	
	public int getX() {
		
		return x;
	}
	
	public int getY() {
		
		return y;
	}
}
