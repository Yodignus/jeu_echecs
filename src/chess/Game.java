package chess;

import chess.util.Color;
import chess.util.Position;


public class Game {

	private String whitePlayerName;
	private String blackPlayerName;
	private Chessboard board;
	private Color currentColor;

	public Game(String whitePlayerName, String blackPlayerName) {

	}

	public void Turn(Position position1, Position position2) {

	}

	public String getWhitePlayerName() {
		return whitePlayerName;

	}

	public String getBlackPlayerName() {
		return blackPlayerName;

	}

	public Color getCurrentColor() {
		return currentColor;

	}

	public static void main(String[] args) {
		Chessboard board = new Chessboard();
		System.out.println(board.pr());  //test
		
	}

}
