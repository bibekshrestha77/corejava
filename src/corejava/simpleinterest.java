package corejava;
import java.util.Scanner;

public class simpleinterest {
	public static void main(String[] args) {
		int p;
		int t;
		double r;
		double result;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter value of principal=");
		p= sc.nextInt();
		
		System.out.println("Enter value of time=");
		t= sc.nextInt();
		
	System.out.println("Enter value of rate=");
		r=sc.nextDouble();
		
		result=(p*t*r)/100;
		System.out.println("the result is="+result);
		
	
	}

}
