package inheritance;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double salary;
    private double commission;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double sales, double commission, double salary) {
        super(firstName, lastName, socialSecurityNumber, sales, commission);
        this.salary = salary;
    }

    public double earnings() {
        commission = getSales() * getCommission()/100;
        return commission;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Base Plus Commission Employee: " + super.toString();
    }
}
