package OzlympicGame;

import java.util.Random;

public abstract class Athletes extends Participants
{
	// private instance variables

	private int points;
	private int result;
	// The constructor
	
	public Athletes(String id, String name, int age, String state){
		super(id, name, age, state);
		points=0;
	}
	// this.record = record;
	// this.points = points;
	
	
	  public int getResult(){
		  return result;
	  }

	  public void setResult(int result){
		  this.result = result;
	  }
	
	  
	public int getPoint()
	{
		return points;
	}
	
	public void setPoint(int x)
	{
		 points+=x;
	}
	
	public int compete(){
		return 0;
		
	}
	
}