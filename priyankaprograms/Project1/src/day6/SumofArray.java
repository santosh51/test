package day6;

public class SumofArray {
	public static void main(String[] args) {
		//int a[]= {1,2,3,4,5};
		//int sum=0;
    /*for(int i=0;i<=a.length-1;i++)
{
	sum=sum+a[i];
}
	{
	System.out.println("sum of array elements"+sum);
	}*/
	
	
	
	//Enhanced for loop
	
	/*for(int x:a) {
		sum=sum+x;
	}
	{
		System.out.println("sum of the array"+sum);
	}*/
		int a[]= {1,2,3,4,5};
		int sum=0;
		/*for(int i=0;i<=a.length-1;i++) 
		{
			sum=sum+a[i];
		}
			
			
		{
		System.out.println("sum of the array"+sum);	
		}*/
		
		for(int x:a)
		{
			sum=sum+x;
		}
		{
			System.out.println("sum of the array"+sum);
		}
		
		
		
	}

}
