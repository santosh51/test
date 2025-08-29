package day19;

 class Parent
 {
	 String name="John";
	 
	 void m1()
	 {
		 System.out.println("this is m1 from parent..");
	 }
 }

 class Child extends Parent
 
 {
	 int id=101;
	 
	void m2()
	{
		System.out.println("this is m1 from child..");
	}
	 
 }
 

public class TypeCastingObject1 {

	public static void main(String[] args) {
	//Approch..1	
  /*Child c =new Child();(why we create child class obj boz child class have Parent class also)
  System.out.println(c.name);
	c.m1();	  
	System.out.println(c.id);
	c.m2();*/
		
		//Approch..2
		/*Parent p =new Child();//Upcasting(variable is parent calss and object is child class)
		Child c =new Child();//Upcasting		
		System.out.println(p.name);//Parent
			p.m1();	  
			System.out.println(p.id);//we cannot access boz parent calss access 
			p.m2();*/
		
		
		//Downcasting..
		Parent p=new Parent();
		Child c=(Child)p;
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
	}

}
