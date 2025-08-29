package mypractice;

public class ArrayProgram {

	public static void main(String[] args) {
		
     //find sum of elements in array. a={1,2,3,4,5}     sum=15
		
		/*int a[]= {1,2,3,4,5};
			int sum=0;
			for(int i=0; i<=a.length-1;i++)// ( i<5)i<a.length or (i<=4 ) i<=a.length-1 
			{
				sum=sum+a[i];
			}
		System.out.println("sum of the elements "+sum);*/
		
		
		//print even and odd number from array. a={1,2,3,4,5,6}     even=3 odd=3
		
		int a[]= {1,2,3,4,5,6};
		//Extracting even number
		/*System.out.println("Even number in array....");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		
			
				System.out.println("odd Number in array....");
				for(int j=0;j<=a.length-1;j++)
				{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
				}
	
		}
	}
}*/
   //Enhanced for loop
   for(int x:a )
   {
	  if(x%2==0)
		  System.out.println("even number"+x);
   }
   
   for(int x:a )
   {
	  if(x%2!=0)
		  System.out.println("odd number"+x);
   }
   
	}	
	
}
		
		
		
	


