
package day13;

public class StaticDemo {

static	int a=10;//static variable
	int b=20;//non-static variable
	
	static void m1() //static method
	{
		System.out.println("this is m1 static method..");
	}
	void m2()//non-static method
	{
		System.out.println("this is m2 non-static method..");
	}
	void m()//non-static
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	
	
	public static void main(String[]args) {
		//System.out.println(a);
	//	m1();
		 
  /* System.out.println(b);// cannot access, b is non-static
   //m2();//cannot access, m2() is non-ststic*/
				StaticDemo sd=new StaticDemo(); 
		//System.out.println(sd.b);//through object
		sd.m2();//through object
				
		sd.m();
	}

}
