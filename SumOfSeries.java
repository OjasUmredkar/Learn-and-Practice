
import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of the series upto "+num+" is: "+sum);

    }
}


