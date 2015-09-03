package com.company;

import java.lang.*;
/**
 * Created by sophiag on 24/08/15.
 */
public class Item {
    String itemName,type="general";
    double price=0.0;
    double shelfPrice;
    boolean isItImported;
    double salesTax, importTax, totalTax;
    String[] exemptSalesTax = {"chocolate","chocolates","book"};

    public Item(String itemList){
        String[] splitItemList = itemList.split(" ");
        int len = splitItemList.length;
        shelfPrice = Double.parseDouble(splitItemList[len - 1]);
        isItImported = itemList.contains("imported");
        for(int i=0;i<3;i++){
            if(itemList.contains(exemptSalesTax[i])){
                type = "exempt";
            }
        }

        setTaxValues();

        itemName = splitItemList[0];
        for(int i=1; i<splitItemList.length-2; i++) {
            itemName += " " + splitItemList[i];
        }
        itemName += ": "+Double.toString(price);
    }

    private void setTaxValues(){
        if(type=="exempt"){
            salesTax = 0.0;
        }
        else{
            salesTax = 0.1 * shelfPrice;
            salesTax = Math.round(salesTax / 0.05) * 0.05;

        }

        if(isItImported){
            importTax = 0.05 * shelfPrice;
            importTax = Math.round(importTax / 0.05) * 0.05;
        }

        totalTax = salesTax + importTax;
        price = shelfPrice + totalTax;
        System.out.println(price);
        price = Math.round(price / 0.01) * 0.01;
        System.out.println(price);
    }
    
}
