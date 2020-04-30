package chess.pieces;

import chess.Chessboard;
import chess.util.Color;
import chess.util.Position;
import chess.util.Symbol;

public class Queen extends Piece {
	public Queen(Chessboard board, Position position, Color color) {
		super(board, position, color, "Queen", color == Color.WHITE ? Symbol.WHITE_QUEEN : Symbol.BLACK_QUEEN);
	}

	public boolean isValidMove(Position position) {
		return false;

	}

}
