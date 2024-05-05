package corejava;

import java.util.Scanner;

public class variable {
	/*
	 * 
	 * --------------Variable---------------
	 * -> use to store data/value
	 * -> data  stored data processing
	 * 
	 * ->syntax:
	 * data_type var_name;
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int l= 400;
		int b=900;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter l");
		l = sc.nextInt();
		
		System.out.println("enter b");
		l =sc.nextInt();
		
		int area=l*b;
		System.out.println("area="+area);
		
	}

}
