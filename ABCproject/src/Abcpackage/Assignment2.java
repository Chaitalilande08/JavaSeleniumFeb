package Abcpackage;
public class Assignment2 {
	public int multi(int a,int b) {
		int c;
		c=a*b;
		System.out.println("multi is"+c);
		return c;
	}
	public int sub (int c,int d) {
		int e;
		e=c-d;
		System.out.println("sub is "+e);
		return e;
		}
	public int sub1 (int e, int f) {
		int g;
		g=e-f;
		System.out.println("sub1 is "+g);
		return g;
		}
	public int sum(int g, int h) {
		int i;
		i=g+h;
		System.out.println("sum is "+i);
		return i;
		}
	public int div (int i,int j){
		int k;
		k=i/j;
		System.out.println("final result is" +k);
		return k;
		}
	public static void main(String[] args) {
		Assignment2 obj =new Assignment2();
		int multiresult =obj.multi(10,2);
		int subresult =obj.sub(multiresult,2);
		int sub1result =obj.sub1(subresult,2);
		int sumresult =obj.sum(sub1result, 2);
	    obj.div(sumresult,2);
		
	}
	

}
