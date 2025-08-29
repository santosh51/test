package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetDemo {

	public static void main(String[] args) {
		//Declaration
		
		HashSet myset= new HashSet();
		//Set myset=new HashSet();
		//HashSet<String> myset= new HashSet<String>();
		
		//adding elements in to hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		//Printing hashset
		System.out.println(myset);//[null,A,100,10.5,welcome,true]
		
		//Size of hashset
		System.out.println("size of hashset:"+myset.size());
		
		
		//Removing elements
		myset.remove(10.5);//10.5 is value(not an index)
		System.out.println("After removing:"+myset);//[null,A,100,welcome,true]
		
		
		//Inserting element - Not possible
		
		//Access specific elements - not possible
		
		ArrayList a1 =new ArrayList(myset);
		
		System.out.println(a1);//[null, A,100,welcome,true]
		System.out.println(a1.get(2));
		
		//Read all the elements using for..each
		/*for(Object X:myset)
		{
			System.out.println(X);
		}*/
		
		//using iterator
		Iterator<Object>it=myset. iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//clearing all the elements in hashset
		
		myset.clear();
		System.out.println(myset.isEmpty());//true
		
		
	}

}
