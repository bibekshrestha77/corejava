package looping;

public class ForEachloop {
	/*
	 * 
	 * ---------------for Each loop/enhanced for loop-----------
	 * #used to read data from collection(array, list, set, map)
	 * 
	 * 		#syntax:
	 * 			for(data_type var : collection){
	 * 				//statements
	 * 			}
	 * 		
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] values= {78,47,97,28,37,02,85};
		int sum=0;
		for(int x : values) {
			System.out.println(x);
			sum= sum+x;
		}
		System.out.println("Total ="+sum);
	}

}
