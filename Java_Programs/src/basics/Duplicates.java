package basics;

public class Duplicates {

	public static void main(String[] args) {
		
		int[] arr = {6,3,4,6,8,4};
		
		int len = arr.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i] == arr[j])
				{
//					System.out.println(" " + arr[i]);
					arr[i] = -1;
				}
			}
		}
		
		for(int i=0;i<len;i++)
		{
			if(arr[i] != -1)
			{
				System.out.println(" " + arr[i]);
			}
		}

	}

}
