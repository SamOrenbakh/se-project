package edu.yu.cs;
import edu.yu.cs.Room;
import java.util.*;

public class Guest {
    private Room hotelRoom;

    private String name;

    int age;
    int id;
    int phoneNumber;
    int moneySpent;
    int daysBooked;
    int daysLeftInRoom;
    int checkInTime;
    String encodedCreditCard;



    public Guest(int age, int id, int phoneNumber, int pricePerNight, int daysBooked, int checkInTime, int creditCard){
        if (age <= 0 || daysBooked <=0){
            throw new IllegalArgumentException("Age and DaysBooked can not  be <= 0");
        }
        this.age = age;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.moneySpent = pricePerNight;
        this.daysLeftInRoom = daysBooked;
        this.checkInTime = checkInTime;

        String creditCardNumberString = Integer.toString(creditCard);

        String encodedCreditCardNumber = Base64.getEncoder().encodeToString(creditCardNumberString.getBytes());

        this.encodedCreditCard = encodedCreditCardNumber;
    }

    public String getDecryptedCreditCard() {
        String decodedCreditCard = new String(Base64.getDecoder().decode(encodedCreditCard));
        return encodedCreditCard;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getCheckInTime() {
        return checkInTime;
    }

    public int getDaysBooked() {
        return daysBooked;
    }

    public int getId() {
        return id;
    }

    public void setEncodedCreditCard(int creditCard) {

        String creditCardNumberString = Integer.toString(creditCard);

        String encodedCreditCardNumber = Base64.getEncoder().encodeToString(creditCardNumberString.getBytes());

        this.encodedCreditCard = encodedCreditCard;
    }

    public int getDaysLeftInRoom() {
        return daysLeftInRoom;
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public Room getHotelRoom() {
        return hotelRoom;
    }
}
