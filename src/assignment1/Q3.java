package assignment1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		int a;
		int b;
		 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of a=");
		a=sc.nextInt();
		System.out.println("enter the value of b");
		b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("the sum is=" +sum);
		
		int avg= (a+b)/2;
		System.out.println("the average is=" +avg);
		
		
	}

}
