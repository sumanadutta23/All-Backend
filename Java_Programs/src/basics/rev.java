package basics;

public class rev
{
	public static void main(String[] args) {
		String s="aaabbcccdd";
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			char f=s.charAt(i);
			char n=s.charAt(i+1);
			
			if(f==n) {
				count++;
			}
			else if(f!=n) {
				System.out.print(""+f+count);
				count=1;
			}
		}
	}
}