package redo;
/**
 * @author ruishen_wang
 */
import java.util.Random;

public class Swimmer extends Athlete {
	
	public Swimmer(String id, String name, int age, String state){
		  super(id, name, age, state);
	  }
	
	 @Override  
		public int compete(Game thisGame)
		{
			// Random a record here
			Random  random=new Random();
		    int time=random.nextInt(200%101)+100;
		    return time;
			}
} 
	 
