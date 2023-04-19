import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number upto which you want sum of odd and even numbers: ");
        int n = s.nextInt();

        int oddsum=0,evensum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evensum+=i;
            }
            else{
                oddsum+=i;
            }
        }
        System.out.println("Sum of even numbers upto "+n+" is "+evensum);
        System.out.println("Sum of odd numbers upto"+n+" is "+oddsum);

    }
}
