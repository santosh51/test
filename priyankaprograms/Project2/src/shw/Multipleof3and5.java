package shw;

import java.util.Scanner;

//Display number only if number is multiple of 3 and 5(scanner)
public class Multipleof3and5 {

	public static void main(String[] args) {
   /* Scanner sc=new Scanner(System.in);
System.out.println("Display number only if number is multiple of 3 and 5");
int i=sc.nextInt();
for(i=50;i<=150;i++)
{
	if(i%3==0 || i%5==0) {
		System.out.println(i);
	}
	 else 
		 
	 
	{
		System.out.println(i+"invalid");
	}
}
   	}

}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Display number only if number is multiple of 3 and 5");
		int i=sc.nextInt();
		for(i=50;i<=150;i++)
		{
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
			 else 
				 
			 
			{
				System.out.println(i+"invalid");
			}
		}
		   	}

		}