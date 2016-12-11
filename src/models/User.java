package models;

import java.util.ArrayList;
import java.util.List;

public class User {
	public static Long counter = 0l;
	
	public Long id;
	public String firstName;
	public String lastName;
	public String gender;
	public int age;
	public String occupation;
	public int zipcode;
		
	public User(String firstName, String lastName, int age, String gender, String occupation, int zipcode){
		this.id			= counter++;
		this.firstName 	= firstName;
		this.lastName	= lastName;
		this.gender		= gender;
		this.age		= age;
		this.occupation	= occupation;
		this.zipcode	= zipcode;
	}
	
	public User(Long id, String firstName, String lastName, int age, String gender, String occupation, int zipcode){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + ", occupation=" + occupation + ", zipcode=" + zipcode + "]";
	}

}
