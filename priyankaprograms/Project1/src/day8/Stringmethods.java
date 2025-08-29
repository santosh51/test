package day8;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {
		String s="welcome";
     //  String s =new String("welcome");//object type String
		//System.out.println(s);
		
		//length()-returns length of a string(number of character)
		/*String s="welcome";
		int l=s.length();
		System.out.println(l);//7
		System.out.println(s.length());//7
		System.out.println("welcome".length());//7*/
		
		
		//concat()-joining strings
		/*String s1="welcome";
		String s2="to java";
		String s3="automation";
		System.out.println(s1+s2);//welcometo java
		System.out.println(s1.concat(s2));//welcometo java
		System.out.println(s1+s2+s3);//welcometo javaautomation
		System.out.println(s1.concat(s2).concat(s3));//welcometo javaautomation
		System.out.println(s1.concat(s2+s3));// welcometo javaautomation
		System.out.println("welcome"+"java");//welcometo java
		System.out.println("welcome".concat("to java"));//welcometo java*/
		
		//trim()- remove spaces right and lift side
		/*s="   welcome   ";
		System.out.println(s);//print string along with spaces
	    System.out.println("before trimming:"+s.length());
		System.out.println(s.trim());
		System.out.println("after trimmed:"+s.trim().length());*/
		
		
		//charAt()-returns a character from a string based on index
		//index starts from 0
		/*s="welcome";
		System.out.println(s.charAt(3));//c
		System.out.println(s.charAt(0));
		System.out.println(0);*/
		
		//contain()-returns true/false
		/*System.out.println(s.contains("wel"));//true
		System.out.println(s.contains("come"));//true
		System.out.println(s.contains("Wel"));//false
		System.out.println(s.contains("COME"));//false
		System.out.println(s.contains("welme"));//false*/
		
		//equals(),equalsIgnoreCase()-compare Strings
	 /* String s1="welcome";
	  String s2="welcome";
	   System.out.println(s1==s2);//true
	   System.out.println(s1.equals(s2));//true
	   System.out.println(s1.equals("Welcome"));//false
	   System.out.println(s1.equalsIgnoreCase("Welcome"));//true*/
	   
	   //replace()- replace single/multiple(Sequance)of character in a String
	  /* s="welcome to selenium java selenium python selenium c#";
	   System.out.println(s.replace('e','x'));
	   System.out.println(s.replace("selenium","playwrigth"));*/
	  
	   
	   
	   //substring()-extract substring from the main string
	   //Strating index - 0
	   //ending index - 1
	   s="selenium";
	  // System.out.println(s.substring(1,5));//elen
	   //System.out.println(s.substring(0,3));//sel
	   
	   //toUpperCase()   toLowerCase()
	  /* s="Welcome";
	   System.out.println(s.toLowerCase());
	   System.out.println(s.toUpperCase());
	  
	   
	   
	   //split()-split the string into multiple parts based on delimeter
	   s="abc@gmail.com";
	   System.out.println(s.substring(0,3));//abc
	   
	   String a[]=s.split("@");
	   System.out.println(Arrays.toString(a)); //[abc,gmail.com]
	   System.out.println(a[0]);//abc
	   System.out.println(a[1]);//gmail.com
	   
	   s="Priya203@gmail.com";
	   String arr[]=s.split("@");
	  System.out.println(arr[0]);
	   System.out.println(arr[1]);
	    System.out.println(Arrays.toString(arr));*/
	   
	   
	   
	   
	   //Example1
	  /* String amount="$15,20,55";
	   System.out.println(amount.replace("$"," "));//15,20,55
	   System.out.println(amount.replace("$","").replace(",",""));//152055*/
	   
	   //Example2
	   s="abc,123@xyj"; //abc  123  xyz
	   
	 /* String arr1[]= s.split(",");// abc  123@xyz
	  System.out.println(Arrays.toString(arr1)); //[abc,123@xyz]
	   
	   
	 String arr2[]=arr1[1].split("@");
	  System.out.println(Arrays.toString(arr2)); //[123, xyz]
	   
	  System.out.println(arr1[0]);//abc
	  System.out.println(arr2[0]);//123
	  System.out.println(arr2[1]);//xyz*/
		String arr[]=s.split(",");
	  System.out.println(arr[0]);//abc
	  System.out.println(arr[1]);//123@xyj
	  String arr2[] =arr[1].split("@");
	  System.out.println(arr[0]);
	  System.out.println(arr2[0]);
	  System.out.println(arr2[1]);
	  
		//Example3 based on space
		/*s="abc 123 zyz";
		String ar[]=s.split(" ");
		System.out.println(Arrays.toString(ar));//[abc, 123, zyz]
		
		// * % ^ & ( )-you cannot use as delimeter
		
		//example4
		String name="John Kenedy";
		//System.out.println(name.contains("john"));//false
		System.out.println(name.replace('J','j').contains("john"));//true		 
		System.out.println(name.toLowerCase().contains("john"));//true*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
