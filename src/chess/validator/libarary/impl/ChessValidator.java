package chess.validator.libarary.impl;

import java.util.List;

import chess.validator.libarary.api.Piece;
import chess.validator.libarary.enums.DefaultMove;
import chess.validator.libarary.exceptions.InvalidMoveException;
import chess.validator.libarary.exceptions.InvalidPieceException;

public class ChessValidator {

	public static void checkMoveValidity(ChessBoard boardstate, PieceMove pieceMove)
			throws InvalidPieceException, InvalidMoveException {

		checkIfPiecePresentAtOldPosition(boardstate, pieceMove);

		Piece piece = getPieceAtOldPosition(boardstate, pieceMove.getOldPosition());

		boolean isValid = false;

		for (Move move : piece.getPossibleMoves()) {
			if (canReachUsingMove(move, boardstate, piece, pieceMove.getOldPosition(), pieceMove.getNewPosition(),
					false)) {
				isValid = true;
				break;
			}
		}

		for (Move move : piece.getPossibleKillMoves()) {
			if (canReachUsingMove(move, boardstate, piece, pieceMove.getOldPosition(), pieceMove.getNewPosition(),
					true)) {
				isValid = true;
				break;
			}
		}

		if (!isValid) {
			throw new InvalidMoveException();
		}

	}

	private static Piece getPieceAtOldPosition(ChessBoard boardstate, Position oldPosition) {
		return boardstate.getBoardState()[oldPosition.getX()][oldPosition.getY()];
	}

	private static void checkIfPiecePresentAtOldPosition(ChessBoard boardstate, PieceMove pieceMove)
			throws InvalidPieceException {
		Piece piece = getPieceAtOldPosition(boardstate, pieceMove.getOldPosition());
		if (!piece.getPieceColor().equals(pieceMove.getPieceColor())
				|| !piece.getPieceType().equals(pieceMove.getPieceType())) {
			throw new InvalidPieceException();
		}
	}

	private static boolean canReachUsingMove(Move move, ChessBoard boardstate, Piece piece, Position oldPosition,
			Position newPosition, boolean isKillMove) {
		List<DefaultMove> moveSeq = move.getMoveSequence();

		// assuming complex moves not to be multiple
		// TODO: case of checking if already an item is present or not and also kill
		// move
		boolean isValid = false;
		for (DefaultMove defMove : moveSeq) {
			if (defMove.equals(DefaultMove.BB) || defMove.equals(DefaultMove.FF) || defMove.equals(DefaultMove.LL)
					|| defMove.equals(DefaultMove.RR) || defMove.equals(DefaultMove.DD1)
					|| defMove.equals(DefaultMove.DD2) || defMove.equals(DefaultMove.DD3)
					|| defMove.equals(DefaultMove.DD4)) {
				for (int i = 0; i < 8; i++) {
					int additive = (oldPosition.getX() + i) % 8;
					Position pos = applyMove(defMove, oldPosition.getX(), oldPosition.getY(), additive);
					if (pos.equals(newPosition))
						isValid = true;
				}
				if (!isValid)
					return false;
			} else {
				oldPosition = applyMove(defMove, oldPosition.getX(), oldPosition.getY(), 1);

			}
			if (oldPosition.equals(newPosition)
					&& ((!isKillMove && boardstate.getBoardState()[newPosition.getX()][newPosition.getY()] == null)))
				return true;
		}
		return false;
	}

	private static Position applyMove(DefaultMove defMove, int x, int y, int additive) {
		switch (defMove) {
		case B:
			x = x - 1;
			break;
		case BB:
			x = x - additive;
			break;
		case D1:
			x = x + 1;
			y = y + 1;
			break;
		case D2:
			x = x + 1;
			y = y + 1;
			break;
		case D3:
			x = x + 1;
			y = y + 1;
			break;
		case D4:
			x = x + 1;
			y = y + 1;
			break;
		case DD1:
			x = x + additive;
			y = y + additive;
			break;
		case DD2:
			x = x + additive;
			y = y + additive;
			break;
		case DD3:
			x = x + additive;
			y = y + additive;
			break;
		case DD4:
			x = x + additive;
			y = y + additive;
			break;
		case F:
			x = x + 1;
			break;
		case FF:
			x = x + additive;
			break;
		case L:
			y = y - 1;
			break;
		case LL:
			y = y - additive;
			break;
		case R:
			y = y + 1;
			break;
		case RR:
			y = y + additive;
			break;
		default:
			break;

		}
		return new Position(x, y);

	}
}
