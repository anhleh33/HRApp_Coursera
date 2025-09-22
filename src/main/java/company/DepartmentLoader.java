package company;

import java.io.*;
import java.util.*;

public class DepartmentLoader {
    public static Department[] loadDepartmentsFromFile(String filename) {
        List<Department> tempList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                    String name = line.trim();
                    tempList.add(new Department(name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Convert list → array
        Department[] departments = new Department[tempList.size()];
        return tempList.toArray(departments);
    }
}
