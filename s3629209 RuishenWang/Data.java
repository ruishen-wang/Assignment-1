package redo;
/**
 * 
 * @author ruishen_wang
 * 
 */

public interface Data
{
	SuperAthlete p1 = new SuperAthlete("s001", "Superman", 30, "VIC");
	SuperAthlete p2 = new SuperAthlete("s002", "Ironman", 40, "NSW");
	SuperAthlete p3 = new SuperAthlete("s003", "Batman", 35, "ACT");
	SuperAthlete p4 = new SuperAthlete("s004", "Spiderman", 15, "SA");
	Sprinter r1 = new Sprinter("r111", "Tiger", 17, "ACT");
	Sprinter r2 = new Sprinter("r222", "Kangroo", 15, "WA");
	Sprinter r3 = new Sprinter("r333", "Ostrich", 34, "QLD");
	Sprinter r4 = new Sprinter("r444", "Leopard", 20, "TAS");
	Swimmer s1 = new Swimmer("s111", "Bass", 10, "VIC");
	Swimmer s2 = new Swimmer("s222", "Cod", 15, "NSW");
	Swimmer s3 = new Swimmer("s333", "Dolphin", 20, "QLD");
	Swimmer s4 = new Swimmer("s444", "Salmon", 25, "TAS");
	Cyclist c1 = new Cyclist("c111", "Peter", 34, "NSW");
	Cyclist c2 = new Cyclist("c222", "Luke", 15, "NSW");
	Cyclist c3 = new Cyclist("c333", "Lucy", 20, "QLD");
	Cyclist c4 = new Cyclist("c444", "Boby", 25, "TAS");
	
	public Athlete[] athletesList=new Athlete[8];
	
	
}
