package controllers;

import javax.swing.*;

import models.User;
import utils.CSVLoader;
import utils.Serializer;
import utils.XMLSerializer;

import java.awt.event.*;
import java.awt.*;

public class Main{
	
	static MovieSpeakAPI movieSpeak;
	
	public static void main(String[] args) throws Exception{
		movieSpeak = new MovieSpeakAPI();
		movieSpeak.load();
	}
	
	
}