package basics;

public class vowel {
	
	public static void main(String[] args) {
		
		String str = "STL Digital";
		StringBuilder str1=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				str1.append('A');
				}
			else if(str.charAt(i)=='e') {
				str1.append('E');
			}
			else if(str.charAt(i)=='i') {
				str1.append('I');
			}
			else if(str.charAt(i)=='o') {
				str1.append('O');
			}
			
			else if(str.charAt(i)=='u') {
				str1.append('U');
			}
			else
				str1.append(str.charAt(i));	
		}
		
		System.out.println("vowel:"+str1);
	}
}