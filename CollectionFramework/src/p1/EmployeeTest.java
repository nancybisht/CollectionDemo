package p1;
import java.util.*;
public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>(); 
		Employee e=new Employee(101,"Devil",23);
		al.add(e); 
		al.add(new Employee(106,"Sujay",27));  
		al.add(new Employee(105,"Demon",21));  
		Collections.sort(al,new AgeComparison());
		for(Employee emp:al){  
		System.out.println(emp.empno+" "+emp.ename+" "+emp.empage);  
		}  
		

	}

}
