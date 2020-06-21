package chess.validator.libarary.impl;

import java.util.List;

import chess.validator.libarary.enums.DefaultMove;

public class Move {

	private List<DefaultMove> moveSequence;

	public Move(List<DefaultMove> moveSequence) {
		super();
		this.moveSequence = moveSequence;
	}

	public List<DefaultMove> getMoveSequence() {
		return moveSequence;
	}

	public void setMoveSequence(List<DefaultMove> moveSequence) {
		this.moveSequence = moveSequence;
	}
}
