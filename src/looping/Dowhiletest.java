package looping;

public class Dowhiletest {
	/*
	 * 
	 * ----------do-while--------------
	 * #syntax:
	 * 	do{
	 * 	//statements
	 * 	} while(condition);
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int n=8;
		int i=1;
		do {
			System.out.println(n+" x "+i+ " = "+(n*i));
			i++;
		}while(i<=10);
		
	}


}
