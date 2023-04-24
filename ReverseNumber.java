import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the the number to reverse");
        int num=s.nextInt();
        /*int t=num/10;
        int o=num%10;
        int revnum=10*o+t;*/
        int revnum=(10*(num%10))+(num/10);
        System.out.println("Reversed number is "+revnum);
    }
}
