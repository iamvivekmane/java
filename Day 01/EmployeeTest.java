public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram", "Sham", 10000.0);
        System.out.println("First Name      : " + e1.getFirstName());
        System.out.println("Last Name       : " + e1.getLastName());
        System.out.println("Yearly Salary   : " + e1.getYearlySalary());
        e1.raiseSalary();
        System.out.println("After Hike");
        System.out.println("Yearly Salary   : " + e1.getYearlySalary());
        System.out.println("---------------------------------------");
        Employee e2 = new Employee("Raj", "Sharma", 15000.0);
        System.out.println("First Name      : " + e2.getFirstName());
        System.out.println("Last Name       : " + e2.getLastName());
        System.out.println("Yearly Salary   : " + e2.getYearlySalary());
        e2.raiseSalary();
        System.out.println("After Hike");
        System.out.println("Yearly Salary   : " + e2.getYearlySalary());
    }
}
