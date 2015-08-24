package com.company;

/**
 * Created by sophiag on 24/08/15.
 */
public class Item {
    private String itemName;
    private int price;
    private boolean isItImported;
    private boolean isSalesTaxApplicable;
    private int salesTax, importTax;

    public Item(String itemName, int price, boolean isItImported){
        this.itemName = itemName;
        this.price = price;
        this.isItImported = isItImported;


        setTaxValues();
    }

    private setTaxValues(){
        if(itemName=="medicine"||itemName=="bood"||itemName=="food"){
            salesTax = 0;
            isSalesTaxApplicable = false;
        }

        int taxRate =
    }


}
