package game;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;

public class Board {
	Square[][] b;
	
	/**
	 * Constructs the board
	 */
	public Board() {
		b = createGameBoard();
	}
	
	
	/**
	 * Creates the game board in the initial state
	 * @return
	 */
	public static Square[][] createGameBoard() {
		Square[][] board = new Square[8][8];
		
		/**
		 * Initializes back rank for white
		 */
		board[0][0] = new Square(0, 0, new Rook(true));
		board[1][0] = new Square(1, 0, new Knight(true));
		board[2][0] = new Square(2, 0, new Bishop(true));
		board[3][0] = new Square(3, 0, new Queen(true));
		board[4][0] = new Square(4, 0, new King(true));
		board[5][0] = new Square(5, 0, new Bishop(true));
		board[6][0] = new Square(6, 0, new Knight(true));
		board[7][0] = new Square(7, 0, new Rook(true));
		
		/**
		 * Initializes pawns for white
		 */
		for(int i = 0; i < 8; i++) {
			board[i][1] = new Square(i, 1, new Pawn(true));
		}
		
		/**
		 * Initialized back rank for black
		 */
		board[0][7] = new Square(0, 7, new Rook(false));
		board[1][7] = new Square(0, 7, new Knight(false));
		board[2][7] = new Square(0, 7, new Bishop(false));
		board[3][7] = new Square(0, 7, new Queen(false));
		board[4][7] = new Square(0, 7, new King(false));
		board[5][7] = new Square(0, 7, new Bishop(false));
		board[6][7] = new Square(0, 7, new Knight(false));
		board[7][7] = new Square(0, 7, new Rook(false));
		
		/**
		 * Initializes pawns for black
		 */
		for(int i = 0; i < 8; i++) {
			board[i][6] = new Square(i, 6, new Pawn(false));
		}
		
		/**
		 * Initializes empty squares
		 */
		for(int i = 0; i < 8; i++) {
			for(int j = 2; j < 6; j++) {
				board[i][j] = new Square(i, j, null);
			}
		}
		
		return board;
	}
	
	public void printBoard() {
		String s = "";
		
		s = s.concat("\r\n---------------------------------\r\n");
		for(int i = 0; i < 8; i++) {
			s = s.concat("|");
			for(int j = 0; j < 8; j++) {
				if(b[j][i].getPiece() == null) {
					s = s.concat("   |");
					continue;
				}
				switch(b[j][i].getPiece().getType()) {
				case ROOK:
					s = s.concat(" R |");
					continue;
				case KNIGHT:
					s = s.concat(" N |");
					continue;
				case BISHOP:
					s = s.concat(" B |");
					continue;
				case QUEEN:
					s = s.concat(" Q |");
					continue;
				case KING:
					s = s.concat(" K |");
					continue;
				case PAWN:
					s = s.concat(" P |");
					continue;
				}
			}
			s = s.concat("\r\n---------------------------------\r\n");
		}
		
		System.out.println(s);
	}

}
