package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseEx;
    private boolean toppings;
    private boolean takeAway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        price = this.isVeg?300:400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseEx){
            cheeseEx = true;
            price +=80;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings){
            toppings = true;
            price += isVeg?70:120;
        }
    }

    public void addTakeaway(){
        // your code goes here
       if(!takeAway){
           takeAway = true;
           price += 20;
       }
    }

    public String getBill(){
        // your code goes here
//        bill = bill + "Total Price: "+getPrice();
        bill = "Base Price Of The Pizza: "+(isVeg?300:400)+"\n"+
                (cheeseEx?("Extra Cheese Added: "+80+"\n"):"")+
                (toppings?("Extra Toppings Added: "+(isVeg?70:120)+"\n"):"")+
                (takeAway?("Paperbag Added: "+20+"\n"):"")+"Total Price: "+price+"\n";
        return this.bill;
    }
}
