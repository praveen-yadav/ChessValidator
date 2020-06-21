package chess.validator.libarary.pieces;

import java.util.ArrayList;
import java.util.List;

import chess.validator.libarary.enums.DefaultMove;
import chess.validator.libarary.enums.PieceColor;
import chess.validator.libarary.enums.PieceType;
import chess.validator.libarary.impl.Move;

public class Pawn extends AbstractPiece {

	public Pawn(PieceColor pieceColor) {
		super(PieceType.P, pieceColor);
	}

	@Override
	public List<Move> getPossibleMoves() {
		List<Move> moves = new ArrayList<Move>();
		// FFL
		List<DefaultMove> fSeq = new ArrayList<>();
		fSeq.add(DefaultMove.F);
		Move move = new Move(fSeq);
		moves.add(move);
		return moves;
	}

	@Override
	public List<Move> getPossibleKillMoves() {
		List<Move> moves = new ArrayList<Move>();
		// FFL
		List<DefaultMove> d1Seq = new ArrayList<>();
		d1Seq.add(DefaultMove.D1);
		Move move1 = new Move(d1Seq);
		List<DefaultMove> d2Seq = new ArrayList<>();
		d2Seq.add(DefaultMove.D2);
		Move move2 = new Move(d2Seq);
		moves.add(move1);
		moves.add(move2);
		return moves;
	}

}
