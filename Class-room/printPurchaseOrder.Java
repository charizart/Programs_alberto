/*
Alberto vega vega
printPurchaseOrder.Java

This programs calculates and prints a purcharse

*/
Imput java.util.Scanner

public class printPurchaseOrder{
  Public static void main(String[] args){
    Scanner userData = new Scanner (System.in);
    double price;
    int quantity;

    System.out.println("enter the price");
    price = userData.nextDouble();
    System.out.println("enter the quantity ");
    quantity = userData.nextInt();

    System.out.println("total purcharse order $" + price * quantity);
    }
  }
 
