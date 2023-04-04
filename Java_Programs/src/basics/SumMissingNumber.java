package basics;
import java.util.*;

public class SumMissingNumber {
public static void main(String args[]) {	

	int[] arr= {2, 4,1,9};
	int sum=0;
	System.out.println("Input array:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(" "+arr[i]);
	}
	Arrays.sort(arr);
	
	System.out.println("Output array:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(" "+arr[i]);
	}
	int count=0;
	System.out.println("Missing Number:");
	
	for(int i=arr[0];i<=arr[(arr.length)-1];i++) {
		if(arr[count]==i) {
			count++;
		}
			else {
				System.out.print(" "+i);
				
				 sum= sum+i;
			}
				
			
		}
	System.out.println(" ");
	System.out.println("SUM of MIssing no:"+sum);
	
	}
}

