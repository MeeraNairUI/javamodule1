package userdefinedobjects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashMap;
public class TestHashMap {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
		   
		   Employee emp2 = new Employee("Jone Doe","Male",30,102,"Accounting",30000);
		   
		   Employee emp3 = new Employee("Jis Doe","Male",40,103,"sales",50000);
		  
		   Employee emp4 = new Employee("Jonas Doe","Male",45,104,"Research",60000);
		   
		   Employee emp5 = new Employee("Jones Doe","Male",50,105,"Marketing",20000);
		   
		   ArrayList<Employee> empList = new ArrayList<Employee>();
		   
		   empList.add(emp1);
           empList.add(emp2);
           empList.add(emp3);
           empList.add(emp4);
           empList.add(emp5);
			
           HashSet<Employee> empSet = new HashSet<Employee>();
           empSet.add(emp1);
           empSet.add(emp2);
           empSet.add(emp3);
           empSet.add(emp4);
           empSet.add(emp5);
           
           TreeSet<Employee> TreeSet = new TreeSet<Employee>();
           TreeSet.add(emp1);
           TreeSet.add(emp2);
           TreeSet.add(emp3);
           TreeSet.add(emp4);
           TreeSet.add(emp5);


    HashMap<String,Collection> dataMap = new HashMap<>();
    
    dataMap.put("empList",empList);
    dataMap.put("empSet",empSet);
    dataMap.put("empTreeSet",TreeSet);
    System.out.println(dataMap);
    
    Collection<Employee> list = dataMap.get("empList");
    Iterator<Employee> iter = list.iterator();
    while(iter.hasNext()) {
    	System.out.println(iter.next());
    }
    Collection<Employee> set = dataMap.get("empset");
    iter = set.iterator();
    while(iter.hasNext()) {
    	System.out.println(iter.next());
    }
    
    Collection<Employee> tree = dataMap.get("empTreeSet");
    iter = tree.iterator();
    while(iter.hasNext()) {
    	System.out.println(iter.next());
    }
}
}

