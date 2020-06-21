package chess.validator.libarary.pieces;

import java.util.List;

import chess.validator.libarary.api.Piece;
import chess.validator.libarary.enums.PieceColor;
import chess.validator.libarary.enums.PieceType;
import chess.validator.libarary.impl.Move;

public abstract class AbstractPiece implements Piece {

	protected PieceType pieceType;
	protected PieceColor pieceColor;

	public AbstractPiece(PieceType pieceType, PieceColor pieceColor) {
		this.pieceType = pieceType;
		this.pieceColor = pieceColor;
	}

	@Override
	public PieceType getPieceType() {
		return pieceType;
	}

	@Override
	public PieceColor getPieceColor() {
		return pieceColor;
	}

	public abstract List<Move> getPossibleMoves();

	@Override
	public boolean canSkipPiecesInPath() {
		return false;
	}

	@Override
	public List<Move> getPossibleKillMoves() {
		return getPossibleMoves();
	}

}
