package p1;

import java.util.Comparator;

public class AgeComparison implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.empage==o2.empage)  
		return 0;  
		else if(o1.empage>o2.empage)  
		return 1;  
		else  
		return -1;  
		}  
	}

