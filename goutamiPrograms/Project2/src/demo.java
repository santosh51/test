/*import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of m: ");
		// TODO Auto-generated method stub
		int m,n,x,y;
		 m= scanner.nextInt();
		 System.out.print("Enter the value of n: ");
		 n= scanner.nextInt();
		 
		for(x=1;x<=m;x++)
		{
			System.out.println(" ");
			for(y=1;y<=n;y=y+2)
			{
				System.out.print(y);
			}
		}
	}
}*/
public class demo {
  int modelYear;//variable declaration
  String modelName;
  double mileage;//variable declaration
  public demo() {//default constructor
	  System.out.println("default constructor called");
  }
  
  
  public demo(int year, String name)// two parameterized constructor
  {
    modelYear = year;
    modelName = name;
    System.out.println(" two parameterized constructor");
  }
  public demo(double val)//one parameterized constructor
  {
	  mileage=val;
 
    System.out.println("one parameterized constructor");
  }

public void displayValues(){//method declaration
    System.out.println("Method call"+modelYear + " " + modelName);
}
  public static void main(String[] args) {
    demo myCar = new demo(1969, "Mustang");
    demo myCar1 = new demo(19.50);
    demo myCar2 = new demo();//object creation
    System.out.println(myCar.modelYear + " " + myCar.modelName);
    System.out.println(myCar1.mileage);

    myCar.displayValues();//fun call
  }
}
//12.34f
//12.3400000000000



		



	
