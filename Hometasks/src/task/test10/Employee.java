package task.test10;

import java.util.Random;

public class Employee {

    private String _name;
    private String _surname;
    private int _id;

    public Employee(String name, String surname, int id) {
        _name = name;
        _surname = surname;
        _id = id;
    }

    public Employee(String name, String surname) {
        _name = name;
        _surname = surname;

        Random r = new Random();
        _id = r.nextInt(Integer.MAX_VALUE);
    }

    public String print() {
        return "Employe{" + "name='" + _name + '\'' + ", surname='" + _surname + '\'' + ", id=" + _id + '}';
    }

}
