package Basics;

import java.util.Scanner;

public class Vibro {
	
	
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
	
	static int fibig(int x,int y,int z) {
		int temp=x>y?x:y;
		int big=temp>z?temp:z;
		return big;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 number ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int key=0;
		int big=0;
		int res=0;
		int t=x;
		while(x>0) {
			int a=x%10;
			int b=y%10;
			int c=z%10;
			big=fibig(a,b,c);
			key=key*10+big;
			x/=10;
			y/=10;
			z/=10;	
			res=reverse_num(key);
			t/=10;
		}	
		System.out.println(res);
	}

}
