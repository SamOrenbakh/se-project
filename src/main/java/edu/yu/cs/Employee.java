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
        this.name =  name;
        this.potentialHours = potentialHours;
        this.staffPosition = staffPosition;
        this.hourlyRate = hourlyRate;
        this.onDuty = false;
    }

    /**
     *
     * @param hourlyRate
     */
    public void changeHourlyRate(double hourlyRate){
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
    private void setStaffPosition(String staffPosition) throws IllegalAccessException {
        if (!staffPosition.equals("service") || !staffPosition.equals("kitchen") || !staffPosition.equals("cleaning")){
            throw new IllegalAccessException("Postition must be service, kitchen, cleaning not " + staffPosition);

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
