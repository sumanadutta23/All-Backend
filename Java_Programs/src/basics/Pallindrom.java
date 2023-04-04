package basics;

public class Pallindrom {
public static void main(String args []) {
	String str="MAM";
	String rev="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		rev=ch+rev;
	}
	System.out.println(rev);
	
	if(rev.equals(str)) {
		System.out.println("Pallindrom No");
		
	}
		else {
			System.out.println("Non Pallindrom No");
	}
		
	
	
}
}
