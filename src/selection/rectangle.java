package selection;

import java.util.Scanner;

public class rectangle {
	public static void main(String[] args) {
		int l;
		int b;
		int a;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter length=");
		l=sc.nextInt();
		
		System.out.println("enter breadth=");
		b= sc.nextInt();
		
		if(l !=0 && b !=0) {
			a= l*b;
			System.out.println("the area is=" +a);
		
		
		
	}
		
	
}
}
