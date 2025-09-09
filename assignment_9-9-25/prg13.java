// Base class
public class Employee {
    public String employeeID;          
    protected String department;       
    private double salary;          

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. It must be non-negative.");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID +
                           ", Department: " + department +
                           ", Salary: $" + salary);
    }
}


public class Manager extends Employee {
    private String team; 

    public Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID +
                           ", Department: " + department +
                           ", Salary: $" + getSalary() +
                           ", Team: " + team);
    }
}



public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("E123", "HR", 50000);
        emp.displayEmployeeDetails();

        Manager mgr = new Manager("M456", "Sales", 75000, "North Team");
        mgr.displayManagerDetails();

    }
}
