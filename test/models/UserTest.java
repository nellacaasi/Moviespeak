package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	public static User[] users ={
		new User(1l,"Isaac", "Allen", 19, "M", "student"),
		new User(2l,"Mary", "Ryan", 47, "F", "baker"),
		new User(3l,"Richard", "Branson", 66, "M", "entrepreneur")};
	
	@Test
	public void userIDTest() 
	{
		assertEquals(1, users[0].getId(), 0.01);
		assertEquals(2, users[1].getId(), 0.01);
		assertEquals(3, users[2].getId(), 0.01);
		assertNotEquals(2, users[0].getId(), 0.01);
		assertNotEquals(10, users[1].getId(), 0.01);
	}
	
	@Test
	public void getFirstNameTest()
	{
		assertEquals("Isaac", users[0].getFirstName());
		assertEquals("Mary", users[1].getFirstName());
		assertEquals("Richard", users[2].getFirstName());
		assertNotEquals("John", users[1].getFirstName());
		assertNotEquals("Harry", users[0].getFirstName());
	}
	
	@Test
	public void getLastNameTest()
	{
		assertEquals("Allen", users[0].getLastName());
		assertEquals("Ryan", users[1].getLastName());
		assertEquals("Branson", users[2].getLastName());
		assertNotEquals("Gibson", users[1].getLastName());
		assertNotEquals("Firth", users[0].getLastName());
	}
	
	@Test
	public void getAgeTest()
	{
		assertEquals(19, users[0].getAge());
		assertEquals(47, users[1].getAge());
		assertEquals(66, users[2].getAge());
		assertNotEquals(239, users[1].getAge());
		assertNotEquals(-12, users[0].getAge());
	}
	
	//@Test
	public void getGenderTest()
	{
		assertEquals("M", users[0].getGender());
		assertEquals("F", users[1].getGender());
		assertEquals("M", users[2].getGender());
		assertNotEquals("E", users[2].getGender());
		assertNotEquals("L", users[0].getGender());
	}
	
	@Test
	public void getOccupationTest()
	{
		assertEquals("student".toLowerCase(), users[0].getOccupation());
		assertEquals("baker".toLowerCase(), users[1].getOccupation());
		assertEquals("entrepreneur".toLowerCase(), users[2].getOccupation());
		assertNotEquals("housewife".toLowerCase(), users[2].getOccupation());
		assertNotEquals("banana".toLowerCase(), users[0].getOccupation());
	}	

}
