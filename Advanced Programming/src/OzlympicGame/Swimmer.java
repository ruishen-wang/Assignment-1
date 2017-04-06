package OzlympicGame;

import java.util.Random;

public class Swimmer extends Athletes {
	public Swimmer(String id, String name, int age, String state){
		  super(id, name, age, state);
	  }
	
    @Override  
	public int compete()
	{
		// Random a record here
		Random  random=new Random();
		return (random.nextInt(200%101)+100);
	}

	
}
