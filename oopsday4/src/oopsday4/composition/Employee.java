package oopsday4.composition;

import java.util.Objects;

public class Employee extends Person {
	private long empId;
	private String deptno;
	private double salary;
	private Address residenceAddress;
	private Address correspondenceAddress;
	
	public Employee(){
	}

	
	public Employee(String name, String gender, int age,long empId, String deptno, double salary, Address residenceAddress,
			Address corrrespondenceAddress) {
		super(name,gender,age);
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
		this.residenceAddress = residenceAddress;
		this.correspondenceAddress = corrrespondenceAddress;
	}


	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getresidenceAddress() {
		return residenceAddress;
	}
	public void setresidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}
	public Address getcorrespondenceAddress() {
		return correspondenceAddress;
	}
	public void setcorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptno=" + deptno + ", salary=" + salary + "getName()=" +getName()+", getGender()=" + getgender() +", getAge()=" +getage() +"]";
	}
	public int hashCode() {
		return Objects.hash(deptno, empId, salary );
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptno, other.deptno) && empId == other.empId
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
}
