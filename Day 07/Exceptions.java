import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) throws ArithmeticException, FileNotFoundException, IOException,
            ArrayIndexOutOfBoundsException, NullPointerException {
        try {
            // Test 1 .ArithmeticException
            // int number1 = 10;
            // int answer = number1 / 0;

            // // Test 2. NullPointerException
            // int []myArray = null;
            // System.out.println(myArray.length);

            // // Test 3.ArrayIndexOutOfBoundsException
            // int arr[] = new int[2];
            // arr[0] = 10;
            // arr[1] = 20;
            // System.out.println(arr[2]);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is the finally block it will execute all the time");
        }

        try {
            // Test 4,5. IOException FileNotFoundException
            FileReader fileReader = new FileReader("a.txt");
            BufferedReader b = new BufferedReader(fileReader);
            for (int i = 0; i < 10; i++) {
                b.readLine();
            }
            b.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This is the second finally block that will also execute all the times");
        }
    }

}