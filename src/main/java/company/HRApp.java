package company;

import java.util.List;

public class HRApp {
    public static void main(String[] args) {
        Employee[] employees = EmployeeLoader.loadEmployeesFromFile("employees.txt");
        Department ITdepartments = new Department("IT");
        Department HRdepartments = new Department("HR");
        Department Financedepartments = new Department("Finance");
        Department Marketingdepartments = new Department("Marketing");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        for(Employee employee : employees) {
            if(employee.getDepartment().equals("IT")) {
                ITdepartments.addEmployee(employee);
            }
            else if(employee.getDepartment().equals("HR")) {
                HRdepartments.addEmployee(employee);
            }
            else if(employee.getDepartment().equals("Finance")) {
                Financedepartments.addEmployee(employee);
            }
            else if(employee.getDepartment().equals("Marketing")) {
                Marketingdepartments.addEmployee(employee);
            }
        }

        System.out.println("HR App start!");

        ITdepartments.print();
        HRdepartments.print();
        Financedepartments.print();
        Marketingdepartments.print();

    }
}
