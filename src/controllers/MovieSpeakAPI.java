package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Movie;
import models.Rating;
import models.User;
import utils.CSVLoader;
import utils.XMLSerializer;

public class MovieSpeakAPI {
	 public Map<Long, User> userIndex = new HashMap<>();
	 public Map<Long, Movie> movieIndex = new HashMap<>();
	 public Map<Long, Rating> ratingIndex = new HashMap<>();
	 
	 public XMLSerializer serializer;

	 public MovieSpeakAPI(){
		 
	 }
	 
	 public void load() throws Exception
	 {
	 serializer.read();
	 userIndex = (Map<Long, User>) serializer.pop();
	 movieIndex = (Map<Long, Movie>) serializer.pop();
	 ratingIndex = (Map<Long, Rating>) serializer.pop();
	 User.counter = (Long) serializer.pop();
	 }

	 public void store() throws Exception{
		 serializer.push(userIndex);
		 serializer.push(movieIndex);
		 serializer.push(ratingIndex);
		 serializer.push(User.counter);
		 serializer.write();
	 }
	 
	 public void prime() throws Exception{
		 CSVLoader loader = new CSVLoader();
		 List <User> users = loader.loadUsers("moviedata_small/users5.dat");
		 for (User user : users){
			 userIndex.put(user.id,user);
		 }
		 
		 List <Movie> movies = loader.loadMovies("moviedata_small/items5.dat");
		 for (Movie movie : movies){
			 movieIndex.put(movie.id, movie);
		 }
		 
		 List <Rating> ratings = loader.loadRatings("moviedata_small/ratings5.dat");
		 for (Rating rating : ratings){
			 ratingIndex.put(rating.id, rating);
		 }
	 }

	 public User addUser(String firstName, String lastName, String age, String gender, String occupation){
		 User user = new User (firstName, lastName, age, gender, occupation);
		 userIndex.put(user.id, user);
		 return user;
	 }
	 
	 public Movie addMovie(String title, String year, String url){
		 Movie movie = new Movie (title, year, url);
		 movieIndex.put(movie.id, movie);
		 return movie;
	 }

	public void removeUser(Long id) {
		userIndex.remove(id);
	}
	
	public void authenticate(String stringid, char[] password){
		Long id = Long.parseLong(stringid);
	}
}
