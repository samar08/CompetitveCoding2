import java.util.Scanner;

public class AddingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // starting number
        int b = sc.nextInt(); // must be divisible by this
        int n = sc.nextInt(); // number of digits to add

        int foundDigit = -1;

        // Try appending digits 0 to 9
        for (int d = 0; d <= 9; d++) {
            int candidate = a * 10 + d;
            if (candidate % b == 0) {
                foundDigit = d;
                break;
            }
        }

        if (foundDigit == -1) {
            System.out.println(-1);
        } else {
            // First, print the valid number formed by appending the digit
            System.out.print(a);
            System.out.print(foundDigit);

            // Then, append (n - 1) zeros
            for (int i = 0; i < n - 1; i++) {
                System.out.print("0");
            }

            System.out.println();
        }
    }
}