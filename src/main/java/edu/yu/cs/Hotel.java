package edu.yu.cs;
import java.util.*;
import java.time.LocalDate;
import java.util.Calendar.Builder;
import java.time.LocalTime;

public class Hotel {

    LocalDate startDate = LocalDate.now();
    Calendar calendar = new GregorianCalendar();
    ArrayList<Employee> employees = new ArrayList<>();
    Map<Integer, Room> roomMap = new HashMap<>();
    int currentBalance;
    int totalMoneyInvested;
    int bills;
    int monthlyExpenses;
    //queue representing rooms needing general service
    ArrayDeque<Room> RoomsReqMaintenence = new ArrayDeque<>();
    //queue reprsenting rooms requesting room service
    ArrayDeque<Room> RoomsReqRoomService = new ArrayDeque<>();
    //rooms that need cleaning
    ArrayDeque<Room> RoomsThatNeedCleaning = new ArrayDeque<>();
    //queue representing service employees and whoever is on duty
    ArrayDeque<Employee> serviceEmployees = new ArrayDeque<>();
    //queue of cleaning staff on duty
    ArrayDeque<Employee> cleaningEmployees = new ArrayDeque<>();
    //queue oof maintnence employees
    ArrayDeque<Employee> maintenenceEmployees = new ArrayDeque<>();
    HashMap<Integer, Room> rooms = new HashMap<>();
//new comm
    public void addRoom(Room room){
        rooms.put(room.getRoomNum(), room);
    }

    public void bookRoom(Guest person, int roomNum, int checkoutTime, int daysOfStay, String checkoutDate){
        LocalDate checkoutDay = LocalDate.parse(checkoutDate);
        rooms.get(roomNum).book(daysOfStay,checkoutDate, person);
    }

    public void cleanARoom(){
        cleaningEmployees.peekFirst();
        RoomsThatNeedCleaning.pop();
    }
    public void maintenenceARoom(){
        maintenenceEmployees.peekFirst();
        RoomsReqMaintenence.pop();
    }
    public void serviceARoom(){
        serviceEmployees.peekFirst();
        RoomsReqRoomService.pop();
    }



}
