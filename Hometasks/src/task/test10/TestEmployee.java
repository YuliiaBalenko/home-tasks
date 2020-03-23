package task.test10;

import task.ITest;

public class TestEmployee implements ITest {
    public String run() {
        String result = "\n";
        int id = (int) (Math.random() * Integer.MAX_VALUE);
        result += testEmployee("Fidya", "Petrov", id) + "\n";
        result += testEmployee("Lida", "Ivanova") + "\n";
        result += testEmployee("Yulia", "Balenko") + "\n";
        return result;
    }

    private String testEmployee(String setName, String setSurname, int setId) {

        return new Employee(setName, setSurname, setId).print();
    }

    private String testEmployee(String setName, String setSurname) {
        Employee employee = new Employee(setName, setSurname);
        return employee.print();
    }
}
