package chess.validator.libarary.pieces;

import java.util.ArrayList;
import java.util.List;

import chess.validator.libarary.enums.DefaultMove;
import chess.validator.libarary.enums.PieceColor;
import chess.validator.libarary.enums.PieceType;
import chess.validator.libarary.impl.Move;

public class Queen extends AbstractPiece {

	public Queen(PieceColor pieceColor) {
		super(PieceType.Q, pieceColor);
	}

	@Override
	public List<Move> getPossibleMoves() {
		List<Move> moves = new ArrayList<Move>();

		// FF
		List<DefaultMove> forwardMoveSeq = new ArrayList<>();
		forwardMoveSeq.add(DefaultMove.FF);
		Move forwardMove = new Move(forwardMoveSeq);
		// BB
		List<DefaultMove> backwardMoveSeq = new ArrayList<>();
		backwardMoveSeq.add(DefaultMove.BB);
		Move backMove = new Move(backwardMoveSeq);
		// RR
		List<DefaultMove> rightMoveSeq = new ArrayList<>();
		rightMoveSeq.add(DefaultMove.RR);
		Move rightMove = new Move(rightMoveSeq);
		// LL
		List<DefaultMove> leftMoveSeq = new ArrayList<>();
		leftMoveSeq.add(DefaultMove.LL);
		Move leftMove = new Move(leftMoveSeq);
		// DD
		List<DefaultMove> diagonalMoveSeq = new ArrayList<>();
		diagonalMoveSeq.add(DefaultMove.DD1);
		Move diagonalMove = new Move(diagonalMoveSeq);

		List<DefaultMove> diagonal2MoveSeq = new ArrayList<>();
		diagonal2MoveSeq.add(DefaultMove.DD2);
		Move diagonal2Move = new Move(diagonal2MoveSeq);

		List<DefaultMove> diagonal3MoveSeq = new ArrayList<>();
		diagonalMoveSeq.add(DefaultMove.DD3);
		Move diagonal3Move = new Move(diagonal3MoveSeq);

		List<DefaultMove> diagonal4MoveSeq = new ArrayList<>();
		diagonalMoveSeq.add(DefaultMove.DD4);
		Move diagonal4Move = new Move(diagonal4MoveSeq);

		moves.add(forwardMove);
		moves.add(backMove);
		moves.add(leftMove);
		moves.add(rightMove);
		moves.add(diagonalMove);
		moves.add(diagonal2Move);
		moves.add(diagonal3Move);
		moves.add(diagonal4Move);
		return moves;
	}

}
