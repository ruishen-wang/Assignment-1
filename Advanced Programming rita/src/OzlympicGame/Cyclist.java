package OzlympicGame;

import java.util.Random;

public class Cyclist extends Athletes 
{
	public Cyclist(String id, String name, int age, String state)
	{
		super(id, name, age, state);
	}
	
	@Override
	public int compete()
	{
		// Random a record here
		Random random=new Random();
		return  (random.nextInt(800%301)+500);
	}

}
