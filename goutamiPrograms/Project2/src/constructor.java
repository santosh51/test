import java.util.*;
public class constructor {
	
	constructor()
	{
		System.out.print("default constructor");
	}
	constructor(int a, int b)
	{
		System.out.print("parameterized constructor");
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		constructor c1=new constructor();
		constructor c2=new constructor(a,b);
		
		
		
		
		// TODO Auto-generated method stub

	}

	
}







