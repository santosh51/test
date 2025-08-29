package day16;

interface Shape{
	int length=10;//final&static
	int width=20;//final&static
	
	void circle();//abstraction
	
default	void square()
	{
		System.out.println("this is square-default method");
	}
static void rectangle() 
{
	System.out.println(" this is rectangle-static method");
}


}

public class InterfaceDemo implements Shape
{
	int x=100;
	int y=200;
public	 void circle()
	{
		System.out.println("this is circle-abstract method...");
		
	}
void triangle()
	{
		System.out.println("this is triangle...");
		
	}
	public static void main(String[] args) {
		//scenario1
		InterfaceDemo idobj  = new InterfaceDemo();
		idobj.circle();
		idobj.square();
		Shape.rectangle();// static method can directly access from interface
		idobj.triangle();
		System.out.println(idobj.x+idobj.y);//
		//scenario 2
		Shape sh=new InterfaceDemo();
		sh.circle();//abstract
		sh.square();//default
		
		Shape.rectangle();//static method can directly access from interface
		//sh.triangle();//we cannot access
		System.out.println(Shape.length *Shape.width);//Accessing static variables directly
	//
		System.out.println(sh.x+sh.y);//we cannot access
	}
}
