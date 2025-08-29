
//constructor
/*public class java {
	String name;
	int rollno;
	java()
	{
		name="harsh";
		rollno=20;
	}
	java(String ab,int c)
	{
		name=ab;
		rollno=c;
	}
	public static void main(String[] args) {
		java co=new java();
		java co1=new java("kira",45);
		System.out.println(co.name);
		System.out.println(co.rollno);
		System.out.println(co1.name);
		System.out.println(co1.name);*/
import java.util.*;
class java{
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
