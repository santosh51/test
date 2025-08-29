package day7;

import java.util.Arrays;

public class SortingelementinArray {

	public static void main(String[] args) {
		int a[]= {100,600,200,400,500};
    System.out.println("Before sorting...");
    System.out.println(Arrays.toString(a));//just for printing
   /* for(int value:a)
    {
    	System.out.println(value);
    }*/
    Arrays.sort(a);//sort elements in array
    System.out.println("After sorting...");
    System.out.println(Arrays.toString(a));
    
    
    
    
    
	}

}
