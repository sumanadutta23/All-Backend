package basics;

public class PrimeNo
{
	public static void main(String[] args) {
		int n=29, i;
		boolean flag= false;
		 for(i=2;i<=n/2;i++){
		     if(n%i==0){
		         flag= true;
		         break;
		     }
		 }
		 if(!flag) {
			 System.out.println("prime no");
		 }
		     else{
		         System.out.println(" prime no.");
		         
		     }
		 }
	}

