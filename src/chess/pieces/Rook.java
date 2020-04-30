package chess.pieces;

import chess.Chessboard;
import chess.util.Color;
import chess.util.Position;
import chess.util.Symbol;

public class Rook extends Piece {
	public Rook(Chessboard board, Position position, Color color) {

		super(board, position, color, "Rook", color == Color.WHITE ? Symbol.WHITE_ROOK : Symbol.BLACK_ROOK);

	}

	public boolean isValidMove(Position position) {
		
		return false ;
		
		

	}

}
