package tamilnadu.chennai;

public class Employee {
	String name; 
	int exp; 
	int salary; 
	
	public Employee(String name, int exp, int salary) {
		// TODO Auto-generated constructor stub	
        this.name = name;

		this.exp = exp;
		this.salary = salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee emp1 = new Employee("kurinji",8,30000);
Employee emp2 = new Employee("Selvendiran",8,35000);
		
System.out.println(emp1.equals(emp2));
	
}
	public boolean equals(Object obj)
	{
		Employee e=(Employee) obj ;
		
		if(this.exp==e.exp)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
} 
