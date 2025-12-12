package Employee;

public class Intern extends Employee {
	
	Intern(String name, double baseSalary)
	{
		super(name, baseSalary);
	}
	
	double calculateSalary()
	{
		return baseSalary * 0.50;
	}
}
