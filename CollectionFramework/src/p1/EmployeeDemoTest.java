package p1;

import java.util.*;

public class EmployeeDemoTest {
	public static void main(String[] args) {
	ArrayList<EmployeeDemo> al=new ArrayList<EmployeeDemo>();    
	  al.add(new EmployeeDemo(101,"Demon",25));    
	  al.add(new EmployeeDemo(106,"Elina",27));    
	  al.add(new EmployeeDemo(105,"Recardo",28));   
	  Comparator<EmployeeDemo> cm1=Comparator.comparing(EmployeeDemo::getEname);  
	  Collections.sort(al,cm1);  
	   System.out.println("Sorting by Name");  
	   for(EmployeeDemo emp: al){  
	     System.out.println(emp.empno+" "+emp.ename+" "+emp.empage);  
	     }    
	    Comparator<EmployeeDemo> cm2=Comparator.comparing(EmployeeDemo::getEmpage);  
	Collections.sort(al,cm2);  
	   System.out.println("Sorting by Age");  
	   for(EmployeeDemo st: al){  
	     System.out.println(st.empno+" "+st.ename+" "+st.empage);  
	     }    

}
}