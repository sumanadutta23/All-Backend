package basics;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		
		int[] arr = {3,2,9,5,12,16};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);			
		}
		
		System.out.println(".....................");
		
		for(int i=arr.length-1;i>0;--i)
		{
			System.out.println(arr[i]);
		}


	}

}
