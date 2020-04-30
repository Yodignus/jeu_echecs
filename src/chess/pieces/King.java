package chess.pieces;

import chess.Chessboard;
import chess.util.Color;
import chess.util.Position;
import chess.util.Symbol;

public class King extends Piece{
	public King(Chessboard board, Position position, Color color) {
		super(board, position, color, "King", color == Color.WHITE ? Symbol.WHITE_KING : Symbol.BLACK_KING);
	}
	
	public boolean isValidMove(Position position) {
		return false;
		
		
	}
	
	
}
