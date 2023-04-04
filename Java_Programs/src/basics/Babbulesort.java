package basics;

public class Babbulesort {
	
	public static void main(String args[]) {
		
		int arr[]= {1,7,5,2,6};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				
				}
			}
		}
		System.out.println("OutPut:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("OutPut:");
		int x=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(x!=arr[i]) {
				System.out.println("Missing number is: " + x);
				break;
			}
			x++;
		}
	}
}

