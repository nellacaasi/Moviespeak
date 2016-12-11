package models;

public class Movie {
	public static Long counter = 0l;
	
	public Long id;
	
	public String title;
	public String year;
	public String url;
	
	
	public Movie(String title, String year, String url){
		this.id		= counter++;
		this.title	= title;
		this.year 	= year;
		this.url 	= url;
	}
}
