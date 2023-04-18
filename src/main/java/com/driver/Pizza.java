package com.driver;

public class Pizza {

    private int price;
    private int nonvegbaseprice=400;
    private int vegbaseprice=300;
    private int extracheese=80;
    private int vegtopping=70;
    private int nonvegtopping=120;
    private int paperbagprice=20;
    private Boolean isVeg;
    private String bill;
    private Boolean toppingsselected=false;
    private Boolean paperbagselected=false;
    private Boolean cheeseselected=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price+=vegbaseprice;
        }
        else{
            price+=nonvegbaseprice;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseselected){
            cheeseselected=true;
            price+=extracheese;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsselected){
            toppingsselected=true;
            if(isVeg){
                price+=vegtopping;
            }
            else{
                price+=nonvegtopping;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        price+=paperbagprice;
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            this.bill+="Base Price of The Pizza:"+300;
        }
        else{
            this.bill+="Base Price of The Pizza:"+400+"\n";
        }
        if(cheeseselected){
            this.bill+="Extra Cheese Added:80"+"\n";
        }
        if(toppingsselected){
            this.bill+="Extra Toppings Added:70"+"\n";
        }
        if(paperbagselected){
            this.bill+="Paperbag Added:20"+"\n";
        }
        this.bill+="Total Price:"+getPrice();
        return this.bill;
    }
}
