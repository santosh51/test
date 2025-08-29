package day11;

public class ConstructionDemo {

	int x,y;
	ConstructionDemo() //default constructor
	{
		x=100;
		y=200;
	}
	ConstructionDemo(int a, int b) //parameterised constuctor
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
		
	}
	
	
	
	public static void main(String[] args) {
		//ConstructionDemo cd= new ConstructionDemo();//invoke deault constructor
		ConstructionDemo cd= new ConstructionDemo(10,20);// parameterized constructor
		//cd.sum();

	}

}
