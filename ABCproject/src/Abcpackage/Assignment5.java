package Abcpackage;

public class Assignment5 {
	public void Assigbment5() {
		System.out.println("Defult Constrator");
		
	}
	public void Assigbment5(int a) {
		System.out.println("One Prameterized Constrator");
		
	}
	public Assignment5 (int a,int b) {
		System.out.println("Two Prameterized Constrator");
		
	}
	public static void main(String[] args) {
		Assignment5 ob3 =new Assignment5(1,2);
		Assignment4 ob1 = new Assignment4();
		Assignment4 ob2 = new Assignment4(1);
	}
	
	
	

}
