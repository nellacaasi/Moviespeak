package models;

public class Rating {
	public static Long counter = 0l;
	
	public Long id;
	
	public long userID;
	public long movieID;
	public int score;
	public double timestamp;
	
	public Rating(long userID, long movieID, int rating, double timestamp){
		this.id		= counter++;
		this.userID	= userID;
		this.movieID = movieID;
		this.score = score;
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Rating [id=" + id + ", userid=" + userID + ", score=" + score + ", timestamp=" + timestamp + "]";
	}
}
