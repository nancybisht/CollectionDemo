package p1;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(20,"Karvel");  
		  map.put(21,"Davil");  
		  map.put(22,"Madona");  
		  map.put(23,"Davil");
		   System.out.println(map);  
		  
		  System.out.println(map.putIfAbsent(24, "Poonam"));
		   map.replace(20,"Damon");
		 System.out.println(map.size());
			   System.out.println(map);  
			 
		   

	}
	}

