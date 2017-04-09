package redo;

/**
 * 
 * @author ruishen_wang
 *
 */

public abstract class Athlete extends Participant
{
	private int score;
	private double time;
	public Athlete(String id, String name, int age, String state){
		super(id, name,age,state);
		this.score=score;
	}

	public abstract int compete(Game thisGame);

	public int getScore() {
		return score;
	}

	public void setScore(int point) {
		this.score=score+point;
	}

	

}
