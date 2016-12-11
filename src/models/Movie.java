package models;

public class Movie {
	
	private Long id;
	
	private String title;
	private String year;
	private String url;
	
	
	public Movie(String title, String year, String url){
		this.id		= null;
		this.title	= title;
		this.year 	= year;
		this.url 	= url;
	}


	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", url=" + url + "]";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
}
