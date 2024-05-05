package selection;

import java.util.Scanner;

public class Addsubmultidiv {
	public static void main(String[] args) {
		String math;
		Scanner sc= new Scanner(System.in);
		System.out.println("What you want to do ?");
		math= sc.next();
		int a=90;
		int b=7;
		
		switch(math) {
		case ("add"):
		System.out.println("sum of a and b is:" + (a+b));
		break;
		
		case ("subtract"):
			System.out.println("sub of a and b is:"+ (a-b));
		break;
		
		case("multiply"):
			System.out.println("mul of a and b is:"+ (a*b));
		break;
		
		case("division"):
			System.out.println("division of and b is:"+ (a/b));
		break;
		
		default:
			System.out.println("Not valid maths");
		}
	}

}
