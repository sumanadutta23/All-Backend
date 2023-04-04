package basics;

public class CountOfObject {





    
    static int noOfObjects = 0;
    
    {
        noOfObjects++;
    }
    
	public static void main(String[] args) {
	    
		CountOfObject m1 = new CountOfObject();
		CountOfObject m2 = new CountOfObject();
		CountOfObject m3 = new CountOfObject();
	    
	    System.out.println(CountOfObject.noOfObjects);
	}
	    
	}

