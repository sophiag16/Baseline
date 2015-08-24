package com.company;

/**
 * Created by sophiag on 24/08/15.
 */
public class ShoppingBasket {
    int numberOfItems = 3;
    Item[] list = new Item[numberOfItems];
    double totalPrice = 0;
    double totalTax = 0;

    public ShoppingBasket(int numberOfItems){
        this.numberOfItems = numberOfItems;

        list[0] = new Item("book",12.49,false);
        list[1] = new Item("music_CD",14.99,false);
        list[2] = new Item("food",0.85,false);

        calculateTotal();

     }

    public void calculateTotal(){
        for(int i=0;i<3;i++) {
            //System.out.println(list[i].itemName+" "+list[i].price);
            totalPrice += list[i].price;
            totalTax += list[i].totalTax;
        }

        //System.out.println("Total price is:"+totalPrice+"\nTotal tax is:"+totalTax);
    }

    public void printReceipt(){
        for(int i=0;i<3;i++) {
            System.out.println(list[i].itemName+" "+list[i].price);
        }
        System.out.println("Total price is:"+totalPrice+"\nTotal tax is:"+totalTax);
    }

}
