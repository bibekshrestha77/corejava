package selection;

public class Laddertest {
	/*
	 * 
	 * --------------else if---------------
	 * 
	 * syntax:
	 * if(condition1){
	 * 	//statements
	 * }
	 * 
	 * else if(condition-2){
	 *	//statements
	 *}
	 *	............
	 *	.............
	 *else{
	 *
	 *}
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int marks= 89;
		
		if(marks >= 80) {
			System.out.println("Distinciton");
		}
		else if(marks >=60) {
			System.out.println("First");
		}
	
	else if(marks >= 45) {
		System.out.println("Second");
	}
	else if(marks >=32) {
		System.out.println("Third");
	}
	else {
		System.out.println("failed");
	}
	}
	}


