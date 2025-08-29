package day7;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
   //  Example..1
		/*System.out.println("Enter first number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second number:");
		int num2=sc.nextInt();
		System.out.println("sum of two number"+(num1+num2));*/
		
    // Example..2
     System.out.println("Enter name:");
     String name=sc.next();
     System.out.println("your name is:"+name);
     
     System.out.println("Enter your age:");
     int age=sc.nextInt();
     System.out.println("Your age is:"+age);
     
     
     System.out.println("Enter unknown value:");
     Object value=sc.next();
     System.out.println(value);
     
     
     
     
     
     
     
	}

}
