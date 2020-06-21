package chess.validator.libarary.impl;

import chess.validator.libarary.enums.PieceColor;
import chess.validator.libarary.enums.PieceType;

public class PieceMove {

	private PieceType pieceType;
	private PieceColor pieceColor;
	private Position oldPosition;
	private Position newPosition;

	public PieceMove(PieceType pieceType, PieceColor pieceColor, Position oldPosition, Position newPosition) {
		this.pieceType = pieceType;
		this.pieceColor = pieceColor;
		this.oldPosition = oldPosition;
		this.newPosition = newPosition;
	}

	public Position getOldPosition() {
		return oldPosition;
	}

	public void setOldPosition(Position oldPosition) {
		this.oldPosition = oldPosition;
	}

	public Position getNewPosition() {
		return newPosition;
	}

	public void setNewPosition(Position newPosition) {
		this.newPosition = newPosition;
	}

	public PieceType getPieceType() {
		return pieceType;
	}

	public void setPieceType(PieceType pieceType) {
		this.pieceType = pieceType;
	}

	public PieceColor getPieceColor() {
		return pieceColor;
	}

	public void setPieceColor(PieceColor pieceColor) {
		this.pieceColor = pieceColor;
	}

}
