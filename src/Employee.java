import java.util.Arrays;

public class Employee {
    private String Role;
    private String Name;
    private static Arrays employees;
    private int salary;


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String Name, String Role, int salary) {
        this.Name = Name;
        this.Role = Role;
        this.salary = salary;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
