package inheritance;

public class SalariedEmployee extends Employee{

    private double salary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber);
        this.salary = salary;
    }

    public double earnings() {
        return salary;
    }

    @Override
    public String toString() {
        return "Salaried Employee: " + super.toString() + "\nWeekly Wage:";
    }
}
