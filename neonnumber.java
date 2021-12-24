import java.util.Scanner;
public class neonnumber {
    public static void main(String[] args) {
        int d;
        int digit;
        int sq;
        int sum=0;
        Scanner jk = new Scanner(System.in);
        System.out.println("Enter the numbr: ");
        d = jk.nextInt();
        sq = d*d;
        while(sq!=0){
            digit = sq % 10;
            sum += digit;
            sq= sq/10;
        }
        if(d==sum){
            System.out.println(d+" is a neon number");
        }
        else{
            System.out.println(d+" is not a neon number");
        }
    }
}
