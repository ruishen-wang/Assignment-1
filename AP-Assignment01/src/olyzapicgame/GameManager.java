package olyzapicgame;

import java.util.Scanner;

public class GameManager
{
	
	private int s ;
	private int c ;
	private int r ;
	private String IDOfGame;
	
	
	public void operationOfMenu(int numbOfMenu)
	{
		switch (numbOfMenu)
		{
		case 1:
			gameRun();
			break;

		case 2:
			predict();
			break;

		case 3:
			start();
			break;

		case 4:
			displayGame();
			break;

		case 5:
			displayAthletes();
			break;

		case 6:
			gameExit();
			System.out.println("Leave The Game");
			System.exit(0);
			break;

		default:
			break;
		}
		
	}

	public void gameRun()
	{
		
		Scanner keyboard = new Scanner(System.in);
		Menu.Gametype();

		int gameType = keyboard.nextInt();

		switch (gameType)
		{
		case 1:
			s++;
			IDOfGame = "S" + s;
			break;

		case 2:
			c++;
			IDOfGame = "C" + c;
			break;

		case 3:
			r++;
			IDOfGame = "R" + s;
			break;

		default:
			break;
		}
		System.out.println(IDOfGame);
	}

	public void predict()
	{

	}

	public void start()
	{
		for (int i = 0; i < array.length; i++)
		{
			Result;
		}
	}

	public void displayGame()
	{
		
	}

	public void displayAthletes()
	{

	}

	public void gameExit()
	{
		
	}

}


