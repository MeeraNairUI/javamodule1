package oopsday4.inheritance;

public class Person {
      private String name;
      private String gender;
      private int age;
      
      public Person() {
    	  
      }

	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getgender(){
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public int getage() {;
	     return age; 
    }
     public void setage(int age) {
    	 this.age = age;
     }

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
     
	}
	
     
    	  

