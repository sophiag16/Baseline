package com.company;

/**
 * Created by sophiag on 24/08/15.
 */
public class Item {
    String itemName,type;
    double price;
    double shelfPrice;
    boolean isItImported;
    boolean isSalesTaxApplicable;
    double salesTax, importTax, totalTax;

    public Item(String itemName, double price, boolean isItImported, String type){
        this.itemName = itemName;
        this.shelfPrice = price;
        this.isItImported = isItImported;
        this.type = type;


        setTaxValues();
    }

    private void setTaxValues(){
        if(type=="medicine"||type=="book"||type=="food"){
            salesTax = 0.0;
            isSalesTaxApplicable = false;
        }
        else{
            isSalesTaxApplicable = true;
        }

        double taxRate;
        if(isItImported&&isSalesTaxApplicable) {
            taxRate = 15.0;
        }
        else if(isItImported) {
            taxRate = 5.0;
        }
        else if(isSalesTaxApplicable) {
            taxRate = 10.0;
        }
        else {
            taxRate = 0.0;
        }

        //shelfPrice = (price/((taxRate/100)+1));
        totalTax = (taxRate/100.0) * shelfPrice;

        price = shelfPrice + totalTax;

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
