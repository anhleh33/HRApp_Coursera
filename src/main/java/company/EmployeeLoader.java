package company;

import java.io.*;
import java.util.*;

public class EmployeeLoader {
    public static Employee[] loadEmployeesFromFile(String filename) {
        List<Employee> tempList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double salary = Double.parseDouble(parts[2].trim());
                    String department = parts[3].trim();
                    Employee employee = new Employee(id, name, salary, department);
                    tempList.add(employee);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert List -> Array
        Employee[] employees = new Employee[tempList.size()];
        return tempList.toArray(employees);
    }
}
