package chess.pieces;

import chess.Chessboard;
import chess.util.Color;
import chess.util.Position;
import chess.util.Symbol;

public class Knight extends Piece{
	public Knight(Chessboard board, Position position, Color color) {
		super(board, position, color, "Knight", color == Color.WHITE ? Symbol.WHITE_KNIGHT : Symbol.BLACK_KNIGHT);
	}
	
	public boolean isValidMove(Position position) {
		return false;
		
		
	}
	
	
}
