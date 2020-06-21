package chess.validator.libarary.api;

import java.util.List;

import chess.validator.libarary.enums.PieceColor;
import chess.validator.libarary.enums.PieceType;
import chess.validator.libarary.impl.Move;

public interface Piece {

	public PieceType getPieceType();

	public PieceColor getPieceColor();

	public List<Move> getPossibleMoves();

	public boolean canSkipPiecesInPath();

	public List<Move> getPossibleKillMoves();

}
