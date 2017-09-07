package process.controller;

import java.util.Scanner;

public class ProjectController
{

	public void start()
	{
		System.out.println("This is a project there are many");
		System.out.println("Like it but this one is mine");
		
		testScanner();
	
}
	
private void testScanner()
	

	Scanner firstScanner;
	firstScanner = new Scanner(System.in);
	System.out.println("What is your favorite food");
	String answer = firstScanner.nextline();
	System.out.println("Oh cool, you like " + answer);
}










