// Addition of 2D array 
import java.util.Scanner;
public class Array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 3;
        int[][] arr1 = new int[length][length];
        int[][] arr2 = new int[length][length];
        int [] result = new int[length];

        System.out.println("Enter Array 1 : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Array 2 : ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Addition  is : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                result[i] = arr1[i][j] + arr2[i][j];
                System.out.printf("%d     ", result[i]);
            }
            System.out.println("");
        }
    }
}
