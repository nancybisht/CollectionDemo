package p1;
import java.util.*;
public class SetCollectionDemo {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<String>();  
		hs.add("David");  
		hs.add("Marshel");  
		hs.add("Karvel");  
		hs.add("David");
		hs.remove("David");
		//hs1.removeIf(n->(n%2==0));
		/*for(int i:hs1)
		{
			System.out.println(i);
			
		}*/
		
		
		
		Iterator itr= hs.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());
		}	}
}