package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseEx;
    private boolean toppings;
    private boolean takeAway;


//    Veg pizza base price = 300
//    Non-veg pizza base price = 400
//    Extra Cheese Price = 80
//    Extra Toppings For Veg Pizza = 70
//    Extra Toppings For Non-veg Pizza = 120
//    Paper bag Price = 20

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        price = this.isVeg?300:400;
//        bill = bill + "Base Price Of The Pizza: " + getPrice()+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseEx){
            cheeseEx = true;
//            bill = bill + "Extra Cheese Added: 80"+"\n";
            price +=80;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings){
            toppings = true;
            price += isVeg?70:120;
//            bill = bill + "Extra Toppings Added: "+Integer.toString(num)+"\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
       if(!takeAway){
           takeAway = true;
//           bill = bill + "Paperbag Added: 20"+"\n";
           price += 20;
       }
    }

//    Base Price Of The Pizza: 400
//    Extra Cheese Added: 80
//    Extra Toppings Added: 120
//    Total Price: 600


    public String getBill(){
        // your code goes here
//        bill = bill + "Total Price: "+getPrice();
        bill = "Base Price Of The Pizza: "+(isVeg?300:400)+"\n"+
                (cheeseEx?("Extra Cheese Addes: "+80+"\n"):"")+
                (toppings?("Extra Toppings Added: "+(isVeg?70:120)+"\n"):"")+
                (takeAway?("Paperbag Added: "+20+"\n"):"")+"Total Price: "+price+"\n";
        return this.bill;
    }
}
