package company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {
    Department department;

    @BeforeEach
    void setUp(){
        department = new Department("IT");
    }

    @AfterEach
    public void tearDown() {
        department = null;
    }

    @Test
    void getName() {
        assertEquals("IT", department.getName());
    }
    @Test
    void setName() {
        department.setName("HR");
        assertEquals("HR", department.getName());
    }

    @Test
    void getLenghtofEmployees() {
        assertEquals(5, department.getEmployees().length);
    }

    @Test
    void checkDepartmentSize() {
        assertEquals(0, department.getSize());
    }

    @Test
    void testAddValidEmployee() {
        Employee e = new Employee(1, "John Doe", 5000, "IT");
        department.addEmployee(e);

        assertEquals(1, department.getSize());
        assertEquals("John Doe", department.getEmployees()[0].getName());
    }

    @Test
    void testAddEmployeeWrongDepartment() {
        Employee e = new Employee(2, "Jane Smith", 6000, "HR");
        department.addEmployee(e);

        assertEquals(0, department.getSize());
    }

    @Test
    void testAddDuplicateEmployee() {
        Employee e1 = new Employee(3, "Alice Brown", 7000, "IT");
        department.addEmployee(e1);
        department.addEmployee(e1);

        assertEquals(1, department.getSize());
    }

//    @Test
//    void testAddEmployeeWhenFull() {
//        for (int i = 1; i <= 5; i++) {
//            department.addEmployee(new Employee(i, "Emp" + i, 4000 + i * 100, "IT"));
//        }
//
//        Employee extra = new Employee(99, "Overflow", 9000, "IT");
//        department.addEmployee(extra);
//
//        assertEquals(5, department.getSize());
//    }

    @Test
    void testTotalSalary(){
        Employee e1 = new Employee(3, "Alice Brown", 7000, "IT");
        Employee e2 = new Employee(2, "Alice Bring", 8500, "IT");
        Employee e3 = new Employee(1, "Alice Cliensd", 10000, "IT");

        department.addEmployee(e1);
        department.addEmployee(e2);
        department.addEmployee(e3);

        assertEquals((7000+8500+10000), department.totalSalary());
    }

    @Test
    void testAverageSalary(){
        Employee e1 = new Employee(3, "Alice Brown", 7000, "IT");
        Employee e2 = new Employee(2, "Alice Bring", 8500, "IT");
        Employee e3 = new Employee(1, "Alice Cliensd", 10000, "IT");

        department.addEmployee(e1);
        department.addEmployee(e2);
        department.addEmployee(e3);

        assertEquals(Math.round((double) (7000 + 8500 + 10000) /3), department.averageSalary());
    }

}