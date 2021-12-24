import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args){
        int e;
        int digit;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        e=sc.nextInt();
        int i;
        i=e;

        while(i!=0){
            digit = i%10;
            sum = (sum*10)+digit;
            i = i/10;
        }
        System.out.println("the original number was: " +e);
        System.out.println("the reversed number was: " +sum);

    }
}
