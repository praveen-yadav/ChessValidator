package chess.validator.libarary.enums;

public enum PieceType {
	R("Rook"), B("Bishop"), H("Horse"), K("King"), Q("Queen"), P("Pawn");
	private String name;

	private PieceType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
