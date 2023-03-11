package serialization.test;

import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestEmployee {
	public static void main(String[] args) throws Exception
	{
	Employee emp = new Employee(101,"John doe",4000,"chumma");
	FileOutputStream fos= new FileOutputStream("emp.dat");
	ObjectOutputStream ois = new ObjectOutputStream(fos);
	ois.writeObject(emp);
	}
}
