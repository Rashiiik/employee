package inheritance;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("Arman", "Mansur", "123-45-6789", 1000));
        employees.add(new SalariedEmployee("Robert", "Bruce", "987-65-4321", 1500));
        employees.add(new HourlyEmployee("Surongo", "Masud", "111-22-3333", 900, 23));
        employees.add(new HourlyEmployee("Tony", "Stark", "999-88-7777", 750, 45));
        employees.add(new CommissionEmployee("Steve", "Rogers", "000-12-3456", 2000, 20));
        employees.add(new BasePlusCommissionEmployee("Jahangir", "Bhai", "444-55-6666",3000, 15, 200));

        for (Employee e: employees) {

            if (e instanceof BasePlusCommissionEmployee) {

            } else if (e instanceof CommissionEmployee) {
                System.out.print("Commission Employee: ");
            }

            System.out.println(e + " " + e.earnings());

            if (e instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee b = (BasePlusCommissionEmployee)e;
                System.out.println("Base Salary: " + b.getSalary() + "\nIncreased Base Salary: " + b.getIncreasedSalary());
            }

        }

    }
}
