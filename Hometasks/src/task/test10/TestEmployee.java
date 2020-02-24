package task.test10;

import task.ITest;

public class TestEmployee implements ITest
{
	public String run ()
	{
		String result = "\n";
		int id = (int)(Math.random() * Integer.MAX_VALUE);
		result += testEmployee("Fidya", "Petrov", id) + "\n";
		result += testEmployee("Lida", "Ivanova") + "\n";
		result += testEmployee("Yulia", "Balenko") + "\n";
		return result;
	}

	private String testEmployee(String name, String surname, int id)
	{
		return new Employee(name, surname, id).print();
	}

	private String testEmployee(String name, String surname)
	{
		Employee employee = new Employee(name, surname);
		return employee.print();
	}
}
