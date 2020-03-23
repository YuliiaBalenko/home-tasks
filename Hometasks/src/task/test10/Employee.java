package task.test10;

import java.util.Random;

public class Employee {

    private String name;
    private String surname;
    private int id;

    public Employee(String setName, String setSurname, int setId) {
        name = setName;
        surname = setSurname;
        id = setId;
    }

    public Employee(String setName, String setSurname) {
        name = setName;
        surname = setSurname;

        Random r = new Random();
        id = r.nextInt(Integer.MAX_VALUE);
    }

    public String print() {
        return "Employee{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", id=" + id + '}';
    }

}
