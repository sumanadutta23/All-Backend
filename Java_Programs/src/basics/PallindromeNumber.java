package basics;

public class PallindromeNumber {
	public static void main(String args[]) {
		int n =151;
		int sum=0, rem, temp;
		
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("pallindrom no");
			
				}
		
		else
			System.out.println("Non pallindrom no");
		}
	}

