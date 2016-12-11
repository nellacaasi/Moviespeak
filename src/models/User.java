package models;

import java.util.ArrayList;
import java.util.List;

public class User {
	public static Long counter = 0l;
	
	public Long id;
	public String firstName;
	public String lastName;
	public String gender;
	public String age;
	public String occupation;
	
	public List <Rating> ratings = new ArrayList<>();
	
	public User(String firstName, String lastName, String gender, String age, String occupation){
		this.id			= counter++;
		this.firstName 	= firstName;
		this.lastName	= lastName;
		this.gender		= gender;
		this.age		= age;
		this.occupation	= occupation;
	}
}
