package boardgame;

public class Piece 
{
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //por padrão já recebe null, colocando para enfatizar que a posição no início é nula
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
}
