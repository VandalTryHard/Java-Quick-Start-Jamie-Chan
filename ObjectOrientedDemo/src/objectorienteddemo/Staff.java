/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorienteddemo;

/**
 *
 * @author Val
 */
public class Staff {
    private String nameOfStaff;
    private final int hourlyRate =30;
    private int hoursWorked;
    
    public void printMessage(){
        System.out.println("Calculating Pay...");
    }

    public int calculatePay(){
        printMessage();
        int staffPay;
        staffPay = hoursWorked * hourlyRate;
        if (hoursWorked > 0){
            return staffPay;
        }else{
            return -1;
        }
    }

    public int calculatePay(int bonus, int allowance){
        printMessage();
        if (hoursWorked > 0){
            return hoursWorked * hourlyRate + bonus + allowance;
        }else{
            return 0;
        }
    }

    public void setHoursWorked(int hours){
        if (hours > 0){
            hoursWorked = hours;
        }else{
            System.out.println("Error: HoursWorked Cannot be Smaller than Zero");
            System.out.println("Error: HoursWorked is not updated");
        }
    }

    public int getHoursWorked(){
        return hoursWorked;
    }

    public Staff(String name){
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("--------------------------");
    }

    public Staff(String firsName, String lastName){
        nameOfStaff = firsName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("--------------------------");
    }

}
