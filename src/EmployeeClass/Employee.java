package EmployeeClass;

public class Employee {
    private int id;
    private String firstName;
    private String secondName;
    private int salary;
    private int AnnualSalary;

    public Employee(int id, String firstName, String secondName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int annualSalay (int salary) {
        AnnualSalary = this.salary *12;
        return AnnualSalary;
    }

    public String toString () {
        return "ID: " + id +
                "\nFirstName: " + firstName +
                "\nSecondName: " + secondName +
                "\nSalary: $" + salary +
                "\nAnnualSalary: $" + annualSalay(salary);
    }
}
