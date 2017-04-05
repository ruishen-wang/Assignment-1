package olyzapicgame;

import java.util.HashMap;
import java.util.Scanner;

public class Driver
{
	HashMap<String, String> gameMap= new HashMap<String,String>();
	private int s ;
	private int c ;
	private int r ;
	private String IDOfGame;
	private String referee;
	
	public Scanner keyboard = new Scanner(System.in);
	public void start(){

		try
		{
			int numbOfMenu;
			do
			{	
				Menu.menu();
				numbOfMenu = keyboard.nextInt();
				
				switch (numbOfMenu)
				{
				case 1:
					gameRun();
					break;

				case 2:
					predict();
					break;

				case 3:
					gameStart();
					break;

				case 4:
					displayGame();
					break;

				case 5:
					displayAthletes();
					break;

				case 6:
					gameExit();
					break;

				default:
					break;
				}
				
			} while (numbOfMenu!=6);
			

				{
					throw new Exception("Invaid operation");
				}
				
			
			} 
			catch (Exception e)
			{
				Menu.menu();

			}	

	}
	
	public void gameRun()
	{
		
		Menu.Gametype();

		int gameType = keyboard.nextInt();

		switch (gameType)
		{
		case 1:
			s++;
			IDOfGame = "S0"+s;
			referee="Jay";
			break;

		case 2:
			c++;
			IDOfGame = "C0" + c;
			referee="Ray";

			break;

		case 3:
			r++;
			IDOfGame = "R0" + s;
			referee="Tay";
			break;

		default:
			break;
		}
		
		gameMap.put(IDOfGame, referee);
		System.out.println(gameMap);
	}

	public void predict()
	{

	}
	
	public int caculation(int x, int y){
		return (int)(Math.random()*(y-x))+x;
	}

	public void gameStart()
	{
		
	}

	public void displayGame()
	{
		
	}

	public void displayAthletes()
	{

	}

	public void gameExit()
	{
		System.out.println("Leave The Game");
		System.exit(0);
	}

	
}
