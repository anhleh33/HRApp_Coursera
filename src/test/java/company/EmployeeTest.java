package company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee(1, "Anh", 6000, "IT");
    }

    @AfterEach
    void tearDown() {
        employee = null;
    }

    @Test
    void getName() {
        assertEquals("Anh", employee.getName());
    }

    @Test
    void setName() {
        employee.setName("Anh Hoang");
        assertEquals("Anh Hoang", employee.getName());
    }

    @Test
    void getDepartment() {
        assertEquals("IT", employee.getDepartment());
    }
    @Test
    void setDepartment() {
        employee.setDepartment("HR");
        assertEquals("HR", employee.getDepartment());
    }
    @Test
    void getSalary() {
        assertEquals(6000, employee.getSalary());
    }
    @Test
    void setSalary() {
        employee.setSalary(70000);
        assertEquals(70000, employee.getSalary());
    }

    @Test
    void getID() {
        assertEquals(1, employee.getID());
    }
    @Test
    void setID() {
        employee.setID(3);
        assertEquals(3, employee.getID());
    }
}
