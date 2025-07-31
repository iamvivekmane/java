import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 3;
        int [] [] arr = new int [length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
    }
}
