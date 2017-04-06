package OzlympicGame;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Ruishen Wang s3629209
 *
 */
public class Driver
{
	private int s;
	private int c;
	private int r;
	private String IDOfGame;
	private String referee;
	private int predictID;
	ParticipantInfo participantInfo = new ParticipantInfo();
	Scanner keyboard = new Scanner(System.in);

	// programming start!

	public void start()
	{
		// throw exceptions
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
					gameChoose();
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

			} while (numbOfMenu != 6);

			throw new Exception("invade input");

		} catch (

		Exception e)
		{
			Menu.menu();
		}

	}

	// choose the type of game
	public void gameChoose()
	{
		System.out.println("=========================================");
		Menu.Gametype();

		int gameType = keyboard.nextInt();
		switch (gameType)
		{
		case 1:
			s++;
			IDOfGame = "S0" + s;
			break;

		case 2:
			c++;
			IDOfGame = "C0" + c;
			break;

		case 3:
			r++;
			IDOfGame = "R0" + s;
			break;

		default:
			break;
		}
		System.out.println(participantInfo.athletesList);
	}

	public String getIDOfGame()
	{
		return IDOfGame;
	}

	public void predict()
	{
		System.out.println("=======================================");
		ArrayList<Athletes> athletes = participantInfo.getAthletes();
		for (int j = 0; j < athletes.size(); j++)
		{
			System.out.println((j + 1 )+ ". " + athletes.get(j).getAge());
		}
		System.out.println("Please choose one players that you predict the winner of this game:");
		int predictID = keyboard.nextInt();

	}

	public void gameStart()
	{
		// ArrayList<Athletes> athletes = participantInfo.getAthletes();
		// ArrayList<Integer> finalList = new ArrayList<Integer>();
		// TreeMap<Integer, Athletes> athleteAndResult = new TreeMap<Integer,
		// Athletes>();
		// Game game =null;
		//
		// boolean done=false;
		// while (!done)
		// {
		// for (int i = 0; i < athletes.size(); i++)
		// {
		// int score = athletes.get(i).compete();
		// finalList.add(score);
		// athleteAndResult.put(score, athletes.get(i));
		// }
		// Set<Integer> set = new HashSet<Integer>(finalList);
		// if (finalList.size() == set.size())
		// {
		// break;
		//
		// }
		//
		// }
		//
		// int randomNum = (int) (Math.random() * 4);
		// Officials referee = participantInfo.getOfficials()[randomNum];
		// System.out.println("The referee is " + referee.getName());
		// game.setReferee(referee);
		// game.setAthleteAndResult(athleteAndResult);
		// Collections.sort(finalList);
		//
		// // Important to judge if prediction is correct.
		// String winnerID = (athleteAndResult.get(finalList.get(0)).getId());
		//
		// if ( (athletes.get(predictID-1).getId()).equals(winnerID))
		// {
		// System.out.println("Congratulations! Your prediction is correct!");
		// } else
		// {
		// System.out.println("Wrong prediction. Better luck next time.");
		// }
		//
		// // to add points for each athletes
		//
		// for (int result : finalList)
		// {
		// System.out.println((finalList.indexOf(result) + 1) + ". "
		// + athleteAndResult.get(result).getName() + ": " + result);
		// if (finalList.indexOf(result) == 0)
		// {
		// athleteAndResult.get(result).setPoint(5);
		// }
		// if (finalList.indexOf(result) == 1)
		// {
		// athleteAndResult.get(result).setPoint(2);
		// }
		// if (finalList.indexOf(result) == 2)
		// {
		// athleteAndResult.get(result).setPoint(1);
		// }
		// }
	}

	public void displayGame()
	{

	// ArrayList<Game> games = participantInfo.getGames();
	//
	// for (Game oneGame : games)
	// {
	// oneGame.printResult();
	//
	// }
	//
	}
	//
	public void displayAthletes()
	{
		// Athletes[] a =participantInfo.athletesList;
		// for (Athletes result : a) {
		// System.out.println(result.getId() + "." + result.getName() + ": " +
		// result.getPoint());
		// }
	}

	//
	public void gameExit()
	{
		// System.out.println("Leave The Game");
		// System.exit(0);
	}
	//
}
