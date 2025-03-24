package Abcpackage;

public class Assignment3 {

	public Assignment3() {
		System.out.println("Defult Constrator");
		}
	public Assignment3(int a) {
		System.out.println("One prameterized constrator");
	}
	public Assignment3(int i, int j) {
		System.out.println("Two prameterized constrator");
	}
	public Assignment3(int i, int j,int k) {
		System.out.println("Three prameterized constrator");
	}
	public Assignment3(int i,int j,int k ,int l) {
		System.out.println("Four prameterized constrator");
	}
	public static void main(String[] args) {
		Assignment3 ob4= new Assignment3(1,2,3);
		Assignment3 ob1= new Assignment3();
		Assignment3 ob2= new Assignment3(1);
		Assignment3 ob3= new Assignment3(1,2);
		Assignment3 ob5= new Assignment3(1,2,3,4);
		
		
	}
}
