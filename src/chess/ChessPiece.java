package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Get do color - sera somente acessada
	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece(Position poaisition) {
		ChessPiece p = (ChessPiece)getBoard().piece(poaisition);
		return p != null && p.getColor() != color;
	}
}
