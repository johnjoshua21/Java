package Basics;

import java.util.Scanner;

public class Make_SIngle {
	
	static int check(int num) {
		int cnt=0;
		while(num>0) {
			num/=10;
			cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(check(n)!=1) {
			sum=0;
			while(n>0) {
				int a=n%10;
				sum+=a;
				n/=10;
			}
			n=sum;
		}
		System.out.println(sum);

		
		

	}

}
