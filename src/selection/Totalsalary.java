package selection;

import java.util.Scanner;

public class Totalsalary {
	public static void main(String[] args) {
		String post;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your post");
		post = sc.next();
		
				
				
				switch(post) {
				case ("MD"):
					System.out.println("total salary of MD is equals: "+(23000*20)/100);
					break;
					
				case ("CEO"):
					System.out.println("total salary of CEO is: "+(25000*25.79)/100);
					break;
					
				case ("Manager"):
					System.out.println("total salary of manager is:" +(176000*16)/100);
					break;
					
				case ("Helper"):
					System.out.println("(total salary of helper is:" +(145900*9)/100);
					break;
					
					default:
						System.out.println("error");
				}
				
	}

}
