package day18;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("program is Started....");
   Scanner sc=new Scanner(System.in);
   
   //Example..1
  /* System.out.println("enter a number:");
    int num=sc.nextInt();
   System.out.println(100/num);//ArithmeticException*/
   
   //Example..2
  /* int a[]=new int[5];
   System.out.println("Enter the position(0-4):");
   int pos=sc.nextInt();
   
   System.out.println("Enter a value:");
   int value=sc.nextInt();
   
   a[pos]=value;
   System.out.println(a[pos]);*/
   
   //Example..3
   /*String s= "12345";//"welcome";not accept
   int num=Integer.parseInt(s);
   System.out.println(num);*/
   
   //Example..4
   String s="welcome";// nullpointerException by put "Null"
   System.out.println(s.length());
   
   System.out.println("program is completed...");
   System.out.println("program is exited...");
   
   
   
   
   
	}

}
