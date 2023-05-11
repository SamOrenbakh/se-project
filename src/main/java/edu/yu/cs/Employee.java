package edu.yu.cs;

public class Employee {
    private Boolean onDuty;
    private String name;
    private String staffPosition;
    private double hourlyRate;
    private int weeklyHours;
    private int potentialHours;

    /**
     *
     * @param name
     * @param potentialHours
     * @param staffPosition
     * @param hourlyRate
     *
     *
     */

    public Employee(String name, int potentialHours, String staffPosition, Double hourlyRate){
        if (potentialHours <= 0 || hourlyRate <= 0){
            throw new IllegalArgumentException("potential hours or hourly rate can not be <= 0");
        }
        this.name =  name;
        this.potentialHours = potentialHours;
        setStaffPosition(staffPosition);
        this.hourlyRate = hourlyRate;
        this.onDuty = false;
    }

    /**
     *
     * @param hourlyRate
     */
    public void changeHourlyRate(double hourlyRate){
        if (hourlyRate <= 0){
            throw new IllegalArgumentException("potential hours can not be <= 0");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate(){
        return this.hourlyRate;
    }

    /**
     *
     * @param weeklyHours
     */
    public void setWeeklyHours(int weeklyHours){
        if (weeklyHours <= 0){
            throw new IllegalArgumentException("weekly hours can not be <= 0");
        }
        this.weeklyHours = weeklyHours;
    }

    public int getWeeklyHours(){
        return this.weeklyHours;
    }

    /**
     *
     * @param staffPosition
     * @throws IllegalAccessException
     */
    private void setStaffPosition(String staffPosition) {
        if (!staffPosition.equals("service") || !staffPosition.equals("kitchen") || !staffPosition.equals("cleaning")){
            throw new IllegalArgumentException("Postition must be service, kitchen, cleaning not " + staffPosition);

        }

        this.staffPosition = staffPosition;

    }

    public String getStaffPosition(){
        return this.staffPosition;
    }

    /**
     *
     * @param status
     */
    private void setWorkStatus(boolean status){
        this.onDuty = status;
    }

    private boolean getWorkStatus(){
        return this.onDuty;
    }

    /**
     * @returns WeeklyHours * HourlyRate
     */
    public double getWeeklySalary(){
        return this.weeklyHours * this.hourlyRate;
    }
}
