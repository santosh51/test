package day18;
import java.util.Scanner;
public class HandaleException {

	public static void main(String[] args) {
		System.out.println("program is Started....");
		   Scanner sc=new Scanner(System.in);
		   
		System.out.println("enter a number:");
	    int num=sc.nextInt();
	    try
	    {
	  System.out.println(100/num);//ArithmeticException
	    }
	    catch(ArithmeticException e)
	    {
	    System.out.println("Invalid data....");	
	    }
	   System.out.println("program is completed...");
	   System.out.println("program is exited...");
	   
	   
	}

}
