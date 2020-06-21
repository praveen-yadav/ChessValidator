package chess.validator.libarary.pieces;

import java.util.List;

import chess.validator.libarary.api.Piece;
import chess.validator.libarary.enums.PieceColor;
import chess.validator.libarary.enums.PieceType;
import chess.validator.libarary.impl.Move;

public class Rook extends AbstractPiece implements Piece {

	public Rook(PieceColor pieceColor) {
		super(PieceType.R, pieceColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Move> getPossibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
