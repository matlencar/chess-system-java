package boardgame;

public class Piece {
	
	//Variaveis
	protected Position position;
	private Board board;
	
	//Construtor com argumentos - apenas com a variavel board
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Get do board
	protected Board getBoard() {
		return board;
	}
	
	
	
}
