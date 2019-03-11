package checkers;

import java.util.Scanner;

public class Checkers {
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		Board board = new Board();
		board.drawBoard();
			
		White wp = new White();
		Black bp = new Black();

		while(true) {
			
			wp.move(board, s);
			
			board.drawBoard();
	
			bp.move(board, s);
			
			board.drawBoard();
		}
	}

}
//
//class Board {
//	private int[][] board = {
//			{0,1,0,1,0,1,0,1},
//			{1,0,1,0,1,0,1,0},
//			{0,1,0,1,0,1,0,1},
//			{0,0,0,0,0,0,0,0},
//			{0,0,0,0,0,0,0,0},
//			{2,0,2,0,2,0,2,0},
//			{0,2,0,2,0,2,0,2},
//			{2,0,2,0,2,0,2,0} };
//	
//	public Board() {	
//	}
//	
//	public void drawBoard() {
//		System.out.println("    0 1 2 3 4 5 6 7");
//		System.out.println("  +------------------+");
//		for (int i = 0; i<8; i++) {
//			System.out.print(i+ " | "); 
//			for (int j = 0; j<8; j++) {
//				if ( board[i][j] != 0)
//					System.out.print(board[i][j]+ " ");
//				else
//					System.out.print("  ");
//			} System.out.print(" |" + "\n");
//		} 
//		System.out.println("  +------------------+");
//		System.out.println("    0 1 2 3 4 5 6 7");
//	}
//
//	public int getPiece(int x, int y) {
//		return board[y][x];
//	}
//	
//	public void changeSpot(int fromX, int fromY,int toX,int toY, int color) {
//		board[fromY][fromX] = 0;
//		board[toY][toX] = color;
//	}
//}
//
//
//class Piece{
//	protected int tempMove;
//	protected int fromX;
//	protected int fromY;
//	protected int toX;
//	protected int toY;
//
//	public void move(Board board,Scanner s) {
//	}
//	
//}
//
//
//class White extends Piece {
//	
//	public void move(Board board,Scanner s) {
//		while (true) {
//			try {
//				System.out.println("Choose which piece to move, by inserting its coordinates:");
//				System.out.println("X: ");
//				tempMove = s.nextInt();
//				if (tempMove >=0 && tempMove <= 7)
//					fromX = tempMove;
//				System.out.println("Y: ");
//				tempMove = s.nextInt();
//				if (tempMove >=0 && tempMove <= 7)
//					fromY = tempMove;
//				
//				if (board.getPiece(fromX,fromY) == 1)
//					break;
//				else
//					System.out.println("you dont have a piece in that position");
//			
//			} catch(RuntimeException e) {
//				
//				System.out.println("you can only input numbers, Please try again.");
//				s.next();
//			}
//		}
//		while (true) {
//			try {
//				System.out.println("Choose where to move to, by inserting the coordinates");
//				System.out.println("X: ");
//				tempMove = s.nextInt();
//				if (tempMove >=0 && tempMove <= 7)
//					toX = tempMove;
//				System.out.println("Y: ");
//				tempMove = s.nextInt();
//				if (tempMove >=0 && tempMove <= 7)
//					toY = tempMove;
//				
//				if (board.getPiece(toX,toY) == 0 && (Math.abs(toX-fromX)==1) && (toY==fromY+1) ) {
//					board.changeSpot(fromX, fromY, toX, toY, 1);
//					break;
//				}
//				else
//					System.out.println("you cannot move there");
//			
//			} catch(RuntimeException e) {
//				
//				System.out.println("you can only input numbers, Please try again.");
//				s.next();
//			}
//		}
//	}
//}
//
//class Black extends Piece {
//	
//	public void move(Board board,Scanner s) {
//		while (true) {
//			try {
//				System.out.println("Choose which piece to move, by inserting its coordinates:");
//				System.out.println("X: ");
//				tempMove = s.nextInt();
//				if (tempMove >=0 && tempMove <= 7)
//					fromX = tempMove;
//				System.out.println("Y: ");
//				tempMove = s.nextInt();
//				if (tempMove >=0 && tempMove <= 7)
//					fromY = tempMove;
//				
//				if (board.getPiece(fromX,fromY) == 2)
//					break;
//				else
//					System.out.println("you dont have a piece in that position");
//			} catch(RuntimeException e) {
//				
//				System.out.println("you can only input numbers, Please try again.");
//				s.next();
//			}
//		}
//		while (true) {
//			try {
//				System.out.println("Choose where to move to, by inserting the coordinates");
//				System.out.println("X: ");
//				tempMove = s.nextInt();
//				if (tempMove >=0 && tempMove <= 7)
//					toX = tempMove;
//				System.out.println("Y: ");
//				tempMove = s.nextInt();
//				if (tempMove >=0 && tempMove <= 7)
//					toY = tempMove;
//				
//				if (board.getPiece(toX,toY) == 0 && (Math.abs(toX-fromX)==1) && (toY==fromY-1)) {
//					board.changeSpot(fromX, fromY, toX, toY, 2);
//					break;
//				}
//				else
//					System.out.println("you cannot move there");
//			} catch(RuntimeException e) {
//				
//				System.out.println("you can only input numbers, Please try again.");
//				s.next();
//			}
//		}
//	}
//}
//
//






