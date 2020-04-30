package chess;

import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Piece;
import chess.pieces.Queen;
import chess.pieces.Rook;
import chess.util.Color;
import chess.util.Position;
import chess.util.Symbol;

public class Chessboard {

	private Piece[][] pieces;

	public String pr() { // test
		return "bjr";
	}

	public void start(Chessboard board) {

		Color color = Color.BLACK;

		pieces[0][0] = new Rook(board, new Position(0, 0), color);
		pieces[0][1] = new Knight(board, new Position(0, 1), color);
		pieces[0][2] = new Bishop(board, new Position(0, 2), color);
		pieces[0][3] = new Queen(board, new Position(0, 3), color);
		pieces[0][4] = new King(board, new Position(0, 4), color);
		pieces[0][5] = new Bishop(board, new Position(0, 5), color);
		pieces[0][6] = new Knight(board, new Position(0, 6), color);
		pieces[0][7] = new Rook(board, new Position(0, 7), color);

		for (int col = 0; col < pieces[1].length; col++) {

			pieces[1][col] = new Pawn(board, new Position(1, col), color);

		}

		color = Color.WHITE;
		for (int col = 0; col < pieces[6].length; col++) {

			pieces[6][col] = new Pawn(board, new Position(6, col), color);
		}

		pieces[7][0] = new Rook(board, new Position(0, 0), color);
		pieces[7][1] = new Knight(board, new Position(0, 1), color);
		pieces[7][2] = new Bishop(board, new Position(0, 2), color);
		pieces[7][3] = new Queen(board, new Position(0, 3), color);
		pieces[7][4] = new King(board, new Position(0, 4), color);
		pieces[7][5] = new Bishop(board, new Position(0, 5), color);
		pieces[7][6] = new Knight(board, new Position(0, 6), color);
		pieces[7][7] = new Rook(board, new Position(0, 7), color);
		System.out.println("    A   B   C   D   E   F   G   H");
		System.out.println("  ┏━━━┳━━━┳━━━┳━━━┳━━━┳━━━┳━━━┳━━━┓");
		for (int row = 0; row < pieces.length; row++) {
			int r = 8 - row;
			System.out.print(r);
			for (int col = 0; col < pieces[row].length; col++) {
				System.out.print(" ┃ ");
				
				if (pieces[row][col] != null) {
					System.out.print(pieces[row][col].getSymbol());
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ┃");
			r = 8 - row;
			System.out.print(" " + r);
			System.out.println("");

			if (row != 7)
				System.out.println("  ┣━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━┫");

		}
		System.out.println("  ┗━━━┻━━━┻━━━┻━━━┻━━━┻━━━┻━━━┻━━━┛");
		System.out.println("    A   B   C   D   E   F   G   H");

	}

	public Chessboard() {
		pieces = new Piece[8][8];
	}

	public Piece getPiece(int x, int y) {

	}

	public Piece getPiece(Position position) {

	}

	public void setPiece(Position position, Piece piece) {

	}

	public boolean isPiecePresentOnSameDiagonalBetween(Position position, Position position) {

	}

	public boolean isPiecePresentOnSameColumnBetween(Position position, Position position) {

	}

	public boolean isPiecePresentOnSameLineBetween(Position position, Position position) {

	}

	public String toString() {

	}

}