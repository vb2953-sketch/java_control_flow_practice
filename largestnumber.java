import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        // Creating scanner object for input
        Scanner input = new Scanner(System.in);

        // Declaring variables
        int number1;
        int number2;
        int number3;
        int largest;

        // Taking input
        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        // Finding largest number
        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        }
        else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        }
        else {
            largest = number3;
        }

        // Display result
        System.out.println("Largest number is: " + largest);
    }
}
