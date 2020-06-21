package chess.validator.libarary.impl;

import chess.validator.libarary.api.Piece;
import chess.validator.libarary.enums.PieceColor;
import chess.validator.libarary.pieces.Rook;

public class ChessBoard {

	private int dimension;
	private Piece[][] boardState;

	public ChessBoard(int dimension) {
		this.dimension = dimension;
		boardState = new Piece[dimension][dimension];
		initBoard();
	}

	private void initBoard() {

		// define default board
		boardState[0][0] = new Rook(PieceColor.W);
		boardState[0][7] = new Rook(PieceColor.W);
		// TODO
	}

	public int getDimension() {
		return dimension;
	}

	public Piece[][] getBoardState() {
		return boardState;
	}

}
