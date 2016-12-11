package controllers;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Movie;
import models.Rating;
import models.User;
import utils.CSVLoader;
import utils.Serializer;
import utils.XMLSerializer;

public class MovieSpeakAPI implements IMovieSpeakAPI {
	 public Map<Long, User> userIndex = new HashMap<>();
	 public Map<Long, Movie> movieIndex = new HashMap<>();
	 public Map<Long, Rating> ratingIndex = new HashMap<>();
	 
	 public File  data = new File("data.xml");
	 public  Serializer serializer = new XMLSerializer(data);

	 public MovieSpeakAPI(){
		 
	 }
	 
	 public void load() throws Exception{
		  if (data.isFile()){
				  serializer.read();
				  userIndex = (Map<Long, User>) serializer.pop();
				  movieIndex = (Map<Long, Movie>) serializer.pop();
				  ratingIndex = (Map<Long, Rating>) serializer.pop();
				  User.counter = (Long) serializer.pop();
				  Movie.counter = (Long) serializer.pop();
				  Rating.counter = (Long) serializer.pop();
		  }
		  else{
				  CSVLoader loader = new CSVLoader();
				  List <User> users = loader.loadUsers("moviedata_small/users5.dat");
				  for (User user : users){
					  userIndex.put(user.id, user);
				  }
				 
				  List <Movie> movies = loader.loadMovies("moviedata_small/items5.dat");
				  for (Movie movie : movies){
					  movieIndex.put(movie.getId(), movie);
				  }
				 
				  List <Rating> ratings = loader.loadRatings("moviedata_small/ratings5.dat");
				  for (Rating rating : ratings){
					  ratingIndex.put(rating.id, rating);
				  }
		  }
	 }

	 public void store() throws Exception{
		 serializer.push(userIndex);
		 serializer.push(movieIndex);
		 serializer.push(ratingIndex);
		 serializer.push(User.counter);
		 serializer.push(Movie.counter);
		 serializer.push(Rating.counter);
		 serializer.write();
	 }

	 public User addUser(String firstName, String lastName, int age, String gender, String occupation, int zipcode){
		 User user = new User (firstName, lastName, age, gender, occupation, zipcode);
		 userIndex.put(user.id, user);
		 return user;
	 }
	 
	 public void addUser(User user) {
		 userIndex.put(user.id, user);
	 }
	 
	 public void addMovie(String title, String year, String url){
		 Movie movie = new Movie (title, year, url);
		 movieIndex.put(movie.getId(), movie);
	 }

	 public void removeUser(Long id) {
		userIndex.remove(id);
	 }
	
	 public void removeMovie(Long id){
		movieIndex.remove(id);
	 }
	 
	 public void addRating(Long userID, Long movieID, int rating, double timestamp){
		 Rating newRating = new Rating (userID, movieID, rating, timestamp);
		 ratingIndex.put(newRating.id, newRating);
	 }
	 
	 public void removeRating(Long id){
		 ratingIndex.remove(id);
	 }
	
	 public void authenticate(String stringid, char[] password){
		Long id = Long.parseLong(stringid);
	 }

	@Override
	public void addUser(String firstName, String lastName, int age, String gender, String occupation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMovie(Long movieID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUserRatings(Long userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUserRecommendations(Long userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTopTenMovies() {
		// TODO Auto-generated method stub
		
	}

}
