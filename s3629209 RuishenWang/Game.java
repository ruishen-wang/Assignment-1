package redo;
/**
 * @author ruishen_wang
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import java.util.TreeMap;

public class Game
{
	private String gameID;
	private Official referee;
	private ArrayList<Athlete> athletesList;
	private ArrayList<Integer> arrayList;

	public Game(String gameID)
	{
		this.gameID = gameID;
	}

	
	public String getID(){
		return gameID;
	}

	public void setOffical(Official referee)
	{
		this.referee = referee;
	}

	public Official getOfficial()
	{
		return referee;
	}

	public void gameResult()
	{
		System.out.println();
	}

	public void setAthlete(ArrayList<Athlete> athletesList)
	{
		this.athletesList=athletesList;
	}

	public ArrayList<Athlete> getAthlete()
	{
		return athletesList;
	}
	public void setResult(ArrayList<Integer> arrayListt)
	{
		this.arrayList=arrayListt;
	}

	public ArrayList<Integer> getResult()
	{
		return arrayList;
	}

}
