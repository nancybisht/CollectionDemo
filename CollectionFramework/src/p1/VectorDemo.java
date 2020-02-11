package p1;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>(); 
		Vector<Integer> vec1=new Vector<Integer>(); 
		  vec.add("Demon");  
		  vec.add("Elina");  
		  vec.add("Ricardo"); 
		  vec1.add(22);
		  vec1.add(2);
		  vec1.add(19);
		  vec1.add(39);
		  vec1.add(16);
		  System.out.println(vec.equals(vec1));
		  Collections.sort(vec1);
		  for(int i:vec1)
		  {
			  System.out.println(""+i);
		  }
		  
		 Enumeration e=vec.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		  } 
		  
	}

}
