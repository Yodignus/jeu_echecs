package chess.pieces;

import chess.Chessboard;
import chess.util.Color;
import chess.util.Position;

public abstract class Piece {

	private Position position;
	private final char symbol;
	private final Color color;
	private final String name;
	protected final Chessboard board;
	
	public Piece(Chessboard board, Position position, Color color, String name, char symbol) {
		
		
	}
	
	public char getSymbol() {
		
	}
	
	public Color getColor() {
		
	}
	
	public Position getPosition() {
		
	}
	
	public String getName() {
		
	}
	
	public boolean isBlack() {
		
	}
	
	public boolean isWhite() {
		
	}
	
	public void moveTo(Position position) {
		
	}
	
	public boolean isValidMove(Position position) {
		
	}
	
	
	
	
	
	
	
}
