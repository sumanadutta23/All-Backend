package basics;

public class PrintDublicateNo {

	public static void main(String args[]) {
		int [] arr = {1,9,2,9,1};
		System.out.println("Input array:");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		
		}
		System.out.println(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					System.out.println(" "+arr[i]);
					 arr[i]=-1;
				}
			}
		}
		
		System.out.println(" ");
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=-1) {
				System.out.println(" "+arr[i]);
			}
			
		}
		
	}
}
