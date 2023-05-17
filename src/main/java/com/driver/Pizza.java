 package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public static int vegBasePrice=300;
    public static int nonVegBasePrice=400;
    public static int cheesePrice=80;
    public static int vegToppingPrice=70;
   public static int nonVegToppingPrice=120;
   public static int takeAwayPrice=20;

    private Boolean isCheeseAdded;
    private Boolean isToppingAdded;
    private Boolean isTakeAwayAdded;
    private int myToppingPrice=0;

    private int basePrice=0;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice=isVeg ? vegBasePrice : nonVegBasePrice;
        this.price = 0;
        this.bill = "";
        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded=false;
        // your code goes here
    }

    public int getPrice() {
        this.price=basePrice;
        if (isCheeseAdded){
            this.price += cheesePrice;
    }
        if(isToppingAdded){
            this.price+=this.myToppingPrice;
        }
        if(isTakeAwayAdded){
           this.price+=takeAwayPrice;
        }
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            this.myToppingPrice+=isVeg ? vegToppingPrice:nonVegBasePrice;
            isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
     String bill="Base Price of Pizza: " + this.basePrice + "\n";
        if(isCheeseAdded){
            bill+="Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(isToppingAdded){
            bill+="Extra Toppings Added: " + myToppingPrice + "\n";
        }
        if(isTakeAwayAdded){
            bill+="Paperbag Added: " + takeAwayPrice + "\n";
        }
        bill+="Total Price: " + this.price + "\n";
        this.bill=bill;
        return this.bill;
    }
}
