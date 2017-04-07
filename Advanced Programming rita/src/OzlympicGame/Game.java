package OzlympicGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Game
{
	private TreeMap<Integer, Athletes> athleteAndResult;
	private String refereeName;
	
	private String gameID;
	private ArrayList<Game> games;
	private Officials official;

	public Game(String IDOfGame)
	{
		gameID = IDOfGame;
		
	}

	public String getGameID(String gameID)
	{
		return gameID;
	}

	public void setGameID(String gameID)
	{
		this.gameID = gameID;
	}

	//get the official for each game
		public void saveOfficial(Officials official) {
			this.official= official;
		}
	

	public TreeMap<Integer, Athletes> getAthleteAndResult()
	{
		return this.athleteAndResult;
	}
	
	public void setAthleteAndResult(TreeMap<Integer, Athletes> athleteAndResult){
		this.athleteAndResult=athleteAndResult;
	}

	public void addGame(Game game)
	{
		this.games.add(game);
	}

	public ArrayList<Game> getGames()
	{
		return this.games;
	}

	public void printResult()
	{
		Set<Integer> keys = athleteAndResult.keySet();
		Integer[] results = keys.toArray(new Integer[keys.size()]);
		Arrays.sort(results);
		System.out.println(gameID);
		System.out.println("Referee is : " + refereeName);
		for (int i = 0; i < results.length; i++)
		{
			System.out.println((i + 1) + ". " + athleteAndResult.get(results[i]).getName() + ": "
					+ results[i]);
		}
	}


}
