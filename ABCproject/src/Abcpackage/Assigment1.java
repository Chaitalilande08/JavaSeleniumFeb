package Abcpackage;

public class Assigment1 {
	public int sum (int a,int b) {
		int c;
		c =a+b;
		System.out.println("sum is "+c);
		return c;}
	public int sub (int c,int d) {
		int e;
		e=c-d;
		System.out.println("sub is "+e);
		return e;}
   public int sum1(int e,int f){
      int g;
      g = e+f;
      System.out.println("sum is "+g);
      return g;
       }
   public int multi (int g,int h) {
	   int i;
	   i = g*h;
	   System.out.println("multi is"+i);
	   return i;
   }
   public int div(int i,int j) {
	   int k;
	   k=i/j;
	   System.out.println("final result is "+k);
	   return k;
	   
   }
   public static void main(String[] args) {
	Assigment1 obj=new Assigment1();
	int sumresult = obj.sum(10,2);
	int subresult = obj.sub(sumresult,2);
	int sum1result = obj.sum1(subresult, 2);
	int multiresult =obj.multi(sum1result,2);
	 obj.div(multiresult, 2);			
}
}
