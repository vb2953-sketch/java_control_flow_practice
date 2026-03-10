import java.util.Scanner;

public class SumWhileLoop {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number;
        int sum = 0;
        int i = 1;

        // Taking input from user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // While loop to calculate sum
        while(i <= number) {

            sum = sum + i;

            i++;
        }

        // Display result
        System.out.println("Sum is: " + sum);
    }
}
