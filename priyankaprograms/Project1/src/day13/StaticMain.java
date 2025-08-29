package day13;

public class StaticMain {

	public static void main(String[] args) {
		
		/*System.out.println(StaticDemo.a);
		StaticDemo.m1();*/
		 
  // System.out.println(b);// cannot access, b is non-static
   //m2();//cannot access, m2() is non-ststic
				StaticDemo sd=new StaticDemo(); 
		System.out.println(sd.b);//through object
	sd.m2();//through object
				
		sd.m();
	}

	}


