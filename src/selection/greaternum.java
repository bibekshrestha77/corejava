package selection;

import java.util.Scanner;

public class greaternum {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a=");
		a= sc.nextInt();
		System.out.println("Enter the value of b=");
		b= sc.nextInt();
		
		if(a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
	}

}
