/*Q2. Employee Payroll System – Multiple Child Classes
Create:
Parent class: Employee
Fields: id, name, baseSalary
 Method: calculateSalary()
Child classes:
Manager:
Allowance = 40% of baseSalary
Bonus = ₹10,000 if teamSize > 10
Developer:
Allowance = 30%
Extra pay = ₹2000 × numberOfProjects
Intern:
Stipend = 50% of baseSalary
Task:
Create an array of 10 employees (mix of all types).
Implement salary calculation using overrides.
Display:
Employee with maximum salary
Count how many employees earn above 60,000.
Concepts Used
Inheritance + overriding
Polymorphism with reference array
Logical operations for filtering and counting
*/

package Employee;
import java.util.*;
public class Employee_Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		
		Employee e[] = new Employee[size];
		
		for(int i = 0; i < e.length; i++)
		{
			System.out.println("Enter the Employee Details: "+ (i+1));
			System.out.println("1.Manager: ");
			System.out.println("2.Developer: ");
			System.out.println("3.Intern: ");
			System.out.println("Choice: ");
			int choice = sc.nextInt();
			
//			System.out.println("Enter the Employee Id: ");
//			int id = sc.nextInt();
			
			System.out.println("Enter the Employee Name: ");
			String name = sc.next();
			
			System.out.println("Enter the Employee Base Salary: ");
			double baseSalary = sc.nextDouble();
			
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Team Size: ");
				int teamSize = sc.nextInt();
				e[i] = new Manager(name, baseSalary, teamSize);
				break;
				
			case 2: 
				System.out.println("Enter the Number of Projects: ");
				int numberOfProject = sc.nextInt();
				e[i] = new Developer(name, baseSalary, numberOfProject);
				break;
				
			case 3:
				e[i]=new Intern(name, baseSalary);
				break;
				
			default:
                System.out.println("Invalid type! Assigning Intern by default.");
                e[i] = new Intern(name, baseSalary);
                break;
			}
		}	
		Employee maxEmployee = e[0];
		double maxSalary = e[0].calculateSalary();
		
		int countAbove60 = 0;
		for(Employee emp : e)
		{
			double salary = emp.calculateSalary();
			if(salary > maxSalary)
			{
				maxSalary = salary;
				maxEmployee = emp;
			}
			
			if(salary > 60000)
			{
				countAbove60++;
			}
		}
		System.out.println("\n===== Employee with Maximum Salary =====");
        System.out.println("ID: " + maxEmployee.id);
        System.out.println("Name: " + maxEmployee.name);
        System.out.println("Salary: " + maxSalary);

        System.out.println("\nEmployees earning above 60,000 = " + countAbove60);
	}

}
