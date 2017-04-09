package redo;

/**
 * @author ruishen_wang
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ParticipantInfo implements Data
{
	private Official[] officialList = new Official[4];
	private TreeMap<Integer, Athlete> resultMap;
	private ArrayList<Game> games;

	public Athlete[] athletesList(int choice)
	{
		athletesList[0] = p1;
		athletesList[1] = p2;
		athletesList[2] = p3;
		athletesList[3] = p4;
		switch (choice)
		{
		case 1:
			athletesList[4] = s1;
			athletesList[5] = s2;
			athletesList[6] = s3;
			athletesList[7] = s4;
			break;

		case 2:
			athletesList[4] = c1;
			athletesList[5] = c2;
			athletesList[6] = c3;
			athletesList[7] = c4;
			break;
		case 3:
			athletesList[4] = r1;
			athletesList[5] = r2;
			athletesList[6] = r3;
			athletesList[7] = r4;
			break;

		default:
			break;
		}
		return athletesList;
	}

	public void showPre()
	{

		for (int i = 0; i < athletesList.length; i++)// not oosd!!!!
		{
			System.out.println(athletesList[i].getId() + " " + athletesList[i].getName());
		}
	}

	// sort athlete and get the time
	public TreeMap<Integer, Athlete> athleteResult(Game thisGame)
	{
		resultMap = new TreeMap<Integer, Athlete>(new Comparator<Integer>()
		{

			public int compare(Integer a, Integer b)
			{
				return b - a;
			}
		});

		for (int i = 0; i < athletesList.length; i++)
		{
			int time = athletesList[i].compete(thisGame);
			// resultMap.put(time, athletesList[i].getId());
			resultMap.put(time, athletesList[i]);

		}
		return resultMap;

	}

	// get random referee
	public Official setReferee()
	{
		officialList[0] = new Official("O01", "Rita", 26, "VIC");
		officialList[1] = new Official("O02", "Lei", 20, "QLD");
		officialList[2] = new Official("O03", "Rei", 22, "NT");
		officialList[3] = new Official("O04", "Kay", 32, "TAS");
		int randomNum = (int) (Math.random() * 4);
		return officialList[randomNum];
	}

			public void addGame(Game thisGame){
				 games.add(thisGame);
			}

	public ArrayList<Game> getGame()
	{
		return this.games;
	}

	// display all athletes
	public void allAthelets()
	{
		ArrayList<Athlete> allAthletes = new ArrayList<>();
		allAthletes.add(c1);
		allAthletes.add(c2);
		allAthletes.add(c3);
		allAthletes.add(c4);
		allAthletes.add(s1);
		allAthletes.add(s2);
		allAthletes.add(s3);
		allAthletes.add(s4);
		allAthletes.add(r1);
		allAthletes.add(r2);
		allAthletes.add(r3);
		allAthletes.add(r4);
		allAthletes.add(p1);
		allAthletes.add(p2);
		allAthletes.add(p3);
		allAthletes.add(p4);
		System.out.printf("%4s,%9s,%2s,%2s,%2s ", "ID", "Name", "age", "state", "points");
		System.out.println();
		for (int i = 0; i < allAthletes.size(); i++)
		{
			System.out.printf("%4s,%9s,%2d,%2s,%2d ", allAthletes.get(i).getId(),
					allAthletes.get(i).getName(), allAthletes.get(i).getAge(),
					allAthletes.get(i).getState(), allAthletes.get(i).getScore());
			System.out.println();
		}

	}

}
