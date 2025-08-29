/*import java.util.Scanner;
class Abcdemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int i;
        //for(i=1;i<=n;i++)
      //  {
            if(n<=5 && n%2==0)
            {
                System.out.println("not weird");
            }
            else if(n>=6 && n<=20 && n%2==0)
            {
                System.out.println("weird");
            }
            else if(n>20 && n%2==0)
            {
                System.out.println("not weird");
            }
            else
            {
                System.out.println("weird");
            }
        }
    }*/



/*public class Abcdemo {
    int a;
    double b;
    String str,c,d;
    Abcdemo()
    {
    
        a=42;
        b=3.1415;
        
        str="String: Welcome to HackerRank's Java\ntutorials!";
        	 
        d="Double: "+b;
        c="Int: "+a;
    }
     public static void main(String[] args) {
            Abcdemo sc=new Abcdemo();
            System.out.println(sc.str);
            System.out.println(sc.d);
            System.out.println(sc.c);
     }
}*/
/*import java.util.Scanner;

public class Abcdemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String str = scan.next();
        i=42;
        d=3.1415;
        str="Welcome to HackerRank's Java\ntutorials!";
    
        

        // Write your code here.

        System.out.println("String: "+str);
        System.out.println("Double: "+d);
        System.out.println("Int: " +i);
    }
}*/

/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Abcdemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i;

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(i=1;i<=10;i++)
        {
            System.out.println("2 x "+i+" = "+ N*i);
        }
        

        bufferedReader.close();
    }
}*/

/*class Abcdemo //odd numbers using loop
{
	public static void main(String[]args) {
		int i;
		for(i=1;i<=50;i=i+2)
		{
			System.out.println(i);
		}
	}
}*/
/*class Abcdemo { //odd numbers using if block
    public static void main(String[] args) {
        int i;
        for(i=1;i<=50;i++)
        {
            if(i%2!=0){
                System.out.println(i);
            }
        }
        
    }
} */


/*class Abcdemo { //even numbers using if block 
    public static void main(String[] args) {
        int i;
        for(i=1;i<=50;i++)
        {
            if(i%2==0){
                System.out.println(i);
            }
        }
        
    }
}  */
        
/*class Abcdemo { // multiples of 3 or 5 
    public static void main(String[] args) {
        int i;
        for(i=50;i<=150;i++)
        {
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }
        }
        
    }
} */  

/*import java.util.*;
class Abcdemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m : ");
		int m=sc.nextInt();
		System.out.println("Enter the value of n:  ");
		    
	        int n=sc.nextInt();
	        int i;
	        if(m>50 && n<150 && m<n)
	        {
	        for(i=m;i<=n;i++)
	        
	        {
	           if(i%3==0 || i%5==0)
	        	{
	        		System.out.println(i);
	        	}
	        
	        }
	        }
	        else
	        {
	        	System.out.println("invalid");
	        }
	}
}*/
/*	  class Abcdddemo {
	public static void main(String[] args) 
	{
		System.out.println("Even numbers from 1 to 50:");
		for (int i = 1; i <= 100; i++){
		    if (i % 3 == 0){
		        System.out.println(i + "multiple of 3 ");
		    }
		    if (i % 3 != 0)
		    	System.out.println(i + "-invalid ");
		}
	
	}
}   */

/*class Abcdemo{
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=4;i++)
		{
			System.out.println(" ");
			for(j=1;j<=4;j++)
			{
				System.out.print("*");
			}
			
		}
	}
	
}*/
		
	/*	class Abcdemo{
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			System.out.println("  ");
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
		}
	}
		}*/
		
		//project name always starts with upper case, incase of two or more words we write names in camel case e.g,ProgramOne
		//class name always starts with upper case
		//interface name always starts with upper case
		//variable name always starts with lower case,incase of two or more words we write names in camel case e.g,programOne, fName
		//method name always starts with lower case,incase of two or more words we write names in camel case e.g,getName,setName,getUserName
		//object name always starts with lower case

/*class Abcdemo{
	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}*/
		
/*class Abcdemo{
	public static void main(String [] args) {
		int i=2;
		while(i<=20)
		{
			System.out.println(i);
			i++;
		}
	}
}*/

/*class Abcdemo{
	public static void main(String [] args) {
		int i=10;
		do
		{
			System.out.println(i);
			i--;
		}
		while(i>=1);
	}
}*/

/*class Abcdemo{
	public static void main(String[] args) {
		int i=1,j=1;
		while(i<=4)
		{
			System.out.println(" ");
			i++;
			
			for(j=1;j<=4;j++)
			{
				System.out.print("*");
			}
			j++;
			
		}
	}
}*/






	
    	
    
    	
    
        
        
        
        
        

