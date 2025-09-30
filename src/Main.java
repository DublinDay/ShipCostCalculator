import java.util.Scanner;
public class Main {//Class ShippingPrice
    public static void main(String[] args) {//main()
        Scanner in= new Scanner(System.in);
        double itemPrice= 0;//num itemPrice=0
        double shipTotal= 0;//shipTotal=0
        final double SHIP_COST= 0.02;//SHIP_COST=0.02
        System.out.println("Enter the price of your item");//output "Enter the price of your item"
        itemPrice=in.nextDouble();//input itemPrice
        if (itemPrice > 100){//if itemPrice >= 100
            System.out.println("Your shipping cost is free ");}//output "your shipping will be free"
        else {//else
            shipTotal = SHIP_COST * itemPrice;//shipTotal = SHIP_COST * itemPrice
            System.out.println("Your shipping cost is $"+shipTotal);//output "Your shipping will be " +shipPrice
        }//endif
    }//return
}//endClass