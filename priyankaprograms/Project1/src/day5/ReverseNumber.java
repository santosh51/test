package day5;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	
  Scanner sc=new Scanner(System.in);
  
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

}
