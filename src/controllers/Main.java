package controllers;

import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;
import models.User;
import utils.CSVLoader;
import utils.Serializer;
import utils.XMLSerializer;

public class Main{
	
	static MovieSpeakAPI movieSpeak;
	
	public static void main(String[] args) throws Exception{
		movieSpeak = new MovieSpeakAPI();
		movieSpeak.load();
		
		Main main = new Main();
		Shell shell = ShellFactory.createConsoleShell("Moviespeak", "Moviespeak Movie System - Type ?list for commands and ?help for instructions", main);
		shell.commandLoop();
		movieSpeak.store();
	}

	@Command(description="Add a new User")
	 public void addUser (@Param(name="first name") String firstName, @Param(name="last name") String lastName,
		@Param(name="age")int age, @Param(name="gender") String gender, @Param(name="occupation") String occupation) throws Exception{
		movieSpeak.addUser(firstName, lastName, age, gender, occupation);
	 }

	 @Command(description="Delete a User")
	 public void removeUser (@Param(name="id") Long id){
		 movieSpeak.removeUser(id);
	 }
	 
	 @Command(description="Add a Movie")
	 public void addMovie (@Param(name="title") String title, @Param(name="year") String year, @Param(name="url") String url){
		 movieSpeak.addMovie(title, year, url);
	 }
	 
	 @Command(description="Add a Rating")
	 public void addRating (@Param(name="userID") Long userID, @Param(name="movieID") Long movieID, @Param(name="rating") int rating){
		 movieSpeak.addRating(userID,movieID,rating);
	 }
	 
	 @Command(description="Delete a Movie")
	 public void removeMovie (@Param(name="id") Long id){
		 movieSpeak.removeMovie(id);
	 }
	 
	 @Command(description="Return a users ratings")
	 public void getUserRatings(@Param(name="id") Long id){
		 System.out.println(movieSpeak.getUserRatings(id).toString());
	 }
}