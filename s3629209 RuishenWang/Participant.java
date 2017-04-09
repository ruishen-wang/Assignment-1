package redo;
/**
 * 
 * @author ruishen_wang
 *
 */

public class Participant
{
	private String id;
	private String name;
	private int age;
	private String state;

	public Participant(String id, String name, int age, String state)
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
	

}
