package Basics;

import java.util.Scanner;

public class string {

	static int reverse_num(int number) {
		int reverse=0;
		while(number != 0)   
		{ 	
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		return reverse;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 number ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int res=0;
		int max=0;
		
		int a=reverse_num(x)%10;
		System.out.println(a);
		
		int b=(y/100)%10;
		
		while(z>0) {
			res=z%10;
			if(max<res)
				max=res;
			z/=10;
		}
		System.out.println((a*b)-max);
		
		
		
		
		
		
		

	}

}
