  import java.util.Scanner;
public class Primes {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number to check it is prime or not: \n");
        int num= s.nextInt();
        boolean flag =true;
         for(int i=2;i<=num/2;i++){
             if(num%i==0){
                 flag=false;
                 break;
             }


         }
        if (flag != true) {
            System.out.println(num+" is prime not number");
        } else {
            System.out.println(num+" is prime number");
        }
    }
}
