 package com.driver;

public class Pizza {

     private int totalPrice;
    private int vegPrice;
    private boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int basePrice;
    private int toppingPrice;
    private int paperBagPrice;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;

     public Pizza(Boolean isVeg){
     this.isVeg=isVeg;

     if(isVeg==true){
         basePrice=300;
         toppingPrice=70;
     }
     else{
         basePrice=400;
         toppingPrice=120;
     }
     basePrice=80;
     paperBagPrice=20;
     totalPrice=basePrice;
     bill="Base price of Pizza: "+ basePrice+"\n";
     }
     public int getPrice(){
         return this.totalPrice;
     }
     public void addExtraCheese(){
         if(isCheeseAdded==false){
             totalPrice=totalPrice + cheesePrice;
             isCheeseAdded=true;
             bill=bill+"Extra Cheese Added: "+ cheesePrice;
         }
     }

     public void addExtraToppings(){
         if(isToppingsAdded==false){
             totalPrice=totalPrice+totalPrice;
             bill=bill+"Extra Topping added: "+ toppingPrice;
         }
     }
    public void addTakeaway() {
         if(!isPaperBagAdded){
             isPaperBagAdded=true;
             totalPrice=totalPrice + paperBagPrice;
             bill=bill+"Paperbag Added: "+ paperBagPrice;
         }
     }

     public String getBill(){
         if(!isBillGenerated){
             isBillGenerated=true;
             if(isCheeseAdded)
                 bill=bill+"Extra Cheese Added: "+ cheesePrice+"\n";
             if(isToppingsAdded)
                 bill=bill+"Extra Toppings Added: "+ toppingPrice+"\n";
             if(isPaperBagAdded)
                 bill=bill+"Paperbag Added: "+ paperBagPrice+"\n";
             bill=bill+"Total price: "+ totalPrice;
         }
         return this.bill;
    }
}
