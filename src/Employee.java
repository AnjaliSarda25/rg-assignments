package src;

import java.util.ArrayList;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
    }
}

class EmployeeCRUD {
    private ArrayList<Employee> employeeList;

    public EmployeeCRUD() {
        employeeList = new ArrayList<>();
    }

    // Create: Add a new employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee added: " + employee);
    }

    // Read: Get an employee by ID
    public Employee getEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
        return null;
    }

    // Update: Update an existing employee
    public void updateEmployee(int id, String name, String department) {
        Employee employee = getEmployee(id);
        if (employee != null) {
            employee.setName(name);
            employee.setDepartment(department);
            System.out.println("Employee updated: " + employee);
        }
    }

    // Delete: Remove an employee by ID
    public void deleteEmployee(int id) {
        Employee employee = getEmployee(id);
        if (employee != null) {
            employeeList.remove(employee);
            System.out.println("Employee deleted: " + employee);
        }
    }

    // Read: List all employees
    public void listAllEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();

        // Adding employees
        employeeCRUD.addEmployee(new Employee(1, "Person1", "Engineering"));
        employeeCRUD.addEmployee(new Employee(2, "Person2", "Marketing"));

        // Listing all employees
        System.out.println("All Employees:");
        employeeCRUD.listAllEmployees();

        // Getting an employee by ID
        System.out.println("Get Employee with ID 1:");
        System.out.println(employeeCRUD.getEmployee(1));

        // Updating an employee
        employeeCRUD.updateEmployee(1, "Person x", "Engineering");

        // Listing all employees after update
        System.out.println("All Employees after update:");
        employeeCRUD.listAllEmployees();

        // Deleting an employee
        employeeCRUD.deleteEmployee(2);

        // Listing all employees after deletion
        System.out.println("All Employees after deletion:");
        employeeCRUD.listAllEmployees();
    }
}

