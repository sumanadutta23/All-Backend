package occ;

public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaaabbbbcccc";
		char a='a';
		char b='b';
		char c='c';
		int c1=0,c2=0,c3=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==a) {
				c1=c1+1;
				
			}
			else if(s.charAt(i)==b) {
				c2=c2+1;
			}
			else {
				c3=c3+1;
			}
		}
		System.out.println("a"+c1+"b"+c2+"c"+c3);

	}

}
