
public class PlayGame
	{	
	static boolean isPlaying = true;
	static int enemyShips;
	static int targetRow;
	static String target;
	static int targetCol;
	
		public static void playGame()
			{
				while (isPlaying = true)
					{
						if (enemyShips != 0)
							{
				System.out.println("Where would you like to aim?");
				target = Battleship.userInput.nextLine();
				translateToCoordinates();
				for (int row = 0; row < Board.enemy.length; row++ )
					{
						for (int col = 0; col < Board.enemy[0].length; row++)
							{
								if (Board.enemy[row][col].equals(Board.enemy[targetRow][targetCol]))
											{
												System.out.println("It's a hit!");
											}
								// We want to compare Board.enemy[targetRow][targetCol] to every index in Board.enemy
							}
					}
				// Need parameters for non-hits
			
			}
			}
		public static void translateToCoordinates()
		{
			if (target.substring(0,1).equals("A"))
				{
					targetRow = 0;
								
				}
		else if (target.substring(0,1).equals("B"))
			{
					targetRow = 1;	
			}
		else if (target.substring(0,1).equals("C"))
			{
				targetRow = 2;
			}
		else if (target.substring(0,1).equals("D"))
			{
				targetRow = 3;
			}
		else if (target.substring(0,1).equals("E"))
			{
				targetRow = 4;
			}
		
		// Now for the columns
		if (target.substring(1,2).equals("1"))
			{
				targetCol = 0;
							
			}
	else if (target.substring(1,2).equals("2"))
		{
				targetCol = 1;	
		}
	else if (target.substring(1,2).equals("3"))
		{
			targetCol = 2;
		}
	else if (target.substring(1,2).equals("4"))
		{
			targetCol = 3;
		}
	else if (target.substring(1,2).equals("5"))
		{
			targetCol = 4;
		}
		}
	}
