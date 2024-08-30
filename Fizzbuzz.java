package Basics;

import java.util.Scanner;

public class Prog {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("No:");
		int n=sc.nextInt();
		if(n%3==0 && n%5==0)
			System.out.println("Fizzbuzz");
		else if(n%3==0)
			System.out.println("Fizz");
		else if(n%5==0)
			System.out.println("Buzz");
		else
			System.out.println("Enter Valid no!!!!!!!!!!!");
			
			
			
			
			
			
			
			
			
			
	}
	
	


}
