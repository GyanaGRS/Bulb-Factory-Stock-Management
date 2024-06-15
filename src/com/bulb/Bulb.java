package com.bulb;
public class Bulb {
    int watt;
    double price;
    String colour;
    boolean state;  //On or Off -> true for on and false for off, so that we take the state as boolean type
    static int quantity;  //if there are no any bulb is made, then always 0 is counted
    static String brandName;  //as all bulbs are the same brand, we make it static, so that all the objects can share it

    static {
        quantity=0;
        brandName= "G-R-S";
        System.out.println(". . . *** . . . *** . .[  BULB FACTORY PROJECT FOR "+brandName+" BULB FACTORY  ]. . *** . . . *** . . .\n");
    }

    {
        quantity++; // we can put this within the default constructor but, in future if we use any parameterized constructor then default constructor wouldn,t be invoke and quantity instance will not increase
    }
    Bulb() {
        watt= 100;
        price= 34.8;
        colour= "red";
        state= true;
    }
    Bulb(int w, double p, String c, boolean s) {
        watt= w;
        price= p;
        colour= c;
        state= s;
    }
    void showDetails() {
        System.out.println("Watt of Bulb => "+watt);
        System.out.println("Colour of Bulb is => "+colour);
        System.out.println("Price of Bulb is => "+price);
        System.out.println("State of Bulb is => "+state);
        System.out.println("Brand of Bulb is => "+brandName);
        System.out.println("State of Bulb is => "+state);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    }
    void changeState() {
        if(state== true)
            state= false;
        else
            state= true;
    }
    static void countBulb() {  //when 0 bulb is counted then always show this
        System.out.println("[!! * * *  Total Number of Bulb = "+quantity+"  * * * !!]\n");
    }
    void changeCompanyName(String cmpName) {
        brandName= cmpName;
    }

    public static void main(String[] args) {
        Bulb.countBulb();
        System.out.println("! ! { Creating Same Type of Bulb } ! !");
        Bulb bulb1= new Bulb();
        Bulb bulb2= new Bulb();
        Bulb bulb3= new Bulb();

        System.out.println("______ Details of Bulb1 ______");
        bulb1.showDetails();
        System.out.println("______ Details of Bulb2 ______");
        bulb2.showDetails();
        System.out.println("______ Details of Bulb3 ______");
        bulb3.showDetails();

        //preferring use scanner object for insert details
        System.out.println("! ! { Creating Different Type of Bulb } ! !\n");
        Bulb bulb4= new Bulb(2300, 56.6, "Green", true);
        Bulb bulb5= new Bulb(654, 75.9, "Pink", false);
        Bulb bulb6= new Bulb(8700, 90.7, "Yellow", true);

        System.out.println("______ Details of Bulb1 ______");
        bulb4.showDetails();
        System.out.println("______ Details of Bulb2 ______");
        bulb5.showDetails();
        System.out.println("______ Details of Bulb3 ______");
        bulb6.showDetails();

        Bulb.countBulb();

        bulb5.changeState();
        System.out.println("********* Updated details of Bulb5 State ***********");
        bulb5.showDetails();

        bulb6.changeCompanyName("Phillips");
        System.out.println("********* Updated details of Bulb6 State ***********");
        bulb6.showDetails();
    }
}
