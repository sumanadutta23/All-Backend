package basics;

public class AdditionwithoutOperator {
	public static void main(String rgs[]) {
		int x=4 ,y=8;
//		for(int i=1; i<=y;i++) {
//			x++;
//		}
//		System.out.println(x);
//		
		int sum = 0;
		for(int i=1;i<=y;i++)
		{
			sum = sum + x;
		}
		
		System.out.println(sum);
	}

}
