package models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RatingTest {

	public static Rating[] ratings ={
		new Rating(1, 12l, 1),
		new Rating(23456l, 13l, 4),
		new Rating(34567l, 14l, -1),
		new Rating(45678l, 15l, 0)};
}