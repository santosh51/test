package day14;



class D
{
	int d;
  void display()
  {
	  System.out.println(d);
  }
}

class E extends D
{
	int e;
	void show()
	{
		System.out.println(e);
	}
}
class F extends E
{
	int f;
	void print()
	{
		System.out.println(f);
	}
}




public class MultilevelInheritance {

	public static void main(String[] args) {
		
 
		F cobj=new F();
		cobj.d=100;
		cobj.e=200;
		cobj.f=300;
		//System.out.println(cobj.a);
		//System.out.println(cobj.b);
		//System.out.println(cobj.c);
		cobj.display();
		cobj.show();
		cobj.print();
	}

}
