package com.company;

/**
 * Created by sophiag on 24/08/15.
 */
public class Item {
    private String itemName;
    private int price;
    private boolean isItImported;
    private int salesTax, importTax;

    public Item(String itemName, int price, boolean isItImported){
        this.itemName = itemName;
        this.price = price;
        this.isItImported = isItImported;

        setTaxValues();
    }

    private void setTaxValue(){
        if(isItImported){

        }
    }
}
