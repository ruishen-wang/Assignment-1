package OzlympicGame;

import java.util.ArrayList;

public class ParticipantInfo
{
	Athletes[] athletesList = new Athletes[8];
	Officials[] officialsList = new Officials[3];
	private ArrayList<Game> games;
	ArrayList<Officials> refereeList = new ArrayList<Officials>();
	

	public Athletes[] athletesList(int choice)
	{
		athletesList[0] = new SuperAthlete("s001", "Superman", 30, "VIC");
		athletesList[1] = new SuperAthlete("s002", "Ironman", 40, "NSW");
		athletesList[2] = new SuperAthlete("s003", "Batman", 35, "ACT");
		athletesList[3] = new SuperAthlete("s004", "Spiderman", 15, "SA");
		switch (choice)
		{
		case 1:
			athletesList[4] = new Swimmer("s111", "Bass", 10, "VIC");
			athletesList[5] = new Swimmer("s222", "Cod", 15, "NSW");
			athletesList[6] = new Swimmer("s333", "Dolphin", 20, "QLD");
			athletesList[7] = new Swimmer("s444", "Salmon", 25, "TAS");
			break;

		case 2:
			athletesList[4] = new Cyclist("c111", "Peter", 34, "NSW");
			athletesList[5] = new Cyclist("c222", "Cod", 15, "NSW");
			athletesList[6] = new Cyclist("c333", "Dolphin", 20, "QLD");
			athletesList[7] = new Cyclist("c444", "Salmon", 25, "TAS");
			break;
		case 3:
			athletesList[4] = (new Sprinter("r111", "Tiger", 17, "ACT"));
			athletesList[5] = (new Sprinter("r222", "Kangroo", 15, "WA"));
			athletesList[6] = (new Sprinter("r333", "Ostrich", 34, "QLD"));
			athletesList[7] = (new Sprinter("r444", "Leopard", 20, "TAS"));
			break;

		default:
			break;
		}
		return athletesList;
	}
	

	public ArrayList<Athletes> getAthletes() {
		ArrayList<Athletes> result = new ArrayList<Athletes>();
		for (int i = 0; i < athletesList.length; i++)
		{
			result.add(athletesList[i]);
		}
		
		return result;
	}
		
		
	public void referrList()
	{
		officialsList[0]=new Officials("O01", "Rita", 26, "VIC");
		officialsList[1]=(new Officials("O02", "Lei", 20, "QLD"));
		officialsList[2]=(new Officials("O03", "Rei", 22, "NT"));
		officialsList[3]=(new Officials("O04", "Kay", 32, "TAS"));

	}
	public Officials[] getOfficials() {
		return officialsList;
	}


	public ArrayList<Game> getGames()
	{
		// TODO Auto-generated method stub
		return this.games;
	}
	
//	public Athletes[] getAthletes() {
//		return athletesList;
//	}
	
	


}
