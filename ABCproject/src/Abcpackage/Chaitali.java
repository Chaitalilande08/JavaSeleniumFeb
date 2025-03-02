package Abcpackage;

public class Chaitali {

	private static final int Naina = 0;
	int rollno;
	int name;
	int age;
	
	
	public void display1()
	{
		System.out.println("Display1");
	}
	public void display2()
	{
		System.out.println("Display2");
	}
	
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Chaitali obj1=new Chaitali();
		obj1.rollno=10;
		
		obj1.name= (int) Naina;
		obj1.age=24;
		System.out.println("rollno is "+obj1.rollno);
		System.out.println("name is "+obj1.name);
		System.out.println("age is"+obj1.age);
		obj1.display1();
		obj1.display2();
		
		
		Chaitali obj2=new Chaitali();
		obj2.rollno=20;
		int komal = 0;
		obj2.name=komal;
		obj2.age=22;
		System.out.println("rollno is"+obj2.rollno);
		System.out.println("name is"+obj2.name);
		System.out.println("age is "+obj2.age);
		obj2.display1();
		obj2.display2();
		
		
		

	}

}
