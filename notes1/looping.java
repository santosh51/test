/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {

		int i,j=3,k=j;
		int x=10;
		
		for(i=1;i<=x;i++){
		   	System.out.print (" "+i); 
		}
		
		for(i=10;i>=1;i--){
		   	System.out.println("Hello -"+i); 
		}
		
		while(j<=x){
		    System.out.println("While COndition -"+j); 
		    
		    j = j + 3;
		}
		
		do{
		    System.out.println("Do While COndition -"+k); 
		    
		    k = k + 3;
		}while(k<=x);
	
	}
}