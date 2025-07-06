package inheritance;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<SalariedEmployee> salariedEmployees = new ArrayList<>();
        ArrayList<HourlyEmployee> hourlyEmployees = new ArrayList<>();
        ArrayList<CommissionEmployee> commissionEmployees = new ArrayList<>();
        ArrayList<BasePlusCommissionEmployee> basePlusCommissionEmployees = new ArrayList<>();

        salariedEmployees.add(new SalariedEmployee("Arman", "Mansur", "123-45-6789", 1000));
        salariedEmployees.add(new SalariedEmployee("Robert", "Bruce", "987-65-4321", 1500));
        hourlyEmployees.add(new HourlyEmployee("Surongo", "Masud", "111-22-3333", 900, 23));
        hourlyEmployees.add(new HourlyEmployee("Tony", "Stark", "999-88-7777", 750, 45));
        commissionEmployees.add(new CommissionEmployee("Steve", "Rogers", "000-12-3456", 2000, 20));
        basePlusCommissionEmployees.add(new BasePlusCommissionEmployee("Jahangir", "Bhai", "444-55-6666",3000, 15, 200));

        for (SalariedEmployee e: salariedEmployees) {
            System.out.println(e + "\nWeekly Wage: " + e.earnings());
        }

        for (HourlyEmployee e: hourlyEmployees) {
            System.out.println(e + "\nHourly Wage: " + e.earnings());
        }

        for (CommissionEmployee e: commissionEmployees) {
            System.out.println("Commission Employee: " + e + "\nCommission: " + e.earnings());
        }

        for (BasePlusCommissionEmployee e: basePlusCommissionEmployees) {
            System.out.println(e + "\nCommission: " + e.earnings() + "\nBase Salary: " + e.getSalary() + "\nIncreased Base Salary: " + e.getIncreasedSalary());
        }


    }
}
