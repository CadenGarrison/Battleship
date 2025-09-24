
public class Board
	{
		static String [][] board = new String[5][5];
		
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
				String [][] enemy = new String[5][5];
				// Destroyer
				enemy [2][2] = "DesA";
				enemy [2][3] = "DesB";
				
				//Cruiser
				enemy [4][4] = "CruC";
				enemy [3][4] = "CruB";
				enemy [2][4] = "CruA";
				
			}
	}

