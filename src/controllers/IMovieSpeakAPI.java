package controllers;

import java.util.List;

import models.Movie;
import models.Rating;

public interface IMovieSpeakAPI {
	
	public void addUser(String firstName, String lastName, int age,String gender,String occupation);
	
	public void removeUser(Long userID);
	
	public void addMovie(String title, String year, String url);
	
	public void addRating(Long userID, Long movieID, int rating);
	
	public Movie getMovie(Long movieID);
	
	public List<Rating> getUserRatings(Long userID);
	
	public void getUserRecommendations(Long userID);
	
	public void getTopTenMovies();
	
	public void load() throws Exception;
	
	public void store() throws Exception;
}
