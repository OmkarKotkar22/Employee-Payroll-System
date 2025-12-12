package Employee;

public class Employee {
	
	static int Id = 1;
	int id;
	String name;
	double baseSalary;
	
	Employee(String name, double baseSalary){
		this.id = Id++;
		this.name = name; 
		this.baseSalary = baseSalary;
	}
	
	double calculateSalary()
	{
		return baseSalary;
	}
}
