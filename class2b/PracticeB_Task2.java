package class2b;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative (" + salary + ")");
        }
    }

    public String getName() {
        return this.name;
    }
}

public class PracticeB_Task2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Abebe", 4500.0);

        System.out.println(emp.getName() + " Initial Salary: $" + emp.getSalary());

        // Test valid input
        emp.setSalary(5200.0);
        System.out.println("Updated Valid Salary: $" + emp.getSalary());

        // Test invalid input
        emp.setSalary(-1000.0);
        System.out.println("Salary after invalid update: $" + emp.getSalary());
    }
}