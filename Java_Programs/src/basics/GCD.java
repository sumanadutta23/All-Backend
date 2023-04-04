package basics;

public class GCD {

	public static void main(String args[]) {
		int x=12,y=4;
		int gcd=1;
		for(int i=1;i<=x&&i<=y;i++) {
			if (x%i==0 && y%i==0) {
				gcd=i;
			}
			
			
		}
		int lcm= (x*y)/gcd;
		System.out.println("GCD is:"+gcd);
		System.out.println("GCD is:"+lcm);
	}
	
}
