/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex10;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        double tax_conversion = 0.055;
        int item1price = myApp.getItem1Price();
        int item1quantity = myApp.getItem1Quantity();
        int item2price = myApp.getItem2Price();
        int item2quantity = myApp.getItem2Quantity();
        int item3price = myApp.getItem3Price();
        int item3quantity = myApp.getItem3Quantity();
        double subtotal = myApp.getSubtotal(item1price, item1quantity, item2price, item2quantity, item3price, item3quantity);
        double tax = myApp.getTax(subtotal, tax_conversion);
        double total = myApp.getTotal(subtotal, tax);
        myApp.printOutput(subtotal, tax, total);
    }

    public int getItem1Price() {
        System.out.print("Enter the price of item 1: ");
        return in.nextInt();
    }

    public int getItem1Quantity() {
        System.out.print("Enter the quantity fo item 1: ");
        return in.nextInt();
    }
    public int getItem2Price() {
        System.out.print("Enter the price of item 2: ");
        return in.nextInt();
    }

    public int getItem2Quantity() {
        System.out.print("Enter the quantity fo item 2: ");
        return in.nextInt();
    }
    public int getItem3Price() {
        System.out.print("Enter the price of item 3: ");
        return in.nextInt();
    }

    public int getItem3Quantity() {
        System.out.print("Enter the quantity fo item 3: ");
        return in.nextInt();
    }

    public double getSubtotal(int item1price,int item1quantity,int item2price,int item2quantity,int item3price,int item3quantity) {
        return (item1price*item1quantity)+(item2price*item2quantity)+(item3price*item3quantity);
    }

    public double getTax(double subtotal, double tax_conversion) {
        return subtotal*tax_conversion;
    }

    public double getTotal(double subTotal, double tax) {
        return subTotal+tax;
    }

    public void printOutput(double subtotal, double tax, double total) {
        System.out.printf("Subtotal: $%.02f\nTax: $%.02f\nTotal: $%.02f", subtotal, tax, total);
    }

}





