package looping;

public class Sumofoddandeven {
	public static void main(String[] args) {
		int even=0;
		int odd=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 ==0) {
				even= even+i;
				
			}else {
				odd= odd+i;
			}
		}
		System.out.println("sum of even numbers="+even);
		System.out.println("sum of odd numbers="+odd);
		System.out.println("-----------------");
		System.out.println("total="+(even+odd));
	}

}
