package olyzapicgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.corba.se.spi.legacy.connection.LegacyServerSocketEndPointInfo;
import com.sun.webkit.ThemeClient;


public class Game
{
	
	int n;
	private String referee;
	 
	public Game(String IDOfGame, String referee)
	{
		String id=IDOfGame;
		this.referee=referee;
	}

	public static void main(String[] args)
	{
		int running=1;
		Scanner in = new Scanner(System.in);

		try
		{
			while (running==1)
			{

				Menu.menu();
				int numbOfMenu = in.nextInt();
				GameManager test=new GameManager();
				test.operationOfMenu(numbOfMenu);
				
				if (numbOfMenu > 6)
				{
					throw new Exception("Invaid operation");
				}
				
			}
			} 
			catch (Exception e)
			{
				Menu.menu();

			}	

	}
}
	