package inheritance;

public class CommissionEmployee extends Employee{

    private double sales;
    private double salary;
    private double commission;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double sales, double commission) {
        super(firstName, lastName, socialSecurityNumber);
        this.sales = sales;
        this.commission = commission;
    }

    public double earnings() {
        salary = sales * commission/100;
        return salary;
    }

    public double getSales() {
        return sales;
    }

    public double getCommission() {
        return commission;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + sales + "\nCommission: ";
    }
}
