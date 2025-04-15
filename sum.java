import java.util.Scanner;

public final class AddNumbers {

    private AddNumbers() { }

    /**
     * The main method.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        final int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        final int num2 = scanner.nextInt();
        final int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
