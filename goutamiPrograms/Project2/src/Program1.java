/*import java.util.*;
import java.util.Scanner;


public class Program1 {

	public static void main(String[] args) {
		
		System.out.println(2+3);
		System.out.println("2+3");
		System.out.println(2%3);
		System.out.println(2-3);
		System.out.println(2/3);
		System.out.println(2*3);
		System.out.println(2^3);
	
		System.out.println("\tJava2");
		System.out.println("       Java1");
		System.out.println("1234567Java3");
		System.out.println("++++++++Java4");
		System.out.println("\t  Java programming");
		System.out.println("  \tJava programming");
		System.out.println("---\tJava programming");
		System.out.println("--------\tJava programming");
		System.out.println("\nJava programming");
		System.out.println("Java\n programming");
		System.out.print("Java programming\n");
		System.out.println("  \tJava programming");

int a=10,b=20;
System.out.println(a+" is an integer" );
System.out.println(b+" is twice of a" );
System.out.println("sum of a and b is equal to "+(a+b));
float c=30,d=15;
System.out.println(c+" is a float");
System.out.println(d+" is an half of "+c);
System.out.println("sub of c and d is "+(a-b));

double e=50, f=40;
double g=e+f;
System.out.println(g);
System.out.println("double value of e is "+50);
System.out.println(g+" is the sum of e and f");

//printing patterns using loops
int i=1,j=1;
for(i=1;i<=3;i++)
{
	System.out.println(" ");
	for(j=1;j<=4;j++)
	{
		System.out.print(j);
	}
}*/
/*import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum,r;
		sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
	}*/

/*import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the value of n: ");
        int i;
        for(i=2;i<=n;i++)
        {
            if(n%2==0)
            {
                System.out.println("Not weird");
            }
            else
            {
                System.out.println("weird");
            }
        }
    }
}*/

	import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
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
}







	
		

	














		// TODO Auto-generated method stub

	}

}
