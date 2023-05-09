package edu.yu.cs;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.time.LocalDate;
import java.time.LocalTime;

public class Hotel {

    LocalDate startDate = LocalDate.now();


    ArrayDeque<Employee> serviceEmployees = new ArrayDeque<>();
    HashMap<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room room){
        rooms.put(room.getRoomNum(), room);
    }

    public void bookRoom(Guest person, int roomNum, int checkoutTime, String checkoutDate){
        LocalDate checkoutDay = LocalDate.parse(checkoutDate);

        rooms.get(roomNum).book();

    }


}
