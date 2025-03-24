package Abcpackage;

public class Assignment4 {
	public Assignment4() {
		System.out.println("Defult Constrator");
		
	}
	public Assignment4(int a) {
		System.out.println("One prameterized Constrator");
		
	}
	public Assignment4(int a, int b) {
		System.out.println("Two Prameterized Constrator");
		
	}
	public Assignment4(int a,int b ,int c) {
		System.out.println("Three Prameterized Constrator");
		
	}
	public Assignment4(int a,int b,int c,int d) {
		System.out.println("Four Prameterized Constrator");
		
	}
    public static void main(String[] args) {
    	Assignment4 ob4 = new Assignment4(1,2,3);
    	Assignment4 ob1 = new Assignment4();
    	Assignment4 ob3 = new Assignment4(1,2);
    	Assignment4 ob2 = new Assignment4(1);
    	Assignment4 ob5= new Assignment4(1,2,3,4);
    	
    	
		
	}
}
