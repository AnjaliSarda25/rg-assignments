package src.jdbc;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        EmployeeJDBC employeeJDBC = new EmployeeJDBC();
        try {
            employeeJDBC.createEmployeesTable();
            Employee newEmployee = new Employee(1, "Anjali S", "IT");
            employeeJDBC.addEmployee(newEmployee);
            Employee newEmployee1 = new Employee(2, "Sarda A", "Engineering");
            employeeJDBC.addEmployee(newEmployee1);
            Employee employee = employeeJDBC.getEmployee(1);
            System.out.println("Employee Name: " + employee.getName() + ", Department: " + employee.getDepartment());
            employee.setName("Jane Doe");
            employeeJDBC.updateEmployee(employee);
            employee = employeeJDBC.getEmployee(1);
            System.out.println("Employee Name: " + employee.getName() + ", Department: " + employee.getDepartment());
            employeeJDBC.deleteEmployee(1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}