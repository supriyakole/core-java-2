package oops;

public class Employee {

public String Name;
public int EmployeeId;
public static int Salary = 1000;
public static String CompanyName = " infosys" ;

Employee(String Name,int EmployeeId,int Salary) {

	this.Name = Name;
	this.EmployeeId = EmployeeId;
	this.Salary = Salary;
}
public Employee(String Name,int EmployeeId) {
	this.Name = Name;
	this.EmployeeId = EmployeeId;
			
}
public void PrintName() 
{
System.out.println("Name of Employee is " + this.Name);
}
public void PrintSalary()
{
	System.out.println("Salary of Employee is " + Employee.Salary);
}
public static void ChangeCompanyName()
{
	Employee.CompanyName = "Infosys Technology";
}
}
