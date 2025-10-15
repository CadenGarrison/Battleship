
public class PlayGame
	{	
	static boolean isPlaying = true;
	static int enemyShips = 2;
	static int targetRow;
	static String target;
	static int targetCol;
	
		public static void playGame()
			{
				while (isPlaying = true)
					{
						if (enemyShips != 0)
							{
				System.out.println("Now where would you like to aim?");
				target = Battleship.userInput.nextLine();
				translateToCoordinates();
				
				for (int row = 0; row < 5; row++ )
					{
						for (int col = 0; col < 5; col++)
							{
								if (Board.enemy[targetRow][targetCol].equals(Board.enemy[row][col]))
											{
												System.out.println("It's a hit!");
												enemyShips -= 0.4;
												playGame();
											}
								// We want to compare Board.enemy[targetRow][targetCol] to every index in Board.enemy
							}
						
					}	
				System.out.println("It's a miss!");
				playGame();
				//It works! Now we need to track hits
							}
						else if (enemyShips==0)
						{
							System.out.println("You win!");
							System.exit(0);
						}
						else
						{
							playGame();
						}
					}
				
					
				}
			
		public static void translateToCoordinates()
		{
			target.toUpperCase();
			
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
