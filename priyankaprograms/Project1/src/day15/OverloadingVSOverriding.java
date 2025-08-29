package day15;

class ABC
{

	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}
class XYZ{
	void m1(int a)
	{
		System.out.println(a*a);//Overriding
		
	}
	void m2(int a, int b)//overloading            // common thing overloding and overriding is method//
	{
		System.out.println(a+b);
	}
}

public class OverloadingVSOverriding {

	public static void main(String[] args) {
	
		ABC abcobj=new ABC();
		abcobj.m1(10);
		abcobj.m2(20);
		
		XYZ xyzobj=new XYZ();
		xyzobj.m1(20);
		xyzobj.m2(10, 20);

	}

}
