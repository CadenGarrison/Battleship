
public class PlayGame
	{	
	// We'll want a while loop and a boolean to loop until complete
		public static void playGame()
			{
				System.out.println("Where would you like to aim?");
				String target = Battleship.userInput.nextLine();
				switch (target)
				{
				case "C3":
					System.out.println("It's a hit!");
					break;
				case "C4":
					System.out.println("It's a hit!");
					break;
				}
			
			}
	}
