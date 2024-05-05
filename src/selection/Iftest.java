package selection;

import java.util.Scanner;

public class Iftest {
	/*
	 * 
	 * 
	 * ------if---------
	 * #use to implement single condition in the program
	 * #syntax:
	 * if(condition){
	 * 	//statements
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int salary;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter salary=");
		salary=sc.nextInt();
		
		System.out.println("total salary = "+salary);
	}

}
