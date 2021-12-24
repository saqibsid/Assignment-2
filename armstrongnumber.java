import java.util.Scanner;
public class armstrongnumber {
    public static void main(String[] args) {
        // programs from JAVA BASIC POINT
        // armstrong number
        int b;
        int digit;
        int sums = 0;

        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the number: ");
        b = ab.nextInt();
        int og;
        og = b;

        while (og != 0) {
            digit = og % 10;
            sums += Math.pow(digit, 3);
            System.out.println(sums);
            og /= 10;
        }
        if (sums == b) {
            System.out.println("The number is an armstrong number");
        } else {
            System.out.println("The number is NOT an armstrong number");
        }
    }
}
