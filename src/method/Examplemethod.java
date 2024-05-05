package method;

public class Examplemethod {
	public static void main(String[] args) {
		sum();
		area();
		printTable(8);
		
		
		int sum= getSumof1To100();
		System.out.println("Sum of 100 nums="+sum);
		
		int sv= findSmallest(873648,9987);
		System.out.println("Smallest value "+sv);
		
		area2();
		
		volume();
		
		
	}
	// 1) no return type with no arguments
	
	static void sum() {
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println("Total="+c);
	}
	static void area() {
		int l=9;
		int b=78;
		int c = l*b;
		System.out.println("Area="+c);
	}
	// 2) no return type with arguments
	
	static void printTable(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n+" x " +i+" ="+(n*i));
		}
	}
	// 3) return type with no arguments
	
	static int getSumof1To100() {
		int s=0;
		for(int i=1; i<=100 ; i++) {
			s= s+i;
		}
		return s;
	}
	// 4) return type with arguments
	
	static int findSmallest(int x, int y) {
		if(x<y) {
			return x;
			
		}
		return y;
	}
	 static void  area2() {
		 int l=6;
		 int b=8;
		 int a= l*b;
		 System.out.println("area="+a);
		 
	 }
	 static void volume() {
		 int h=40;
		 int area=48;
		 int v= area *h;
		 System.out.println("volume is="+v);
	 }
	
	

}
