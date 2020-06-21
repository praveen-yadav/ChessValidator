package chess.application.impl;

import chess.validator.libarary.impl.ChessBoard;

public class ChessBoardFactory {

	private static ChessBoardFactory instance;

	public static ChessBoardFactory getInstance() {
		if (instance == null)
			instance = new ChessBoardFactory();
		return instance;

	}

	private ChessBoardFactory() {
	}

	public ChessBoard createDefaultChessBoard() {
		return new ChessBoard(8);
	}
}
