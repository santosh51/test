package day6;
/*1) Declare an array
2)add value into arry
3)find size of an arry
4)read single value from array
5)read multiple value from an arry*/

public class TwodimensionalArray {

	public static void main(String[] args) {
	   //declaring arry
		
		//Approach1
	/*	int a[][]=new int[3][2];
	// int []a[]=new int[3][2];
	// int [][]a=new int[3][2];
	 
		a[0][0]=100;
		a[0][1]=200;
		
        a[1][0]=300;
        a[1][1]=400;
        
        a[2][0]=500;
        a[2][1]=600;*/
		
		
		//Approach..2
		int a[][]= {{100,200},{300,400},{500,600}};
		
		
		//3)find size of an arry
     /*   System.out.println("length of rows"+a.length);
        System.out.println("length of columns"+a[0].length);*/
		
		
		
      //  4)read single value from array

     //  System.out.println(a[2][1]);//600
		


		//5)read multiple value from an arry*/
		
//normal for
    /*   for(int r=0;r<=a.length-1; r++) // r<=2
       {
    	   for(int c=0;c<=a[r].length-1; c++)  // c<=1   0 1 2 
    	   
    	   {
    	   System.out.print(a[r][c]+"    ");//100 200
    	   }
    	   System.out.println();
}*/

		//enhanced for loop
		
		for(int arr[]:a) 
		{
		
				for (int x:arr)
				{	
					
					System.out.print(x+"  " );
			}
				System.out.println();
		}
		
		
		
		


	}

}
