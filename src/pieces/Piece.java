package pieces;

public abstract class Piece {
	private boolean isWhite;
	
	public Piece(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public abstract void move(int x, int y);
	
	public abstract Type getType();
}
