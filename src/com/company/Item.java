package com.company;

/**
 * Created by sophiag on 24/08/15.
 */
public class Item {
    String itemName;
    double price;
    double shelfPrice;
    boolean isItImported;
    boolean isSalesTaxApplicable;
    double salesTax, importTax, totalTax;

    public Item(String itemName, double price, boolean isItImported){
        this.itemName = itemName;
        this.price = price;
        this.isItImported = isItImported;


        setTaxValues();
    }

    private void setTaxValues(){
        if(itemName=="medicine"||itemName=="bood"||itemName=="food"){
            salesTax = 0;
            isSalesTaxApplicable = false;
        }

        int taxRate;
        if(isItImported&&isSalesTaxApplicable)
            taxRate = 15;
        else if(isItImported)
            taxRate = 5;
        else if(isSalesTaxApplicable)
            taxRate = 10;
        else
            taxRate = 0;

        shelfPrice = (price/((taxRate/100)+1));

        totalTax = price - shelfPrice;

        if(isItImported&&isSalesTaxApplicable){
            salesTax = totalTax*(2/3);
            importTax = totalTax*(1/3);
        }
        else if(isItImported)
            importTax = totalTax;
        else if(isSalesTaxApplicable)
            salesTax = totalTax;
    }


}
