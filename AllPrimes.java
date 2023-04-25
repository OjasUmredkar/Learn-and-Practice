
import java.util.Scanner;
public class AllPrimes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter upto which you want to print prime numbers");
        int n=s.nextInt();
        boolean flag=true;
        System.out.println("Prime numbers between 1 to "+n+" is ");
        for(int i=2;i<=n;i++){
            flag =true;
            for(int j=2;j<=i/2;j++){

                if(i%j==0){
                    flag=false;
                }
            }
            if(flag==true)
                System.out.println(i);
        }
    }
}
