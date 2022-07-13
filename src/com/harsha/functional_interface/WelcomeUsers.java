package com.harsha.functional_interface;

public class WelcomeUsers {	
	
	public static void main(String[] args) {		
		Greeting greeting = (name) -> {System.out.println("Welcome "+name);};		
		greeting.greet("Seeta");
	}
}
