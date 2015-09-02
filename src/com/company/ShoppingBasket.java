package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sophiag on 24/08/15.
 */
public class ShoppingBasket {
    Item[] list = new Item[10];
    double totalPrice = 0;
    double totalTax = 0;
    int count = 0;

    public ShoppingBasket(){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String itemList = "";
        while(true){
            try {
                itemList = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(itemList.equals("done"))
                break;
            list[count++] = new Item(itemList);
        }

        calculateTotal();

     }

    public void calculateTotal(){
        for(int i=0;i<count;i++) {
            totalPrice += list[i].price;
            totalTax += list[i].totalTax;
        }

        totalPrice = Math.ceil(totalPrice * 100) / 100;

    }

    public void printReceipt(){
        for(int i=0;i<count;i++) {
            System.out.println(list[i].itemName);
        }
        System.out.println("Sales Taxes: "+totalTax+"\nTotal: "+totalPrice);
    }

}
