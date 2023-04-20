
import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the numbers to check for greatest among them");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        if(a>b&&a>c){
            System.out.println(a+" is greatest");
        }
        else{
            if(b>c&&b>a){
                System.out.println(b+" is greatest");
            }
            else{
                System.out.println(c+" is greatest");
            }
        }
    }
}
