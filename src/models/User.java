package models;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String occupation;
		
	public User(String firstName, String lastName, int age, String gender, String occupation){
		this.id			= null;
		this.firstName 	= firstName;
		this.lastName	= lastName;
		this.gender		= gender;
		this.age		= age;
		this.occupation	= occupation;
	}
	
	public User(Long id, String firstName, String lastName, int age, String gender, String occupation){
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
				+ ", age=" + age + ", occupation=" + occupation + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
