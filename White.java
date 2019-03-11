package checkers;

import java.util.Scanner;

public class White extends Piece {
	
	public void move(Board board,Scanner s) {
		while (true) {
			try {
				System.out.println("Choose which piece to move, by inserting its coordinates:");
				System.out.println("X: ");
				tempMove = s.nextInt();
				if (tempMove >=0 && tempMove <= 7)
					fromX = tempMove;
				System.out.println("Y: ");
				tempMove = s.nextInt();
				if (tempMove >=0 && tempMove <= 7)
					fromY = tempMove;
				
				if (board.getPiece(fromX,fromY) == 1)
					break;
				else
					System.out.println("you dont have a piece in that position");
			
			} catch(RuntimeException e) {
				
				System.out.println("you can only input numbers, Please try again.");
				s.next();
			}
		}
		while (true) {
			try {
				System.out.println("Choose where to move to, by inserting the coordinates");
				System.out.println("X: ");
				tempMove = s.nextInt();
				if (tempMove >=0 && tempMove <= 7)
					toX = tempMove;
				System.out.println("Y: ");
				tempMove = s.nextInt();
				if (tempMove >=0 && tempMove <= 7)
					toY = tempMove;
				
				if (board.getPiece(toX,toY) == 0 && (Math.abs(toX-fromX)==1) && (toY==fromY+1) ) {
					board.changeSpot(fromX, fromY, toX, toY, 1);
					break;
				}
				else
					System.out.println("you cannot move there");
			
			} catch(RuntimeException e) {
				
				System.out.println("you can only input numbers, Please try again.");
				s.next();
			}
		}
	}
}

