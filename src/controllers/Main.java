package controllers;

import javax.swing.*;

import models.User;

import java.awt.event.*;
import java.awt.*;

	public class Main extends JFrame {
		private static final int WIDTH = 400;
		private static final int HEIGHT = 300;
		
		public static MovieSpeakAPI movieSpeak;
		    
		    public static void main(String[] args) throws Exception {
		    	
		    	movieSpeak.prime();
		        
		        JFrame frame = new JFrame("Assignment 2 Movie System");
		        
		        frame.setSize(350, 200);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		        JPanel panel = new JPanel();
		        
		        // adding panel to frame
		        frame.add(panel);
		        panel.setBackground(Color.pink);

		        placeComponents(panel);

		        frame.setVisible(true);
		    }

		    private static void placeComponents(JPanel panel) {

		        panel.setLayout(null);

		        // Creating JLabel
		        JLabel userLabel = new JLabel("Username");
		        
		        userLabel.setBounds(10,20,80,25);
		        panel.add(userLabel);

		        /* Creating text field where user is supposed to
		         * enter user name.
		         */
		        JTextField idInput = new JTextField(20);
		        idInput.setBounds(100,20,165,25);
		        panel.add(idInput);
		        
		        JLabel passwordLabel = new JLabel("Password");
		        passwordLabel.setBounds(10,50,80,25);
		        panel.add(passwordLabel);

		        JPasswordField passwordText = new JPasswordField(20);
		        passwordText.setBounds(100,50,165,25);
		        panel.add(passwordText);

		        // Creating login button
		        JButton loginButton = new JButton("Login");
		        loginButton.setBounds(10, 80, 80, 25);
		        panel.add(loginButton);
		        
		        String userID = userLabel.getText();
		        char[] password = passwordText.getPassword();
		        loginButton.addActionListener(e -> movieSpeak.authenticate(userID, password));
		    }

		}