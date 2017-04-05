package OzlympicGame;

public class Athletes {
  //private instance variables
  private String id;
  private String name;
  private int age;
  private String state;
  private double record;
  private int points;
  
  //The constructor
  public Athletes(String id, String name, int age, String state, double record, int points){
	  this.id = id;
	  this.name = name;
	  this.age = age;
	  this.state = state;
	  this.record = record;
	  this.points = points;
  }
  
  
  //methods
  public String getId(){
	  return id;
  }
  public String getName(){
	  return name;
  }
  public String getState(){
	  return state;
  }
  public double getrecord(){
	  return record;
  }
  public double setRecord(value){
	  this.record = value;
  }
  public Complete(){
	 /* if complete() method run swimming, return math.random 100-200s.
	  * else if complete() method runs cycling, return math.random 500-800s
	  * else return math.random 10-20s
	  */
  }
}