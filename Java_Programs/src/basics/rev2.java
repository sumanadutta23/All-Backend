package basics;

public class rev2 {

	public static void main(String[] args) {
		
		String str = "a2b3c4";
		int n = str.length();
		
		for(int i=0;i<n;i=i+2)
		{
			char t = str.charAt(i);
			//System.out.println(t);
			char x = str.charAt(i+1);
			//System.out.println(x);
			int k=Character.getNumericValue(x);
			//System.out.println(k);
//			System.out.println(x);
			for(int j=0; j<k; j++)
			{
				System.out.print(t);
			}
			
		}

	}

}
