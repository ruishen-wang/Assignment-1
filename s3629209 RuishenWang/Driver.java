package redo;

/**
 * @ruishen_wang
 *3629209
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Driver
{
	private int s;
	private int c;
	private int r;
	private String gameID;
	private int gameType;
	private String predictID;

	private TreeMap<String, Game> gameList;

	Scanner keyboard = new Scanner(System.in);
	ParticipantInfo test = new ParticipantInfo();
	ArrayList<Integer> arrayList = new ArrayList<>();
	TreeMap<Integer, Athlete> list = new TreeMap<>();
	ArrayList<Athlete> atheletList = new ArrayList<>();

	Game thisGame;
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
			System.out.println("invade input, please enter again!" + "\n");
			start();// restart
		}

	}

	// choose the type of game
	public void gameChoose()
	{
		System.out.println("=========================================");
		Menu.Gametype();
		gameType = keyboard.nextInt();
		switch (gameType)
		{
		case 1:
			s++;
			gameID = "S0" + s;
			thisGame = new Swimming(gameID);
			break;

		case 2:
			c++;
			gameID = "C0" + c;
			thisGame = new Cycling(gameID);
			break;

		case 3:
			r++;
			gameID = "R0" + s;
			thisGame = new Running(gameID);
			break;

		default:
			break;
		}
		System.out.println();
	}

	// prediction
	public void predict()
	{
		System.out.println("=======================================");
		test.athletesList(gameType);
		test.showPre();
		System.out.println("Please choose one players that you predict will be the winner:");
		predictID = keyboard.next();// can not use nextln()
		String junk = keyboard.nextLine();// avoid
		System.out.println();

	}

	public void gameStart()
	{
		/*
		 * if(predictID.equals(test.athleteResult(thisGame).firstEntry().
		 * getValue())){ System.out.println(
		 * "Congratulation! You prediction is correct."); }else
		 * System.out.println("Sorry! your prediction is wrong.");
		 */
		// split TreeMap into arrylist and athleteList to store time and
		// athletes separately
		TreeMap<Integer, Athlete> list = new TreeMap<>();
		list.putAll(test.athleteResult(thisGame));
		arrayList.addAll(list.keySet());// sorted time
		atheletList.addAll(list.values());// sorted athletes
		String winnerID = atheletList.get(0).getId();
		// String
		// winnerID=test.athleteResult(thisGame).firstEntry().getValue().getId();
		if (predictID.equals(winnerID))
		{
			System.out.println("Congratulation! You prediction is correct. ");
		} else
			System.out.println("Sorry! your prediction is wrong. The winner is " + winnerID);

		System.out.println();

		// add points for top 3
		thisGame.setOffical(test.setReferee());
		for (int i = 0; i < 3; i++)
		{
			if (i == 0)
			{
				atheletList.get(0).setScore(5);
			} else if (i == 1)
			{
				atheletList.get(1).setScore(2);
			} else if (i == 2)
			{
				atheletList.get(2).setScore(1);
			}
		}
		System.out.println();
	}

	// just present recent game but do not save all result. thinking of Map or
	// arraylist
	private void displayGame()
	{
		Game newGame = new Game(gameID);

		System.out.println("Game ID: " + thisGame.getID() + "   Official: "
				+ thisGame.getOfficial().getName());
		for (int i = 0; i < arrayList.size(); i++)
		{

			// System.out.printf("%4s,%9s,%4d,%4s,%2d ",
			// atheletList.get(i).getId(),
			// atheletList.get(i).getName(), atheletList.get(i).getAge(),
			// atheletList.get(i).getState(), arrayList.get(i).intValue());
			System.out.printf("%4s,%9s,%4d,%4s,%2d ", atheletList.get(i).getId(),
					atheletList.get(i).getName(), atheletList.get(i).getAge(),
					atheletList.get(i).getState(), arrayList.get(i).intValue());
			System.out.println();

		}
		System.out.println();
	}

	private void displayAthletes()
	{
		test.allAthelets();

		// clear arraylist
		test.athleteResult(thisGame).clear();
		atheletList.clear();
		arrayList.clear();
		System.out.println();
	}

	private void gameExit()
	{
		System.out.println("Leave The Game");
		System.exit(0);
	}

}
