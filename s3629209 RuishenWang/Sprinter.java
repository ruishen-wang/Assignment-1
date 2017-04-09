package redo;
/**
 * @author ruishen_wang
 */
import java.util.Random;

public class Sprinter extends Athlete
{
	public Sprinter(String id, String name, int age, String state)
	{
		super(id, name, age, state);
	}
	
	@Override
	public int compete(Game thisGame){
		Random  random=new Random();
		int time=random.nextInt(20%11)+10;
		return time;
	}

}
