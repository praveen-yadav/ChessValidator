package chess.validator.libarary.pieces;

import java.util.ArrayList;
import java.util.List;

import chess.validator.libarary.enums.DefaultMove;
import chess.validator.libarary.enums.PieceColor;
import chess.validator.libarary.enums.PieceType;
import chess.validator.libarary.impl.Move;

public class Horse extends AbstractPiece {

	public Horse(PieceColor pieceColor) {
		super(PieceType.H, pieceColor);
	}

	@Override
	public List<Move> getPossibleMoves() {
		List<Move> moves = new ArrayList<Move>();
		// FFL
		List<DefaultMove> fflSeq = new ArrayList<>();
		fflSeq.add(DefaultMove.F);
		fflSeq.add(DefaultMove.F);
		fflSeq.add(DefaultMove.L);
		Move ffl = new Move(fflSeq);
		// BBL
		List<DefaultMove> bblSeq = new ArrayList<>();
		bblSeq.add(DefaultMove.B);
		bblSeq.add(DefaultMove.B);
		bblSeq.add(DefaultMove.L);
		Move bbl = new Move(bblSeq);
		// FFR
		List<DefaultMove> ffrSeq = new ArrayList<>();
		ffrSeq.add(DefaultMove.F);
		ffrSeq.add(DefaultMove.F);
		ffrSeq.add(DefaultMove.R);
		Move ffr = new Move(ffrSeq);
		// BBR
		List<DefaultMove> bbrSeq = new ArrayList<>();
		bbrSeq.add(DefaultMove.B);
		bbrSeq.add(DefaultMove.B);
		bbrSeq.add(DefaultMove.R);
		Move bbr = new Move(bbrSeq);
		// LLF
		List<DefaultMove> llfSeq = new ArrayList<>();
		llfSeq.add(DefaultMove.L);
		llfSeq.add(DefaultMove.L);
		llfSeq.add(DefaultMove.F);
		Move llf = new Move(llfSeq);
		// LLB
		List<DefaultMove> llbSeq = new ArrayList<>();
		llbSeq.add(DefaultMove.L);
		llbSeq.add(DefaultMove.L);
		llbSeq.add(DefaultMove.B);
		Move llb = new Move(llbSeq);
		// RRF
		List<DefaultMove> rrfSeq = new ArrayList<>();
		rrfSeq.add(DefaultMove.R);
		rrfSeq.add(DefaultMove.R);
		rrfSeq.add(DefaultMove.F);
		Move rrf = new Move(rrfSeq);
		// BBR
		List<DefaultMove> rrBSeq = new ArrayList<>();
		rrBSeq.add(DefaultMove.R);
		rrBSeq.add(DefaultMove.R);
		rrBSeq.add(DefaultMove.B);
		Move rrB = new Move(rrBSeq);
		moves.add(ffl);
		moves.add(bbl);
		moves.add(ffr);
		moves.add(bbr);
		moves.add(llf);
		moves.add(llb);
		moves.add(rrf);
		moves.add(rrB);
		return moves;
	}

	@Override
	public boolean canSkipPiecesInPath() {
		return true;
	}

}
