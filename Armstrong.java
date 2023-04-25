import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check for armstrong number");
        int arm=s.nextInt();
        int temp=arm;
        int sum=0,digit=0,r=1,multi=1;
        
        for(int i=arm;i>0;digit++) {
        	i=i/10;
        }
        for(int i=arm;i>0;i=i/10) {
        	multi=1;
        	r=i%10;
        	
        	for(int j=1;j<=digit;j++) {
        		multi=multi*r;
        	}
        	
        	sum=sum+(multi);
        	
        }
        if(sum==arm){
            System.out.println(temp+" is a Armstrong number");
        }
        else{
            System.out.println(temp+" is not a Armstrong number");
        }

    }
}
