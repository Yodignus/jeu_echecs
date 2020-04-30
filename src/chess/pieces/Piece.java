package chess.pieces;

import chess.Chessboard;
import chess.util.Color;
import chess.util.Position;
import chess.util.Symbol;

public abstract class Piece {

	private Position position;
	private final char symbol;
	private final Color color;
	private final String name;
	protected final Chessboard board;

	public Piece(Chessboard board, Position position, Color color, String name, char symbol) {
		this.symbol = symbol;
		this.board = board;
		this.color = color;
		this.name = name;

	}

	public char getSymbol() {

		return symbol;
	}

	public Color getColor() {
		return color;
	}

	public Position getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

	public boolean isBlack() {
		if (this.color == Color.BLACK) {
			return true;
		} else
			return false;
	}

	public boolean isWhite() {
		if (this.color == Color.WHITE) {
			return true;
		} else
			return false;
	}

	public void moveTo(Position position) {

	}

	public abstract boolean isValidMove(Position position) {

	}

}
