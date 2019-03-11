package checkers;


public class Board {
	private int[][] board = {
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{2,0,2,0,2,0,2,0},
			{0,2,0,2,0,2,0,2},
			{2,0,2,0,2,0,2,0} };
	
//	public Board() {	
//		
//	}
	
	public void drawBoard() {
		System.out.println("    0 1 2 3 4 5 6 7");
		System.out.println("  +------------------+");
		for (int i = 0; i<8; i++) {
			System.out.print(i+ " | "); 
			for (int j = 0; j<8; j++) {
				if ( board[i][j] != 0)
					System.out.print(board[i][j]+ " ");
				else
					System.out.print("  ");
			} System.out.print(" |" + "\n");
		} 
		System.out.println("  +------------------+");
		System.out.println("    0 1 2 3 4 5 6 7");
	}

	public int getPiece(int x, int y) {
		return board[y][x];
	}
	
	public void changeSpot(int fromX, int fromY,int toX,int toY, int color) {
		board[fromY][fromX] = 0;
		board[toY][toX] = color;
	}
}


