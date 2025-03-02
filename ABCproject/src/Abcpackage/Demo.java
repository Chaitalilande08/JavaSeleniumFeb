package Abcpackage;

public class Demo {
	int rollno;
	int age;
	
	public void method1() {
		System.out.println("Method 1");
	}
	public void method2() {
		System.out.println("Method 2");
	}

	
	
	
	public static void main(String[] args) {
		Demo ob1=new Demo();
		ob1.rollno=11;
		ob1.age=22;
		
		System.out.println("rollno is"+ob1.rollno);
		System.out.println("age is"+ob1.age);
		ob1.method1();
		ob1.method2();
		
		Demo ob2=new Demo();
		ob2.rollno=12;
		ob2.age=23;
		
		System.out.println("rollno is"+ob2.rollno);
		System.out.println("age is "+ob2.age);
		ob2.method1();
		ob2.method2();
		
		

	}

}
