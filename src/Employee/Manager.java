package Employee;

public class Manager extends Employee {
	
	int teamSize;
	Manager(String name, double baseSalary, int teamSize){
		super(name, baseSalary);
		this.teamSize = teamSize;
	}
	
	double calculateSalary()
	{
		double allowance = baseSalary * 0.40;
		double bonus = (teamSize > 10) ? 10000 : 0;
		return baseSalary + allowance + bonus;
	}
}
