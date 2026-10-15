import java.util.Scanner;

public class Revese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int reverse = 0;
        int num = input;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        System.out.println("The reversed number is: " + reverse);
        sc.close();
    }
}