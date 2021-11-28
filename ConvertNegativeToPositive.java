package week1.day2;

import java.util.Scanner;

public class ConvertNegativeToPositive 
	{
	static Scanner reader;
	public static void main(String[] args) 
	{
		reader = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = reader.nextInt();	
		int b = -1;
	if (a<0)
	{
		System.out.println("The Entered number " + a + " is negative");
		System.out.println("The Converted number is " + a*b);
	}
	else
	{
		System.out.println("The Entered number " + a + " positive");
	}
	}
	
	}


