package basics;

public class ReverseString {
	public static void main(String args[]) {
		String  str= "Sumana";	
		String str1=" ";
		char rev;
		for(int i=0;i<=str.length()-1;i++) {
			rev=str.charAt(i);
			str1=rev+str1;
		}
		System.out.println("Reverse string:"+str1);
	}

	

}
