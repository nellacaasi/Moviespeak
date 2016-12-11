package models;

public class Rating {
	static Long counter = 0l;
	
	public Long id;
	
	public String title;
	public String comment;
	public int score;
	
	public Rating(String title, String comment, int score){
		this.id		= counter++;
		this.title	= title;
		this.comment= comment;
		this.score 	= score;
	}
}
