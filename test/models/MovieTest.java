package models;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

	public static Movie[] movies ={
		new Movie("The Godfather", "1972", "http://www.imdb.com/title/tt0068646/"),
		new Movie("The Shawshank Redemption", "1994", "http://www.imdb.com/title/tt0111161/"),
		new Movie("Schindlers List", "1993", "http://www.imdb.com/title/tt0108052/"),
		new Movie("Raging Bull", "1980", "http://www.imdb.com/title/tt0081398/"),
		new Movie("Casablanca", "1942", "http://www.imdb.com/title/tt0034583/")};
	
	@Test
	public void testGetName() 
	{
		assertEquals("The Godfather", movies[0].getTitle());
		assertEquals("The Shawshank Redemption", movies[1].getTitle());
		assertEquals("Schindlers List", movies[2].getTitle());
		assertEquals("Raging Bull", movies[3].getTitle());
		assertNotEquals("Casablanca", movies[2].getTitle());
	}

	//@Test
	public void testGetYear() 
	{
		assertEquals(1972, movies[0].getYear());
		assertEquals(1994, movies[1].getYear());
		assertEquals(1993, movies[2].getYear());
		assertEquals(1980, movies[3].getYear());
		assertNotEquals(1942, movies[1].getYear());
	}
	
	@Test
	public void testGetUrl() 
	{
		assertEquals("http://www.imdb.com/title/tt0068646/", movies[0].getUrl());
		assertEquals("http://www.imdb.com/title/tt0111161/", movies[1].getUrl());
		assertEquals("http://www.imdb.com/title/tt0108052/", movies[2].getUrl());
		assertEquals("http://www.imdb.com/title/tt0081398/", movies[3].getUrl());
		assertNotEquals("http://www.google.ie", movies[2].getUrl());
	}
}
