package day13;

/*public class Thiskeyword {
 int x,y;//class variables/instance variables
	
 Thiskeyword(int a, int b)
 {
	 x=a;
	 y=b;
 }
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		Thiskeyword th=new Thiskeyword(100,200);
		th.display();

	}*/
	/*public class Thiskeyword 
	 int x,y;//class variables/instance variables
		
	 Thiskeyword(int x, int y)//local variable
	 {
		this. x=x;//this.x=class variable
		this.y=y;
	 }
		void display()
		{
			System.out.println(x);
			System.out.println(y);
		}
		public static void main(String[] args) {
			Thiskeyword th=new Thiskeyword(100,200);
			th.display();

		}*/


	public class Thiskeyword {
	int x,y;//class variables/instance variables
	
	 void setDate(int a,int b)
	 {
		 x=a;
		 y=b;
	 }
	 
	 
		void display()
		{
			System.out.println(x);
			System.out.println(y);
		}
		public static void main(String[] args) {
			Thiskeyword th=new Thiskeyword();
			th.setDate(100,200);
			
			th.display();

		}
	
	
	
	
	
}
