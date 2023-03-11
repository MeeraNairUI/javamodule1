package oopsday4.inheritance;

public class CompanyHR {
   public static void main(String[] args) {
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
