import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, sum;

        System.out.print("Enter first integer:");
        number1 = input.nextInt();

        System.out.print("Enter Second integer:");
        number2 = input.nextInt();

        sum = number1 * number2;

        System.out.printf("Sum is %d%n", sum);
    }
}