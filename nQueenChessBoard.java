//Assignment: Place the n-queens on the chessboard by taking input form the User
			// eg: User says row -> 1 and col -> 1 as input -> replace it with queen
			//	a total of 4 inputs can be taken to place 4 queens in the chessboard
			//	no queen can be placed in the same row again or same column again :)
			//	Hint: use a do, while loop and make sure not to take more than 4 queens positions
	

import java.util.*;

public class nQueenChessBoard {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			char blackSquare = '\u25A0';	// 1
			char whiteSquare = '\u25A1';	// 0
			char queen = '\u2655';

			char[][] square = new char[8][8];
			System.out.print("chess board before Queen\n");
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(i%2==0) {
						 square[i][j] = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
						System.out.print(square[i][j]+" ");
					}else {
						 square[i][j] = (j % 2) == 0 ? blackSquare : whiteSquare;
						System.out.print(square[i][j]+" ");
						}
					}
				System.out.println();
			}
			
			int count = 0;
			int row = 0;
			int col = 0;
			while(count < 4) {
				System.out.print("enter new row: ");
				int newRow = sc.nextInt();
				while(newRow <= row) {
					System.out.print("this row is already assigned \nEnter another row: ");
					newRow = sc.nextInt();
				}
				row = newRow;
				
				System.out.print("enter new column: ");
				int newCol = sc.nextInt();
				while(newCol <= col) {
					System.out.print("this column is already assigned \nEnter another column: ");
					newCol = sc.nextInt();
				}
				col = newCol;
				
				for(int i = 0; i < 8; i++) {
					for(int j = 0; j < 8; j++) {
						if(i == newRow && j == newCol) {
							 square[i][j] = queen;}
						}
					}
				count++;
				}
			sc.close();
			
			System.out.print("\nchess board after queens\n");
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					System.out.print(square[i][j]+" ");
				}
				System.out.println();
			}
			
		}
	}
