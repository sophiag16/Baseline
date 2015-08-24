package com.company;

/**
 * Created by sophiag on 24/08/15.
 */
public class ShoppingBasket {
    int numberOfItems = 3;
    Item[] list = new Item[numberOfItems];
    double totalPrice = 0;
    double totalTax = 0;

    public ShoppingBasket(){

        list[0] = new Item("book",12.49,false,"book");
        list[1] = new Item("musicCD",14.99,false,"general");
        list[2] = new Item("chocolateBar",0.85,false,"food");

        calculateTotal();

     }

    public void calculateTotal(){
        for(int i=0;i<3;i++) {
            totalPrice += list[i].price;
            totalTax += list[i].totalTax;
        }

    }

    public void printReceipt(){
        for(int i=0;i<3;i++) {
            System.out.println(list[i].itemName+" "+list[i].price);
        }
        System.out.println("Total price is:"+totalPrice+"\nTotal tax is:"+totalTax);
    }

}
