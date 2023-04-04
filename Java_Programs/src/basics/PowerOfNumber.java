package basics;
import java.util.*;

public class PowerOfNumber {
	public static void main(String args[]) {
		//int base=2, exponent=2;
		System.out.println("Enter input value:");
		Scanner sc= new Scanner(System.in);
		int base= sc.nextInt();
		Scanner sc1= new Scanner(System.in);
		int exponent =sc1.nextInt();
		long result=1;
		while(exponent!=0) {
			result=result*base;
			exponent--;
		}
		System.out.println("Answer:"+result);
	}

}
