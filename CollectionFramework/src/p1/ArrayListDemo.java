package p1;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>(); 
		//List<String> all=new ArrayList<String>(); 
		al.add("David"); 
		al.add("Marshel");  //allow duplicate and ordered
		al.add("Devil");
		al.add("David");
		System.out.println(al.size());
		System.out.println(al.get(2));
		System.out.println(al.contains("Marshell"));
		al.remove(1);
		Iterator itr= al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
				  

	}

}
