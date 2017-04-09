package redo;
/**
 * @author ruishen_wang
 */
import java.util.Random;

public class SuperAthlete extends Athlete 
{
	public SuperAthlete(String id, String name, int age, String state){
		super(id, name, age, state);
	}
	
	@Override
	public int compete(Game thisGame) {
		int time;
		Random random = new Random();
		if (thisGame instanceof Running) {
			time=random.nextInt(20%11)+10;
		} else if (thisGame instanceof Swimming){
			time=random.nextInt(200%101)+100;
		} else 
		{
			time=random.nextInt(800%301)+500;
		}
		return time;
	}



}
