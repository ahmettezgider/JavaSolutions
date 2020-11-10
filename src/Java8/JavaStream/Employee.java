package Java8.JavaStream;

import java.io.Serializable;
import java.util.Random;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Random r = new Random(Integer.MAX_VALUE);

    private long id;
    private String name;
    private String surname;
    private double salary;

    public Employee(long id, String name, String surname, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    //Getters and setters

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public static Employee create() {
        //Get the employee id in more predictable manner
        //e.g. Max id present in databse + 1

        Employee obj = new Employee(r.nextInt(), "", "", 0.0d);
        return obj;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static Random getR() {
        return r;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String name) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}