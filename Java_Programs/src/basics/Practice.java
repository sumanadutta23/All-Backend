package basics;

public class Practice {
	public static void main(String args[]) {
		int arr[]= {5,9,2,1,4};
		System.out.print("Input array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(" ");
		System.out.println("Output:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int x=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(x!=arr[i]) {
				System.out.println("Missing no:"+x);
				break;
			}
			x++;
		}
	}
	}