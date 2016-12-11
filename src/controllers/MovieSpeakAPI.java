package controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
	 
	 List<Rating> ratingMatchesList;

	 public MovieSpeakAPI(){
		 
	 }
	 
	 public void load() throws Exception{
		  if (data.isFile()){
			  serializer.read();
			  ratingIndex = (Map<Long, Rating>) serializer.pop();
			  movieIndex = (Map<Long, Movie>) serializer.pop();
			  userIndex = (Map<Long, User>) serializer.pop();
		  }
		  else{
			  CSVLoader loader = new CSVLoader();
			  List <User> users = loader.loadUsers("moviedata/users.dat");
			  for (User user : users){
				  userIndex.put(user.getId(), user);
			  }
			 
			  List <Movie> movies = loader.loadMovies("moviedata/items.dat");
			  for (Movie movie : movies){
				  movieIndex.put(movie.getId(), movie);
			  }
			 
			  List <Rating> ratings = loader.loadRatings("moviedata/ratings.dat");
			  for (Rating rating : ratings){
				  ratingIndex.put(rating.id, rating);
			  }
		  }
	 }

	 public void store() throws Exception{
		 serializer.push(userIndex);
		 serializer.push(movieIndex);
		 serializer.push(ratingIndex);
		 serializer.write();
	 }

	 public void addUser(String firstName, String lastName, int age, String gender, String occupation){
		 User user = new User (firstName, lastName, age, gender, occupation);
		 userIndex.put(userIndex.size()+1l, user);
	 }
	 
	 public void addUser(User user) {
		 userIndex.put(user.getId(), user);
	 }
	 
	 public void addMovie(String title, String year, String url){
		 Movie movie = new Movie (title, year, url);
		 movieIndex.put(movieIndex.size()+1l, movie);
	 }

	 public void removeUser(Long id) {
		userIndex.remove(id);
	 }
	
	 public void removeMovie(Long id){
		movieIndex.remove(id);
	 }
	 
	 public void addRating(Long userID, Long movieID, int rating){
		 Rating newRating = new Rating (userID, movieID, rating);
		 ratingIndex.put(ratingIndex.size()+1l, newRating);
	 }
	 
	 public void removeRating(Long id){
		 ratingIndex.remove(id);
	 }
	
	 public void authenticate(String stringid, char[] password){
		Long id = Long.parseLong(stringid);
	 }

	@Override
	public Movie getMovie(Long movieID) {
		return movieIndex.get(movieID);
	}

	@Override
	public List<Rating> getUserRatings(Long userID1) {
		ratingMatchesList = new ArrayList<Rating>();
		for (Entry<Long, Rating> entry : ratingIndex.entrySet())
		{
			if(userID1 == entry.getValue().userID){
				ratingMatchesList.add(entry.getValue());
			}
		}
		return ratingMatchesList;
	}

	@Override
	public void getUserRecommendations(Long userID) {
		
	}

	@Override
	public void getTopTenMovies() {		
	}

}
