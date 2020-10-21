//Java program to demonstrate ArrayList class

package Demo4;

import java.util.ArrayList;
import java.util.Iterator;
class Employee{
	int emp_id;
	String name;
}
public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList list1 can store any type of Object
		ArrayList list1=new ArrayList();				//any type
		
		//ArrayList list2 can only store String Objects 
		ArrayList<String> list2=new ArrayList<String>(); //type specific
		Employee e=new Employee();
		e.emp_id=101;
		e.name="Richard";
				
		//Add any type of data in the ArrayList list1
		list1.add(2);			//index 0
		list1.add(4.78);		//index 1
		list1.add("John");		//index 2
		list1.add(e);			//index 3
		list1.add('a');			//index 4
		
		//Add data in the ArrayList list2
		list2.add("George");    //index 0
		list2.add("Bob");	   //index 1
		list2.add("Richard");  //index 2
		list2.add("Jack");	   //index 3
		
		//Print reference to list prints elements in the list sequentially
		System.out.println("List 1:"+list1);
		System.out.println("List 2:"+list2);
		
		//Get an element from list1
		Object o=list1.get(2);
		System.out.println("Get an element from List 1 that is at index 2\n"+o);
		
		//Get an element from list2
		String s=list2.get(2);
		System.out.println("Get an element from List 2 that is at index 2\n"+s);
		
		//Update an element from list 2
				list2.set(2, "Steve");
				System.out.println("Update an element from List 2 that is at index 2\n");
				System.out.println("List 2 after updation");
				System.out.println(list2);
				
				//Remove an element from list2
				list2.remove(2);
				System.out.println("Remove an element from List 2 that is at index 2\n");
				System.out.println("List 2 after updation");
				System.out.println(list2);
				
				//Remove all the elements from the list
				//list.clearAll();
				
				System.out.println("Search an element from the list");
				//Search an element from the list
				if(list2.contains("Bob"))
				{
					System.out.println("Bob is in the list");
								
				}
				
				System.out.println("******************************");
				//Iterate with basic for loop
				
				System.out.println("Iterating with basic for loop");
				for(int i=0;i<list2.size();i++)
				{
					 System.out.println(list2.get(i));
				}
				
				/*Iterate in ArrayList with enhanced for loop
				 *
				 * System.out.println("Iterate with enhanced for loop");
				 *  for(String str:list2)
			     *  System.out.println(str);
				 */
				
				System.out.println("Iterating with Iterator");
				Iterator<String> itr=list2.iterator();
				
				//System.out.println(itr.next());
				System.out.println(itr.next());
				System.out.println(itr.next());
							
				System.out.println("Iterating with Iterator using while loop");
				while(itr.hasNext())
				{
					String str=itr.next();
					System.out.println(str);
					if(str.equals("Jack"))
					{
						itr.remove();
					}
					System.out.println("Remove Jack from List 2");
					System.out.println("List 2 as follows"+list2);
				}
			}
		}
