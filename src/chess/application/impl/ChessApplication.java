package chess.application.impl;

import java.util.ArrayList;
import java.util.List;

import chess.validator.libarary.enums.PieceColor;
import chess.validator.libarary.enums.PieceType;
import chess.validator.libarary.exceptions.InvalidMoveException;
import chess.validator.libarary.exceptions.InvalidPieceException;
import chess.validator.libarary.impl.ChessBoard;
import chess.validator.libarary.impl.ChessValidator;
import chess.validator.libarary.impl.PieceMove;
import chess.validator.libarary.impl.Position;

public class ChessApplication {

	public static void main(String[] args) {

		ChessBoard boardState = ChessBoardFactory.getInstance().createDefaultChessBoard();
		List<PieceMove> movesList = inputMoves();
		for (PieceMove move : movesList) {
			try {
				ChessValidator.checkMoveValidity(boardState, move);
				System.out.println("Valid Move");
			} catch (InvalidPieceException | InvalidMoveException e) {
				System.out.println("Error:Invalid Move");
			}
		}

	}

	private static List<PieceMove> inputMoves() {
		PieceMove move1 = new PieceMove(PieceType.P, PieceColor.W, new Position(1, 2), new Position(2, 2));
		PieceMove move2 = new PieceMove(PieceType.P, PieceColor.B, new Position(6, 0), new Position(6, 4));
		PieceMove move3 = new PieceMove(PieceType.H, PieceColor.B, new Position(7, 1), new Position(5, 0));
		PieceMove move4 = new PieceMove(PieceType.Q, PieceColor.W, new Position(0, 3), new Position(3, 0));
		List<PieceMove> movesList = new ArrayList<>();
		movesList.add(move1);
		movesList.add(move2);
		movesList.add(move3);
		movesList.add(move4);
		return movesList;
	}
}
