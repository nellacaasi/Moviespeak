package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import models.Movie;
import models.Rating;
import models.User;
import edu.princeton.cs.introcs.*;

public class CSVLoader{
	public List<User> loadUsers(String filename) throws Exception{
		File usersFile = new File(filename);
		In inUsers = new In(usersFile);

		String delims = "[|]";
		List<User> users = new ArrayList<User>();
		while (!inUsers.isEmpty()){
			String userDetails = inUsers.readLine();
			String[] userTokens = userDetails.split(delims);
			if (userTokens.length == 7){
				Long id = Long.parseLong(userTokens[0]);
				String firstName = userTokens[1];
				String lastName = userTokens[2];
				int age = Integer.parseInt(userTokens[3]);
				String gender = userTokens[4];
				String occupation = userTokens[5];
				int zipcode = Integer.parseInt(userTokens[6]);
				users.add(new User(id,firstName, lastName, age, gender, occupation, zipcode));
			}
			
			else{
				throw new Exception("Invalid member length: " + userTokens.length);
			}
		}
		return users;
	}
	
	 public List<Movie> loadMovies (String filename) throws Exception{
		 File moviesFile = new File(filename);
			In inMovies = new In(moviesFile);
	
			String delims = "[|]";
			List<Movie> movies = new ArrayList<Movie>();
			while (!inMovies.isEmpty()){
				String movieDetails = inMovies.readLine();
				String[] movieTokens = movieDetails.split(delims);
				if (movieTokens.length > 4){
					String id = movieTokens[0];
					String title = movieTokens[1];
					String year = movieTokens[2];
					String url = movieTokens[3];
					movies.add(new Movie(title, year, url));
				}
				
				else{
					throw new Exception("Invalid member length: " + movieTokens.length);
				}
			}
			return movies;
	 }
	 
	 public List<Rating> loadRatings (String filename) throws Exception{
		 File ratingsFile = new File(filename);
			In inRatings = new In(ratingsFile);
	
			String delims = "[|]";
			List<Rating> ratings = new ArrayList<Rating>();
			while (!inRatings.isEmpty()){
				String ratingDetails = inRatings.readLine();
				String[] ratingTokens = ratingDetails.split(delims);
				if (ratingTokens.length >= 4){
					Long userid = Long.parseLong(ratingTokens[0]);
					int score = Integer.parseInt(ratingTokens[1]);
					double timestamp = Double.parseDouble(ratingTokens[2]);
					ratings.add(new Rating(userid, score, score, timestamp));
				}
				
				else{
					throw new Exception("Invalid member length: " + ratingTokens.length);
				}
			}
			return ratings;
	 }
}