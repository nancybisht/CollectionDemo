package p1;
import java.util.*;
public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> a=new ArrayList<Employee>(); 
		Employee e=new Employee(101,"Devil",23);
		a.add(e); 
		a.add(new Employee(106,"Sujay",27));  
		a.add(new Employee(105,"Demon",21));  
		Collections.sort(a,new AgeComparison());
		for(Employee emp:a){  
		System.out.println(emp.empno+" "+emp.ename+" "+emp.empage);  
		}  
		

	}

}
