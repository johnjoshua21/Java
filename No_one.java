package Basics;
import java.util.Scanner;
public class No_one {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n1=sc.nextInt();
		if(n1>=65&&n1<=90) {
			System.out.println((char)n1);
		}
		else if(n1>=97&&n1<=122) {
			System.out.println((char)n1);
		}
		else if(n1>=48&&n1<=57) {
			System.out.println((char)n1);
		}
		else {
			System.out.println("Give between range");
		}	
}
}