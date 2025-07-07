package inheritance;

public class HourlyEmployee extends Employee{

    private double salary;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double salary, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public double earnings() {

        if (hoursWorked > 40) {
            salary = salary * 1.5;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "Hourly Employee: " + super.toString() + "\nHours Worked: " + hoursWorked + "\nHourly Wage:";
    }
}
