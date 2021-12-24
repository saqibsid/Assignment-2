import java.util.Scanner;
public class palindromenumber {
    public static void main(String[] args) {
        int c;
        int digit;
        int substitute;
        int sum=0;

        Scanner ok = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        c=ok.nextInt(); // taking input and stroing it in variable
        substitute=c;// storing value of c in temporary variable as we dont want to change value of c

        while(substitute!=0){
            digit = substitute%10;
            sum=(sum*10) + digit; // here we individually take each digit and make it equal to original number in order to
            substitute /= 10;
            // check for palindrome
        }
        if(c==sum){
            System.out.println(c+" Is a palindrome number");
        }
        else{
            System.out.println(c+" Is not a palindrome number");
        }
    }
}


