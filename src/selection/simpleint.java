package selection;

import java.util.Scanner;

public class simpleint {
	public static void main(String[] args) {
		int p;
		int t;
		float r;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p=");
		p=sc.nextInt();
		System.out.println("enter t");
		t=sc.nextInt();
		System.out.println("enter r");
		r=sc.nextInt();
		
		float i;
		
		if(p !=0 && t!=0 &&r !=0) {
			i=(p*t*r)/100;
			System.out.println("the interest is="+i);
		}
	}
	

}
