package models;

public class Rating {
	
	public Long id;
	
	public long userID;
	public long movieID;
	
	public Rating(long userID, long movieID, int rating){
		this.id		= null;
		this.userID	= userID;
		this.movieID = movieID;
	}

	@Override
	public String toString() {
		return "Rating [id=" + id + ", userID=" + userID + ", movieID=" + movieID + "]";
	}
}
