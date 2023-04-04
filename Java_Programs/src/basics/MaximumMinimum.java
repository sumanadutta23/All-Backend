package basics;

public class MaximumMinimum {
public static void main(String args[]) {
	int max=0, min=0;
	int []arr =new int[] {6,87,68,75,53,90};
	System.out.println("Input:");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	
	if(arr[i]==max) {
		max=arr[i];
		System.out.println("max no"+arr[i]);
	}
	}
}
}
