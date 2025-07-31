import java.util.Scanner;

public class Person {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        void setData()
        {
        System.out.print("Name    :   ");
        this.name = sc.nextLine();
        System.out.print("Age     :   ");
        this.age = sc.nextInt();
        }
        void getData()
        {
        System.out.println("Age     :   "+this.age);
        System.out.println("Name    :   "+this.name);
        }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setData();
        p1.getData();
    }
}
