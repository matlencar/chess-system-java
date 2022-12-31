package boardgame;

public class Board {

	//Variaveis
	private int rows;
	private int columns;
	private Piece pieces [] [];
	
	//Construtor com argumentos - apenas rows e columns
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	//Getters and Setters
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece (int row, int column) {
		return pieces [row] [column];
	}
	
	public Piece piece (Position position) {
		return pieces [position.getRow()] [position.getColumn()];
	}
}
