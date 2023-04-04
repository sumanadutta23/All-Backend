package basics;

public class FibonacciNo {
	public static void main(String args[]) {
		int n=10 ,a=0,b=1,c;
		System.out.print(a+" ");
		System.out.print(" "+b);
		for(int i=2;i<=n-1;i++) {
			c=b+a;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
		
	}

}
