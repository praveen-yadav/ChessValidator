package chess.validator.libarary.enums;

public enum PieceColor {
	W("White"), B("Black");
	private String name;

	private PieceColor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
