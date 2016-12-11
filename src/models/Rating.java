package models;

public class Rating {
	public static Long counter = 0l;
	
	public Long id;
	
	public long userID;
	public long movieID;
	
	public Rating(long userID, long movieID, int rating){
		this.id		= counter++;
		this.userID	= userID;
		this.movieID = movieID;
	}

	@Override
	public String toString() {
		return "Rating [id=" + id + ", userID=" + userID + ", movieID=" + movieID + "]";
	}
}
