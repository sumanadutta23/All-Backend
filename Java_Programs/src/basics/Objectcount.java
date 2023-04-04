package basics;

public class Objectcount {

	static int no_of_object=0;
	{
		no_of_object++;
	}
	
	public static void main(String args[]) {
	Objectcount oc=new Objectcount();
	Objectcount oc1=new Objectcount();
	Objectcount oc3=new Objectcount();
	
	
	System.out.println(Objectcount.no_of_object);
}
}