package selection;

public class Nestedcase {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * ----------Nested if-else--------------
		 * syntax:
		 * 
		 * if(condition 1){
		 * 	if(condition 2){
		 * 		
		 * 		if(condition 3){
		 * 			............
		 * 			............
		 * 			............
		 * 		}else{
		 * 		}
		 * 	}else{
		 * 	}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		 String citizen= "nepali";
		 int age = 40;
		 boolean voterId= true;
		 
		 if(citizen.equals("nepali")) {
			 if(age>=18) {
				 if(voterId) 
				 {
					 System.out.println("You can vote!!");
					 
				 }
				 else {
					 System.out.println("You dont have voterId");
				 }
			 
			 
		 }
			 else {
			 System.out.println("You are under age!!");
			 
		 }
	}
		 else {
		System.out.println("Invalid citizenship!!");
	}
	}
}


