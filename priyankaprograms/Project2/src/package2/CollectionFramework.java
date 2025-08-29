package package2;

import java.util.*;

public class CollectionFramework {
/*	ArrayList :
		--Maintain Order of insertion
		--Allows Duplicate

		HashSet :
		--Doesnt Maintain Order of insertion
		--Doesnt  Duplicate

		LinkedHashSet :
		--Maintains Order of insertion
		--Doesnt  Duplicate

		TreeSet :
		--Inserts in Sorted order
		--Doesnt  Duplicate*/

		
		public static void main(String[] args) {
	        // Create an ArrayList of Strings
	       // ArrayList<String> fruits = new ArrayList<>();//
	        Set fruits1 = new TreeSet<>();
	      /* // Add elements
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Apple");
	        fruits.add("Mango");
	        fruits.add("Cherry");

	        System.out.println("Fruits: " + fruits); // Output: Fruits: [Apple, Banana, Cherry]
for(int i=0;i<fruits.size();i++) {
	 String firstFruit = fruits.get(i);
     System.out.println("First fruit: " + firstFruit); // Output: First fruit:
     
}
int j=0;
while(j<fruits.size())
	{
	System.out.println();
	j++;
	}*/

	        fruits1.add(10);
fruits1.add("Apple");
fruits1.add("Banana");

fruits1.add("Apple");
fruits1.add("Mango");

fruits1.add("Cherry");
System.out.println("Fruits: " + fruits1);

/*for (String value : fruits1)
{
	System.out.println("Fruits: " + value);

		}*/

}
}