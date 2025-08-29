package day6;

public class Evenoddnumberfromarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,};
		//extracting even number
		
		/*System.out.println("even number in array.....");
		for(int i=0;i<a.length;i++) //6
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("odd number in array.....");
		for(int i=0;i<a.length;i++) //6
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}*/
		
		
		//Enhanced for loop
		System.out.println("even number");
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
		}
		System.out.println("odd number");
		for(int value:a)
		{
			if(value%2!=0)System.out.println(value);
		}
		
		
	}
	

}
