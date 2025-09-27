//Convert number in binary format
import java.util.Scanner;


public class Binary {

    public static void main(String[] args) {
        System.out.print("Number  :   ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        String converted =  Integer.toBinaryString(number1);
        System.out.println("Binary  :   "   +converted);
    }
}