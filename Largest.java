import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("Enter array :   ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int min = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            
                if (arr[i]<arr[i+1]) {
                    min = arr[i];
                }
            
        }

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[i]<arr[j]) {
        //             min = arr[i];
        //         }
        //     }
        // }
    System.out.println("Min :   "+min);
    // System.out.println("Max :   "+max);
    }
}
