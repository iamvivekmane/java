public class Employee {
    String firstName;
    String lastName;
    Double monthlySalary;

    Employee(String firstName, String lastName, Double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    void setFirstname(String firstName) {
        this.firstName = firstName;
    }
    void setLastname(String lastName) {
        this.lastName = lastName;
    }
    void setMonthlySalary(Double monthlySalary) {
        if (monthlySalary <= 0) {
            monthlySalary = 0.0;
        } else {
            this.monthlySalary = monthlySalary;
        }

    }
    Double raiseSalary() {
        this.monthlySalary = this.monthlySalary + this.monthlySalary * 0.10;
        return this.monthlySalary*12;
    }
    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
    Double getMonthlySalary() {
        return monthlySalary;
    }
    Double getYearlySalary()
    {
        return monthlySalary*12;
    }
}