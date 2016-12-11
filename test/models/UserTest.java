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

}
