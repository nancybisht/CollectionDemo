package p1;
public class EmployeeDemo {
	int empno;    
	   String ename;    
	  int empage;    
	    EmployeeDemo(int empno,String ename,int empage){    
	    this.empno=empno;    
	    this.ename=ename;    
	    this.empage=empage; 	    
	    }
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public int getEmpage() {
			return empage;
		}
		public void setEmpage(int empage) {
			this.empage = empage;
		}  
	  
}
