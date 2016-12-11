package controllers;

import models.Movie;

public interface IMovieSpeakAPI {
	
	public void addUser(String firstName, String lastName, int age,String gender,String occupation);
	
	public void removeUser(Long userID);
	
	public void addMovie(String title, String year, String url);
	
	public void addRating(Long userID, Long movieID, int rating);
	
	public Movie getMovie(Long movieID);
	
	public void getUserRatings(Long userID);
	
	public void getUserRecommendations(Long userID);
	
	public void getTopTenMovies();
	
	public void load() throws Exception;
	
	public void store() throws Exception;
}
