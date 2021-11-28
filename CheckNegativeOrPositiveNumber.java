package week1.day2;

import java.util.Scanner;

public class CheckNegativeOrPositiveNumber 
	{
		static Scanner reader;
		public static void main(String[] args) 
	{
		reader = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = reader.nextInt();	
	if (a<0)
	{
		System.out.println("The Entered number " + a + " is negative");
	}
	else if (a>0)
	{
		System.out.println("The Entered number " + a + " is positive");
	}
	else
	{
		System.out.println("The Entered number " + a + " neither positive nor negative");
	}
	}
	}
