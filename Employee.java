package inheritance;

abstract class Employee{

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    abstract double earnings();

    @Override
    public String toString() {
        return firstName + " " + lastName +"\nSSN: " + socialSecurityNumber;
    }
}
