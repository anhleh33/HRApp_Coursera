package company;

import java.util.ArrayList;

public class Department {
    private String name;
    private Employee[] employees;
    private int size;

    public Employee[] getEmployees() {
        return employees;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Department(String name) {
        this.name = name;
        this.employees = new Employee[5];
        this.size = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department [name=" + name + ", employee size=" + employees.length + "]";
    }

    public void print() {
        System.out.println("Department " + this.name);
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        System.out.println("Total Salary: " + totalSalary());
        System.out.println("Average Salary: " + averageSalary());
        System.out.println();
    }

    public double totalSalary() {
        double total = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return Math.round(total * 100) / 100.0;
    }

    public double averageSalary() {
        return Math.round(totalSalary()/size * 100) / 100.0;
    }

    public boolean isAlreadyExist(Employee employee) {
        if(size == 0) return false;
        for (Employee emp : employees)
            if(emp != null){
                if (emp.getID() == employee.getID() && emp.getDepartment().equals(employee.getDepartment()))
                    return true;
            }
        return false;
    }

    public void addEmployee(Employee employee) {
        if (size == 6) {
            System.out.println("❌ Employees size is full");
            return;
        }

        if (!employee.getDepartment().equals(name)) {
            System.out.println("❌ Employee department does not match " + name);
            return;
        }

        if (isAlreadyExist(employee)) {
            System.out.println("❌ Employee already exist");
            return;
        }

        employees[size] = new Employee(employee);
        size++;
        System.out.println("✅ Added " + employee.getName() + " to " + name);
    }

}
