import java.util.Scanner;

public class Factorial {

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int fact=1;
            System.out.print("Enter the number to calculate the factorial: \n");
            int num=s.nextInt();

            for(int i=1;i<=num;i++){
                fact*=i;
            }
            System.out.println("Factorial of " +num+ " is : "+fact);



        }

}
 