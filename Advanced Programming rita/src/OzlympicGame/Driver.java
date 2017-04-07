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
	private String predictID;
	private int predict;
	Game gameNew;
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
		participantInfo.athletesList(gameType);
		gameNew = new Game(IDOfGame);
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
			System.out.println(j + 1 + " . " + athletes.get(j).getName());
		}
		System.out.println("Please choose one players that you predict the winner of this game:");
		predict = keyboard.nextInt();
		System.out.println("you chose: " + athletes.get(predict).getId() + "  "
				+ athletes.get(predict).getName());

	}

	public void gameStart()
	{
		ArrayList<Integer> finalList=null;
		ArrayList<Athletes> athletes = participantInfo.getAthletes();
		TreeMap<Integer, Athletes> athleteAndResult =null;
		for (int i = 0; i < athlete.length; i++)
		{
			System.out.println(athletes.get(i).getName());
			
		}
		

		// generate the result, get randomly complete time base on the selected
		// game
		boolean mark = true;
		while (mark)
		{
			finalList = new ArrayList<Integer>();
			athleteAndResult = new TreeMap<>();
			for (int i = 0; i < athletes.size(); i++)
			{
				int result = athletes.get(i).compete();
				finalList.add(result);
				athleteAndResult.put(result, athletes.get(i));
				System.out.println("===============================");
			}

			Set<Integer> set = new HashSet<Integer>(finalList);
			if (finalList.size() == set.size())
			{
				mark = false;
				break;
			}

		}

		// for Test
		for (int j = 0; j < athletes.size(); j++)
		{
			System.out.println((j + 1) + ". " + athletes.get(j).getPoint());
		}

		int randomNum = (int) (Math.random() * 4);
		Officials referee = participantInfo.getOfficials()[randomNum];
		String nameOfOfficial = referee.getName();
		System.out.println("The official is " + referee.getName());
		gameNew.saveOfficial(referee);
		gameNew.setAthleteAndResult(athleteAndResult);
		Collections.sort(finalList);

		for (int ranking : finalList)
		{
			System.out.println((finalList.indexOf(ranking) + 1) + ". "
					+ athleteAndResult.get(ranking).getName() + ": " + ranking);
			if (finalList.indexOf(ranking) == 0)
			{
				athleteAndResult.get(ranking).setPoint(5);
			}
			if (finalList.indexOf(ranking) == 1)
			{
				athleteAndResult.get(ranking).setPoint(2);
			}
			if (finalList.indexOf(ranking) == 2)
			{
				athleteAndResult.get(ranking).setPoint(1);
			}
		}

		// Important to judge if prediction is correct.
		String winnerID = athleteAndResult.get(finalList.get(0)).getId();

		if (predictID.equals(winnerID))
		{
			System.out.println("Congratulations! Your prediction is correct!");
		} else
			System.out.println("Wrong prediction. Better luck next time.");
	}

	

	// to add points for each athletes

	public void displayGame()
	{

		ArrayList<Game> games = gameNew.getGames();

		for (Game oneGame : games)
		{
			oneGame.printResult();

		}

	}

	public void displayAthletes()
	{
		Athletes[] a = participantInfo.athletesList;
		for (Athletes result : a)
		{
			System.out.println(result.getId() + "." + result.getName() + ": " + result.getPoint());
		}
	}

	public void gameExit()
	{
		System.out.println("Leave The Game");
		System.exit(0);
	}

}
