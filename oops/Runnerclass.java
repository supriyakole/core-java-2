package oops;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Employee emp1 = new Employee("supriya",24242,1000);
Employee emp2 = new Employee("sayali",34343,2000);
Employee emp3 = new Employee("nikhil",42424);
Employee.ChangeCompanyName();

emp1.PrintName();
emp2.PrintName();
emp3.PrintName();
	}
}