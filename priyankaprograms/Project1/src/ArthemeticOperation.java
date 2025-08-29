import java.util.Scanner;
public class ArthemeticOperation {
    int a1,b1;
	float x,y;
	
	public ArthemeticOperation() {
		System.out.println("Default constructor");
		a1=10;
		x=12.4f;
		
		
	}
	public void add() {
		System.out.println("add a1 and x"+(a1+x));
		
	}
	public void add(int c) {
		System.out.println("add a1,c and x"+(a1+x+c));
		
	}
	public void add(float c) {
		System.out.println("add a1,c and x"+(a1+x+c));
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a=scanner.nextFloat();
		System.out.println("Enter integer b number");
		int b=scanner.nextInt();
		
		ArthemeticOperation ac = new ArthemeticOperation();
		ac.add();
		ac.add(b);
		
		ac.add(a);
		
	System.out.println("Input b number"+b);
	System.out.println("Input a number"+a);
	
	}
}
