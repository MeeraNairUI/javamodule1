package serialization.test;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

public class Employee implements  Serializable {
		private int empno;
		private String name;
		private double salary;
		transient private String password;
	
		
		public Employee() {

	}
		public Employee(int empno, String name, double salary, String password)
		{
			super();
			this.empno = empno;
			this.name = name;
			this.salary = salary;
			this.password = password;
		}
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public double getSalary() {
			return salary;
		}

		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		
		public String getname() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public double salary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", password=" + password
					+ "]";
		}

	
	
}

