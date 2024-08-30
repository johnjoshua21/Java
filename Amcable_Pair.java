package Basics;
import java.util.Scanner;
public class Amcable_Pair {
		static int amic(int n) {
		int sum = 0;
		for (int i=1;i<=n/2;i++){
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 2 number ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(amic(x)==y && amic(y)==x) {
			System.out.println(x+" and "+y+" is amicable Pair");
		}
		else {
			System.out.println(x+" and "+y+" is not amicable Pair");
		}	
	}
}