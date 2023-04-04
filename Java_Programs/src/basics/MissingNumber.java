package basics;

import java.util.*;

public class MissingNumber {
	static void missingno(int arr[],int n){
		int count=0;
		for(int i=arr[0];i<arr[n-1];i++) {
			if(arr[count]==i) {
				count++;
			}
			else {
				System.out.println(i+"");
			}
		}
		
	}

	public static void main(String args[]) {
		int[] arr= {2,4,1,9,5};
		System.out.println("Input arry:"+Arrays.toString(arr));
		
			Arrays.sort(arr);
			System.out.println("Sorted array:"+ Arrays.toString(arr));
			int n=arr.length;
			missingno(arr,n);
	}

}
