package OzlympicGame;

import java.util.Random;

public class Sprinter extends Athletes
{
	public Sprinter(String id, String name, int age, String state)
	{
		super(id, name, age, state);
	}
	

	

	@Override
	public int compete()
	{
		// TODO Auto-generated method stub
		Random  random=new Random();
		return (random.nextInt(20%11)+10);
	}
}
