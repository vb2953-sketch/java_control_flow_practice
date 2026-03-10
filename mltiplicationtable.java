import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number;
        int result;

        // Taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // For loop to print table
        for(int i = 1; i <= 10; i++) {

            result = number * i;

            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
