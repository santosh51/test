package day3;

public class Swapping2numbers5differentways {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("before swapping values are..."+a+" "+b);
		
         //logic1-third variable
		/*int t=a;
		a=b;
		b=t;*/
		
		
		//logical2-use + & -without using third variable
		/*a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20*/
		
		//logic3- use * & /without using third variable
		//here a & b values should not be Zero
		
		/*a=a*b;//10*20=200(a)
		b=a/b;//200/20=10(b)
		a=a/b;//200/10=20(a)*/
		
		//logic4-using - bitwise XOR(^)
		/*a=a^b;
		b=a^b;
		a=a^b;*/
		
		//logic 5- single statement(right to left)
		b=a+b-(a=b);
		
		
		System.out.println("after swapping values are..."+a+" "+b);
		
	}

}
