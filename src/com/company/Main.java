package com.company;

public class Main {

    public static void main(String[] args) {

        //String[] items = {"book","12.49","music","14.99","food","0.85"}

        //ShoppingBasket myBasket = new ShoppingBasket(items);

        Item[] list = new Item[3];



        list[0] = new Item("book",12.49,false);
        list[1] = new Item("music_CD",14.99,false);
        list[2] = new Item("food",0.85,false);

        int totalPrice = 0;
        int totalTax = 0;

        for(int i=0;i<3;i++) {
            System.out.println(list[i].itemName+" "+list[i].price);
            totalPrice += list[i].price;
            totalTax += list[i].totalTax;
        }

        System.out.println(totalPrice+" "+totalTax);
    }
}
