package chess.validator.libarary.enums;

public enum DefaultMove {

	// single step forward
	F,
	// single step backward
	B,
	// single left
	L,
	// single right
	R,
	// any number of steps forward and so on
	FF, BB, LL, RR,
	// specific diagonals
	D1, D2, D3, D4, DD1, DD2, DD3, DD4
}
