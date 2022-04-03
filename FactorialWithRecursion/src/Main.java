import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        if (n >= 1)
            return (n * factorial(n - 1));
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        long num = scanner.nextInt();
        scanner.nextLine();
        long a = num;

        for (int i = 1; i <= a; i++) {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
            num--;
        }

        scanner.close();
    }
}
