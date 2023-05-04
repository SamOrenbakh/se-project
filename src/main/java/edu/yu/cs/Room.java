package edu.yu.cs;

public class Room {
    boolean isBooked;
    boolean NeedsService;
    boolean NeedsCleaning;
    private int daysBooked;
    private final int roomNum;
    private int roomPrice;
    private boolean isSpecialRoom;
    private String roomTitle;
    private int checkoutTime;
    private Guest theGuest;
    int extraExpenses;


    //upon intitialization only need roomNum, if its a special room, and roomTitle
    public Room (int roomNum, boolean isSpecialRoom, String roomTitle){
        this.roomNum = roomNum;
        this.isSpecialRoom = isSpecialRoom;
        this.roomTitle = roomTitle;
    }
    public int getDaysBooked(){return this.daysBooked;}
    public int getRoomNum(){return this.roomNum;}
    public int getRoomPrice(){return this.roomPrice;}
    public boolean getRoomSpec(){return this.isSpecialRoom;}
    public String getRoomTitle(){return this.roomTitle;}
    public int getCheckoutTime(){return this.checkoutTime;}
    public Guest getGuest(){return this.theGuest;}


    //method for creating booking
    //return if it got booked
    public boolean book(int daysToBook, int checkout, Guest Guest){
        this.daysBooked = daysToBook;
        this.checkoutTime = checkout;
        this.theGuest = Guest;
        this.isBooked = true;
        return isBooked;
    }

    public void setRoomPrice(int newPrice){
        if (newPrice <= 0){
            throw new IllegalArgumentException("Too Cheap");
        }
        this.roomPrice = newPrice;
    }

    public int getTotalPrice(){
        int roomCost = this.daysBooked * this.roomPrice;
        return roomCost + extraExpenses;
    }
    public void addExpense(int purchase){
        this.extraExpenses += purchase;
    }

}
