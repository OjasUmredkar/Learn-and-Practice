
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
        System.out.println("Enter the number: \n");
        int m=s.nextInt();
        System.out.println("Enter the power: \n");
        int n=s.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=m;
        }
        System.out.println(m+" to the power "+n+" is: "+ans);
    }
}
