package userdefinedobjects;
import java.util.TreeSet;
import java.util.Iterator;
public class TestEmpTreeSet {

	public static void main(String[] args) {
		TreeSet<Employee> TreeSet = new TreeSet<Employee>();
		
		   Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
		   
		   Employee emp2 = new Employee("Jone Doe","Male",30,102,"Accounting",30000);
		   
		   Employee emp3 = new Employee("Jis Doe","Male",40,103,"sales",50000);
		  
		   Employee emp4 = new Employee("Jonas Doe","Male",45,104,"Research",60000);
		   
		   Employee emp5 = new Employee("Jones Doe","Male",50,105,"Marketing",20000);
		   
           TreeSet.add(emp1);
           TreeSet.add(emp2);
           TreeSet.add(emp3);
           TreeSet.add(emp4);
           TreeSet.add(emp5);
           System.out.println(TreeSet);

	}

}
