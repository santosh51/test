package mypractice;

import java.util.Scanner;

public class LoopPrograms {

	public static void main(String[] args) {
		//Reverse a number(% / =operator)input 1234, output 4321
		 
		/*  Scanner sc=new Scanner(System.in);
		  
		   System.out.println("Enter a number:");
		  int num= sc.nextInt();    //1234
		  
		  //1) Using Algorithm
		  
		  int rev=0;
		  while(num!=0) {
			  rev=rev*10+num%10;//4, 43, 432,4321
			  num=num/10;//123, 12, 1, 0
		  }
		  System.out.println("reverse number is:"+rev);
			}
}*/
	
  //palindrome number(conditional statment+looping)input 121 , After reversing 121,
    

	    /*  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number:");
	      int num=sc.nextInt();//
	      int org_num=num;
	      
	      int rev=0;
	      while(num!=0) 
	      {
	      rev=rev*10+num%10;
	      num=num/10;
	      
		}
	if(org_num==rev)
	{
		     System.out.println("palindrom Number:"+org_num);
	}
	else
	{
		System.out.println("Not palindrom Number:"+org_num);
	}	
	}
}*/ 
		//count number of digits in a number(looping statment) input:423424, output:6
		
		/*int num=423424;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("Number of Digits:"+count);
		
		
	}
}*/
   //find sum of digits in a number. input:1234, sum:10
		
		
	/*int num=1234;
		int sum=0;
		
		while(num>0)
       {
			sum=sum+num%10;//4+3+2+1
			num=num/10;//123  12  1 0
		}
		System.out.println("Sum of digits in a number:"+sum);
	}
		
}	*/
 // count no of even and odd digit in a number. input:23456, output: 3even 2odd
		
	int num=23456;
	int even_count=0;
	int odd_count=0;
	
	while(num>0)//23456
	{
		 int rem=num%10;
		if(rem%2==0)
		{
			even_count++;
		}
		else
		{
			odd_count++;
		}
		num=num/10;
		
	}
	System.out.println("Number of even number:"+even_count);
	System.out.println("Number of odd Number:"+odd_count);
	}
	}
	

   


   

		