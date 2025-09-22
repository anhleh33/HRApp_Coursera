package company;

public class Employee {
    private int ID;
    private String name;
    private double salary;
    private String department;


    public Employee(int ID, String name, double salary, String department) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Employee(Employee employee) {
        this.ID = employee.getID();
        this.name = employee.getName();
        this.salary = employee.getSalary();
        this.department = employee.getDepartment();
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + ID + ", name=" + name + ", salary=" + salary +  ", department=" + department + "]";
    }
}
