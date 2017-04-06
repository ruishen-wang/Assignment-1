package OzlympicGame;

import java.util.Random;

public class SuperAthlete extends Athletes
{
	private int game;
	// SuperAthlete s001 = new SuperAthlete("s001", "Superman", 30, "VIC");
	// SuperAthlete s002= new SuperAthlete("s002", "Ironman", 40, "NSW");
	// SuperAthlete s003= new SuperAthlete("s003", "Batman", 35, "ACT");
	// SuperAthlete s004 = new SuperAthlete("s004", "Spiderman", 15, "SA");

	public SuperAthlete(String id, String name, int age, String state)
	{
		super(id, name, age, state);
		// this.game = game;
	}

	public int compete()
	{
		Random random = new Random();

		int Min, Max;
		switch (this.game)
		{
		case 1:
			Min = 10;
			Max = 20;
			break;
		case 2:
			Min = 100;
			Max = 200;
			break;
		case 3:
			Min = 500;
			Max = 800;
			break;
		default:
			Min = 0;
			Max = 0;
			break;
		}

		return (random.nextInt(Max % (Max - Min + 1)) + Min);
	}
}
