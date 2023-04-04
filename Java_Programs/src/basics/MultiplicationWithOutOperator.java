package basics;
import java.util.Scanner;

public class MultiplicationWithOutOperator {
	public static void main(String args[]) {
		
		int x, y, sum=0;
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		y=sc1.nextInt();
		
		for(int i=1;i<=x;i++) {
			sum=sum+y;
		}
		System.out.println("Multiplication:"+sum);
	}

}
