package chess.pieces;

import chess.Chessboard;
import chess.util.Color;
import chess.util.Position;
import chess.util.Symbol;

public class Bishop extends Piece{
	public Bishop(Chessboard board, Position position, Color color) {
		super(board, position, color, "Bishop", color == Color.WHITE ? Symbol.WHITE_BISHOP : Symbol.BLACK_BISHOP);
		
	}
	
	public boolean isValidMove(Position position) {
		return false;
		
		
	}
	
	
}
