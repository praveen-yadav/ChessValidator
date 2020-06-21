package chess.validator.libarary.impl;

public class Position {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Position) obj).getX() == x && ((Position) obj).getY() == y;
	}

}
