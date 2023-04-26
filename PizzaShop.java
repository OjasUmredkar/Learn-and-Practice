import java.util.Scanner;

public class PizzaShop {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Press 1 for Pizza - Rs 400 \nPress 2 for Coldrink - Rs 50 " +
                "\nPress 3 for Sandwich - Rs 150  \nPress 4 for Burger - Rs 200 \n  ");

        int amount=0,qty=0,order =0;
        do{
            System.out.println("Enter your order and press 5 for total bill and 6 to Exit");
            order = s.nextInt();

            switch (order){
                case 1:
                    System.out.println("How many pizzas you want to order?");
                    qty=s.nextInt();
                    amount=amount+(qty*400);
                    break;

                case 2:
                    System.out.println("How many coldrinks you want to order?");
                    qty=s.nextInt();
                    amount = amount+(qty*50);
                    break;

                case 3:
                    System.out.println("How many sandwiches you want to order?");
                    qty=s.nextInt();
                    amount=amount+(qty*150);
                    break;

                case 4:
                    System.out.println("How many burger you want to order?");
                    qty=s.nextInt();
                    amount=amount+(qty*200);
                    break;

                case 5:
                    System.out.println("Your Total bill is "+ amount);
                    break;

                case 6:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Enter valid order number");

            }

        }while( order!=6);
    }


}
