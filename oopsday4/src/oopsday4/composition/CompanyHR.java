package oopsday4.composition;
import oopsday4.inheritance.Employee;

public class CompanyHR {
   public static void main(String[] args) {
	   
	   Address resAdd=new Address("31","Mannath","Worli","Mumbai","400048");
	   Address commAdd = new Address("32","Antela","Bandra","Mumbai","400032");
	   
	   
	   Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
	   System.out.println(emp1);
	   Employee emp2 = new Employee("Jone Doe","Male",30,102,"Accounting",30000);
	   System.out.println(emp1);
	   Employee emp3 = new Employee("Jis Doe","Male",40,103,"sales",50000);
	   System.out.println(emp1);
	   Employee emp4 = new Employee("Jonas Doe","Male",45,104,"Research",60000);
	   System.out.println(emp1);
	   Employee emp5 = new Employee("Jones Doe","Male",50,105,"Marketing",20000);
	   System.out.println(emp5);

	   if(emp1.equals(emp5))
		   System.out.println("they are same");
	   else
		   System.out.println("they are not same");
}
}
