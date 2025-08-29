package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
       ArrayList mylist=new ArrayList();
      // List mylist =new ArrayList();//List is Interface so we import it 
       
      // ArrayList <Integer>mylist=new ArrayList<Integer>();// Integer type object
       //ArrayList <String>mylist=new ArrayList<String>();//String type of date
     //  ArrayList <Employee>mylist=new ArrayList<Employee>();//Employee type object
		
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		
		//size of arraylist
		System.out.println("Size of an array list:"+mylist.size());//8
		
		//printing arraylist
		System.out.println("printing of an array list:"+mylist);//[100,10.5,welcome,A,True,100,null,null]
		
		//Remove element from arraylist
		mylist.remove(5);
		System.out.println("After removing:"+mylist);//[100,10.5,welcome,A,true,null,null]
		
		//Insert element in the arraylist
		mylist.add(2,"java");
		System.out.println("After insertion:"+mylist);//[100,10.5,java,welcome,A,true,null,null]
		
		//modify element in the arralist(modify/replace/change)
		mylist.set(2, "python");
		System.out.println("After replacing:"+mylist);//[100,10.5,python,welcome,A,true,null,null]
		
		//Access specific element from arraylist
		System.out.println(mylist.get(3));// here 3 is index//welcome
		
		//Reading all the element from arraylist
		
		//using normal for loop
		
		/*for(int i=0;i<mylist.size();i++);
		{
			System.out.println(mylist.get(i));
		}*/
		
		//using for..each loop
		/*for(Object x:mylist)
		{
		System.out.println(x);	
		}*/
		
		//using iterator
		Iterator it=mylist.iterator();
		
		 /*while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		
		//checking arraylist is empty or not
		System.out.println("is arraylist empty?"+mylist.isEmpty());
		
		// remove all the elements from array list
		ArrayList mylist2=new ArrayList();
		mylist.add(100);
		mylist.add("welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements:"+mylist);//[10.5, python, A, true,null,null]
		
		//remove all the elements/clear
		mylist.clear();
		System.out.println("Is arraylist empty?"+mylist.isEmpty());//true
		
		
		
		
		
		
	}

}
