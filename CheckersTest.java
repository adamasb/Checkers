package CheckersTest;

import static org.junit.Assert.*;

import org.junit.Before;

import checkers.*;

import org.junit.Test;

public class CheckersTest {
	Board board;
	White wp;
	Black bp;
	
	@Before
	public void Before(){
		board = new Board();
		wp = new White();
		bp = new Black();
		board.drawBoard();
	}

	@Test
	public void testBoard(Board board) {
		assertTrue(board.getPiece(1, 2) == 1);		
		assertTrue(board.getPiece(5, 6) == 2);
		assertFalse(board.getPiece(2, 3) == 1);
		
		board.changeSpot(1, 2, 2, 3, 1);
		assertTrue(board.getPiece(2, 3) == 1);	
	}
//	@Test
//	public void testPiece() {	
//	}
}
