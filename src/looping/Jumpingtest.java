package looping;

public class Jumpingtest {
	/*
	 * 
	 * ----------Jumping Statements---------
	 * 		a) break;      : exit from loop
	 * 		b) continue;   : skip values 
	 * 		c) return;     : exit from method
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		for(int i=1; i<=10 ; i++) {
			if(i ==5) {
				//break;
				continue;
			}
			System.out.println(i);
		}
	
		System.out.println("end for loop");
	}
	
	

}
