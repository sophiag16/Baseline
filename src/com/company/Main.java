package com.company;

public class Main {

    public static void main(String[] args) {

        //String[] items = {"book","12.49","music","14.99","food","0.85"}

        //ShoppingBasket myBasket = new ShoppingBasket(items);

        Item[] list;



        list[0] = new Item("book",12.49,false);
        list[1] = new Item("music_CD",14.99,false);
        list[2] = new Item("food",0.85,false);

        for(int i=0;i<3;i++) {
            System.out.println(list[i].itemName+" ");
        }
    }
}
