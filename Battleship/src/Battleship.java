import java.util.Scanner;

public class Battleship
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userInput = new Scanner(System.in);
		
		public static void main(String[] args)
			{
			// THIS IS MY MESSAGE TO MR. MCGUIRE THAT I HAVE IN FACT SUCCESSFULLY OPERATED GITHUB
			Board.displayBoard();
			Board.generateEnemy();
			introduction();
			}
		
		public static void introduction()
		{
			System.out.println("Welcome to Battleship. Do you know how to play? (1) Yes (2) No");
			int instructions = userIntInput.nextInt();
			if (instructions == 2)
			{
				System.out.println(" ");
				System.out.println("There are two enemy ships at unknown locations on a 5x5 square board like the one before you.");
				System.out.println("One can be sunk in two shots, the other in three.");
				System.out.println("You will select a given location with a row and column identifier (like A1).");
				System.out.println("Hits and misses will be tracked on the board in front of you.");
				System.out.println("You must land the exact number of hits in the exact location to sink a ship.");
				System.out.println("Good luck!");
				System.out.println("Now...");
				PlayGame.playGame();
			}
			else if (instructions == 1)
			{
				PlayGame.playGame();
			}
			else
			{
				System.out.println("I'll take that as a no.");
				PlayGame.playGame();
			}
			
		}

	}
