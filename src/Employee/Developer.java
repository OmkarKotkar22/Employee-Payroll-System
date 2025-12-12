package Employee;

public class Developer extends Employee {

	int numberOfProjects;
	Developer(String name, double baseSalary, int numberOfProjects)
	{
		super(name, baseSalary);
		this.numberOfProjects = numberOfProjects;
	}
	
	double calculateSalary()
	{
		double allowance = baseSalary * 0.30;
		double extra = numberOfProjects* 2000;
		return baseSalary + allowance + extra;
	}
}
