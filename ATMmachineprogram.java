import java.util.Scanner;
public class ATMmachineprogram {
    public static void main(String[] args) {
        int balance = 10000, withdraw_amt = 0;
        int deposit_amt;
        int f;

        while (true) {
            System.out.println("WELCOME TO JAVA ATM MACHINE!!!!!");
            System.out.println("Please selection an option below");
            System.out.println("Press 1 to check balance");
            System.out.println("Press 2 to withdraw money");
            System.out.println("Press 3 to deposit money");
            System.out.println("Press 4 to exit transaction");

            Scanner ss = new Scanner(System.in);
            f = ss.nextInt();
            switch (f) {
                case 1:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount you want to withdraw: ");
                    withdraw_amt = ss.nextInt();
                    if (withdraw_amt <= balance) {
                        System.out.println("collect cash ");
                        int avail_balance = balance - withdraw_amt;
                        System.out.println("Available balance: " + avail_balance);
                    } else {
                        System.out.println("you dont have enough money");
                    }

                    break;
                case 3:
                    System.out.println("ENter amount you want to deposit: ");
                    deposit_amt = ss.nextInt();
                    balance = balance + deposit_amt;
                    System.out.println("Amount deposited is: " + deposit_amt);
                    System.out.println("Your new balance is: " + balance);
                case 4:
                    System.out.println("Have a good day!!! ");
                    System.exit(0);

            }
        }
    }
}
