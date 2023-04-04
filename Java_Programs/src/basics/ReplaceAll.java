package basics;

public class ReplaceAll {
	public static void main(String args[]) {
		String str="Ster200Lite289";
//		String abc="[0-9]";
//		String str1="";
//	str1= str.replaceAll(abc, str1);
//	System.out.println("output:"+str1);
	
	str = str.replaceAll("[0-9]", "");
	System.out.println(str);
		
		
	}

}
