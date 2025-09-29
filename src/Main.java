import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double itemPrice= 0;
        double shipTotal= 0;
        final double SHIP_COST= 0.02;
        System.out.println("Enter the price of your item");
        itemPrice=in.nextDouble();
        if (itemPrice > 100){
            System.out.println("Your shipping cost is free ");}
        else {
            shipTotal = SHIP_COST * itemPrice;
            System.out.println("Your shipping cost is $"+shipTotal);
        }
    }
}