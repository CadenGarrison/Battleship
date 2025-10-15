
public class Board
	{
		static String [][] board = new String[5][5];  
		static String [][] enemy = {{"A1", "A2", "A3", "A4", "A5"}, {"B1", "B2", "B3", "B4", "B5"}, {"C1", "C2", "C3", "C4", "C5"}, {"D1", "D2", "D3", "D4", "D5"}, {"E1", "E2", "E3", "E4", "E5"}};
		
		public static void displayBoard()
		{
			
			System.out.println("    1   2   3   4   5  ");
			System.out.println("  ---------------------");
			System.out.println("A |   |   |   |   |   |");
			System.out.println("  ---------------------");
			System.out.println("B |   |   |   |   |   |");
			System.out.println("  ---------------------");
			System.out.println("C |   |   |   |   |   |");
			System.out.println("  ---------------------");
			System.out.println("D |   |   |   |   |   |");
			System.out.println("  ---------------------");
			System.out.println("E |   |   |   |   |   |");
			System.out.println("  ---------------------");
			/*
			System.out.println("A | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | " + board[0][3] + " | "  + board[0][4] + " |");
			System.out.println("B | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | " + board[1][3] + " | "  + board[1][4] + " |");
			System.out.println("C | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | " + board[2][3] + " | "  + board[2][4] + " |");
			System.out.println("D | " + board[3][0] + " | " + board[3][1] + " | " + board[3][2] + " | " + board[3][3] + " | "  + board[3][4] + " |");
			System.out.println("E | " + board[4][0] + " | " + board[4][1] + " | " + board[4][2] + " | " + board[4][3] + " | "  + board[4][4] + " |");
			*/
		}
		
		public static void generateEnemy()
			{
			// In the future, we will randomize these positions to serve as an "AI" enemy
				
				// Destroyer
				enemy [2][2] = "DesA"; // C3
				enemy [2][3] = "DesB"; // C4
				
				//Cruiser
				enemy [4][4] = "CruC"; //C5
				enemy [3][4] = "CruB"; //D5
				enemy [2][4] = "CruA"; //E5
				
			}
	}

