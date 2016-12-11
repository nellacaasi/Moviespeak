package models;

public class Rating {
	public static Long counter = 0l;
	
	public Long id;
	
	public long userid;
	public int score;
	public double timestamp;
	
	public Rating(long userid, int score, double timestamp){
		this.id		= counter++;
		this.userid	= userid;
		this.score = score;
		this.timestamp = timestamp;
	}
}
