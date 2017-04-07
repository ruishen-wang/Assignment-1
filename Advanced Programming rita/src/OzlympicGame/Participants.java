package OzlympicGame;

import java.util.ArrayList;

public class Participants
{
	private String id;
	private String name;
	private int age;
	private String state;

	public Participants(String id, String name, int age, String state)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.state = state;
	}

	public String getId()
	{
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return this.age;
	}

	public String getState()
	{
		return this.state;
	}

	public String toString()
	{
		return ("\n" + id + "  " + name + "  " + age + "  " + state);
	}

}
