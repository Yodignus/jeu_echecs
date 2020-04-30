package chess.pieces;

import chess.Chessboard;
import chess.util.Color;
import chess.util.Position;
import chess.util.Symbol;

public class Pawn extends Piece {
	public Pawn(Chessboard board, Position position, Color color) {
		super(board, position, color, "Pawn", color == Color.WHITE ? Symbol.WHITE_PAWN : Symbol.BLACK_PAWN);   // condition ternaire   =>   color == Color.WHITE ? Symbol.WHITE_PAWN : Symbol.BLACK_PAWN
	}

	public boolean isValidMove(Position position) {
		return false;

	}

	public void moveTo(Position position) {

	}

}
